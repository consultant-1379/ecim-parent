package com.ericsson.ecim.launcher.transformations;

import java.io.File;
import java.util.List;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;

/**
 * This Class needs to be extended in order to contribute a Transformation to the com.ericsson.ecim.transformations
 * Extension Point
 */
public abstract class Transformation {
    
    private String transformationId;
    private boolean isDecisonModel;
    private String transformationName;
    private List<File> generatedFiles;

    private File originalModelFile;
    private File flattenedModelFile;
    private File outputFolder;
    private File umlFolder;
    private String modelName;
    private File workFolder;

    public String getTransformationId() {
        return transformationId;
    }

    public void setTransformationId(String transformationId) {
        this.transformationId = transformationId;
    }

    public boolean getDecisionModelFlag() {
        return isDecisonModel;
    }

    public void setDecisionModelFlag(boolean isDecisionModel) {
        this.isDecisonModel = isDecisionModel;
    }

    public String getTransformationName() {
        return transformationName;
    }

    public void setTransformationName(String transformationName) {
        this.transformationName = transformationName;
    }

    /**
     * @param flattenedModelFile
     *            UML model to transform
     */
    public final void setFlattenedModelFile(File flattenedModelFile) {
        this.flattenedModelFile = flattenedModelFile;
    }

    /**
     * @return the uml model
     */
    public final File getFlattenedModelFile() {
        return this.flattenedModelFile;
    }

    public final File getOriginalModelFile() {
        return originalModelFile;
    }

    public final void setOriginalModelFile(File originalEmxModelFile) {
        this.originalModelFile = originalEmxModelFile;
    }

    /**
     * @param output
     *            folder for generated result after transformation.
     */
    public final void setOutputFolder(File outputFolder) {
        this.outputFolder = outputFolder;
    }

    /**
     * @return the outputfolder for generated files.
     */
    public final File getOutputFolder() {
        return this.outputFolder;
    }

    /**
     * @param modelName
     *            name of model.
     */
    public final void setModelName(String modelName) {
        this.modelName = modelName;
    }

    /**
     * @return the model name
     */
    public final String getModelName() {
        return this.modelName;
    }

    /**
     * @param workFolder
     *            folder for intermediate files created during the transformation process
     */
    public final void setWorkFolder(File workFolder) {
        this.workFolder = workFolder;
    }

    /**
     * @return folder for intermediate files created during the transformation process
     */
    public final File getWorkFolder() {
        return this.workFolder;
    }

    /**
     * @param workFolder
     *            folder for intermediate UML files created during the transformation process
     */
    public final void setUMLFolder(File umlFolder) {
        this.umlFolder = umlFolder;
    }

    /**
     * @return folder for intermediate UML files created during the transformation process
     */
    public final File getUMLFolder() {
        return this.umlFolder;
    }

    /**
     * Will check if all prerequisites for running a {@link Transformation}Transformation is fulfilled. If there are
     * problems, an Exception will be thrown
     * 
     * @throws EcimTransformationException
     *             if prerequisites are not fullfilled.
     */
    public final void checkResources() throws EcimTransformationException {
        checkInputResources();
        checkOutputFolder();
    }

    private void checkOutputFolder() throws EcimTransformationException {
        if (flattenedModelFile == null || !flattenedModelFile.exists())
            throw new EcimTransformationException("Flattened model file must be set");
        if (umlFolder == null)
            throw new EcimTransformationException("UML Folder must be set");
        if (outputFolder == null)
            throw new EcimTransformationException("Output Folder must be set");
    }

    private void checkInputResources() throws EcimTransformationException {
        if (modelName == null || modelName.isEmpty())
            throw new EcimTransformationException("Model name must be set");
        if (originalModelFile == null || !originalModelFile.exists())
            throw new EcimTransformationException("Emx model file must be set");
    }

    /**
     * This method needs to be implemented with the steps needed by this Transformation
     * 
     * @return Should return a IStatus of how successful the Transformation was
     */
    public abstract IStatus run(IProgressMonitor monitor);

    /**
     * Returns the plugin versions used by this transformation.
     * 
     * @return
     */
    public abstract String getPluginVersions();

    public void setGeneratedFiles(List<File> generatedFiles) {
        this.generatedFiles = generatedFiles;
    }

    public List<File> getGeneratedFiles() {
        return generatedFiles;
    }
}