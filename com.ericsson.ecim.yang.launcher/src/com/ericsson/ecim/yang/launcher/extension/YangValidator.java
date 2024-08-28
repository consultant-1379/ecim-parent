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
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.wst.validation.AbstractValidator;
import org.eclipse.wst.validation.ValidationEvent;
import org.eclipse.wst.validation.ValidationResult;
import org.eclipse.wst.validation.ValidationState;
import org.eclipse.wst.validation.ValidatorMessage;

import com.ericsson.ecim.core.exceptions.EcimException;
import com.ericsson.ecim.core.helpers.ResourceHelper;
import com.ericsson.ecim.validator.EcimValidationException;
import com.ericsson.ecim.yang.launcher.YangActivator;

public class YangValidator extends AbstractValidator {

    private static final Logger LOGGER = Logger.getLogger(YangValidator.class);

    private PyangValidator pyangValidatorInstance;

    public YangValidator() throws IOException {
        this.pyangValidatorInstance = new PyangValidator();
    }

    @Override
    public ValidationResult validate(IResource resource, int kind, ValidationState state, IProgressMonitor monitor) {
        ValidationResult result = new ValidationResult();
        try {
            resource.deleteMarkers(IMarker.PROBLEM, true, IResource.DEPTH_ZERO);
        } catch (CoreException e) {
            LOGGER.warn(e.getMessage(), e);
            ValidatorMessage message = ValidatorMessage.create(e.getMessage(), resource);
            result.add(message);
            return result;
        }
        try {
            String yangFilePath = resource.getRawLocation().toOSString();
            // Update module dependency candidate with all sub folders which has yang file in this project
            String[] yangModuleArray = PyangValidator.calculateYangModulePath(resource.getProject());
            if (yangModuleArray.length == 0) {
                pyangValidatorInstance.validateYangFile(yangFilePath);
            } else {
                pyangValidatorInstance.validateYangFile(new String[] { yangFilePath }, yangModuleArray);
            }
        } catch (EcimValidationException e) {
            String validationMessage = e.getMessage();
            LOGGER.warn(validationMessage, e);
            String[] errors = validationMessage.split("\n");
            List<String> errorList = new ArrayList<String>();
            ILog yangLog = YangActivator.getDefault().getLog();

            for (String error : errors) {
                handleSingleErrorMessage(result, error, errorList, yangLog);
            }
        } catch (EcimException e) {
            String validationMessage = e.getMessage();
            LOGGER.warn(validationMessage, e);
            ValidatorMessage message = ValidatorMessage.create(validationMessage, resource);
            message.setAttribute(IMarker.SEVERITY, IMarker.SEVERITY_ERROR);
            result.add(message);
        }
        return result;
    }

    private void handleSingleErrorMessage(ValidationResult result, String error, List<String> errorList, ILog yangLog) {
        String errorMessage = error;
        if (!errorList.contains(error) && !error.trim().isEmpty()) {
            errorList.add(error);
            yangLog.log(new Status(IStatus.ERROR, YangActivator.PLUGIN_ID, error));
            if (error.contains("(at") && error.contains(")")) {
                int start = error.indexOf("(at") + 3;
                errorMessage = error.substring(start, error.length()).trim();
                errorMessage = error.replaceAll("\\)", "");
            }
            addValidatorMessage(result, errorMessage);
        }
    }

    @Override
    public ValidationResult validate(ValidationEvent event, ValidationState state, IProgressMonitor monitor) {
        return validate(event.getResource(), event.getKind(), state, monitor);
    }

    private void addValidatorMessage(ValidationResult result, String errorMessage) {
        ILog yangLog = YangActivator.getDefault().getLog();
        // <filename>:<lineno>: <level>: <message>
        String[] errorDetail = errorMessage.split(":", 5);
        int index = 0;

        String osName = System.getProperty("os.name").toLowerCase();
        File relatedFile = new File(errorDetail[index]);
        if (errorDetail.length >= 5 && osName.contains("windows")) {
            relatedFile = new File(errorDetail[index] + ":" + errorDetail[++index]);
        }
        IFile resourceFile = locateIFile(relatedFile, yangLog);
        if(resourceFile == null) {
            return;
        }
        index++;
        
        ValidatorMessage message = ValidatorMessage.create(errorMessage, resourceFile);
        try {
            message.setAttribute(IMarker.LINE_NUMBER, Integer.parseInt(errorDetail[index]));
        } catch (NumberFormatException e) {
            yangLog.log(new Status(IStatus.ERROR, YangActivator.PLUGIN_ID, "Couldn't found line number " + errorDetail[index] + " in " + resourceFile.getName()));
        }
        index++;
        if (errorDetail[index].contains("error")) {
            message.setAttribute(IMarker.SEVERITY, IMarker.SEVERITY_ERROR);
        } else if (errorDetail[index].contains("warn")) {
            message.setAttribute(IMarker.SEVERITY, IMarker.SEVERITY_WARNING);
        } else {
            message.setAttribute(IMarker.SEVERITY, IMarker.SEVERITY_INFO);
        }
        index++;
        message.setAttribute(IMarker.MESSAGE, errorDetail[index].trim());

        result.add(message);
    }

    private IFile locateIFile(File relatedFile, ILog yangLog) {
        IFile resourceFile = (IFile) ResourceHelper.file2IResource(relatedFile);
        if (resourceFile == null) {
            // Skip to print detail error message
            yangLog.log(new Status(IStatus.ERROR, YangActivator.PLUGIN_ID, relatedFile.getName() + " not exists."));
            return null;
        }
        if (resourceFile != null && !resourceFile.exists()) {
            yangLog.log(new Status(IStatus.ERROR, YangActivator.PLUGIN_ID, resourceFile.getName() + " not exists."));
            return null;
        }
        return resourceFile;
    }

}
