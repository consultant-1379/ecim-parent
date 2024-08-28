package com.ericsson.ecim.swtbot.tests.misccomplex;

import static org.junit.Assert.fail;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.ericsson.ecim.swtbot.tests.SWTBotTest;
import com.ericsson.ecim.swtbot.tests.TransformationTest;

@RunWith(Parameterized.class)
public class MiscComplexTestCases extends TransformationTest {

    public static final String MOM_2_HTML_TEST_MODEL = "Mom2HtmlTest";
    public static final String FULL_CORE_MW_MODEL = "FullCoreMWModel";
    public static final String MIBS_AND_OBJECTS = "MibsAndObjects";
    public static final String MULTIPLE_INHERITANCE = "MultipleInheritance";
    public static final String ECIMMMREVB_INHERITANCE = "ECIMMMRevB_Inheritance";
    public static final String BIDIRASSOCIATION_MODEL = "BiDirAssociationModel";
    public static final String CROSSINHERITANCE1_MODEL = "CrossInheritance1";
    public static final String CROSSINHERITANCE2_MODEL = "CrossInheritance2";

    public MiscComplexTestCases(String testModel, int transforms, long timeout) {
        super(testModel, transforms, timeout);
    }

    @Parameters(name = "{index}:{0}")
    public static List<Object[]> parameters() {
        return Arrays.asList(new Object[][] { 
                new Object[] { MOM_2_HTML_TEST_MODEL, 6, 150000L }, 
                new Object[] { FULL_CORE_MW_MODEL, 6, 150000L },
                new Object[] { MIBS_AND_OBJECTS, 6, DEFAULT_TIMEOUT }, 
                new Object[] { MULTIPLE_INHERITANCE, 3, 150000L }, 
                new Object[] { ECIMMMREVB_INHERITANCE, 3, DEFAULT_TIMEOUT },
                new Object[] { BIDIRASSOCIATION_MODEL, 6, DEFAULT_TIMEOUT }, 
                new Object[] { CROSSINHERITANCE1_MODEL, 6, 150000L }, 
                new Object[] { CROSSINHERITANCE2_MODEL, 6, 150000L }
            }
        );
    }

    @Override
    protected String getModelPath() {
        return SWTBotTest.TEST_MODELS_FOLDER + "MiscComplex/";
    }

    @Override
    public void testTransformation() throws CoreException {
        super.testTransformation();
        // Skip CrossIneritance2Model MafValdiation temporary
        if(!currentTestModel.equals(CROSSINHERITANCE2_MODEL)) {
            try {
                testMafModelValidator();
            } catch (IOException e) { //NOSONAR
                fail(e.getMessage());
            }
        }
    }
}
