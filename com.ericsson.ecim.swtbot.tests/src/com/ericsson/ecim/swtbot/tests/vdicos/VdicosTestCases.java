package com.ericsson.ecim.swtbot.tests.vdicos;

import static org.junit.Assert.fail;

import java.util.Arrays;
import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.ericsson.ecim.swtbot.tests.SWTBotTest;
import com.ericsson.ecim.swtbot.tests.TransformationTest;

@RunWith(Parameterized.class)
public class VdicosTestCases extends TransformationTest {

    private static final String VDICOS_MODEL = "VDicosModel";

    public VdicosTestCases(String testModel, int transforms, long timeout) {
        super(testModel, transforms, timeout);
    }

    @Parameters(name = "{index}:{0}")
    public static List<Object[]> parameters() {
        return Arrays.asList(new Object[][] { new Object[] { VDICOS_MODEL, 7, 100000L } });
    }

    @Override
    protected String getModelPath() {
        return SWTBotTest.TEST_MODELS_FOLDER + "vDicos/";
    }

    @Override
    public void testTransformation() throws CoreException {
        super.testTransformation();
        
        try {
            testMafModelValidator();
        } catch (Exception e) { // NOSONAR
            String message = e.getMessage();
            // The VDicos model has a MOC with no parent to test for:
            // artf415318 : Model transform to mp.dtd compliant XML when there is no external relationship 
            // We therefore need to accept the following MAF validation error
            if (message.contains("ERROR, ModelRepository: Moc (DicosMom~1~FreeLikeABird) has no parent."))
                return;
            fail(e.getMessage());
        }
    }

}
