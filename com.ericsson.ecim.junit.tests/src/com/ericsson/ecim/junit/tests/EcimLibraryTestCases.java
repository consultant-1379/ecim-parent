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
public class EcimLibraryTestCases extends TextTransformationTestCases {

    public static final String COM_TOP = "ComTop_MyLibraryUser.uml";
    public static final String MY_LIBRARY_USER = "MyLibraryUser.uml";
    public static final String MY_ECIM_LIBRARY = "MyEcimLibrary.uml";
    private static final String LOCAL_MODEL_PATH = "/EcimLibrary/";
    private static final String MODEL_PATH = GENERAL_TEST_MODEL_PATH + LOCAL_MODEL_PATH;

    @Parameters
    public static Collection<Object[]> prepareParameters() throws CoreException, IOException {
        Collection<Object[]> retCol = new ArrayList<Object[]>();
        URL comTopURL = testModelsBundle.getEntry(MODEL_PATH + COM_TOP);
        URL myEcimLibraryURL = testModelsBundle.getEntry(MODEL_PATH + MY_ECIM_LIBRARY);
        URL myLibraryUserURL = testModelsBundle.getEntry(MODEL_PATH + MY_LIBRARY_USER);
        retCol.add(initParameters(new ModelContainer(comTopURL), LOCAL_MODEL_PATH));
        retCol.add(initParameters(new ModelContainer(myEcimLibraryURL), LOCAL_MODEL_PATH));
        retCol.add(initParameters(new ModelContainer(myLibraryUserURL), LOCAL_MODEL_PATH));

        return retCol;
    }
    
    public EcimLibraryTestCases(ModelContainer aModelContainer, ModelConverter aModelConverter, File flattenedUMLFile) throws CoreException,
            IOException {
        super(aModelContainer, aModelConverter, flattenedUMLFile);
    }

    @Override
    protected boolean modelIsCoreMw() {
        return true;
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
