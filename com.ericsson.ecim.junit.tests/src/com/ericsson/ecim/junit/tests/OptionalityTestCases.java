package com.ericsson.ecim.junit.tests;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.core.runtime.CoreException;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class OptionalityTestCases extends TextTransformationTestCases {

    private static final String LOCAL_MODEL_PATH = "/Optionality/";
    private static final String MODEL_PATH = GENERAL_TEST_MODEL_PATH + LOCAL_MODEL_PATH;

    @Parameters
    public static Collection<Object[]> prepareParameters() throws CoreException, IOException {
        Collection<Object[]> retCol = new ArrayList<Object[]>();
        retCol.add(initParameters(new ModelContainer(testModelsBundle.getEntry(MODEL_PATH + "OptionalityModel1.uml")), LOCAL_MODEL_PATH));
        retCol.add(initParameters(new ModelContainer(testModelsBundle.getEntry(MODEL_PATH + "OptionalityModel3.uml")), LOCAL_MODEL_PATH));
        return retCol;
    }
    
    public OptionalityTestCases(ModelContainer aModelContainer, ModelConverter aModelConverter, File flattenedUMLFile) throws CoreException,
            IOException {
        super(aModelContainer, aModelConverter, flattenedUMLFile);
    }

    @Override
    public void testUml2Mp() throws Exception {
    }

    @Override
    public void testUml2Yang() throws Exception {
    }

    @Override
    protected boolean modelHasOptionality() {
        return true;
    }

    @Override
    protected boolean modelIsCoreMw() {
        return false;
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
