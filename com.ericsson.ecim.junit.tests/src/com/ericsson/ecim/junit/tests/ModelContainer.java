package com.ericsson.ecim.junit.tests;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.runtime.CoreException;

/**
 * Container class for a model and optionally its depending mom files.
 * 
 * @author erajaik
 * 
 */
public class ModelContainer {

    static class ModelRecord {
        private IFile targetEmxFile;

        public ModelRecord(IFile targetEmxFile) {
            this.targetEmxFile = targetEmxFile;
        }

        public IFile getTargetEmxFile() {
            return targetEmxFile;
        }
    }

    private List<ModelRecord> models = new ArrayList<ModelRecord>();

    private List<URL> sourceModels = new ArrayList<URL>();

    public ModelContainer(List<URL> models) {
        this.sourceModels.addAll(models);
    }

    public ModelContainer(URL modelFile) {
        this.sourceModels.add(modelFile);
    }

    public ModelContainer(URL... modelFiles) {
        if (modelFiles.length <= 0 || modelFiles[0] == null) {
            throw new IllegalArgumentException("No source transform model found!");
        }
        for (URL modelFile : modelFiles) {
            this.sourceModels.add(modelFile);
        }
    }

    public ModelContainer(URL modelFile, URL[] fragementFiles) {
        this.sourceModels.add(modelFile);
        if (fragementFiles != null) {
            for (URL model : fragementFiles) {
                this.sourceModels.add(model);
            }
        }
    }

    public IFile getEmxFile() {
        return models.get(0).getTargetEmxFile();
    }

    public void initialize(List<URL> sourceURLs, IFolder targetRoot) throws CoreException, IOException {
        for (URL sourceURL : sourceURLs) {
            if (!sourceModels.contains(sourceURL)) {
                sourceModels.add(sourceURL);
            }
        }
        initialize(targetRoot);
    }

    public void initialize(IFolder targetRoot) throws CoreException, IOException {
        for (URL sourceModel : sourceModels) {
            copyInputModel(sourceModel, targetRoot);
        }
    }

    private void copyInputModel(URL sourceModel, IFolder targetRoot) throws CoreException, IOException {
        String sourceFile = sourceModel.getFile();
        if (sourceFile.endsWith(".uml")) {
            IFile targetModel = copyFile(sourceModel, targetRoot);
            ModelRecord modelRecord = new ModelRecord(targetModel);
            models.add(modelRecord);
        }
    }

    private IFile copyFile(URL sourceModel, IFolder targetRoot) throws CoreException, IOException {
        IFile modelFile = targetRoot.getFile(sourceModel.getFile().substring(sourceModel.getFile().lastIndexOf('/') + 1));
        if (!modelFile.exists())
            modelFile.create(sourceModel.openStream(), true, null);
        return modelFile;
    }

    public List<ModelRecord> getModels() {
        return models;
    }

}
