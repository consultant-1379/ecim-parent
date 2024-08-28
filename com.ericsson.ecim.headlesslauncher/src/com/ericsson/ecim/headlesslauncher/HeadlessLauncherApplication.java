package com.ericsson.ecim.headlesslauncher;

import static com.ericsson.ecim.headlesslauncher.HeadlessOptions.CONTINUE_ON_FAILURE;
import static com.ericsson.ecim.headlesslauncher.HeadlessOptions.DECISIONS;
import static com.ericsson.ecim.headlesslauncher.HeadlessOptions.HEADLESS_CONFIGURATION;
import static com.ericsson.ecim.headlesslauncher.HeadlessOptions.MODEL_PATH;
import static com.ericsson.ecim.headlesslauncher.HeadlessOptions.MODEL_VALIDATION_ERRORS;
import static com.ericsson.ecim.headlesslauncher.HeadlessOptions.NO_DECISION;
import static com.ericsson.ecim.headlesslauncher.HeadlessOptions.NO_MMA;
import static com.ericsson.ecim.headlesslauncher.HeadlessOptions.OUTPUT_PATH;
import static com.ericsson.ecim.headlesslauncher.HeadlessOptions.POST_UTILITIES;
import static com.ericsson.ecim.headlesslauncher.HeadlessOptions.PRE_UTILITIES;
import static com.ericsson.ecim.headlesslauncher.HeadlessOptions.REMP_PATH;
import static com.ericsson.ecim.headlesslauncher.HeadlessOptions.REYANG_PATH;
import static com.ericsson.ecim.headlesslauncher.HeadlessOptions.SKIP_VALIDATION;
import static com.ericsson.ecim.headlesslauncher.HeadlessOptions.TRANSFORMATIONS;
import static com.ericsson.ecim.headlesslauncher.HeadlessOptions.UMLUTILITIES;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceVisitor;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Assert;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.equinox.app.IApplication;
import org.eclipse.equinox.app.IApplicationContext;

import com.ericsson.ecim.core.CoreActivator;
import com.ericsson.ecim.core.exceptions.EcimException;
import com.ericsson.ecim.core.helpers.ResourceHelper;
import com.ericsson.ecim.headlesslauncher.configure.HeadlessTask;
import com.ericsson.ecim.headlesslauncher.configure.TaskConfigureHelper;
import com.ericsson.ecim.launcher.transformations.CliLauncher;
import com.ericsson.ecim.launcher.transformations.EcimExtensionException;
import com.ericsson.ecim.launcher.umlutilities.UtilitiesLauncher;

/**
 * To run from command line: <br>
 * &lt;command to start rsa&gt; <br>
 * -consoleLog <br>
 * -noSplash <br>
 * -data &lt;workspace location&gt; <br>
 * -application com.ericsson.ecim.clitransform <br>
 * -modelpath &lt;Workspace-relative path to model file(s)&gt; <br>
 * [-outputpath &lt;Filesystem-relative path to output folder&gt;] //If this is omitted, the default output location
 * will be used <br>
 * [-validationErrorLog &lt;Filesystem-relative path to output file&gt;] <br>
 * [-noMMA] // If this is omitted, MMA validation will take place <br>
 * [-remp &lt;Workspace-relative path to MP file&gt;] <br>
 * [-transformations &lt;list of transformations separated by commas&gt;] // If this is omitted, the default behavior
 * will be to run all transformations <br>
 * [-umlutilities &lt;id or class name for the uml utility to be launched&gt;]
 */
public class HeadlessLauncherApplication implements IApplication {

    private static final Logger LOGGER = Logger.getLogger(HeadlessLauncherApplication.class);

    private Integer returnStatus = EXIT_OK;

    private boolean continueOnFailure = false;
    private boolean noDecision = false;

    @Override
    public Object start(IApplicationContext context) throws Exception {
        CoreActivator.setRunningHeadless(true);
        try {
            Object o = context.getArguments().get(IApplicationContext.APPLICATION_ARGS);
            if (!(o instanceof String[])) {
                System.err.println("Could not read program arguments!"); // NOSONAR
                return 1;
            }

            HeadlessCommandLine cmdLine = new HeadlessCommandLine((String[]) o);
            CommandLine cmds = cmdLine.parseCommands();

            parseGlobalOptions(cmds);

            String outputPath = cmds.getOptionValue(OUTPUT_PATH);

            List<HeadlessTask> taskList = prepareHeadlessTasks(cmds, outputPath);

            for (HeadlessTask task : taskList) {
                handleHeadlessTask(task, outputPath);
            }

        } catch (Exception e) {
            returnStatus = 1;
            if (Platform.inDebugMode()) {
                LOGGER.error(e.getMessage(), e);
            }
            System.err.println(e.getMessage()); // NOSONAR
        }
        return returnStatus;
    }

