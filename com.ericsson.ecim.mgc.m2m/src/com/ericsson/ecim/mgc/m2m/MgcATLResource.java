package com.ericsson.ecim.mgc.m2m;

import java.io.File;
import java.util.List;
import java.util.Map;

import org.eclipse.core.runtime.Plugin;

import com.ericsson.ecim.m2m.ECIMATLResources;

public class MgcATLResource extends ECIMATLResources {

    private static final String MODEL_KEY_JSON = "JSON";
    public static final String ECIM_MODEL_2_MGCJSON = "UmlClassToMgcJson.asm";

    public MgcATLResource(String mainModule) {
        super(mainModule);
    }

    @Override
    public Map<String, String> modelPaths(List<File> inputFiles, File outputFile) {
        Map<String, String> modelPaths = initModelPaths(inputFiles, outputFile, true);
        modelPaths.put(MODEL_KEY_JSON, "http://www.ericsson.com/ecim/mgc/Json");
        return modelPaths;
    }

    @Override
    public Plugin getActivator() {
        return MgcM2MActivator.getDefault();
    }

    @Override
    public String getOutModelName() {
        return MODEL_KEY_JSON;
    }

}
