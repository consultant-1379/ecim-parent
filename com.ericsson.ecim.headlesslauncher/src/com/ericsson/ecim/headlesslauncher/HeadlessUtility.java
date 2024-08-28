package com.ericsson.ecim.headlesslauncher;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.Path;

import com.ericsson.ecim.core.exceptions.EcimException;
import com.ericsson.ecim.core.uml.helpers.Uml2ModelHelper;
import com.ericsson.ecim.launcher.reverse.ReverseTransformation;
import com.ericsson.ecim.launcher.reverse.ReverseTransformationJob;
import com.ericsson.ecim.launcher.reverse.ReverseTransformationRegistry;

public class HeadlessUtility {

    private static final Logger LOGGER = Logger.getLogger(HeadlessUtility.class);

    private HeadlessUtility() {
    }
    
    static File locateResourceInOS(String resourcePath) throws EcimException {
        IWorkspace workspace = ResourcesPlugin.getWorkspace();
        IWorkspaceRoot workspaceRoot = workspace.getRoot();
        IFile modelFile = workspaceRoot.getFile(new Path(resourcePath));
        if (modelFile.isAccessible()) {
            return modelFile.getRawLocation().toFile();
        }
        File osResourceFile = new File(resourcePath);
        if (osResourceFile.exists()) {
            return osResourceFile;
        }
        throw new EcimException("Can't locate model [" + resourcePath + "] either in workspace, nor in OS file system.");
    }

    static Uml2ModelHelper loadModelFromFile(final File modelFile) throws EcimException, IOException {
        Uml2ModelHelper modelHelper = null;
        if (modelFile.exists()) {
            modelHelper = new Uml2ModelHelper(modelFile, false);
        } else {
            throw new EcimException("Cannot access file: " + modelFile.toString());
        }
        if (modelHelper.loadModel() != null) {
            return modelHelper;
        }
        throw new EcimException("Model loading failed for file: " + modelFile.getName());
    }

    /**
     * Function to call the reverse transformation MP.xml to UML and move generated files to specified output folder
     * 
     * @param mpFile
     * @param outputpath
     * @return
     * @throws InterruptedException
     * @throws EcimException
     * @throws CoreException
     */
    static String performReverse2UML(final String reverseId, final File sourceFile, String outputpath) throws InterruptedException, EcimException,
            CoreException {
        System.out.println("Start to reverse: " + sourceFile.getAbsolutePath()); // NOSONAR
        ReverseTransformation reverseTransformation = ReverseTransformationRegistry.getInstance().getReverseTransformation(reverseId);
        List<File> sourceFiles = new ArrayList<File>();
        sourceFiles.add(sourceFile);
        ReverseTransformationJob myjob = reverseTransformation.createReverseJob(sourceFiles);
        myjob.setUser(true);
        myjob.schedule();
        myjob.join();

        // checks if there is any generated model from the reverse
        // engineer transformation, if so add it to model list
        if (myjob.getResult().isOK()) {
            return postProcessReverseJob(myjob, outputpath);
        }
        System.out.println(myjob.getResult().getCode() + ": " + myjob.getResult().getMessage() + "."); // NOSONAR
        throw new EcimException("Failed to reverse engineer " + sourceFile.getAbsolutePath());
    }

    static String postProcessReverseJob(ReverseTransformationJob myjob, String outputpath) {
        // gets relative path from emx file to workspace and adds it
        // to models list
        // this will trigger the execution of all applicable
        // transformations on that particular model
        String reverseResult = myjob.getOutputUmlFile().getAbsolutePath();
        if (outputpath != null) {
            try {
                File outputFolder = new File(outputpath);
                // Remove old files from output folder
                FileUtils.deleteQuietly(new File(outputFolder, myjob.getOutputUmlFile().getName()));
                FileUtils.deleteQuietly(new File(outputFolder, myjob.getOutputDiFile().getName()));
                FileUtils.deleteQuietly(new File(outputFolder, myjob.getOutputNotationFile().getName()));

                // Move new files to output folder
                FileUtils.moveFileToDirectory(myjob.getOutputUmlFile(), outputFolder, true);
                FileUtils.moveFileToDirectory(myjob.getOutputDiFile(), outputFolder, true);
                FileUtils.moveFileToDirectory(myjob.getOutputNotationFile(), outputFolder, true);

                // Return new location of the generated UML file
                reverseResult = new File(outputFolder, myjob.getOutputUmlFile().getName()).getAbsolutePath();
            } catch (Exception e) {
                LOGGER.warn("Could not place generated files in specified output path. Reason: " + e.getMessage(), e);
            }
        }

        System.out.println("Reverse result generated: " + reverseResult); // NOSONAR
        return reverseResult;
    }


}
