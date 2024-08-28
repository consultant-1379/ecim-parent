package com.ericsson.ecim.coremw.launcher.extension;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.transform.TransformerException;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.RollbackException;
import org.eclipse.emf.transaction.TransactionalCommandStack;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.util.UMLUtil;
import org.osgi.framework.Bundle;

import com.ericsson.ecim.core.exceptions.EcimException;
import com.ericsson.ecim.core.exceptions.EcimStatusException;
import com.ericsson.ecim.core.helpers.ParameterModelHelper;
import com.ericsson.ecim.core.helpers.XmlPrettyPrinter;
import com.ericsson.ecim.core.uml.helpers.Uml2ModelHelper;
import com.ericsson.ecim.coremw.imm.IMMActivator;
import com.ericsson.ecim.coremw.launcher.CoreMWLauncherActivator;
import com.ericsson.ecim.coremw.m2m.CoreMWATLResources;
import com.ericsson.ecim.launcher.transformations.EcimTransformationException;
import com.ericsson.ecim.launcher.transformations.M2MLauncher;
import com.ericsson.ecim.launcher.transformations.Transformation;
import com.ericsson.ecim.umlmod.UmlUtilBase;
import com.ericsson.ecim.validator.ECIMValidator;

public class ImmXmlTransform extends Transformation {

    private static final Logger LOGGER = Logger.getLogger(ImmXmlTransform.class);
    private Stereotype ecimMomStereotype;
    private Stereotype ecimInstancesStereotype;

    @Override
    public IStatus run(IProgressMonitor monitor) {
        monitor.beginTask("Transforming UML Model to IMM XML", 9);
        IStatus status = Status.OK_STATUS;
        try {
            checkResources();
            monitor.worked(1);
            if (monitor.isCanceled())
                return Status.CANCEL_STATUS;

            List<File> immFiles = doRunTransform(monitor);
            monitor.worked(3);

            copyImmToXml(immFiles);
            monitor.worked(2);
            if (monitor.isCanceled())
                return Status.CANCEL_STATUS;

            status = validateImmOutput(monitor);
            monitor.done();
        } catch (EcimStatusException e) {
            LOGGER.warn(e.getMessage(), e);
            return (e.getStatus() != null) ? e.getStatus() : new Status(IStatus.ERROR, CoreMWLauncherActivator.PLUGIN_ID, e.getMessage(), e);
        } catch (Exception e) {
            LOGGER.warn(e.getMessage(), e);
            return new Status(IStatus.ERROR, CoreMWLauncherActivator.PLUGIN_ID, e.getMessage(), e);
        }

        return status;
    }

    private List<File> doRunTransform(IProgressMonitor monitor) throws IOException, InterruptedException, RollbackException, EcimTransformationException {
        monitor.subTask("Transforming UML to intermediate IMM Model (" + getTransformationId() + ")");
        File modelFile = getFlattenedModelFile();

        Uml2ModelHelper umhMDL = new Uml2ModelHelper(modelFile);
        Model model = umhMDL.loadModel();

        // See if a model merge is required on the model
        if (!model.getPackageMerges().isEmpty()) {
            final Model mergedModel = model;
            final File umlFolder = getUMLFolder();
            modelFile = new File(umlFolder, "merged_" + modelFile.getName());

            // Skip the model merge if the merge was done already by a
            // previously run transform (in this cycle)
            if (!modelFile.exists()) {
                mergeModel(modelFile, umhMDL, mergedModel, monitor);
            }
            umhMDL = new Uml2ModelHelper(modelFile);
            model = umhMDL.loadModel();
        }

        List<File> immFiles = performModelTransform(monitor, modelFile, model);

        // we *must* clean up the loaded models
        if (umhMDL != null) {
            umhMDL.unloadModel();
        }
        return immFiles;
    }

    private List<File> performModelTransform(IProgressMonitor monitor, File mdl, Model model) throws EcimTransformationException {
        List<File> immFiles = new ArrayList<File>();
        setGeneratedFiles(new ArrayList<File>());
        File workFolder = getWorkFolder();
        // Prepare the stereotypes which will be used to split the model
        ecimMomStereotype = getEcimBaseProfile(model).getOwnedStereotype("EcimMom");
        ecimInstancesStereotype = getEcimBaseProfile(model).getOwnedStereotype("EcimInstances");

        // Split the model based on the packages with certain
        // stereotypes
        for (final Package originalPackage : getAllPackages(model)) {
            if (UmlUtilBase.elementIsAppliedToOneOf(originalPackage, new Stereotype[] { ecimMomStereotype, ecimInstancesStereotype })) {
                performImmTransform(monitor, mdl, workFolder, immFiles, originalPackage);
            }
        }
        return immFiles;
    }

    private void mergeModel(File mdl, Uml2ModelHelper umhMDL, final Model mergedModel, IProgressMonitor monitor) throws InterruptedException,
            RollbackException, IOException {
        monitor.subTask("Performing a Model Merge for IMM");
        Resource modelResource = mergedModel.eResource();
        TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(modelResource);
        TransactionalCommandStack commandStack = (TransactionalCommandStack) domain.getCommandStack();
        Map<String, Object> options = new HashMap<String, Object>();
        options.put("no_validation", Boolean.TRUE);

        commandStack.execute(new RecordingCommand(domain) {
            @Override
            protected void doExecute() {
                // perform a package merge on the input model so
                // that we can have non O&M interface items
                // in the IMM files. One line of magic, thanks
                // UML2 :)
                UMLUtil.merge(mergedModel, null);
            }
        }, options);

        modelResource.save(null);

        // we must save and reload the merged model from a file
        // as ATL needs a "File" to transform
        umhMDL.saveModel(mdl);
        umhMDL.unloadModel();
    }