    private List<HeadlessTask> prepareHeadlessTasks(CommandLine cmds, String outputPath) throws EcimException, InterruptedException, CoreException {
        List<String> preUtilities = parseOptionList(cmds, PRE_UTILITIES, ",");
        // Checks whether transformations parameter is defined, if that's
        // the case, run all transformations determined by the user
        List<String> transformationsToRun = parseOptionList(cmds, TRANSFORMATIONS, ",");
        List<String> decisionToRun = parseOptionList(cmds, DECISIONS, ",");
        List<String> postUtilities = parseOptionList(cmds, POST_UTILITIES, ",");
        List<String> utilitiesToRun = parseOptionList(cmds, UMLUTILITIES, ",");

        List<HeadlessTask> taskList = new ArrayList<HeadlessTask>();
        if (cmds.hasOption(HEADLESS_CONFIGURATION)) {
            taskList = readTasksFromConfigration(cmds);
        } else if (cmds.hasOption(MODEL_PATH) || cmds.hasOption(REMP_PATH) || cmds.hasOption(REYANG_PATH)) {
            String[] models = prepareModelList(cmds, outputPath);

            for (final String modelPath : models) {
                HeadlessTask task = createHeadlessTask(cmds, modelPath, preUtilities, transformationsToRun, decisionToRun, postUtilities, utilitiesToRun);
                taskList.add(task);
            }
        }

        if (taskList.isEmpty()) {
            // Report error for there will be no real tasks if has no rexxx, transformation, pre/postUtilities,
            // umlUtilities
            throw new EcimException("There is no headless task found.");
        }

        if (LOGGER.isDebugEnabled()) {
            for(HeadlessTask task : taskList) {
                System.out.println(task);  //NOSONAR
            }
        }

        return taskList;
    }

    private HeadlessTask createHeadlessTask(CommandLine cmds, final String modelPath, List<String> preUtilities, List<String> transformationsToRun,
            List<String> decisionToRun, List<String> postUtilities, List<String> utilitiesToRun) {
        HeadlessTask task = new HeadlessTask(modelPath);
        if (cmds.hasOption(PRE_UTILITIES)) {
            task.setPreProcessList(preUtilities.toArray(new String[preUtilities.size()]));
        }
        if (cmds.hasOption(TRANSFORMATIONS)) {
            task.setTransformationList(transformationsToRun.toArray(new String[transformationsToRun.size()]));
        } else if (cmds.hasOption(UMLUTILITIES)) {
            task.setUmlUtilityList(utilitiesToRun.toArray(new String[utilitiesToRun.size()]));
        }
        if (cmds.hasOption(DECISIONS)) {
            task.setDecisionList(decisionToRun.toArray(new String[decisionToRun.size()]));
        }
        if (cmds.hasOption(POST_UTILITIES)) {
            task.setPostProcessList(postUtilities.toArray(new String[postUtilities.size()]));
        }
        return task;
    }

    private String[] prepareModelList(CommandLine cmds, String outputPath) throws InterruptedException, EcimException, CoreException {
        String[] models = new String[] {};
        // Checks whether reverse engineering parameter is defined, if so
        // start its transformation
        if (cmds.hasOption(REYANG_PATH)) {
            final String reyangPath = cmds.getOptionValue(REYANG_PATH);
            models = new String[] { HeadlessUtility.performReverse2UML(REYANG_PATH, HeadlessUtility.locateResourceInOS(reyangPath), outputPath) };
        } else if (cmds.hasOption(REMP_PATH)) {
            final String rempPath = cmds.getOptionValue(REMP_PATH);
            models = new String[] { HeadlessUtility.performReverse2UML(REMP_PATH, HeadlessUtility.locateResourceInOS(rempPath), outputPath) };
        } else {
            final String modelOptions = cmds.getOptionValue(MODEL_PATH);
            models = modelOptions.split(",");
        }
        return models;
    }

