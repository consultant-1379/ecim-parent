package com.ericsson.ecim.yang.m2m;

import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class YangReATLResource extends YangResource {

    public static final String YANG_MODULE_2_ECIM_PACKAGE = "YangModuleToUmlPackage.asm";

    public YangReATLResource(String mainModule) {
        super(mainModule);
    }

    @Override
    public Map<String, String> inModels() {
        Map<String, String> inModels = new HashMap<String, String>();
        inModels.put("IN", "YANG");
        for (int i = 1; i < 100; i++)
            inModels.put("IN" + (i + 1), "YANG");
        inModels.put("ECIM_MM", "UML");
        inModels.put("YANG_MM", "UML");
        inModels.put("ECIM_DT", "UML");
        inModels.put("ECIM", "UML");
        inModels.put("YANG_GM", "UML");
        add2InModelInCaseParameterModelExists(inModels);
        return inModels;
    }

    @Override
    public Map<String, String> modelPaths(List<File> inputFiles, File outputFile) {
        Map<String, String> modelPaths = new HashMap<String, String>();
        modelPaths.put("UML", "http://www.eclipse.org/uml2/2.1.0/UML");
        modelPaths.put("YANG", "http://www.ericsson.com/2010/Yang");
        modelPaths.put("IN", inputFiles.get(0).toURI().toString());
        fillInEmptyYangFiles(inputFiles, modelPaths);
        modelPaths.put("ECIM_MM", "pathmap://ECIM_BASE_PROFILE/ECIM_Base_Profile.profile.uml");
        modelPaths.put("YANG_MM", "pathmap://ECIM_YANG_PROFILE/ECIM_Yang_Profile.profile.uml");
        modelPaths.put("ECIM_DT", "pathmap://ECIM_DATA_TYPES/EcimDataTypes.uml");
        modelPaths.put("ECIM", "pathmap://ECIM_GUIDELIB/ECIM_Guidelines.uml");
        modelPaths.put("YANG_GM", "pathmap://ECIM_YANG_GUIDELIB/ECIM_Yang_Guidelines.uml");
        modelPaths.put("OUT", outputFile.toURI().toString());
        addParameterFileToModelPath(modelPaths);
        return modelPaths;
    }

    @Override
    public String getOutModelName() {
        return "UML";
    }

}
