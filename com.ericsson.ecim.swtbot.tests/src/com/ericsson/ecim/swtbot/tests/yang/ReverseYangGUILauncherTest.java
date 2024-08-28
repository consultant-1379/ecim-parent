package com.ericsson.ecim.swtbot.tests.yang;

import java.util.Arrays;
import java.util.List;

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.ericsson.ecim.swtbot.tests.ReverseTransformationTest;
import com.ericsson.ecim.swtbot.tests.SWTBotTest;

@RunWith(Parameterized.class)
public class ReverseYangGUILauncherTest extends ReverseTransformationTest {

    public ReverseYangGUILauncherTest(String inputFileName) {
        super(inputFileName);
        this.testFilesPath = SWTBotTest.TEST_MODELS_FOLDER + "YangRe/";
    }

    @Parameters(name = "{index}:{0}")
    public static List<Object[]> parameters() {
        return Arrays.asList(new Object[][] { new Object[] { "simple.yang" } });
    }

}
