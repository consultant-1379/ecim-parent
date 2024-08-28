package com.ericsson.ecim.swtbot.tests.inline;

import java.util.Arrays;
import java.util.List;

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.ericsson.ecim.swtbot.tests.SWTBotTest;
import com.ericsson.ecim.swtbot.tests.TransformationTest;

@RunWith(Parameterized.class)
public class InlineTestCases extends TransformationTest {

    private static final String COM_INLINE_DATA_TYPES = "COMInlineDataTypes";
    private static final String CPP_INLINE_DATA_TYPES = "CPPInlineDataTypes";

    public InlineTestCases(String testModel, int transforms, long timeout) {
        super(testModel, transforms, timeout);
    }

    @Parameters(name = "{index}:{0}")
    public static List<Object[]> parameters() {
        return Arrays.asList(new Object[][] { new Object[] { COM_INLINE_DATA_TYPES, 6, 90000L },
                new Object[] { CPP_INLINE_DATA_TYPES, 7, 60000L } });
    }

    @Override
    protected String getModelPath() {
        return SWTBotTest.TEST_MODELS_FOLDER + "InlineTypes/";
    }

}
