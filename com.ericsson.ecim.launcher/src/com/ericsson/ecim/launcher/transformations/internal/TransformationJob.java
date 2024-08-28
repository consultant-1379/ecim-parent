package com.ericsson.ecim.launcher.transformations.internal;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.Assert;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.MultiStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.SubProgressMonitor;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.uml2.uml.Model;

import com.ericsson.ecim.core.CoreActivator;
import com.ericsson.ecim.core.exceptions.EcimException;
import com.ericsson.ecim.core.exceptions.EcimStatusException;
import com.ericsson.ecim.core.helpers.ResourceHelper;
import com.ericsson.ecim.core.helpers.UIHelper;
import com.ericsson.ecim.core.uml.helpers.Uml2ModelHelper;
import com.ericsson.ecim.flattener.EcimFlattenerATLResources;
import com.ericsson.ecim.launcher.LauncherActivator;
import com.ericsson.ecim.launcher.transformations.CliLauncher;
import com.ericsson.ecim.launcher.transformations.EcimTransformationException;
import com.ericsson.ecim.launcher.transformations.Transformation;
import com.ericsson.ecim.launcher.transformations.internal.TransformationRegistry.TransformationData;
import com.ericsson.ecim.optionality.processor.Decision;
import com.ericsson.ecim.optionality.processor.Decisions;
import com.ericsson.ecim.validator.EcimValidationException;

/**
 * An Eclipse job which wraps all the model validation and transformation steps
 */
public class TransformationJob extends Job {

    private static final Logger LOGGER = Logger.getLogger(TransformationJob.class);
    private List<TransformationData> transformations;
    /**
     * decisionList = null, process all decisionList.isEmpty, process nothing other process given decisions
     */
    private List<Decision> decisionList;
    private File outputFolder;
    private File modelFile;
    private static final String WORK_FOLDER_NAME = ".intermediate";

    /**
     * 
     * Run all model validation and model transformations. An output folder must be specified.
     * 
     * @param jobName
     *            The name of the Job
     * @param modelFile
     *            The File containing the "working" model
     * @param transformations
     *            List of transformations to run
     * @param decisions
     *            List of decision for optionality
     * @param outputFolder
     *            The location to put the transformation output
     */
    public TransformationJob(String jobName, File modelFile, List<TransformationData> transformations, List<Decision> decisions, File outputFolder) {
        super(jobName);
        this.modelFile = modelFile;
        this.transformations = transformations;
        this.decisionList = decisions;
        this.outputFolder = outputFolder;
    }

    public List<TransformationData> getTransfomrations() {
        return this.transformations;
    }

    /**
     * 
     * Run all model validation and model transformations
     * 
     * @param monitor
     *            Keep the UI informed on progress
     * @return IStatus structure detailing how operation went
     */
    @Override
    protected IStatus run(IProgressMonitor monitor) {
        IStatus extResults = null;

        Model model = null;
        try {
            Uml2ModelHelper helper = new Uml2ModelHelper(modelFile);
            model = helper.loadModel();
        } catch (Exception e) {
            return new Status(IStatus.ERROR, LauncherActivator.PLUGIN_ID, "Load model error: " + e.getMessage(), e);
        }
        Assert.isNotNull(model);
        String modelName = model.getName();

        LOGGER.info("Transformation for " + modelName + " start...");

        int noOfSteps = calculateJobSteps(model, this.transformations.size());

        extResults = doRunTransform(monitor, model, noOfSteps);
        if (extResults.getCode() == IStatus.CANCEL)
            return Status.CANCEL_STATUS;

        LOGGER.info("Transformation for " + modelName + " done!");
        return extResults;
    }

    private IStatus doRunTransform(IProgressMonitor monitor, Model model, int noOfSteps) {
        IStatus transformStatus = null;

        File currentOutputFolder = null;
        try {
            monitor.beginTask("Transformation " + this.modelFile.getName(), noOfSteps);
            currentOutputFolder = prepareOutputFolder(model);

            // create the output folder
            File workFolder = new File(currentOutputFolder, WORK_FOLDER_NAME);
            setupOutputFolder(currentOutputFolder);
            ResourceHelper.createFolder(workFolder);

            // create some working folders
            TransformationUtils tu = new TransformationUtils();
            runValidation(model, tu, monitor);
            if (monitor.isCanceled())
                return Status.CANCEL_STATUS;
            
            transformStatus = doTransform(monitor, model, currentOutputFolder, workFolder, tu);

        } catch (EcimValidationException e) {
            logIntoExternalFile(e);
            transformStatus = returnTransformStatusException(e);
        } catch (EcimStatusException e) {
            transformStatus = returnTransformStatusException(e);
        } catch (Exception e) {
            transformStatus = addTransformationVersionsToStatus(new Status(IStatus.ERROR, LauncherActivator.PLUGIN_ID, e.getMessage(), e));
        } finally {
            transformFinalize(model, currentOutputFolder, monitor, transformStatus);
        }
        return transformStatus;
    }

