package com.ericsson.ecim.swtbot.tests.fm;

import java.util.Arrays;
import java.util.List;

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.ericsson.ecim.swtbot.tests.SWTBotTest;
import com.ericsson.ecim.swtbot.tests.TransformationTest;

@RunWith(Parameterized.class)
public class FmTestCases extends TransformationTest {

    private static final String FM_ALARM_TYPE_TEST_LIBRARY = "FmAlarmTypeTestLibrary";

    public FmTestCases(String testModel, int transforms) {
        super(testModel, transforms);
    }

    @Parameters(name = "{index}:{0}")
    public static List<Object[]> parameters() {
        return Arrays.asList(new Object[][] { new Object[] { FM_ALARM_TYPE_TEST_LIBRARY, 6 } });
    }

    @Override
    protected String getModelPath() {
        return SWTBotTest.TEST_MODELS_FOLDER + "FM/";
    }

}
