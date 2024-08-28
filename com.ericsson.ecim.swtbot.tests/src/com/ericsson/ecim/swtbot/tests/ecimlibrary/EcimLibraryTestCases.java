package com.ericsson.ecim.swtbot.tests.ecimlibrary;

import static org.junit.Assert.fail;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.ericsson.ecim.swtbot.tests.SWTBotTest;
import com.ericsson.ecim.swtbot.tests.TransformationTest;

@RunWith(Parameterized.class)
public class EcimLibraryTestCases extends TransformationTest {

    private static final String COM_TOP_MYLIBRARYUSER = "ComTop_MyLibraryUser";
    private static final String MY_LIBRARY_USER = "MyLibraryUser";
    private static final String MY_ECIM_LIBRARY = "MyEcimLibrary";

    public EcimLibraryTestCases(String testModel, int transforms, long timeout) {
        super(testModel, transforms, timeout);
    }

    @Parameters(name = "{index}:{0}")
    public static List<Object[]> parameters() {
        return Arrays.asList(new Object[][] { 
                new Object[] { COM_TOP_MYLIBRARYUSER, 6, DEFAULT_TIMEOUT }, 
                new Object[] { MY_ECIM_LIBRARY, 6, DEFAULT_TIMEOUT },
                new Object[] { MY_LIBRARY_USER, 6, 90000L }
        });
    }

    @Override
    protected String getModelPath() {
        return SWTBotTest.TEST_MODELS_FOLDER + "EcimLibrary/";
    }

    @Override
    public void testTransformation() throws CoreException {
        super.testTransformation();
        try {
            testMafModelValidator();
        } catch (IOException e) { //NOSONAR
            fail(e.getMessage());
        }
    }

}
