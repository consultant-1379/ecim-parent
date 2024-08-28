package com.ericsson.ecim.validator;

import static org.junit.Assert.fail;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

import org.junit.Test;

public class ECIMValidatorTest {

    private InputStream tspMimDTD = ECIMValidatorTest.class.getClassLoader().getResourceAsStream("unittest/tsp_mim.dtd");
    
    @Test
    public void testValidateAgainstDTDSuccess() {
        URL targetURL = ECIMValidatorTest.class.getClassLoader().getResource("unittest/ComTop_mim_success.xml");
        ECIMValidator ecimValidator = new ECIMValidator();
        try {
            ecimValidator.validateAgainstDTD(targetURL.openStream(), tspMimDTD);
        } catch (Exception e) { // NOSONAR
            fail(e.getMessage());
        }
    }

    
    @Test(expected=EcimValidationException.class)
    public void testValidateAgainstDTDFailed() throws EcimValidationException {
        URL targetURL = ECIMValidatorTest.class.getClassLoader().getResource("unittest/ComTop_mim_failed.xml");
        ECIMValidator ecimValidator = new ECIMValidator();
        try {
            ecimValidator.validateAgainstDTD(targetURL.openStream(), tspMimDTD);
        } catch (IOException e) { // NOSONAR
            fail(e.getMessage());
        }
    }

}
