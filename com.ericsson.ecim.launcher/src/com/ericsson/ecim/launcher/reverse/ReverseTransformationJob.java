package com.ericsson.ecim.launcher.reverse;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;

import com.ericsson.ecim.core.CoreActivator;
import com.ericsson.ecim.core.exceptions.EcimException;
import com.ericsson.ecim.core.helpers.ResourceHelper;
import com.ericsson.ecim.core.helpers.UIHelper;
import com.ericsson.ecim.launcher.LauncherActivator;
import com.ericsson.ecim.launcher.transformations.M2MLauncher;
import com.ericsson.ecim.m2m.ECIMATLResources;

public abstract class ReverseTransformationJob extends Job {

    private static final String DI_NOTATION_SKELETON = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<xmi:XMI xmi:version=\"2.0\" xmlns:xmi=\"http://www.omg.org/XMI\"/>";

    private List<File> sourceFiles;
    private File outputUmlFile = null;
    private File outputDiFile = null;
    private File outputNotationFile = null;

    public ReverseTransformationJob(String name, File sourceFile) {
        super(name);
        this.sourceFiles = new ArrayList<File>();
        sourceFiles.add(sourceFile);
    }

    public ReverseTransformationJob(String name, List<File> sourceFiles) {
        super(name);
        this.sourceFiles = sourceFiles; // Need to do list copy?
    }

    public File getSourceFile() {
        return this.sourceFiles.get(0);
    }

    public List<File> getSourceFiles() {
        return this.sourceFiles;
    }

    public File getOutputUmlFile() {
        return outputUmlFile;
    }

    public boolean setOutputUmlFile(File outputUmlFile) {
        this.outputUmlFile = outputUmlFile;
        return true;
    }

    public File getOutputDiFile() {
        return outputDiFile;
    }

    public File getOutputNotationFile() {
        return outputNotationFile;
    }

    public abstract List<File> getInputFiles() throws IOException;

    public abstract ECIMATLResources getEcimATLResources();

    protected void postReverseTransformation() {
    }

    protected void validateInputFiles(List<File> inputFiles) throws EcimException {
    }

    protected IStatus createSkeletonFile(IProgressMonitor monitor) {
        try {
            // Transformation was successful, now we need to create two skeleton files with extension ".di" and
            // ".notation" which together with the generated ".uml"-file form the Papyrus model.
            FileUtils.touch(outputDiFile);
            FileUtils.writeStringToFile(outputDiFile, DI_NOTATION_SKELETON);

            FileUtils.touch(outputNotationFile);
            FileUtils.writeStringToFile(outputNotationFile, DI_NOTATION_SKELETON);
            // refresh the project after creating the file so the other transforms can see it
            IResource sourceResource = ResourceHelper.file2IResource(sourceFiles.get(0));
            if (sourceResource != null && sourceResource.getProject() != null) {
                sourceResource.getProject().refreshLocal(IResource.DEPTH_INFINITE, monitor);
            }

        } catch (IOException ioe) {
            return new Status(IStatus.WARNING, LauncherActivator.PLUGIN_ID, ioe.getMessage(), ioe);
        } catch (CoreException e) {
            return new Status(IStatus.WARNING, LauncherActivator.PLUGIN_ID, e.getMessage(), e);
        }
        return Status.OK_STATUS;
    }

    private String getTransformationMsg() {
        StringBuilder sb = new StringBuilder();
        sb.append("Transforming ");
        sb.append(sourceFiles.get(0).getName());
        sb.append(" using " + (sourceFiles.size() - 1) + " dependent file(s) to UML.");
        return sb.toString();
    }

    @Override
    protected IStatus run(IProgressMonitor monitor) {
        IProgressMonitor inner = (monitor != null) ? monitor : new NullProgressMonitor();
        inner.beginTask(getTransformationMsg(), IProgressMonitor.UNKNOWN);
        IStatus result = Status.OK_STATUS;

        String firstFileName = sourceFiles.get(0).getName().split("\\.", 2)[0];
        outputUmlFile = getOutputUmlFile();
        if (outputUmlFile == null)
            outputUmlFile = new File(sourceFiles.get(0).getParentFile(), firstFileName + ".uml");

        String fileName = outputUmlFile.getName().split("\\.", 2)[0];
        outputDiFile = new File(outputUmlFile.getParentFile(), fileName + ".di");
        outputNotationFile = new File(outputUmlFile.getParentFile(), fileName + ".notation");

        try {
            List<File> inputFiles = getInputFiles();
            validateInputFiles(inputFiles);
            ECIMATLResources atlResources = getEcimATLResources();
            M2MLauncher.convert(inner, inputFiles, outputUmlFile, atlResources);
        } catch (Exception e) {
            result = new Status(IStatus.ERROR, LauncherActivator.PLUGIN_ID, e.getMessage(), e);
        } finally {
            postReverseTransformation();
        }

        if (result != null && !result.isOK()) {
            return result;
        }
        if (!CoreActivator.isRunningHeadless()) {
            UIHelper.popupMessage(LauncherActivator.PLUGIN_ID, "Transformation Status", "Reverse to UML transformation completed successfully");
        }
        result = createSkeletonFile(inner);

        inner.done();

        return result;
    }

}
