package com.ericsson.ecim.swtbot.tests.packageimport;

import java.util.Arrays;
import java.util.List;

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.ericsson.ecim.swtbot.tests.SWTBotTest;
import com.ericsson.ecim.swtbot.tests.TransformationTest;

@RunWith(Parameterized.class)
public class PackageImportTestCases extends TransformationTest {

    private static final String PACKAGE_IMPORT_MODEL = "PackageImportModel";

    public PackageImportTestCases(String testModel, int transforms, long timeout) {
        super(testModel, transforms, timeout);
    }

    @Parameters(name = "{index}:{0}")
    public static List<Object[]> parameters() {
        return Arrays.asList(new Object[][] { new Object[] { PACKAGE_IMPORT_MODEL, 6, 90000L } });
    }

    @Override
    protected String getModelPath() {
        return SWTBotTest.TEST_MODELS_FOLDER + "PackageImportModel/";
    }

}
