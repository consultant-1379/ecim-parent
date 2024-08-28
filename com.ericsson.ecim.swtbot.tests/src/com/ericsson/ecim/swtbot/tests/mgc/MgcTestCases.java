package com.ericsson.ecim.swtbot.tests.mgc;

import java.util.Arrays;
import java.util.List;

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.ericsson.ecim.swtbot.tests.SWTBotTest;
import com.ericsson.ecim.swtbot.tests.TransformationTest;

@RunWith(Parameterized.class)
public class MgcTestCases extends TransformationTest {

    private static final String MGC_WORKING_TESTMODEL = "MGCWorkingTestModel";
    private static final String MGC_MODEL3 = "MGCModel3";

    public MgcTestCases(String testModel, int transforms) {
        super(testModel, transforms);
    }

    @Parameters(name = "{index}:{0}")
    public static List<Object[]> parameters() {
        return Arrays.asList(new Object[][] { new Object[] { MGC_WORKING_TESTMODEL, 7 },
                new Object[] { MGC_MODEL3, 7 } });
    }

    @Override
    protected String getModelPath() {
        return SWTBotTest.TEST_MODELS_FOLDER + "MGC/";
    }

}
