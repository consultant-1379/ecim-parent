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
public class MiscComplexTestCases extends TextTransformationTestCases {

    public static final String MOM_2_HTML_TEST_MODEL_FILE = "Mom2HtmlTest.uml";
    public static final String FULL_CORE_MW_MODEL = "FullCoreMWModel.uml";
    public static final String MIBS_AND_OBJECTS = "MibsAndObjects.uml";
    public static final String MULTIPLE_INHERITANCE = "MultipleInheritance.uml";
    public static final String ECIMMMRevB_INHERITANCE = "ECIMMMRevB_Inheritance.uml";
    public static final String BIDIRASSOCIATION_MODEL = "BiDirAssociationModel.uml";
    public static final String CROSSINHERITANCE1_MODEL = "CrossInheritance1.uml";
    public static final String CROSSINHERITANCE2_MODEL = "CrossInheritance2.uml";    
    private static final String LOCAL_MODEL_PATH = "/MiscComplex/";
    private static final String MODEL_PATH = GENERAL_TEST_MODEL_PATH + LOCAL_MODEL_PATH;

    @Parameters
    public static Collection<Object[]> prepareParameters() throws CoreException, IOException {
        Collection<Object[]> retCol = new ArrayList<Object[]>();
        retCol.add(initParameters(new ModelContainer(testModelsBundle.getEntry(MODEL_PATH + FULL_CORE_MW_MODEL)), LOCAL_MODEL_PATH));
        retCol.add(initParameters(new ModelContainer(testModelsBundle.getEntry(MODEL_PATH + MOM_2_HTML_TEST_MODEL_FILE)), LOCAL_MODEL_PATH));
        retCol.add(initParameters(new ModelContainer(testModelsBundle.getEntry(MODEL_PATH + MIBS_AND_OBJECTS)), LOCAL_MODEL_PATH));
        retCol.add(initParameters(new ModelContainer(testModelsBundle.getEntry(MODEL_PATH + MULTIPLE_INHERITANCE)), LOCAL_MODEL_PATH));
        retCol.add(initParameters(new ModelContainer(testModelsBundle.getEntry(MODEL_PATH + ECIMMMRevB_INHERITANCE)), LOCAL_MODEL_PATH));
        retCol.add(initParameters(new ModelContainer(testModelsBundle.getEntry(MODEL_PATH + BIDIRASSOCIATION_MODEL)), LOCAL_MODEL_PATH));
        retCol.add(initParameters(new ModelContainer(testModelsBundle.getEntry(MODEL_PATH + CROSSINHERITANCE1_MODEL)), LOCAL_MODEL_PATH));
        retCol.add(initParameters(new ModelContainer(testModelsBundle.getEntry(MODEL_PATH + CROSSINHERITANCE2_MODEL)), LOCAL_MODEL_PATH));        
        return retCol;
    }

    public MiscComplexTestCases(ModelContainer aModelContainer, ModelConverter aModelConverter, File flattenedUMLFile) throws CoreException,
            IOException {
        super(aModelContainer, aModelConverter, flattenedUMLFile);
    }

    @Override
    protected boolean modelIsCoreMw() {
        return !(MULTIPLE_INHERITANCE.equals(getModelFile().getName()) || ECIMMMRevB_INHERITANCE.equals(getModelFile().getName()));
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