    private IStatus doTransform(IProgressMonitor monitor, Model model, File currentOutputFolder, File workFolder, TransformationUtils tu)
            throws EcimTransformationException, CoreException, EcimException {
        String modelName = model.getName();
        EcimFlattenerATLResources atlResources = getFlattenerATLResources(monitor, workFolder, tu);
        if (monitor.isCanceled())
            return Status.CANCEL_STATUS;

        File umlOutputFolder = tu.createUMLFolder(workFolder);
        // transform the regular (not decision based model)
        MultiStatus transformStatus = new MultiStatus(LauncherActivator.PLUGIN_ID, IStatus.ERROR, "Error during Transformation Execution", null);
        runTransforms(transformStatus, modelName, umlOutputFolder, workFolder, currentOutputFolder, tu, monitor, modelFile, atlResources, false);
        if (monitor.isCanceled())
            return Status.CANCEL_STATUS;

        performDecisionTransform(transformStatus, monitor, model, currentOutputFolder, tu, workFolder, umlOutputFolder, atlResources);
        return transformStatus;
    }

    private EcimFlattenerATLResources getFlattenerATLResources(IProgressMonitor monitor, File workFolder, TransformationUtils tu)
            throws EcimTransformationException {
        File atlOutputFolder = tu.createATLFolder(workFolder, modelFile);
        // we must explicitly create the folder for ATL or transform will fail
        ResourceHelper.createFolder(atlOutputFolder);
        return tu.runPackageImporter(modelFile, atlOutputFolder, monitor);
    }

    private IStatus performDecisionTransform(MultiStatus transformStatus, IProgressMonitor monitor, Model model, File currentOutputFolder, TransformationUtils tu, File workFolder,
            File umlOutputFolder, EcimFlattenerATLResources atlResources) throws EcimException, CoreException {
        String modelName = model.getName();

        List<Decision> decisionSet = (decisionList != null) ? decisionList : Decisions.getDecisions(model);
        int decisionCount = decisionSet.size();
        // skip the decision modeling stuff if there are no decisions!
        if (decisionSet != null && decisionCount > 0) {
            // we must process all the decisions i.e. create a model and validate it
            IStatus result = tu.processDecisions(monitor, model, decisionSet, workFolder, modelFile);
            transformStatus.add(result);
        }

        // transform each decision model
        for (Decision decision : decisionSet) {
            // set up different folders for each decision based model
            File decisionUmlOutputFolder = new File(umlOutputFolder, decision.getName());
            ResourceHelper.createFolder(decisionUmlOutputFolder);
            File decisionWorkFolder = new File(workFolder, decision.getName());
            ResourceHelper.createFolder(decisionWorkFolder);
            // prefix the output folder with the MOM(Package) name to avoid clashes
            File decisionCurrentOutputFolder = new File(currentOutputFolder, decision.getOwningMom().getName() + decision.getName());
            ResourceHelper.createFolder(decisionCurrentOutputFolder);
            runTransforms(transformStatus, modelName, decisionUmlOutputFolder, decisionWorkFolder, decisionCurrentOutputFolder, tu, monitor, decision.getModelFile(),
                    atlResources, true);
            if (monitor.isCanceled())
                return Status.CANCEL_STATUS;
        }
        return transformStatus;
    }

    private File prepareOutputFolder(Model model) {
        File resultFolder;
        // setup a folder where the generated files should be placed
        if (outputFolder != null)
            resultFolder = outputFolder;
        else {
            resultFolder = ResourceHelper.getOutputFolderForModel(modelFile, CliLauncher.OUTPUT_DIRECTORY, model.getName());
        }
        return resultFolder;
    }

    private void runValidation(Model model, TransformationUtils tu, IProgressMonitor monitor) throws EcimException {
        tu.runMMAValidation(model, monitor, null);
        if (monitor.isCanceled())
            return;

        tu.runModelGuidelineValidation(model, monitor);
        if (monitor.isCanceled())
            return;

        tu.runModelValidation(modelFile, monitor, null);
        if (monitor.isCanceled())
            return;

        tu.runInstanceValueChecker(model, monitor);
        if (monitor.isCanceled())
            return;
    }

