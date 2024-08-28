package com.ericsson.ecim.flattener;

import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.runtime.Plugin;

import com.ericsson.ecim.m2m.ECIMATLResources;


public class EcimFlattenerATLResources extends ECIMATLResources {

    private File rawModelFile;
    
    public EcimFlattenerATLResources(File modelFile) {
        this.rawModelFile = modelFile;
    }
    
    @Override
    public Map<String, String> inModels() {
        Map<String, String> inModels = new HashMap<String, String>();

        inModels.put("IN", "UML");

        //Add an extra input model for every PackageImport in the input model
        int piCount = PackageImportHelper.count(rawModelFile);
        for (int i = 0; i < piCount; i++) {
            inModels.put("IN" + (i + 2), "UML");
        }
        return inModels;
    }

    @Override
    public Map<String, String> modelPaths(List<File> inputFiles, File outputFile) {
        Map<String, String> modelPaths = initModelPaths(inputFiles, outputFile, false);

        //Add an extra input model for every PackageImport in the input model
        List<String> piLocations = PackageImportHelper.get(inputFiles.get(0));
        for (int i = 0; i < piLocations.size(); i++) {
            modelPaths.put("IN" + (i + 2), piLocations.get(i));
        }

        return modelPaths;
    }
    
    @Override
    public String getOutModelName() {
        return "UML";
    }

    @Override
    public Plugin getActivator() {
        return M2MActivator.getDefault();
    }

}
