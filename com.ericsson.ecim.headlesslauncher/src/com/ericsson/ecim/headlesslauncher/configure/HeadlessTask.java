package com.ericsson.ecim.headlesslauncher.configure;

import java.util.Arrays;

public class HeadlessTask {

    private String taskModel;

    private String taskModelDirectory;

    private String[] taskModelSuffix;

    private String[] preProcessList;

    private String[] transformationList;

    private String[] decisionList;

    private String[] umlUtilityList;

    private String[] postProcessList;

    public HeadlessTask(String model) {
        this.taskModel = model;
    }

    public HeadlessTask(String modelDirectory, String... suffix) {
        this.taskModelDirectory = modelDirectory;
        this.taskModelSuffix = suffix;
    }

    public boolean isEmptyTask() {
        boolean empty = true;
        Object[][] tasksList = new Object[][] { preProcessList, transformationList, decisionList, umlUtilityList, postProcessList };
        for (Object[] tasks : tasksList) {
            empty &= isEmptyArray(tasks);
        }
        return empty;
    }

    private boolean isEmptyArray(Object[] array) {
        return array == null || array.length == 0;
    }

    public String getTaskModel() {
        return taskModel;
    }

    public String getTaskModelDirectory() {
        return taskModelDirectory;
    }

    public String[] getTaskModelSuffix() {
        return taskModelSuffix;
    }

    public String[] getPreProcessList() {
        return preProcessList;
    }

    public void setPreProcessList(String[] preprocessList) {
        this.preProcessList = preprocessList;
    }

    public String[] getTransformationList() {
        return transformationList;
    }

    public void setTransformationList(String[] transformationList) {
        for (int i = 0; i < transformationList.length; i++) {
            if ("mmas".equalsIgnoreCase(transformationList[i])) {
                transformationList[i] = "javaoam";
            }
        }
        this.transformationList = transformationList;
    }

    public String[] getDecisionList() {
        return decisionList;
    }

    public void setDecisionList(String[] decisionList) {
        this.decisionList = decisionList;
    }

    public String[] getPostProcessList() {
        return postProcessList;
    }

    public void setPostProcessList(String[] postprocessList) {
        this.postProcessList = postprocessList;
    }

    public String[] getUmlUtilityList() {
        return umlUtilityList;
    }

    public void setUmlUtilityList(String[] umlUtilityList) {
        this.umlUtilityList = umlUtilityList;
    }

    @Override
    public String toString() {
        StringBuilder taskString = new StringBuilder("Headless Task");
        taskString.append("\n");
        if (taskModel != null) {
            taskString.append("Test Model: " + taskModel).append("\n");
        } else if (taskModelDirectory != null) {
            taskString.append("Test Directory: " + taskModelDirectory).append("\n");
            if (!isEmptyArray(taskModelSuffix)) {
                taskString.append("File Suffix: " + Arrays.toString(taskModelSuffix)).append("\n");
            }
        }

        if (!isEmptyArray(preProcessList)) {
            taskString.append("Preprocess List: " + Arrays.toString(preProcessList)).append("\n");
        }
        if (!isEmptyArray(transformationList)) {
            taskString.append("Transformation List: " + Arrays.toString(transformationList)).append("\n");
        }
        if (!isEmptyArray(decisionList)) {
            taskString.append("Decision List: " + Arrays.toString(decisionList)).append("\n");
        }
        if (!isEmptyArray(umlUtilityList)) {
            taskString.append("UmlUtility List: " + Arrays.toString(umlUtilityList)).append("\n");
        }
        if (!isEmptyArray(postProcessList)) {
            taskString.append("Postprocess List: " + Arrays.toString(postProcessList)).append("\n");
        }
        return taskString.toString();
    }
}