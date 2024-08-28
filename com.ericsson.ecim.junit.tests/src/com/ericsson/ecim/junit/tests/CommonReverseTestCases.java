package com.ericsson.ecim.junit.tests;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.junit.After;
import org.junit.AfterClass;

import com.ericsson.ecim.core.CoreActivator;

public abstract class CommonReverseTestCases {

    protected static IProject testProject;
    protected static IFolder timeStampFolder;

    static {
        try {
            testProject = ResourcesPlugin.getWorkspace().getRoot().getProject("testProject");
            if (!testProject.exists()) {
                testProject.create(null);
                testProject.open(null);
            }
        } catch (CoreException e) {
            e.printStackTrace();
        }
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
        CoreActivator.setRunningHeadless(false);
    }

    @After
    public void tearDown() throws Exception {
        timeStampFolder.getProject().refreshLocal(IResource.DEPTH_INFINITE, null);
    }

}
