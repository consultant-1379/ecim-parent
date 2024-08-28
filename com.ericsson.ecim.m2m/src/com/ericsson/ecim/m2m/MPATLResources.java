package com.ericsson.ecim.m2m;

import java.io.File;
import java.util.List;
import java.util.Map;

import org.eclipse.core.runtime.Plugin;

public class MPATLResources extends ECIMATLResources {

    private static final String MODEL_KEY_MP = "MP";

    @Override
    public Map<String, String> modelPaths(List<File> inputFiles, File outputFile) {
        Map<String, String> modelPaths = initModelPaths(inputFiles, outputFile, true);
        modelPaths.put(MODEL_KEY_MP, "http://ericsson.com/ECIM/MP");
        return modelPaths;
    }

    @Override
    public String getOutModelName() {
        return MODEL_KEY_MP;
    }

    @Override
    public Plugin getActivator() {
        return M2MActivator.getDefault();
    }

}
