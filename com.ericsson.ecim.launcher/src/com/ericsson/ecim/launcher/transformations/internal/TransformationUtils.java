package com.ericsson.ecim.launcher.transformations.internal;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FilenameUtils;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.m2m.atl.engine.compiler.atl2006.Atl2006Compiler;
import org.eclipse.uml2.uml.Model;

import com.ericsson.ecim.core.CoreActivator;
import com.ericsson.ecim.core.exceptions.EcimException;
import com.ericsson.ecim.core.helpers.ResourceHelper;
import com.ericsson.ecim.flattener.EcimFlattenerATLResources;
import com.ericsson.ecim.flattener.EcimFlattenerHOTATLResources;
import com.ericsson.ecim.flattener.PackageImportHelper;
import com.ericsson.ecim.launcher.transformations.EcimTransformationException;
import com.ericsson.ecim.launcher.transformations.M2MLauncher;
import com.ericsson.ecim.optionality.processor.Decision;
import com.ericsson.ecim.optionality.processor.OptionalityConstraints;
import com.ericsson.ecim.validator.InstanceValueChecker;
import com.ericsson.ecim.validator.MMAValidator;
import com.ericsson.ecim.validator.ModelGuidelineValidation;
import com.ericsson.ecim.validator.UMLOCLValidator;

/**
 * These utilities are launcher related functions that can be shared by the regular launcher, junit and headless
 */
public class TransformationUtils {
    private static final String ATL_FOLDER = "/atl/";
    private static final String UML_FOLDER = "/uml/";
    private static final String FLATTENER_TRANSFORM_FILE = "ECIMtoECIMFlat.atl";

    /* write methods to setup folder structure */
    public File getUMLFolder(File folder) {
        return new File(folder, UML_FOLDER);
    }

    /* Create atl output folder */
    public File createATLFolder(File outputFolder, File modelFile) {
        String name = FilenameUtils.getBaseName(modelFile.getName());
        File atlOutputFolder = new File(outputFolder, name + ATL_FOLDER);
        ResourceHelper.createFolder(atlOutputFolder);// we must explicitly create the folder
        return atlOutputFolder;
    }

    /* Create uml output folder */
    public File createUMLFolder(File folder) {
        File umlOutputFolder = new File(folder, UML_FOLDER);
        ResourceHelper.createFolder(umlOutputFolder);// we must explicitly create the folder
        return umlOutputFolder;
    }

    /*
     * See if there are package import(s) present on the model. If there are we need to perform a Higher Order
     * Transformation to support dynamic numbers of input models. The end goal is to make foreign packages local.
     */
    public EcimFlattenerATLResources runPackageImporter(File originalEmxModelFile, File atlOutputFolder, IProgressMonitor monitor)
            throws EcimTransformationException {
        EcimFlattenerATLResources atlResources = new EcimFlattenerATLResources(originalEmxModelFile);

        // See if a package import is present on the model. if it is we need to perform a HOT
        if (PackageImportHelper.count(originalEmxModelFile) > 0) {
            String asmFilePath = "";

            // perform a HOT on the UML flattener to support multiple input models and package imports
            if (monitor != null)
                monitor.subTask("Processing Package Imports on UML Model");
            EcimFlattenerHOTATLResources atlHOTResources = new EcimFlattenerHOTATLResources();

            File atlHOTFile = M2MLauncher.convert(monitor, originalEmxModelFile, new File(atlOutputFolder, FLATTENER_TRANSFORM_FILE), atlHOTResources);

            try {
                // compile the generated .atl file to a .asm
                if (atlHOTFile != null) {
                    Atl2006Compiler compiler = new Atl2006Compiler();
                    asmFilePath = atlHOTFile.getAbsolutePath().replace(".atl", ".asm");
                    compiler.compile(new FileInputStream(atlHOTFile), asmFilePath);

                    IResource atlHOTIFile = ResourceHelper.file2IResource(new File(asmFilePath));
                    if (atlHOTIFile != null)
                        atlHOTIFile.refreshLocal(1, null);
                    if (monitor != null)
                        monitor.worked(1);
                }

                // pass in the ASM created by the HOT as the main module for the flattener to run instead of the one in
                // the plugin
                atlResources.setExplicitMainModule(new File(asmFilePath).toURI().toURL());
            } catch (IOException e) {
                throw new EcimTransformationException(e.getMessage(), e);
            } catch (CoreException e) {
                throw new EcimTransformationException(e.getMessage(), e);
            }
        }
        if (monitor != null)
            monitor.worked(1);

        return atlResources;
    }

