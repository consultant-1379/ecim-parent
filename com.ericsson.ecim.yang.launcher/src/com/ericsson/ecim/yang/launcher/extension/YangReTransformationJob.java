package com.ericsson.ecim.yang.launcher.extension;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.ILog;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;

import com.ericsson.ecim.core.CoreActivator;
import com.ericsson.ecim.core.exceptions.EcimException;
import com.ericsson.ecim.core.helpers.ResourceHelper;
import com.ericsson.ecim.launcher.reverse.ReverseTransformationJob;
import com.ericsson.ecim.m2m.ECIMATLResources;
import com.ericsson.ecim.validator.EcimValidationException;
import com.ericsson.ecim.yang.launcher.YangActivator;
import com.ericsson.ecim.yang.m2m.YangReATLResource;

/**
 * Runs the YANG to UML Transformation.
 *
 */
public class YangReTransformationJob extends ReverseTransformationJob {

    private static final Logger LOGGER = Logger.getLogger(YangReTransformationJob.class);

    public YangReTransformationJob(String name, List<File> sourceFiles) {
        super(name, sourceFiles);
    }

    @Override
    public List<File> getInputFiles() {
        return getSourceFiles();
    }

    @Override
    public ECIMATLResources getEcimATLResources() {
        return new YangReATLResource(YangReATLResource.YANG_MODULE_2_ECIM_PACKAGE);
    }

    @Override
    protected void validateInputFiles(List<File> inputFiles) throws EcimException {
        if (inputFiles == null || inputFiles.isEmpty()) {
            return;
        }
        try {
            List<String> yangModules = new ArrayList<String>();
            String[] yangFilePaths = caculateYangModule(inputFiles, yangModules);
            PyangValidator yangValidator = new PyangValidator();
            // Use inputFiles[0]'s parent folder as default yangModulePath
            String yangModulePath = inputFiles.get(0).getParent();
            String[] yangModuleArray = (!yangModules.isEmpty()) ? yangModules.toArray(new String[yangModules.size()]) : new String[] { yangModulePath };
            yangValidator.validateYangFile(yangFilePaths, yangModuleArray);
        } catch (EcimValidationException e) {
            if (!CoreActivator.isRunningHeadless()) {
                showExceptionResult(e);
            }
            throw e;
        } catch (IOException e) {
            throw new EcimException(e.getMessage(), e);
        }
    }

    private String[] caculateYangModule(List<File> inputFiles, List<String> yangModules) {
        String[] yangFilePaths = new String[inputFiles.size()];
        for (int i = 0; i < inputFiles.size(); i++) {
            File inputFile = inputFiles.get(i);
            yangFilePaths[i] = inputFile.getAbsolutePath();
            prepareDependencyModule(inputFile, yangModules);
        }
        return yangFilePaths;
    }

    private void prepareDependencyModule(File inputFile, List<String> yangModules) {
        IResource yangFileResource = ResourceHelper.file2IResource(inputFile);
        if (yangFileResource == null) {
            return;
        }
        try {
            yangFileResource.deleteMarkers(IMarker.PROBLEM, true, IResource.DEPTH_ZERO);
        } catch (CoreException e) {
            LOGGER.warn(e.getMessage(), e);
        }
        if (yangModules.isEmpty()) {
            // Calculate yang module path in container project
            String[] yangModuleArray = PyangValidator.calculateYangModulePath(yangFileResource.getProject());
            for (String yangModule : yangModuleArray) {
                yangModules.add(yangModule);
            }
        }
    }

    private void showExceptionResult(EcimValidationException e) {
        String validationMessage = e.getMessage();
        String[] errors = validationMessage.split("\n");
        List<String> errorList = new ArrayList<String>();
        ILog yangLog = YangActivator.getDefault().getLog();
        for (String error : errors) {
            if (!errorList.contains(error)) {
                errorList.add(error);
                yangLog.log(new Status(IStatus.ERROR, YangActivator.PLUGIN_ID, error));
                createMarkerForError(error);
            }
        }
    }

    private void createMarkerForError(String errorMessage) {
        String osName = System.getProperty("os.name").toLowerCase();
        // <filename>:<lineno>: <level>: <message>
        String[] errorDetail = errorMessage.split(":", 5);
        int index = 0;

        File relatedFile = new File(errorDetail[index]);
        if (errorDetail.length >= 5 && osName.contains("windows")) {
            relatedFile = new File(errorDetail[index] + ":" + errorDetail[++index]);
        }
        index++;
        IFile resourceFile = (IFile) ResourceHelper.file2IResource(relatedFile);
        if (resourceFile == null || !resourceFile.exists()) {
            return;
        }

        try {
            IMarker marker = resourceFile.createMarker(IMarker.PROBLEM);
            marker.setAttribute(IMarker.LINE_NUMBER, Integer.parseInt(errorDetail[index]));
            index++;
            if (errorDetail[index].contains("error")) {
                marker.setAttribute(IMarker.SEVERITY, IMarker.SEVERITY_ERROR);
            } else if (errorDetail[index].contains("warn")) {
                marker.setAttribute(IMarker.SEVERITY, IMarker.SEVERITY_WARNING);
            } else {
                marker.setAttribute(IMarker.SEVERITY, IMarker.SEVERITY_INFO);
            }
            index++;
            marker.setAttribute(IMarker.MESSAGE, errorDetail[index].trim());
        } catch (Exception e) {
            LOGGER.warn(e.getMessage(), e);
        }
    }
}
