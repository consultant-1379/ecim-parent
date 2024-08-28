package com.ericsson.ecim.junit.tests;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.core.runtime.CoreException;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.osgi.framework.Bundle;

@RunWith(Parameterized.class)
public class EpgTestCases extends TextTransformationTestCases {

    private static final String LOCAL_MODEL_PATH = "/EPG/";
    
    @Parameters
    public static Collection<ModelContainer[]> data() throws CoreException, IOException {
        Collection<ModelContainer[]> retCol = new ArrayList<ModelContainer[]>();
        
        Bundle testModelsBundle = TestsActivator.getDefault().getBundle();
        retCol.add(new ModelContainer[] {new ModelContainer(testModelsBundle.getEntry(GENERAL_TEST_MODEL_PATH + LOCAL_MODEL_PATH + "Epg.uml"))});
        
        return retCol;
    }

    public EpgTestCases(ModelContainer modelUrlContainer) throws CoreException, IOException{
        super(modelUrlContainer, testProjectFolder.append(GENERAL_TEST_MODEL_PATH + LOCAL_MODEL_PATH));
        
    }

    @Override
    protected boolean modelIsCoreMw() { return false; }
    
    @Override
    protected boolean modelIsVdicos() { return false; }
    
    @Override
    protected String getTestModelFolderName() {
        return LOCAL_MODEL_PATH;
    }
    
}
