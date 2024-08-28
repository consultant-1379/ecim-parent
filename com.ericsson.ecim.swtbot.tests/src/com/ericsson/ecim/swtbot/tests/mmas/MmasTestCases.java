package com.ericsson.ecim.swtbot.tests.mmas;

import java.util.Arrays;
import java.util.List;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.runtime.CoreException;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.ericsson.ecim.core.helpers.XmlDiffException;
import com.ericsson.ecim.swtbot.tests.SWTBotTest;
import com.ericsson.ecim.swtbot.tests.TransformationTest;

@RunWith(Parameterized.class)
public class MmasTestCases extends TransformationTest {

    private static final String MMAS_MODEL = "MMAS_Model";

    public MmasTestCases(String testModel, int transforms, long timeout) {
        super(testModel, transforms, timeout);
    }

    @Parameters(name = "{index}:{0}")
    public static List<Object[]> parameters() {
        return Arrays.asList(new Object[][] { new Object[] { MMAS_MODEL, 7, 250000L } });
    }

    @Override
    protected String getModelPath() {
        return SWTBotTest.TEST_MODELS_FOLDER + "MMAS/";
    }

    @Override
    protected void compareTransformationResult(IFolder outputFolder, IFolder goldenFolder) throws XmlDiffException, CoreException  {
        super.compareTransformationResult(outputFolder, goldenFolder);
        // TODO Check Java Output
    }
    
}
