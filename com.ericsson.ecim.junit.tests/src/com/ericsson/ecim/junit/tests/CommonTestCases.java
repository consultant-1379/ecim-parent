package com.ericsson.ecim.junit.tests;

import static com.ericsson.ecim.junit.tests.TestHelper.setupProjectAndFolders;

import java.io.File;
import java.io.IOException;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.osgi.framework.Bundle;

import com.ericsson.ecim.core.CoreActivator;

public abstract class CommonTestCases {

    protected static final IFolder inputFolder;
    protected static final IFolder outputFolder;
    protected static final IPath testProjectFolder;
    protected static final String GENERAL_TEST_MODEL_PATH = "/TestModels/";

    protected static Bundle testModelsBundle = TestsActivator.getDefault().getBundle();

    protected ModelContainer modelContainer;
    protected ModelConverter modelConverter;
    protected File flattenedUmlFile;

    public CommonTestCases() {
    }

    protected void initialize(ModelContainer aModelContainer, IPath testModelFolder) throws CoreException, IOException {
        modelContainer = aModelContainer;
        modelContainer.initialize(getInputFolder());
        modelConverter = new ModelConverter(modelContainer, getOutputFolder().getLocation().toFile(), testModelFolder);
    }

    protected void setModelConverter(ModelConverter aModelConverter) {
        this.modelConverter = aModelConverter;
    }

    protected void setFlattenedUmlFile(File aFlattenedUmlFile) {
        this.flattenedUmlFile = aFlattenedUmlFile;
    }

    protected void setModelContainer(ModelContainer aModelContainer) {
        this.modelContainer = aModelContainer;
    }

    public IFile getModelFile() {
        return modelContainer.getEmxFile();
    }

    static {
        String noMMA = System.getProperty("noMMA");
        if (noMMA != null) {
            TestsActivator.getDefault().getLog().log(new Status(Status.INFO, TestsActivator.PLUGIN_ID, "Disable MMA validation in JUnitTest"));
            CoreActivator.setRunningWithMMA(false);
        }
        setupProjectAndFolders();
        IProject testProject = ResourcesPlugin.getWorkspace().getRoot().getProject("testProject");
        IFolder timeStampFolder = testProject.getFolder(TestsActivator.getTimeStamp());
        inputFolder = timeStampFolder.getFolder("Input");
        outputFolder = timeStampFolder.getFolder("Output");
        testProjectFolder = new Path(TestsActivator.getDefault().getBundle().getLocation());
    }

    protected IFolder getInputFolder() throws CoreException {
        IFolder folder = inputFolder.getFolder(getTestModelFolderName().replaceAll("/", ""));

        if (!folder.exists()) {
            folder.create(true, true, null);
        }
        return folder;
    }

    protected static IFolder getInputFolder(String modelFolderName) throws CoreException {
        IFolder folder = inputFolder.getFolder(modelFolderName.replaceAll("/", ""));

        if (!folder.exists()) {
            folder.create(true, true, null);
        }
        return folder;
    }

    protected IFolder getOutputFolder() throws CoreException {
        IFolder folder = outputFolder.getFolder(getTestModelFolderName().replaceAll("/", ""));

        if (!folder.exists()) {
            folder.create(true, true, null);
        }
        return folder;
    }

    protected static IFolder getOutputFolder(String modelFolderName) throws CoreException {
        IFolder folder = outputFolder.getFolder(modelFolderName.replaceAll("/", ""));

        if (!folder.exists()) {
            folder.create(true, true, null);
        }
        return folder;
    }

    abstract String getTestModelFolderName();

}
