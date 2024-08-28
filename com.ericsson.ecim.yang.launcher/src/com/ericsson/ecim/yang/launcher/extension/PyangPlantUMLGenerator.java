package com.ericsson.ecim.yang.launcher.extension;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import org.apache.log4j.Logger;

import com.ericsson.ecim.core.exceptions.EcimException;
import com.ericsson.ecim.validator.EcimValidationException;

public class PyangPlantUMLGenerator {

    private static final Logger LOGGER = Logger.getLogger(PyangPlantUMLGenerator.class);
    private PyangRunner runner;

    /**
     * Use the embedded jython and pyang to initialize PyangValidator
     * 
     * @throws IOException
     */
    public PyangPlantUMLGenerator() throws IOException {
        this.runner = new PyangRunner();
    }

    /**
     * Generate yang files with specified yang module path
     * 
     * @param yangFilePaths
     * @param yangModulePath
     * @throws EcimException
     */
    public void generateYangUmlDiagram(String[] yangFilePaths) throws EcimException {
        forkGenerate(yangFilePaths);
    }

    private void forkGenerate(String[] yangFilePaths) throws EcimException {
        List<String> cmdList = runner.initializeCommandList();

        cmdList.add("-f");
        cmdList.add("uml");

        cmdList.add("--uml-no=annotation");

        for (String yangFile : yangFilePaths) {
            cmdList.add(yangFile);
        }

        String yangPulName = yangFilePaths[0].replaceAll(".yang", ".pul");
        File yangPulFile = new File(yangPulName);
        if (yangFilePaths.length > 1) {
            File directory = new File(yangPulFile.getParent());
            yangPulName = directory.getAbsolutePath() + File.separator + directory.getName() + ".pul";
            yangPulFile = new File(yangPulName);
            cmdList.add("-p");
            cmdList.add(directory.getAbsolutePath());
        }

        int exitValue = 0;
        try {
            exitValue = runner.launchPythonProcess(cmdList);
        } catch (Exception e) {
            throw new EcimException(e.getMessage(), e);
        }
        if (exitValue != 0) {
            throw new EcimValidationException(runner.getErrorMessage().trim());
        }

        StringBuilder plantUmlBuilder = adapteLatestPlantUML(runner.getOutputMessage());

        try {
            FileWriter yangPulWriter = new FileWriter(yangPulFile);
            yangPulWriter.write(plantUmlBuilder.toString());
            yangPulWriter.flush();
            yangPulWriter.close();
        } catch (Exception e) {
            LOGGER.warn(e.getMessage(), e);
        }
    }

    private StringBuilder adapteLatestPlantUML(String plantumlContent) {
        StringBuilder plantUmlBuilder = new StringBuilder();
        String[] plantumlStatements = plantumlContent.split("\n");
        for (String line : plantumlStatements) {
            if (line.startsWith("package")) {
                line = line.trim() + " {\n";
            } else if (line.startsWith("end package")) {
                line = "}\n";
            }
            plantUmlBuilder.append(line);
        }
        return plantUmlBuilder;
    }

}
