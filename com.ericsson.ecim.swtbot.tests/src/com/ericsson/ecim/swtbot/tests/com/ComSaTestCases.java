package com.ericsson.ecim.swtbot.tests.com;

import java.util.Arrays;
import java.util.List;

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.ericsson.ecim.swtbot.tests.SWTBotTest;
import com.ericsson.ecim.swtbot.tests.TransformationTest;

@RunWith(Parameterized.class)
public class ComSaTestCases extends TransformationTest {

    private static final String COMSA_SECURITIY_RULES = "ComSaSecurityRules";
    private static final String IMM_SPLIT_TEST_MODEL = "ImmSplitTestModel";

    public ComSaTestCases(String testModel, int transforms) {
        super(testModel, transforms);
    }

    @Parameters(name = "{index}:{0}")
    public static List<Object[]> parameters() {
        return Arrays.asList(new Object[][] { new Object[] { COMSA_SECURITIY_RULES, 6 },
                new Object[] { IMM_SPLIT_TEST_MODEL, 6 } });
    }

    @Override
    protected String getModelPath() {
        return SWTBotTest.TEST_MODELS_FOLDER + "COMSA/";
    }

}
