package com.ericsson.ecim.vdicos.m2m;

import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.runtime.Plugin;

import com.ericsson.ecim.m2m.ECIMATLResources;


public class VDicosATLResources extends ECIMATLResources {


    private static final String MODEL_KEY_TSP_MIM = "TSP_MIM";
    public static final String VDICOS_TSPMIM = "ECIMtoTspMim.asm";

    public VDicosATLResources(String mainModule) {
        super(mainModule);
    }

    @Override
    public String getOutModelName() {
        return MODEL_KEY_TSP_MIM;
    }

    @Override
    public Map<String, String> inModels() {
        Map<String, String> inModels = new HashMap<String, String>();
        inModels.put("IN", "UML");
        return inModels;
    }

    @Override
    public  Map<String, String> modelPaths(List<File> inputFiles, File outputFile) {
        Map<String, String> modelPaths = initModelPaths(inputFiles, outputFile, false);
        modelPaths.put(MODEL_KEY_TSP_MIM,"com:ericsson:ims:tspmim");
        return modelPaths;
    }

    @Override
    public Plugin getActivator() {
        return Activator.getDefault();
    }

}