    private void logIntoExternalFile(EcimValidationException e) {
        // log into an external file all error messages related to model validation, this will only
        // take place when the validationErrorLog option is provided on the CLI command
        if (CoreActivator.isRunningHeadless() && CoreActivator.isRunningWithValidationErrorLog()) {
            try {
                File f = new File(CoreActivator.getErrorOutputFilepath());
                // create new log file if it doesn't already exist
                if (!f.exists())
                    f.createNewFile();
                BufferedWriter out = new BufferedWriter(new FileWriter(f));
                out.write(e.getMessage());
                out.close();
            } catch (IOException ioe) {
                // print out any issue related with I/O when handling provided file path
                LOGGER.warn(ioe.getMessage(), ioe);
            }
        }
    }

    private IStatus returnTransformStatusException(EcimStatusException e) {
        IStatus exceptionStatus = e.getStatus();
        if (exceptionStatus == null) {
            exceptionStatus = new Status(IStatus.ERROR, LauncherActivator.PLUGIN_ID, e.getMessage(), e);
        }
        return addTransformationVersionsToStatus(exceptionStatus);
    }

    private void transformFinalize(Model model, File currentOutputFolder, IProgressMonitor monitor, IStatus transformResults) {
        try {
            IResource ires = ResourceHelper.file2IResource(currentOutputFolder);
            if (ires != null) {
                ResourceHelper.setPermissionsRecursive(ires, null, true);
                IProject parProj = ires.getProject();
                if (parProj != null)
                    parProj.refreshLocal(IResource.DEPTH_INFINITE, null);
            }
        } catch (CoreException e) {
            LauncherActivator.getDefault().getLog()
                    .log(new Status(IStatus.WARNING, LauncherActivator.PLUGIN_ID, "Could not update Permissions on generated output files", e));
        }
        monitor.done();

        if (transformResults != null && transformResults.isOK()) {
            UIHelper.popupMessage(LauncherActivator.PLUGIN_ID, "ECIM Transformation Status",
                    "All transformations ran successfully for model " + model.getName() + ".");
            return;
        }
    }

    /*
     * Calculate the number of steps in the transformation job. We consider both decision models and validators.
     */
    private int calculateJobSteps(Model model, final int transformsToRun) {
        List<Decision> decisionSet = (decisionList != null) ? decisionList : Decisions.getDecisions(model);
        int decisionCount = decisionSet.size();

        final int preTransforms = 1;// this is for stuff like the PackageImport which always runs before the transforms
        final int postTransforms = 0;// this is for stuff which always runs after the transforms
        final int instanceValidation = 1;// instance validation only runs for the main model, not for decision models
        int validatorSteps = 2;// this represents MMA and UML validation
        int transformSteps = 0;
        // the flattener must run for every transform set so add that here
        int transformsIncludeFlattener = transformsToRun + 1;
        if (decisionCount > 0) {
            transformSteps = transformsIncludeFlattener + (transformsIncludeFlattener * decisionCount);
            validatorSteps = validatorSteps + (validatorSteps * decisionCount) + instanceValidation;
            validatorSteps++;// the decisions must also be validated
        } else {
            transformSteps = transformsIncludeFlattener;
            validatorSteps = validatorSteps + instanceValidation;
        }

        return transformSteps + validatorSteps + preTransforms + postTransforms;
    }

    /*
     * Flatten the model and run a set of transformations.
     */
    private IStatus runTransforms(MultiStatus transformStatus, String modelName, File umlOutputFolder, File workFolder, File currentOutputFolder, TransformationUtils tu, IProgressMonitor monitor, File file,
            EcimFlattenerATLResources atlResources, boolean isDecisionModel) throws EcimTransformationException, CoreException {
        // convert UML model to a flattened UML model
        monitor.subTask("Transforming UML Model to flattened UML Model");

        File flattenedFile = tu.runFlattener(umlOutputFolder, file, atlResources, monitor);

        monitor.worked(1);

        if (monitor.isCanceled())
            return Status.CANCEL_STATUS;

        // run all the other transformations
        runCustomTransforms(transformStatus, monitor, modelName, file, flattenedFile, currentOutputFolder, workFolder, umlOutputFolder, isDecisionModel);
        return transformStatus;
    }

    private Status addTransformationVersionsToStatus(IStatus s1) {
        return new Status(s1.getSeverity(), s1.getPlugin(), s1.getMessage() + "\nECIM Tool-chain plugin versions: \n" + getTransformationVersions(),
                s1.getException());
    }

    private String getTransformationVersions() {
        StringBuilder sb = new StringBuilder();

        for (TransformationData td : transformations) {
            sb.append(td.getTransformation().getPluginVersions());
        }

        return sb.toString();
    }

