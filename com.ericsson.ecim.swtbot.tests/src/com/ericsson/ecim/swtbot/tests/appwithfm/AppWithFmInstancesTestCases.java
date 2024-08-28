package com.ericsson.ecim.swtbot.tests.appwithfm;

import java.util.Arrays;
import java.util.List;

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.ericsson.ecim.swtbot.tests.SWTBotTest;
import com.ericsson.ecim.swtbot.tests.TransformationTest;

@RunWith(Parameterized.class)
public class AppWithFmInstancesTestCases extends TransformationTest {

    private static final String CMW_APPLX = "CmwApplX";
    private static final String FM_PACKAGE_MERGE = "FmPackageMerge";


    public AppWithFmInstancesTestCases(String testModel, int transforms) {
        super(testModel, transforms);
    }

    @Parameters(name = "{index}:{0}")
    public static List<Object[]> parameters() {
        return Arrays.asList(new Object[][] { new Object[] { CMW_APPLX, 6 }, new Object[] { FM_PACKAGE_MERGE, 3 } });
    }

    @Override
    protected String getModelPath() {
        return SWTBotTest.TEST_MODELS_FOLDER + "AppWithFmInstances/";
    }

}