    private List<HeadlessTask> readTasksFromConfigration(CommandLine cmds) throws EcimException {
        String configureFilePath = cmds.getOptionValue(HEADLESS_CONFIGURATION);
        File configureFile = new File(configureFilePath);
        TaskConfigureHelper configureHelper = new TaskConfigureHelper(configureFile);
        return configureHelper.getTaskList();
    }

    private void parseGlobalOptions(CommandLine cmds) {
        final boolean noMMA = cmds.hasOption(NO_MMA);
        final boolean skipValidation = cmds.hasOption(SKIP_VALIDATION);
        noDecision = cmds.hasOption(NO_DECISION);
        continueOnFailure = cmds.hasOption(CONTINUE_ON_FAILURE);

        CoreActivator.setRunningWithMMA(!noMMA);
        CoreActivator.setRunningWithValidation(!skipValidation);

        // Checks if validationErrorLog is in use, if so register it as
        // enabled on CoreActivator along
        // with the respective file path to log the error messages
        if (cmds.hasOption(MODEL_VALIDATION_ERRORS)) {
            String validationOutputPath = cmds.getOptionValue(MODEL_VALIDATION_ERRORS);
            CoreActivator.setRunningWithValidationErrorLog(true);
            CoreActivator.setErrorOutputFilepath(validationOutputPath);
        }
    }

    @Override
    public void stop() {
        // Noting to do
    }

    private List<String> parseOptionList(CommandLine cmds, String option, String separator) {
        List<String> optionList = new ArrayList<String>();
        if (cmds.hasOption(option)) {
            String optionValue = cmds.getOptionValues(option)[0];
            for (String utility : optionValue.split(separator)) {
                optionList.add(utility.toLowerCase());
            }
        }
        return optionList;
    }

    private void handleHeadlessTask(HeadlessTask headlessTask, String outputPath) throws EcimException {
        // Return if there is nothing to do
        if (headlessTask.isEmptyTask())
            return;

        String[] preProcessList = headlessTask.getPreProcessList();
        String[] transformationList = headlessTask.getTransformationList();
        String[] decisionList = headlessTask.getDecisionList();
        String[] utilityList = headlessTask.getUmlUtilityList();
        String[] postProcessList = headlessTask.getPostProcessList();

        String modelDirectory = headlessTask.getTaskModelDirectory();
        if (modelDirectory != null) {
            final String[] modelSuffix = headlessTask.getTaskModelSuffix();
            final List<File> modelFiles = recursiveModelFolder(modelDirectory, modelSuffix);
            System.out.println("There are " + modelFiles.size() + " model(s) located in specified path [" + modelDirectory + "]"); // NOSONAR
            for (File modelFile : modelFiles) {
                String modelPath = modelFile.getAbsolutePath();
                handleModelFile(outputPath, modelPath, preProcessList, transformationList, decisionList, utilityList, postProcessList);
            }
        } else {
            String modelPath = headlessTask.getTaskModel();
            handleModelFile(outputPath, modelPath, preProcessList, transformationList, decisionList, utilityList, postProcessList);
        }
    }

    private List<File> recursiveModelFolder(String modelDirectory, final String[] modelSuffix) {
        IWorkspaceRoot workspaceRoot = ResourcesPlugin.getWorkspace().getRoot();
        IFolder modelFolder = workspaceRoot.getFolder(new Path(modelDirectory));
        final List<File> modelFiles = new ArrayList<File>();
        if (!modelFolder.isAccessible()) {
            recursiveWithinFileSystem(modelDirectory, modelFiles, modelSuffix);
        } else {
            recursiveWithinWorkspace(modelFolder, modelFiles, modelSuffix);
        }
        return modelFiles;
    }

    private void recursiveWithinFileSystem(String modelDirectory, final List<File> modelFiles, final String[] modelSuffix) {
        File modelFolderPath = new File(modelDirectory);
        if (modelFolderPath.isDirectory() && modelFolderPath.exists()) {
            Collection<File> modelCollections = FileUtils.listFiles(modelFolderPath, modelSuffix, true);
            for (File modelFile : modelCollections) {
                String fullPath = modelFile.getAbsolutePath();
                if (!fullPath.contains(".intermediate") && !fullPath.contains("flattened_")) {
                    modelFiles.add(modelFile);
                }
            }
        }
    }

