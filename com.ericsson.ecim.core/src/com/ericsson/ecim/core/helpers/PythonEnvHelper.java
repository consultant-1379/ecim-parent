package com.ericsson.ecim.core.helpers;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import org.apache.log4j.Logger;

public class PythonEnvHelper {

    private static final Logger LOGGER = Logger.getLogger(PythonEnvHelper.class);

    private static String defaultPythonVersion;

    private PythonEnvHelper() {
    }
    
    public static String getDefaultPythonVersion() {
        if (isPythonAvailable()) {
            return defaultPythonVersion;
        }
        return null;
    }

    public static boolean isPythonAvailable() {
        try {
            File versionResult = File.createTempFile("etPyVerCheck", "tmp");
            ProcessBuilder builder = new ProcessBuilder("python", "--version");
            builder.redirectError(versionResult);
            versionResult.deleteOnExit();
            Process process = builder.start();
            if (0 == process.waitFor()) {
                BufferedReader resultReader = new BufferedReader(new FileReader(versionResult));
                String versionLine = resultReader.readLine();
                resultReader.close();
                if (versionLine != null) {
                    String pythonVersion = versionLine.split(" ")[1];
                    return isValidPythonVersion(pythonVersion);
                }
            }
        } catch (Exception e) {
            LOGGER.warn(e.getMessage(), e);
        }
        return false;
    }

    private static boolean isValidPythonVersion(String version) {
        String[] array = version.split("\\.");
        for(String number : array) {
            try {
                Integer.parseInt(number);
            } catch (NumberFormatException e) {
                defaultPythonVersion = null;
                return false;
            }
        }
        defaultPythonVersion = version;
        return true;
    }

}
