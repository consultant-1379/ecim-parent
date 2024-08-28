package com.ericsson.ecim.swtbot.tests.optionality;

import java.util.Arrays;
import java.util.List;

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.ericsson.ecim.swtbot.tests.OptionalityTransformationTest;
import com.ericsson.ecim.swtbot.tests.SWTBotTest;

@RunWith(Parameterized.class)
public class OptionalityTestCases extends OptionalityTransformationTest {

    // TODO Need to run MafModelValidator
    private static final String OPTIONALITY_MODEL1 = "OptionalityModel1";
    private static final String OPTIONALITY_MODEL3 = "OptionalityModel3";
    
    public OptionalityTestCases(String testModel, int transforms, long timeout) {
        super(testModel, transforms, timeout);
    }

    @Parameters(name = "{index}:{0}")
    public static List<Object[]> parameters() {
        return Arrays.asList(new Object[][] {
            new Object[] { OPTIONALITY_MODEL1, 3, 450000L },
            new Object[] { OPTIONALITY_MODEL3, 3, 300000L }
        });
    }

    @Override
    public String getModelPath() {
        return SWTBotTest.TEST_MODELS_FOLDER + "Optionality/";
    }
    
}