    private void recursiveWithinWorkspace(IFolder modelFolder, final List<File> modelFiles, final String[] modelSuffix) {
        try {
            modelFolder.accept(new IResourceVisitor() {
                @Override
                public boolean visit(IResource resource) throws CoreException {
                    if (resource instanceof IFolder)
                        return true;
                    String fileName = resource.getName();
                    for (String suffix : modelSuffix) {
                        if (fileName.endsWith(suffix)) {
                            modelFiles.add(((IFile) resource).getRawLocation().toFile());
                            break;
                        }
                    }
                    return false;
                }
            });
        } catch (CoreException e) {
            LOGGER.warn("Recursive model folder failed due to: " + e.getMessage(), e);
        }
    }

    private void handleModelFile(String outputPath, String modelPath, String[] preProcessList, String[] transformationList, String[] decisionList,
            String[] utilityList, String[] postProcessList) throws EcimException {
        HeadlessModelWrapper modelWrapper = null;

        try {
            modelWrapper = new HeadlessModelWrapper(outputPath, modelPath, preProcessList);
            modelWrapper.initModelWrapper();

            Assert.isNotNull(modelWrapper.modelFile);
            Assert.isNotNull(modelWrapper.model);

            File outputFolder = (outputPath == null) ? null : new File(outputPath);
            runTransformations(modelWrapper, transformationList, decisionList, utilityList, outputFolder);

            if (postProcessList != null && postProcessList.length > 0) {
                runPostProcessList(modelWrapper, postProcessList, outputFolder);
            }

        } catch (Exception e) {
            returnStatus = 2;
            if (Platform.inDebugMode()) {
                LOGGER.error(e.getMessage(), e);
            }
            if (!continueOnFailure) {
                throw new EcimException(e.getMessage(), e);
            }
        } finally {
            if (modelWrapper.model != null) {
                modelWrapper.unloadModel();
            }
        }
    }

    private void runTransformations(HeadlessModelWrapper modelWrapper, String[] transformationList, String[] decisionList, String[] utilityList,
            File outputFolder) throws EcimExtensionException {
        if (transformationList != null && transformationList.length > 0) {
            List<String> transformationsToRun = Arrays.asList(transformationList);
            // decisionList = null, process all
            // decisionList.isEmpty, process nothing
            // other process given decisions
            List<String> decisionToRun = (decisionList != null) ? Arrays.asList(decisionList) : null;
            if (noDecision) {
                decisionToRun = new ArrayList<String>();
            }
            System.out.println("Transforming model: " + modelWrapper.model.getName()); // NOSONAR
            CliLauncher.transform(modelWrapper.modelFile, modelWrapper.model, outputFolder, transformationsToRun, decisionToRun);
        } else if (utilityList != null && utilityList.length > 0) {
            List<String> utilitiesToRun = Arrays.asList(utilityList);
            System.out.println("Launch uml utilities for model: " + modelWrapper.model.getName()); // NOSONAR
            UtilitiesLauncher.launch(modelWrapper.modelFile, modelWrapper.model, utilitiesToRun);
        } else {
            System.out.println("No transformations and utilities are specified. Please specify some transformation or utilities to be executed."); // NOSONAR
        }
    }

    private void runPostProcessList(HeadlessModelWrapper modelWrapper, String[] postProcessList, File outputFolder) {
        List<String> postUtilities = Arrays.asList(postProcessList);
        System.out.println("Launch postprocess utilities for model: " + modelWrapper.model.getName()); // NOSONAR
        /**
         * OutputFolder is totally compatible with CliLauncher, please refer to {@code CliLauncher}.
         */
        File postProcessOutput = null;
        if (outputFolder == null) {
            postProcessOutput = ResourceHelper.getOutputFolderForModel(modelWrapper.modelFile, CliLauncher.OUTPUT_DIRECTORY, modelWrapper.model.getName());
        } else {
            // Create a new folder in the output directory
            postProcessOutput = new File(outputFolder.getAbsolutePath() + File.separator + modelWrapper.model.getName() + File.separator);
        }
        UtilitiesLauncher.launch(modelWrapper.modelFile, modelWrapper.model, postUtilities, postProcessOutput);
    }

}
