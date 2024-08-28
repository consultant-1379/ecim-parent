package com.ericsson.ecim.coremw.m2m;

import java.io.File;
import java.util.List;
import java.util.Map;

import org.eclipse.core.runtime.Plugin;

import com.ericsson.ecim.m2m.ECIMATLResources;

public class CoreMWATLResources extends ECIMATLResources {

    private static final String MODEL_KEY_IMM = "IMM";
    public static final String ECIM_IMM = "ECIMtoIMM.asm";
    public static final String ECIM_IMM_CONFIG = "ECIMtoIMMConfig.asm";

    public CoreMWATLResources(String mainModule) {
        super(mainModule);
    }

    @Override
    public String getOutModelName() {
        return MODEL_KEY_IMM;
    }

    @Override
    public Map<String, String> modelPaths(List<File> inputFiles, File outputFile) {
        Map<String, String> modelPaths = initModelPaths(inputFiles, outputFile, true);
        modelPaths.put(MODEL_KEY_IMM, "http://www.saforum.org/IMMSchema");
        return modelPaths;
    }

    @Override
    public Plugin getActivator() {
        return M2MActivator.getDefault();
    }

}
