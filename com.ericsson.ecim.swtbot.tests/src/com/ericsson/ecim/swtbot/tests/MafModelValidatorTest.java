package com.ericsson.ecim.swtbot.tests;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collection;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.filefilter.NameFileFilter;
import org.apache.commons.io.filefilter.TrueFileFilter;
import org.apache.log4j.Logger;
import org.junit.Test;

/**
 * Runs the maf_model_validator, if tool is available. 
 * @author erajaik
 *
 */

public class MafModelValidatorTest {

    private static final Logger LOGGER = Logger.getLogger(MafModelValidatorTest.class);
    /*
     * On my machine the below path is a symbolic link to a script that looks like this:
     *       #!/bin/bash
     *    LD_LIBRARY_PATH=/home/erajaik/prj/maf_model_validator/maf_model_validator_r2a27:${LD_LIBRARY_PATH}
     *    export LD_LIBRARY_PATH
     *    /home/erajaik/prj/maf_model_validator/maf_model_validator_r2a27/maf_model_validator -q $@
     */
    private static final String MAF_MODEL_VALIDATOR = "/local/scratch/maf_model_validator";

    @Test
    public void testMafOnOptionalityModel1() throws Exception {
        String osName = System.getProperty("os.name").toLowerCase();
        if (osName.contains("windows")) {
            // If run on Windows, just skip MafModelValidator test
            return;
        }
        String mpXml1 = "OptionalityModel1_mp.xml";
        String mpXml2 = "OptionalityModel2_mp.xml";
//        String[] opt1Files = lookup(mpXml1);
//        String opt2File = lookup(mpXml2)[0];
//        for (String mpXmlFile : opt1Files) {
//            runCommand(new String[] { MAF_MODEL_VALIDATOR, mpXmlFile, opt2File });
//        }
    }

    public static void runMafModelValidator(File outputFolder, String mpXml) throws IOException {
        String osName = System.getProperty("os.name").toLowerCase();
        if (osName.contains("windows")) {
            // If run on Windows, just skip MafModelValidator test
            return;
        }
        String[] mpXmlFiles = lookup(outputFolder, mpXml);
        for (String mpXmlFile : mpXmlFiles) {
            runCommand(new String[] { MAF_MODEL_VALIDATOR, mpXmlFile });
        }
    }

    private static String[] lookup(File outputFolder, String fileName) throws FileNotFoundException {
        Collection<File> files = FileUtils.listFiles(outputFolder, new NameFileFilter(fileName),
                TrueFileFilter.INSTANCE);
        if (files == null || files.isEmpty()) {
            throw new FileNotFoundException(fileName);
        }
        String[] filePaths = new String[files.size()];
        int counter = 0;
        for (File f : files) {
            filePaths[counter++] = f.getAbsolutePath();
        }
        return filePaths;
    }

    /**
     * Runs supplied process and checks output. If compilation fails, the output
     * is thrown back in a JavaCompilerException.
     */
    static void runCommand(String[] cmd) throws IOException {
        Process p = Runtime.getRuntime().exec(cmd);

        StringBuilder output = new StringBuilder();
        int exitValue = 0;
        try {
            exitValue = p.waitFor();
        } catch (InterruptedException e) {
            LOGGER.warn(e.getMessage(), e);
        }

        InputStreamReader tempReader = new InputStreamReader(new BufferedInputStream(p.getInputStream()));
        BufferedReader reader = new BufferedReader(tempReader);
        while (true) {
            String line = reader.readLine();
            if (line == null)
                break;
            output.append(line + "\n");
        }
        if (exitValue != 0) {
            throw new RuntimeException(Arrays.toString(cmd) + "\n" + output.toString());
        }
        if (output.length() > 0) {
            LOGGER.debug(output);
            if (output.toString().contains("Failed")) {
                throw new RuntimeException(Arrays.toString(cmd) + "\n" + output.toString());
            }
        }
    }

}
