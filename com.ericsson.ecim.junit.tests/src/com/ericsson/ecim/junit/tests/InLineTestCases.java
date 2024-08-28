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
public class InLineTestCases extends TextTransformationTestCases {

    private static final String LOCAL_MODEL_PATH = "/InlineTypes/";
    private static final String MODEL_PATH = GENERAL_TEST_MODEL_PATH + LOCAL_MODEL_PATH;
    public static final String COM_INLINE_DATATYPES = "COMInlineDataTypes.uml";
    public static final String CPP_INLINE_DATATYPES = "CPPInlineDataTypes.uml";

    @Parameters
    public static Collection<Object[]> prepareParameters() throws CoreException, IOException {
        Collection<Object[]> retCol = new ArrayList<Object[]>();
        retCol.add(initParameters(new ModelContainer(testModelsBundle.getEntry(MODEL_PATH + COM_INLINE_DATATYPES)), LOCAL_MODEL_PATH));
        retCol.add(initParameters(new ModelContainer(testModelsBundle.getEntry(MODEL_PATH + CPP_INLINE_DATATYPES)), LOCAL_MODEL_PATH));
        return retCol;
    }
    
    public InLineTestCases(ModelContainer aModelContainer, ModelConverter aModelConverter, File flattenedUMLFile) throws CoreException, IOException {
        super(aModelContainer, aModelConverter, flattenedUMLFile);
    }

    @Override
    protected boolean modelIsCoreMw() {
        return true;
    }

    @Override
    protected boolean modelIsCPP() {
        return CPP_INLINE_DATATYPES.equals(getModelFile().getName());
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
