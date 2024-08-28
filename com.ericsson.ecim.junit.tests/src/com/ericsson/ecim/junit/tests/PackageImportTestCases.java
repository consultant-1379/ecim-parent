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
public class PackageImportTestCases extends TextTransformationTestCases {

    private static final String LOCAL_MODEL_PATH = "/PackageImportModel/";
    private static final String MODEL_PATH = GENERAL_TEST_MODEL_PATH + LOCAL_MODEL_PATH;

    @Parameters
    public static Collection<Object[]> prepareParameters() throws CoreException, IOException {
        Collection<Object[]> retCol = new ArrayList<Object[]>();
        URL packageImportURL = testModelsBundle.getEntry(MODEL_PATH + "PackageImportModel.uml");
        retCol.add(initParameters(new ModelContainer(packageImportURL), LOCAL_MODEL_PATH));
        return retCol;
    }

    public PackageImportTestCases(ModelContainer aModelContainer, ModelConverter aModelConverter, File flattenedUMLFile) throws CoreException,
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
