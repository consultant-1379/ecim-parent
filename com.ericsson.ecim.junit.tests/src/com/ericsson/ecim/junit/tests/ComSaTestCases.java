package com.ericsson.ecim.junit.tests;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.core.runtime.CoreException;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class ComSaTestCases extends TextTransformationTestCases {
    
    public static final String MODEL_6 = "ComSaSecurityRules.uml";
    public static final String MODEL_7 = "ImmSplitTestModel.uml";
    private static final String LOCAL_MODEL_PATH =  "/COMSA/";
    private static final String MODEL_PATH = GENERAL_TEST_MODEL_PATH + LOCAL_MODEL_PATH;

    @Parameters
    public static Collection<Object[]> prepareParameters() throws CoreException, IOException {
        Collection<Object[]> retCol = new ArrayList<Object[]>();
    
        URL comSaSecurityRulesURL = testModelsBundle.getEntry(MODEL_PATH + MODEL_6);
        retCol.add(initParameters(new ModelContainer(comSaSecurityRulesURL), LOCAL_MODEL_PATH));

        URL immSplitTestURL = testModelsBundle.getEntry(MODEL_PATH + MODEL_7);
        retCol.add(initParameters(new ModelContainer(immSplitTestURL), LOCAL_MODEL_PATH));
        return retCol;
    }
    
    public ComSaTestCases(ModelContainer aModelContainer, ModelConverter aModelConverter, File flattenedUMLFile) throws CoreException, IOException {
        super(aModelContainer, aModelConverter, flattenedUMLFile);
    }

    @Override
    protected boolean modelIsCoreMw() {
        return true;
    }
    
    @Override
    protected boolean modelIsVdicos() { return false; }
    
    @Override
    protected String getTestModelFolderName() {
        return LOCAL_MODEL_PATH;
    }
}
