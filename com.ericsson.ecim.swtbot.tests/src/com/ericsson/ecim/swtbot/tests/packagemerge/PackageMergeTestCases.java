package com.ericsson.ecim.swtbot.tests.packagemerge;

import java.util.Arrays;
import java.util.List;

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.ericsson.ecim.swtbot.tests.SWTBotTest;
import com.ericsson.ecim.swtbot.tests.TransformationTest;

@RunWith(Parameterized.class)
public class PackageMergeTestCases extends TransformationTest {

    private static final String PACKAGE_MERGE_MODEL = "PackageMergeModel";

    public PackageMergeTestCases(String testModel, int transforms) {
        super(testModel, transforms);
    }

    @Parameters(name = "{index}:{0}")
    public static List<Object[]> parameters() {
        return Arrays.asList(new Object[][] { new Object[] { PACKAGE_MERGE_MODEL, 3 } });
    }

    @Override
    protected String getModelPath() {
        return SWTBotTest.TEST_MODELS_FOLDER + "PackageMergeModel/";
    }

}
