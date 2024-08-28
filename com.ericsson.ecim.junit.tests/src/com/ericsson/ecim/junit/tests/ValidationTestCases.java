package com.ericsson.ecim.junit.tests;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.uml2.uml.Model;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;

import com.ericsson.ecim.core.exceptions.EcimException;
import com.ericsson.ecim.core.uml.helpers.Uml2ModelHelper;
import com.ericsson.ecim.launcher.transformations.internal.TransformationUtils;
import com.ericsson.ecim.validator.InstanceValueChecker;

public class ValidationTestCases extends CommonTestCases {

    private static final Logger logger = Logger.getLogger(ValidationTestCases.class);
    private static final String LOCAL_MODEL_PATH = "/Validation/";

    private static Uml2ModelHelper umh;

    public ValidationTestCases() throws CoreException, IOException {
        super();
        initialize(
                new ModelContainer(TestsActivator.getDefault().getBundle()
                        .getEntry(GENERAL_TEST_MODEL_PATH + LOCAL_MODEL_PATH + "NegativeTC.emx")),
                testProjectFolder.append(GENERAL_TEST_MODEL_PATH + LOCAL_MODEL_PATH));
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
    public void testOutOfRange() throws EcimException {
        // Checks that the model error is reported. Test fails if expected error
        // is not detected!
        logger.info("testOutOfRange!");
        validateInstanceValues(
                umh.getModel(),
                new String[] { "NegativeTC::N1::N1Root::outOfRangeDefault1 (Integer value '1000' does not fit into an EcimInt8)" });
    }

    @Test
    public void testStructOCL() throws Exception {
        // Checks that the model error is reported. Test fails if expected error
        // is not detected!
        logger.info("testStructOCL!");
        validateOCL(umh.getModel(), new String[] { "bvla" });
    }

    @Test
    public void testMMA() throws Exception {
        // Checks that the model error is reported. Test fails if expected error
        // is not detected!
        logger.info("testMMA!");
        validateMMA(umh.getModel(), new String[] { "error,Invalid property value,Package,N1,NegativeTC::N1,release" });
    }

    /**
     * 
     */
    public void validateInstanceValues(Model model, String[] expectedErrorMessages) throws EcimException {
        try {
            InstanceValueChecker valueTypeChecker = new InstanceValueChecker(model);
            valueTypeChecker.validate(expectedErrorMessages);
        } catch (EcimException e) {
            throw e;
        }
    }

    /**
     * 
     */
    public void validateOCL(Model model, String[] expectedErrorMessages) throws Exception {
        try {
            TransformationUtils tu = new TransformationUtils();
            tu.runModelValidation(model, null, expectedErrorMessages);
        } catch (EcimException e) {
            throw e;
        }
    }

    /**
     * 
     */
    public void validateMMA(Model model, String[] expectedErrorMessages) throws EcimException {
        try {
            TransformationUtils tu = new TransformationUtils();
            tu.runMMAValidation(model, null, expectedErrorMessages);
        } catch (EcimException e) {
            throw e;
        }
    }

}
