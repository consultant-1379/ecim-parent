package com.ericsson.ecim.junit.tests;

import static org.junit.Assert.assertFalse;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.logging.Level;

import org.apache.commons.io.FilenameUtils;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;

public final class TestHelper {

    public static final String getGeneratedFilesOutputDirectory(IFile modelFile) {
        return getGeneratedFilesOutputDirectory(modelFile.getName());
    }

    public final static String getGeneratedFilesOutputDirectory(File modelFile) {
        return getGeneratedFilesOutputDirectory(modelFile.getName());
    }

    private final static String getGeneratedFilesOutputDirectory(String modelFileName) {
        return "/" + FilenameUtils.getBaseName(modelFileName) + "_output/";
    }

    public final static IFile initializeFileFromUrl(URL url, IFolder inputFolder) throws CoreException, IOException {
        IFile file = inputFolder.getFile(url.getFile().substring(url.getFile().lastIndexOf('/') + 1));
        if (!file.exists())
            file.create(url.openStream(), true, null);
        return file;
    }

    public final static void setupProjectAndFolders() {
        IProject testProject;
        IFolder inputFolder;
        IFolder outPutFolder;
        IFolder timeStampFolder;
        Boolean logStackTrace = false;
        TestLogger testLogger = new TestLogger("setupProjectAndFolders");
        testProject = ResourcesPlugin.getWorkspace().getRoot().getProject("testProject");
        timeStampFolder = testProject.getFolder(TestsActivator.getTimeStamp());
        inputFolder = timeStampFolder.getFolder("Input");
        outPutFolder = timeStampFolder.getFolder("Output");
        String logStackTraceProperty = System.getProperty("logStackTrace");
        if (logStackTraceProperty != null) {
            logStackTrace = true;
        }
        try {
            if (!testProject.exists()) {
                testProject.create(null);
                testProject.open(null);
            }
            if (!timeStampFolder.exists()) {
                timeStampFolder.create(true, true, null);
            }
            if (!inputFolder.exists()) {
                inputFolder.create(true, true, null);
            }
            if (!outPutFolder.exists()) {
                outPutFolder.create(true, true, null);
            }
        } catch (Exception e) {
            testLogger.log(Level.SEVERE, TestLogger.stackTraceToString(e), logStackTrace);
            assertFalse("Failed to setup project and folders", true);
        }
    }
}