    private void copyImmToXml(List<File> immFiles) throws IOException {
        // create a copy of the .imm files with a .xml extension. The
        // XML is the same inside as the Ecore serializer looked after that.
        // we don't delete the .imm as it might be useful for debugging.
        // also the output folders are different
        File outputFolder = getOutputFolder();
        for (final File immFile : immFiles) {
            String sNewFileName = outputFolder.getAbsolutePath() + File.separator + immFile.getName().replaceFirst(".imm$", ".xml");
            File newfile = new File(sNewFileName);
            FileUtils.copyFile(immFile, newfile);
            getGeneratedFiles().add(newfile);
        }
    }

    private void performImmTransform(IProgressMonitor monitor, File mdl, File workFolder, List<File> immFiles, Package originalPackage)
            throws EcimTransformationException {
        CoreMWATLResources atlResources;
        // Prepare a name for the package. If the package is an
        // instance package it must be prepended with the MOM
        // name
        StringBuilder packageName = new StringBuilder(originalPackage.getName() + "_" + getTransformationId());
        // We assign different names to the ouput and run
        // different transforms depending on the package type
        if (originalPackage.isStereotypeApplied(ecimInstancesStereotype)) {
            if (!(originalPackage.getOwner() instanceof Model)) {
                // Only prepend mom name if instance package is
                // contained in an EcimMom
                packageName = packageName.insert(0, ((Package) originalPackage.getOwner()).getName());
            }
            packageName.append("_objects");
            atlResources = new CoreMWATLResources(CoreMWATLResources.ECIM_IMM_CONFIG);
        } else {
            packageName.append("_classes");
            atlResources = new CoreMWATLResources(CoreMWATLResources.ECIM_IMM);
        }

        String[] params = new String[] { "xmiId=" + ((XMIResource) originalPackage.eResource()).getID(originalPackage),
                "immSchemaVersion=" + getTransformationId().toUpperCase(), "immSchemaName=" + getImmSchemaName() };

        File transformationParameters = ParameterModelHelper.createParameterModelFile(params);

        atlResources.setParameterFile(transformationParameters);

        // run the ATL transformation
        File immFile = M2MLauncher.convert(monitor, mdl, new File(workFolder, "imm" + File.separator + packageName + ".imm"), atlResources);

        // clean up
        FileUtils.deleteQuietly(transformationParameters);
        immFiles.add(immFile);
    }

    private IStatus validateImmOutput(IProgressMonitor monitor) throws EcimException, TransformerException {
        // Validate all IMM XML files against the IMM Schema
        Bundle bundleIMM = IMMActivator.getDefault().getBundle();
        ECIMValidator xmlValidator = new ECIMValidator();
        monitor.subTask("Validating IMM XML files against IMM Schema");
        for (File resource : getGeneratedFiles()) {
            if (monitor.isCanceled())
                return Status.CANCEL_STATUS;
            ImmXmlSorter.sort(resource);
            ImmXmlDnLengthChecker.isOK(resource);
            // SDP 751 problem needs to be resolved, therefore the
            // following line is commented.
            XmlPrettyPrinter.printDocument(resource, null);
            xmlValidator.validateAgainstXSD(resource, "http://www.saforum.org/IMMSchema", bundleIMM.getEntry("model/SAI-AIS-IMM-XSD-A.02.13.xsd"));
        }
        monitor.worked(1);
        return Status.OK_STATUS;
    }

    public String getImmSchemaName() {
        if ("imm".equals(getTransformationId()))
            return "SAI-AIS-IMM-XSD-A.01.01.xsd";
        else if ("immR2".equals(getTransformationId()))
            return "SAI-AIS-IMM-XSD-A.02.12.xsd";
        else
            return "SAI-AIS-IMM-XSD-A.02.13.xsd"; // immR3
    }

    /**
     * Returns the plugin versions used by this transformation.
     * 
     * @return
     */
    @Override
    public String getPluginVersions() {
        StringBuilder sb = new StringBuilder();
        sb.append(" coremw.m2m = " + com.ericsson.ecim.coremw.m2m.M2MActivator.getVersion() + "\n");
        sb.append(" coremw.dsl = " + com.ericsson.ecim.coremw.dsl.CoreMwEcimDsl.getVersion() + "\n");
        return sb.toString();
    }

    /**
     * Returns the uml profile for "ECIM Base Profile".
     * 
     * @TBD use constant instead for name of profile
     * @param pck
     * @return
     */
    private Profile getEcimBaseProfile(Package pck) {
        return pck.getAppliedProfile("ECIM Base Profile");
    }

    /**
     * Recursive method to return all the packages in a model regardless of depth.
     * 
     * @param model
     *            or package
     * @return EList of packages
     */
    private EList<Package> getAllPackages(Package pck) {
        // for the first call the storage array will be empty
        EList<Package> packages = new BasicEList<Package>();

        return getAllSubPackages(pck, packages);
    }

    private EList<Package> getAllSubPackages(Package pck, EList<Package> packages) {
        // get the packages in the package/model
        packages.addAll(pck.getNestedPackages());

        // keep getting the nested packages until there are no more
        for (final Package myPackage : pck.getNestedPackages()) {
            // recurse
            getAllSubPackages(myPackage, packages);
        }
        return packages;
    }

}