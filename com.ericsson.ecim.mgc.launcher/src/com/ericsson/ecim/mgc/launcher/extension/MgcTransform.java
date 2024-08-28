package com.ericsson.ecim.mgc.launcher.extension;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.BasicMonitor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.xtext.junit4.GlobalRegistries;
import org.eclipse.xtext.junit4.GlobalRegistries.GlobalStateMemento;

import com.ericsson.ecim.core.exceptions.EcimException;
import com.ericsson.ecim.core.exceptions.EcimStatusException;
import com.ericsson.ecim.core.helpers.ParameterModelHelper.ParametersResource;
import com.ericsson.ecim.core.uml.helpers.Uml2ModelHelper;
import com.ericsson.ecim.launcher.transformations.EcimTransformationException;
import com.ericsson.ecim.launcher.transformations.M2MLauncher;
import com.ericsson.ecim.launcher.transformations.Transformation;
import com.ericsson.ecim.m2m.ECIMATLResources;
import com.ericsson.ecim.mgc.cpp.gen.GenerateMgcCpp;
import com.ericsson.ecim.mgc.launcher.MgcActivator;
import com.ericsson.ecim.mgc.m2m.MgcATLResource;
import com.ericsson.ecim.umlmod.UmlUtilBase;
import com.ericsson.ecim.validator.EcimValidationException;

/**
 * YANG Transformation worker.
 * 
 * @author erajaik
 * 
 */
public class MgcTransform extends Transformation {

    private static final Logger LOGGER = Logger.getLogger(MgcTransform.class);
    static final String MGC_OUTPUT_FOLDER_NAME = "MGC";

    @Override
    public IStatus run(IProgressMonitor monitor) {
        IProgressMonitor inner = (monitor != null) ? monitor : new NullProgressMonitor();
        try {
            checkResources();
        } catch (EcimTransformationException e) {
            return new Status(IStatus.ERROR, MgcActivator.PLUGIN_ID, e.getMessage(), e);
        }

        IStatus mgcStatus = runMgcJson(inner);
        if (!mgcStatus.isOK())
            return mgcStatus;

        mgcStatus = runMgcCpp(inner);
        return mgcStatus;
    }

    private IStatus runMgcCpp(IProgressMonitor monitor) {
        monitor.beginTask("Transforming UML Model to MGC C++", 1);

        GlobalStateMemento registers = null;
        try {
            File modelFile = getFlattenedModelFile();
            File outputFolder = new File(getOutputFolder(), MGC_OUTPUT_FOLDER_NAME);
            if (!outputFolder.exists()) {
                outputFolder.mkdirs();
            }

            URI modelURI = URI.createFileURI(modelFile.getAbsolutePath());
            // See http://www.eclipse.org/forums/index.php/m/909604/#msg_909604
            // for more info
            registers = GlobalRegistries.makeCopyOfGlobalState();

            GenerateMgcCpp mgcCppGenerator = new GenerateMgcCpp(modelURI, outputFolder, new ArrayList<String>());
            monitor.worked(1);
            mgcCppGenerator.doGenerate(BasicMonitor.toMonitor(monitor));
            monitor.worked(1);

            if (LOGGER.isDebugEnabled()) {
                LOGGER.debug("Generate MgcCpp into [" + outputFolder + "] " + outputFolder.list().length);
            }

        } catch (Exception e) {
            MgcActivator.getDefault().getLog().log(new Status(IStatus.ERROR, MgcActivator.PLUGIN_ID, e.getMessage()));
            return new Status(IStatus.ERROR, MgcActivator.PLUGIN_ID, e.getMessage(), e);
        } finally {
            registers.restoreGlobalState();
            monitor.done();
        }

        return Status.OK_STATUS;
    }

    private IStatus runMgcJson(IProgressMonitor monitor) {
        monitor.beginTask("Transforming UML Model to MGC JSON", 1);
        try {

            File modelFile = getFlattenedModelFile();
            File outputFolder = new File(getOutputFolder(), MGC_OUTPUT_FOLDER_NAME);
            if (!outputFolder.exists()) {
                outputFolder.mkdirs();
            }

            runMgcJsonTransforms(monitor, modelFile, outputFolder);

            monitor.worked(1);

        } catch (EcimStatusException e) {
            MgcActivator.getDefault().getLog().log(new Status(IStatus.ERROR, MgcActivator.PLUGIN_ID, e.getMessage()));
            return new Status(IStatus.ERROR, MgcActivator.PLUGIN_ID, e.getMessage(), e);
        } catch (Exception e) {
            MgcActivator.getDefault().getLog().log(new Status(IStatus.ERROR, MgcActivator.PLUGIN_ID, e.getMessage()));
            return new Status(IStatus.ERROR, MgcActivator.PLUGIN_ID, e.getMessage(), e);
        } finally {
            monitor.done();
        }

        return Status.OK_STATUS;
    }

