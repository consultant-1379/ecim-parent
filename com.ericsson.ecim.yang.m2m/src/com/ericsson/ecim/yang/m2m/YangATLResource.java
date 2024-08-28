package com.ericsson.ecim.yang.m2m;

import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class YangATLResource extends YangResource {

    public static final String ECIM_PACKAGE_2_YANG_MODULE = "UmlPackageToYangModule.asm";

    public YangATLResource(String mainModule) {
        super(mainModule);
    }

    @Override
    public Map<String, String> inModels() {
        Map<String, String> inModels = new HashMap<String, String>();
        inModels.put("IN", "UML");
        for (int i = 1; i < 100; i++)
            inModels.put("IN" + (i + 1), "YANG");
        add2InModelInCaseParameterModelExists(inModels);
        return inModels;
    }

    @Override
    public String getOutModelName() {
        return "YANG";
    }

    @Override
    public Map<String, String> modelPaths(List<File> inputFiles, File outputFile) {
        Map<String, String> modelPaths = new HashMap<String, String>();
        modelPaths.put("UML", "http://www.eclipse.org/uml2/2.1.0/UML");
        modelPaths.put("IN", inputFiles.get(0).toURI().toString());
        fillInEmptyYangFiles(inputFiles, modelPaths);
        modelPaths.put("OUT", outputFile.toURI().toString());
        addParameterFileToModelPath(modelPaths);
        modelPaths.put("YANG", "http://www.ericsson.com/2010/Yang");
        return modelPaths;
    }

}