    /*
     * Flatten the UML model according to a predefined transformation algorithm
     */
    public File runFlattener(File umlOutputFolder, File file, EcimFlattenerATLResources atlResources, IProgressMonitor monitor)
            throws EcimTransformationException {
        if (monitor == null) {
            monitor = new NullProgressMonitor();
        }
        File flattenedFile = M2MLauncher.convert(monitor, file, new File(umlOutputFolder, "flattened_" + file.getName()), atlResources);
        IResource flattenedIFile = ResourceHelper.file2IResource(flattenedFile);
        try {
            if (flattenedIFile != null)
                flattenedIFile.refreshLocal(1, null);
        } catch (CoreException e) {
            throw new EcimTransformationException(e.getMessage(), e);
        }
        return flattenedFile;
    }

    /*
     * For every decision in a given model we need to create a model and validate it
     */
    public IStatus processDecisions(IProgressMonitor monitor, Model model, List<Decision> decisionSet, File workFolder, File originalModelFile)
            throws EcimException {
        IStatus extTransfomResults = Status.OK_STATUS;

        if (monitor != null)
            monitor.subTask("Parsing optionality constraint expressions in UML Model ");

        // traverse the model looking for optionality constraints. Only do this once per transformation run as this can
        // be expensive
        try {
            OptionalityConstraints ocs = new OptionalityConstraints(model);

            if (monitor != null)
                monitor.worked(1);

            if (monitor != null)
                if (monitor.isCanceled())
                    return Status.CANCEL_STATUS;

            // for every decision we need to create a model and then validate it
            for (Decision decision : decisionSet) {
                decision.copyModelAndLocalDependencies(workFolder, originalModelFile);

                decision.loadModel();

                // load the model copy and remove invalid elements
                decision.pruneModel(ocs);

                // Run model and MMA validators on the produced model
                runModelValidation(decision.getModelFile(), monitor, null);
                if (monitor != null)
                    if (monitor.isCanceled())
                        return Status.CANCEL_STATUS;

                runMMAValidation(decision.getModel(), monitor, null);
                if (monitor != null)
                    if (monitor.isCanceled())
                        return Status.CANCEL_STATUS;

                decision.unloadModel();
            }
        } catch (IOException e) {
            throw new EcimException(e.getMessage(), e);
        }

        return extTransfomResults;
    }

    /*
     * Ensure instance values are valid according to type and extended properties like range.
     */
    public void runInstanceValueChecker(Model model, IProgressMonitor monitor) throws EcimException {
        // This check may have to be commented out if regexps differ between
        // Java and Posix extended
        if (monitor != null)
            monitor.subTask("Checking Instance Value on UML Model");
        InstanceValueChecker valueTypeChecker = new InstanceValueChecker(model);
        valueTypeChecker.validate(null);
    }

    /**
     * Run model validation on the UML model.
     * 
     * @deprecated
     */
    @Deprecated
    public void runModelValidation(Model model, IProgressMonitor monitor, String[] expectedErrorMessages) throws EcimException {
        if (CoreActivator.isRunningWithValidation()) {
            if (monitor != null)
                monitor.subTask("Validating UML/OCL on UML Model");
            UMLOCLValidator umloclValidator = new UMLOCLValidator();
            umloclValidator.validate(model, expectedErrorMessages);
        }
        if (monitor != null)
            monitor.worked(1);
    }

    /*
     * Run model validation on the UML model.
     */
    public void runModelValidation(File modelFile, IProgressMonitor monitor, String[] expectedErrorMessages) throws EcimException {
        if (CoreActivator.isRunningWithValidation()) {
            if (monitor != null)
                monitor.subTask("Validating UML/OCL on UML Model");
            UMLOCLValidator umloclValidator = new UMLOCLValidator();
            umloclValidator.validate(modelFile, expectedErrorMessages);
        }
        if (monitor != null)
            monitor.worked(1);
    }

    /*
     * Run MMA validation on the UML model.
     */
    public void runMMAValidation(Model model, IProgressMonitor monitor, String[] expectedErrorMessages) throws EcimException {
        if (CoreActivator.isRunningWithMMA()) {
            if (monitor != null)
                monitor.subTask("Validating MMA guidelines on UML Model");
            MMAValidator myMMAGuidelinesValidator = new MMAValidator();
            myMMAGuidelinesValidator.validateAgainstEcimGuidelines(model, expectedErrorMessages);
        }
        if (monitor != null)
            monitor.worked(1);
    }

    public void runModelGuidelineValidation(Model model, IProgressMonitor monitor) throws EcimException {
        if (monitor != null)
            monitor.subTask("Checking Guideline Hierarchy on UML Model");
        ModelGuidelineValidation guidelineValidation = new ModelGuidelineValidation();
        guidelineValidation.checkModelGuidelineHierarchy(model);
        if (monitor != null)
            monitor.worked(1);
    }

}
