package com.ericsson.ecim.headlesslauncher;

import static com.ericsson.ecim.headlesslauncher.HeadlessOptions.REMP_PATH;
import static com.ericsson.ecim.headlesslauncher.HeadlessOptions.REYANG_PATH;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.uml2.uml.Model;

import com.ericsson.ecim.core.exceptions.EcimException;
import com.ericsson.ecim.core.uml.helpers.Uml2ModelHelper;
import com.ericsson.ecim.launcher.umlutilities.UtilitiesLauncher;

class HeadlessModelWrapper {
    
    Uml2ModelHelper helper = null;
    File modelFile = null;
    Model model = null;
    private String[] preProcessList;
    private String modelPath;
    private String outputPath;
    
    HeadlessModelWrapper(String outputPath, String modelPath, String[] preProcessList) {
        this.outputPath = outputPath;
        this.modelPath = modelPath;
        this.preProcessList = preProcessList;
    }
    
    void initModelWrapper() throws EcimException, IOException, InterruptedException, CoreException {
        if (preProcessList == null || preProcessList.length == 0) {
            // No preProcessList
            modelFile = HeadlessUtility.locateResourceInOS(modelPath);
            helper = HeadlessUtility.loadModelFromFile(modelFile);
            model = helper.getModel();
        } else {
            List<String> preUtilities = Arrays.asList(preProcessList);
            System.out.println("Launch preprocess utilities for model: " + modelPath); // NOSONAR
            if (preUtilities.contains(REMP_PATH)) {
                // Handle REMP
                String umlModelPath = HeadlessUtility.performReverse2UML(REMP_PATH, HeadlessUtility.locateResourceInOS(modelPath), outputPath);
                modelFile = HeadlessUtility.locateResourceInOS(umlModelPath);
                helper = HeadlessUtility.loadModelFromFile(modelFile);
                model = helper.getModel();

                List<String> updatedUtilities = new ArrayList<String>(preUtilities);
                if (updatedUtilities.remove(REMP_PATH)) {
                    preUtilities = updatedUtilities;
                }

            } else if (preUtilities.contains(REYANG_PATH)) {
                // Handle REYANG
                String umlModelPath = HeadlessUtility.performReverse2UML(REYANG_PATH, HeadlessUtility.locateResourceInOS(modelPath), outputPath);
                modelFile = HeadlessUtility.locateResourceInOS(umlModelPath);
                helper = HeadlessUtility.loadModelFromFile(modelFile);
                model = helper.getModel();

                List<String> updatedUtilities = new ArrayList<String>(preUtilities);
                if (updatedUtilities.remove(REYANG_PATH)) {
                    preUtilities = updatedUtilities;
                }
            } else {
                // Here we only suppose that these utilities won't generate new model files.
                // Whether we need to handle REMP here, need some prototype
                modelFile = HeadlessUtility.locateResourceInOS(modelPath);
                helper = HeadlessUtility.loadModelFromFile(modelFile);
                model = helper.getModel();
            }
            if (!preUtilities.isEmpty()) {
                UtilitiesLauncher.launch(modelFile, model, preUtilities);
            }
        }

    }
    
    void unloadModel() {
        if(helper != null && model != null) {
            helper.unloadModel();
        }
    }

}
