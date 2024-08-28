package com.ericsson.ecim.junit.tests;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.eclipse.core.runtime.CoreException;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;

import com.ericsson.ecim.core.uml.helpers.Uml2ModelHelper;
import com.ericsson.ecim.optionality.processor.OptionalityConstraints;
import com.ericsson.ecim.validator.EcimValidationException;

public class OptionalityTestCasesNegative extends CommonTestCases {
    
    private static final Logger logger = Logger.getLogger(OptionalityTestCasesNegative.class);
    private static final String LOCAL_MODEL_PATH = "/Optionality/";
    private static Uml2ModelHelper umh;

    public OptionalityTestCasesNegative() throws CoreException, IOException {
        super();
        initialize(new ModelContainer(TestsActivator.getDefault().getBundle()
                .getEntry(
                        GENERAL_TEST_MODEL_PATH + LOCAL_MODEL_PATH
                                + "FailParseException.emx")), testProjectFolder
                .append(GENERAL_TEST_MODEL_PATH + LOCAL_MODEL_PATH));
    }
    
    @Override
    protected String getTestModelFolderName() {
        return LOCAL_MODEL_PATH;
    }
    
    /**
     * Sets up reference to the model helper, to be shared for all test methods.
     * Note: We cannot have this setUp method declared with @BeforeClass because
     * then the modelConverter base class variable has not been set.
     * 
     * @throws IOException
     */
    @Before
    public void setUp() throws IOException {
        if (umh == null) {
            umh = modelConverter.getModelHelper();
            umh.loadModel();
        }
    }

    /**
     * Unloads the model, once all tests have been run.
     */
    @AfterClass
    public static void tearDown() {
        if (umh != null)
            umh.unloadModel();
    }

    @Test
    public void testParseException() throws Exception{
        // Checks that the model error is reported. Test fails if expected error
        // is not detected!
        
        logger.info("Optionality Constraint Validation: Starting");
        try
        {
            //parse the decision model constraints
            OptionalityConstraints ocs = new OptionalityConstraints(umh.getModel());
        }
        catch(EcimValidationException ee)
        {
            String exceptionMessage = ee.getStatus().getMessage();
            
            if(!exceptionMessage.equals("Failed to parse optionality constraint expressions. Location of parse error: [FailInvalidExpression::A::A]"))
            {
                throw ee;
            }
        }
        logger.info("Optionality Constraint Validation: Completed");        
    }
    
}
