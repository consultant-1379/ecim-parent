package com.ericsson.ecim.yang.launcher.extension;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.ericsson.ecim.core.CoreActivator;
import com.ericsson.ecim.core.exceptions.EcimException;
import com.ericsson.ecim.validator.EcimValidationException;

public class PyangValidatorTest {

    private static PyangValidator validator;
    private static String pyangLibPath;
    private String correctYangFilePath;
    private String errorYangFilePath;
    private String yangModulePath;

    @BeforeClass
    public static void setUpForClass() throws IOException {
        String userPath = System.getProperty("user.dir");
        FileInputStream pyangArchiveInputStream = new FileInputStream(userPath
                + "/../com.ericsson.ecim.yang.launcher/lib/pyang-1.4.1.tar.gz");
        pyangLibPath = PyangRunner.preparePyang(pyangArchiveInputStream, userPath + "/lib");
        String jythonStandalonePath = userPath + "/../com.ericsson.ecim.launcher/lib/jython-standalone-2.7-b1.jar";
        validator = new PyangValidator(pyangLibPath, jythonStandalonePath);
        CoreActivator.setRunningHeadless(true);
    }

    @AfterClass
    public static void tearDownForClass() throws IOException {
        if(pyangLibPath == null) {
            return;
        }
        File pyangFolder = new File(pyangLibPath);
        if (pyangFolder != null && pyangFolder.exists() && pyangFolder.isDirectory()) {
            FileUtils.deleteDirectory(pyangFolder);
        }
    }

    @Before
    public void setUp() {
        String usePath = System.getProperty("user.dir");
        correctYangFilePath = usePath + "/resources/ECIM_CommonLibrary.yang";
        errorYangFilePath = usePath + "/resources/ComTop.yang";
        yangModulePath = usePath + "/resources";
    }

    @Test
    public void testValidateYangFileWithModulePath() throws EcimException {
        validator.validateYangFile(new String[] { correctYangFilePath }, new String[] { yangModulePath });
    }

    @Test(expected = EcimValidationException.class)
    public void testValidateYangFileWithDefaultModulePath() throws EcimException {
        validator.validateYangFile(errorYangFilePath);
    }

    @Test(expected = EcimValidationException.class)
    public void testValidateMultiYangFile() throws EcimException {
        validator.validateYangFile(new String[] { correctYangFilePath, errorYangFilePath },
                new String[] { yangModulePath });
    }

}