    /**
     * 
     * Create a folder to dump the transformation outputs and mark as derived.
     * 
     * @param outputFolder
     *            The location to dump the transformation output
     * @throws CoreException
     *             Will be thrown when Eclipse cannot perform the needed operations
     * @throws EcimTransformationException
     *             Will be thrown if expected Exceptions are caught
     * @throws IOException
     */
    // we cannot clean the entire folder out for every run, this won't work when
    // running the transformation on multiple Models
    private void setupOutputFolder(final File outputFolder) throws CoreException, EcimTransformationException, IOException {
        // If the file isn't in the workspace this will result in null
        IResource ires = ResourceHelper.file2IResource(outputFolder);

        if (outputFolder.getParentFile().exists()) {
            // We know that one level down we have a Parent folder that also
            // should be marked derived and read-write
            if (ires != null) {
                ResourceHelper.setPermissions(ires.getParent(), false, true, false);
            }

            if (outputFolder.exists()) {
                // If there already is a directory structure we just make sure
                // the parent is
                // marked as derived, but no recursion
                if (ires != null) {
                    ResourceHelper.setPermissionsRecursive(ires.getParent(), false, null);
                }
                ResourceHelper.deleteRecursive(outputFolder);
                // artf176235 : Generic handling of Output_Models directory upon doing transformation
                // We ignore if delete fails to allow RO file system
            }
            ResourceHelper.createFolder(outputFolder);

            ResourceHelper.setPermissionsRecursive(ires, null, true);
        } else {
            ResourceHelper.createFolder(outputFolder);
            // This needs to be re-found now that it exists
            ires = ResourceHelper.file2IResource(outputFolder);
            // If we just created the Parent folder as well, is should be the
            // root of the recursive permission change
            if (ires != null) {
                ResourceHelper.setPermissionsRecursive(ires.getParent(), null, true);
            }
        }
    }

    /**
     * 
     * Run a transformation for each registered item in the private list "transformations"
     * 
     * @param monitor
     *            Keep the UI informed on progress
     * @param modelName
     *            The name of the model being transformed
     * @param originalEmxModelFile
     *            The file being transformed
     * @param flattenedModelFile
     *            The flattened version of the original file
     * @param workFolder
     *            The folder where intermediate files can be stored
     * @param umlFolder
     *            The folder where intermediate UML files can be stored
     * @param isDecisionModel
     *            Is the model to be generated a decision model or not
     * 
     * @return IStatus structure detailing how operation went
     */
    private IStatus runCustomTransforms(MultiStatus transformStatus, IProgressMonitor monitor, String modelName, File originalEmxModelFile, File flattenedModelFile, File outputFolder,
            File workFolder, File umlFolder, boolean isDecisionModel) {
        Map<TransformationData, IStatus> result = new HashMap<TransformationData, IStatus>();

        // loop over all the transformations we need to perform
        for (TransformationData td : transformations) {
            try {
                if (monitor.isCanceled())
                    return Status.CANCEL_STATUS;
                monitor.subTask("Running Transformation Extension: " + td.getName());
                Transformation transformation = td.getTransformation();
                String curTransnameNoWhitespace = td.getName().replaceAll("\\s", "_");
                File curTransIntermOutputFolder = new File(workFolder, curTransnameNoWhitespace);
                ResourceHelper.createFolder(curTransIntermOutputFolder);
                transformation.setModelName(modelName);
                transformation.setOriginalModelFile(originalEmxModelFile);
                transformation.setFlattenedModelFile(flattenedModelFile);
                transformation.setOutputFolder(outputFolder);
                transformation.setUMLFolder(umlFolder);
                transformation.setWorkFolder(curTransIntermOutputFolder);
                transformation.setTransformationId(td.getId());
                transformation.setDecisionModelFlag(isDecisionModel);
                transformation.setTransformationName(td.getName());
                SubProgressMonitor subMon = new SubProgressMonitor(monitor, 1);
                long start = System.currentTimeMillis();
                IStatus status = transformation.run(subMon);
                if (LOGGER.isDebugEnabled()) {
                    LOGGER.debug(curTransnameNoWhitespace + " transformation takes " + (System.currentTimeMillis() - start) + "ms");
                }
                transformStatus.add(status);
                result.put(td, status);
            } catch (Exception e) {
                IStatus status = new Status(IStatus.ERROR, LauncherActivator.PLUGIN_ID, td.getName() + ": " + e.getMessage(), e);
                transformStatus.add(status);
            }
        }

        return transformStatus;
    }
}
