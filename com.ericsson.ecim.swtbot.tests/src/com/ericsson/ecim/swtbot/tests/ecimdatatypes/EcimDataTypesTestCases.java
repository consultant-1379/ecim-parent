package com.ericsson.ecim.swtbot.tests.ecimdatatypes;

import java.util.Arrays;
import java.util.List;

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.ericsson.ecim.swtbot.tests.SWTBotTest;
import com.ericsson.ecim.swtbot.tests.TransformationTest;

@RunWith(Parameterized.class)
public class EcimDataTypesTestCases extends TransformationTest {

    private static final String ECIM_DATA_TYPES = "EcimDataTypes";

    public EcimDataTypesTestCases(String testModel, int transforms, long timeout) {
        super(testModel, transforms, timeout);
    }

    @Parameters(name = "{index}:{0}")
    public static List<Object[]> parameters() {
        return Arrays.asList(new Object[][] { new Object[] { ECIM_DATA_TYPES, 6, 75000L } });
    }

    @Override
    protected String getModelPath() {
        return SWTBotTest.TEST_MODELS_FOLDER + "EcimDataTypes/";
    }

}
