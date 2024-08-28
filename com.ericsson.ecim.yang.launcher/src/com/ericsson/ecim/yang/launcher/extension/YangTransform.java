package com.ericsson.ecim.yang.launcher.extension;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.EList;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.Stereotype;

import com.ericsson.ecim.core.exceptions.EcimStatusException;
import com.ericsson.ecim.core.helpers.ParameterModelHelper;
import com.ericsson.ecim.core.uml.helpers.Uml2ModelHelper;
import com.ericsson.ecim.launcher.transformations.EcimTransformationException;
import com.ericsson.ecim.launcher.transformations.M2MLauncher;
import com.ericsson.ecim.launcher.transformations.Transformation;
import com.ericsson.ecim.m2m.ECIMATLResources;
import com.ericsson.ecim.validator.EcimValidationException;
import com.ericsson.ecim.yang.launcher.YangActivator;
import com.ericsson.ecim.yang.m2m.YangATLResource;
import com.ericsson.ecim.yang.m2m.YangM2MActivator;

/**
 * YANG Transformation worker.
 * 
 * @author erajaik
 * 
 */
public class YangTransform extends Transformation {

    private static final Logger LOGGER = Logger.getLogger(YangTransform.class);

    @Override
    public IStatus run(IProgressMonitor monitor) {
        monitor.beginTask("Transforming UML Model to YANG", 4);
        try {
            checkResources();

            File modelFile = getFlattenedModelFile();
            File outputFolder = getOutputFolder();

            List<File> convertedYangFiles = runYangTransforms(monitor, modelFile, outputFolder);

            setGeneratedFiles(convertedYangFiles);
            monitor.worked(1);

        } catch (EcimTransformationException e) {
            return new Status(IStatus.ERROR, YangActivator.PLUGIN_ID, e.getMessage(), e);
        } catch (EcimStatusException e) {
            return new Status(IStatus.ERROR, YangActivator.PLUGIN_ID, e.getMessage(), e);
        } catch (Exception e) {
            return new Status(IStatus.ERROR, YangActivator.PLUGIN_ID, e.getMessage(), e);
        } finally {
            monitor.done();
        }

        return Status.OK_STATUS;
    }

    /**
     * Runs the YANG module transformation once and the YANG submodule transformation once for every package within the
     * model.
     * 
     * @param monitor
     * @param umlModelFile
     * @param outFolder
     * @param modelName
     * @return
     * @throws EcimTransformationException
     * @throws EcimValidationException
     * @throws IOException
     */
    private List<File> runYangTransforms(IProgressMonitor monitor, File umlModelFile, File outFolder) throws EcimTransformationException,
            EcimValidationException, IOException {
        List<File> yangFiles = new ArrayList<File>();

        Uml2ModelHelper umh = new Uml2ModelHelper(umlModelFile);
        Model originalModel = umh.loadModel();

        Stereotype ecimMomStereotype = getEcimBaseProfile(originalModel).getOwnedStereotype("EcimMom");
        Stereotype ecimLibraryStereotype = getEcimBaseProfile(originalModel).getOwnedStereotype("EcimLibrary");

        EList<org.eclipse.uml2.uml.Package> originalPackages = originalModel.getNestedPackages();

        File yangFile = null;

        // for every EcimMom or EcimLibrary create a yang file
        for (final Package originalPackage : originalPackages) {
            if (originalPackage.isStereotypeApplied(ecimMomStereotype) || originalPackage.isStereotypeApplied(ecimLibraryStereotype)) {
                File packageNameParameter = ParameterModelHelper.createParameterModelFile(originalPackage.getName());
                yangFile = runYangModuleTransform(monitor, umlModelFile, packageNameParameter, outFolder, originalPackage.getName());

                FileUtils.deleteQuietly(packageNameParameter);
                yangFiles.add(yangFile);
            }
        }
        umh.unloadModel();

        return yangFiles;
    }

    /**
     * Returns the uml profile for "ECIM Base Profile".
     * 
     * @TBD use constant instead for name of profile
     * @param model
     * @return
     */
    private Profile getEcimBaseProfile(Model model) {
        return model.getAppliedProfile("ECIM Base Profile");
    }

    /**
     * Runs the ATL that creates the YANG Module file.
     * 
     * @param monitor
     * @param umlModelFile
     * @param outFolder
     * @param packageName
     * @return
     * @throws EcimTransformationException
     * @throws EcimValidationException
     */
    private File runYangModuleTransform(IProgressMonitor monitor, File umlModelFile, File packageNameParameter, File outFolder, String packageName)
            throws EcimTransformationException, EcimValidationException {
        File yangFile;
        ECIMATLResources atlResources = new YangATLResource(YangATLResource.ECIM_PACKAGE_2_YANG_MODULE);
        atlResources.setParameterFile(packageNameParameter);

        monitor.subTask("Transforming UML Package " + packageName + " to YANG Module");

        yangFile = M2MLauncher.convert(monitor, umlModelFile, new File(outFolder, packageName + ".yang"), atlResources);

        yangFile = addToolVersionsHeader(yangFile);

        monitor.worked(1);
        return yangFile;
    }

    /**
     * Add some tool versioning information to the File.
     * 
     * @return
     */
    public File addToolVersionsHeader(File file) {

        // ensure there is a file before manipulating it
        if (file.exists()) {
            try {
                // construct our custom header details
                String headerData = String.format("/*%n" + "  Copyright (c) " + java.util.Calendar.getInstance().get(java.util.Calendar.YEAR)
                        + " Ericsson AB.%n" + "  All rights reserved%n" + "  DX ECIM Tool-chain generated this file on "
                        + new java.util.Date().toLocaleString() + " using %n" + "    * com.ericsson.ecim.yang.m2m " + YangM2MActivator.getVersion() + "%n"
                        + "*/%n");
                // combine the header with existing file contents and store in original file
                FileUtils.writeStringToFile(file, headerData.concat(FileUtils.readFileToString(file, "UTF-8")), "UTF-8");
            } catch (IOException e) {
                LOGGER.warn(e.getMessage(), e);
            }
        }
        return file;
    }

    /**
     * Returns the plugin versions used by this transformation.
     * 
     * @return
     */
    public String getPluginVersions() {
        StringBuilder sb = new StringBuilder();
        sb.append(" yang.m2m = " + com.ericsson.ecim.yang.m2m.YangM2MActivator.getVersion() + "\n");

        return sb.toString();
    }

}
