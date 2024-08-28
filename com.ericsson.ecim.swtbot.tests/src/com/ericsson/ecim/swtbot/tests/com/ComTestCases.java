package com.ericsson.ecim.swtbot.tests.com;

import java.util.Arrays;
import java.util.List;

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.ericsson.ecim.swtbot.tests.SWTBotTest;
import com.ericsson.ecim.swtbot.tests.TransformationTest;

@RunWith(Parameterized.class)
public class ComTestCases extends TransformationTest {

    private static final String COM_TOP = "ComTop";
    private static final String COM_SYSM = "ComSysM";
    private static final String COM_SECM = "ComSecM";
    private static final String COM_LOCAL_AUTH = "ComLocalAuthorization";
    private static final String COM_FM = "ComFm";

    public ComTestCases(String testModel, int transforms) {
        super(testModel, transforms);
    }

    @Parameters(name = "{index}:{0}")
    public static List<Object[]> parameters() {
        return Arrays.asList(new Object[][] { 
                new Object[] { COM_TOP, 3 },
                new Object[] { COM_SYSM, 3 },
                new Object[] { COM_SECM, 3 },
                new Object[] { COM_LOCAL_AUTH, 3 },
                new Object[] { COM_FM, 3 }
        });
    }

    @Override
    protected String getModelPath() {
        return SWTBotTest.TEST_MODELS_FOLDER + "COM/";
    }

}
