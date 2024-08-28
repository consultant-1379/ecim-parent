package com.ericsson.ecim.junit.tests;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.core.runtime.CoreException;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.osgi.framework.Bundle;

@RunWith(Parameterized.class)
public class FmTestCases extends TextTransformationTestCases {

    public static final String FM_LIB_MODEL = "FmAlarmTypeTestLibrary.uml";
    private static final String LOCAL_MODEL_PATH = "/FM/";
    private static final String MODEL_PATH = GENERAL_TEST_MODEL_PATH + LOCAL_MODEL_PATH;

    @Parameters
    public static Collection<Object[]> prepareParameters() throws CoreException, IOException {
        Collection<Object[]> retCol = new ArrayList<Object[]>();
        Bundle testModelsBundle = TestsActivator.getDefault().getBundle();
        retCol.add(initParameters(new ModelContainer(testModelsBundle.getEntry(MODEL_PATH + FM_LIB_MODEL)),
                LOCAL_MODEL_PATH));
        return retCol;
    }

    public FmTestCases(ModelContainer aModelContainer, ModelConverter aModelConverter, File flattenedUMLFile)
            throws CoreException, IOException {
        super(aModelContainer, aModelConverter, flattenedUMLFile);
    }

    @Override
    protected boolean modelIsCoreMw() {
        return FM_LIB_MODEL.equals(getModelFile().getName());
    }

    @Override
    protected boolean modelIsVdicos() {
        return false;
    }

    @Override
    protected String getTestModelFolderName() {
        return LOCAL_MODEL_PATH;
    }
}