    /**
     * Runs the MGC transformation once for every class in the model.
     * 
     * @param monitor
     * @param emxModelFile
     * @param outFolder
     * @param modelName
     * @return
     * @throws EcimTransformationException
     * @throws EcimValidationException
     * @throws IOException
     */
    private List<File> runMgcJsonTransforms(IProgressMonitor monitor, File emxModelFile, File outFolder) throws EcimException, IOException {
        List<File> outputFiles = new ArrayList<File>();

        Uml2ModelHelper umh = new Uml2ModelHelper(emxModelFile);
        Model originalModel = umh.loadModel();

        EList<org.eclipse.uml2.uml.Package> packages = originalModel.getNestedPackages();
        for (final Package p : packages) {
            Stereotype ecimMomStereotype = getEcimBaseProfile(originalModel).getOwnedStereotype("EcimMom");
            if (!p.isStereotypeApplied(ecimMomStereotype)) {
                continue;
            }
            handleMomPackage(originalModel, p, emxModelFile, outFolder, outputFiles, monitor);
        }
        if (LOGGER.isDebugEnabled()) {
            LOGGER.debug("Generate MgcJson into [" + outFolder + "] " + outFolder.list().length);
        }
        umh.unloadModel();

        return outputFiles;
    }

    private void handleMomPackage(Model originalModel, Package p, File emxModelFile, File outFolder, List<File> outputFiles, IProgressMonitor monitor)
            throws EcimException {
        Stereotype ecimClassStereotype = getEcimBaseProfile(originalModel).getOwnedStereotype("EcimMoClass");
        Stereotype ecimRootClassStereotype = getEcimBaseProfile(originalModel).getOwnedStereotype("EcimRootMoClass");
        EList<Element> els = p.getOwnedElements();
        for (final Element e : els) {
            if (!UmlUtilBase.elementIsAppliedToOneOf(e, new Stereotype[] { ecimClassStereotype, ecimRootClassStereotype })) {
                continue;
            }
            Class c = (Class) e;
            if (classHasAttributes(c, originalModel)) {
                ParametersResource pr = new ParametersResource();
                pr.initializeParametersResource();
                pr.addParameter("class", c.getName());
                pr.addParameter("modid", "" + c.getName().hashCode());
                File prFile = pr.createParametersFile();
                File outFile = runMgcJsonClassTransformation(monitor, emxModelFile, prFile, outFolder, c.getName());
                outputFiles.add(outFile);
            }
        }
    }

    /**
     * Checks if supplied class has attributes.
     */
    private boolean classHasAttributes(Class c, Model model) {
        final Stereotype roAttr = getEcimBaseProfile(model).getOwnedStereotype("EcimAttribute_RO");
        final Stereotype rwAttr = getEcimBaseProfile(model).getOwnedStereotype("EcimAttribute_RW");
        EList<Element> attributes = c.getOwnedElements();
        for (Element a : attributes) {
            if (a.isStereotypeApplied(roAttr) || a.isStereotypeApplied(rwAttr))
                return true;
        }
        return false;
    }

    /**
     * Returns the uml profile for "ECIM Base Profile".
     * 
     * @TBD use constant instead for name of profile
     * @param model
     * @return
     */
    private static Profile getEcimBaseProfile(Model model) {
        return model.getAppliedProfile("ECIM Base Profile");
    }

    /**
     * Runs the ATL that creates the YANG submodule file.
     * 
     * @param monitor
     * @param emxModelFile
     * @param outFolder
     * @param className
     * @return
     * @throws EcimTransformationException
     * @throws EcimValidationException
     */
    private File runMgcJsonClassTransformation(IProgressMonitor monitor, File emxModelFile, File classNameParameter, File outFolder, String className)
            throws EcimException {
        File outFile;
        ECIMATLResources atlResources = new MgcATLResource(MgcATLResource.ECIM_MODEL_2_MGCJSON);
        atlResources.setParameterFile(classNameParameter);

        if (monitor != null)
            monitor.subTask("Transforming UML Class " + className + " to MGC JSON class");

        String fileName = className + "POT.json";
        if (!fileName.startsWith("Mo"))
            fileName = "Mo" + fileName;
        outFile = M2MLauncher.convert(monitor, emxModelFile, new File(outFolder, fileName), atlResources);
        if (monitor != null)
            monitor.worked(1);
        return outFile;
    }

    /**
     * Returns the plugin versions used by this transformation.
     * 
     * @return
     */
    @Override
    public String getPluginVersions() {
        StringBuilder sb = new StringBuilder();
        sb.append(" mgc.m2m = " + com.ericsson.ecim.mgc.m2m.MgcM2MActivator.getVersion() + "\n");
        sb.append(" mgc.cpp = " + com.ericsson.ecim.mgc.cpp.MgcCppActivator.getVersion() + "\n");
        return sb.toString();
    }

}
