package com.ericsson.ecim.yang.launcher.extension;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceVisitor;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.jface.preference.IPreferenceStore;

import com.ericsson.ecim.core.CoreActivator;
import com.ericsson.ecim.core.exceptions.EcimException;
import com.ericsson.ecim.validator.EcimValidationException;
import com.ericsson.ecim.yang.launcher.YangActivator;
import com.ericsson.ecim.yang.launcher.preferences.PreferenceConstants;

public class PyangValidator {

    private static final Logger LOGGER = Logger.getLogger(PyangValidator.class);
    private PyangRunner runner;

    /**
     * Use the embedded jython and pyang to initialize PyangValidator
     * 
     * @throws IOException
     */
    public PyangValidator() throws IOException {
        this.runner = new PyangRunner();
    }

    /**
     * PYangValidator Constructor
     * 
     * @param pyangHome
     *            The pyang home path.
     */
    public PyangValidator(String pyangHome, String jythonStandaloneJarPath) {
        this.runner = new PyangRunner(pyangHome, jythonStandaloneJarPath);
    }

    /**
     * Use the yang file's parent folder as yang module path
     * 
     * @param yangFilePath
     * @throws Exception
     */
    public void validateYangFile(String yangFilePath) throws EcimException {
        File yangFile = new File(yangFilePath);
        String yangModulePath = yangFile.getParent();
        validateYangFile(new String[] { yangFilePath }, new String[] { yangModulePath });
    }

    /**
     * Validate yang files with specified yang module path
     * 
     * @param yangFilePaths
     * @param yangModulePath
     * @throws EcimException
     */
    public void validateYangFile(String[] yangFilePaths, String[] yangModulePaths) throws EcimException {
        StringBuilder modulePathOption = new StringBuilder();
        for (int i = 0; i < yangModulePaths.length; i++) {
            String path = yangModulePaths[i];
            modulePathOption.append(path);
            if (i != (yangModulePaths.length - 1)) {
                modulePathOption.append(File.pathSeparator);
            }
        }
        forkValidate(yangFilePaths, modulePathOption.toString().trim());
    }

    private void forkValidate(String[] yangFilePaths, String yangModulePath) throws EcimException {
        List<String> cmdList = runner.initializeCommandList();
        if (!CoreActivator.isRunningHeadless()) {
            // Read pyang preference for command line options
            prepareInputOptions(cmdList);
        }

        if (!yangModulePath.trim().isEmpty()) {
            cmdList.add("-p");
            cmdList.add(yangModulePath);
            LOGGER.info("Using yang module path: " + yangModulePath);
        } else {
            LOGGER.info("There won't have module path in this pyang process!");
        }
        for (String yangFile : yangFilePaths) {
            cmdList.add(yangFile);
        }
        int exitValue = 0;
        try {
            exitValue = runner.launchPythonProcess(cmdList);
        } catch (Exception e) {
            throw new EcimException(e.getMessage(), e);
        }
        if (exitValue != 0) {
            throw new EcimValidationException(runner.getErrorMessage().trim());
        }
    }

    private void prepareInputOptions(List<String> cmdList) {
        try {
            IPreferenceStore store = YangActivator.getDefault().getPreferenceStore();
            String cmdLineOptions = store.getString(PreferenceConstants.CMD_LINE_OPTIONS);
            if (!cmdLineOptions.isEmpty()) {
                cmdList.add(cmdLineOptions);
            }
        } catch (Exception e) {
            LOGGER.warn("Skip adding pyang command line options. " + e.getMessage(), e);
        }
    }

    static String[] calculateYangModulePath(IProject project) {
        final List<String> result = new ArrayList<String>();
        try {
            project.accept(new YangResourceVisitor(result));
        } catch (CoreException e) {
            LOGGER.warn(e.getMessage(), e);
        }
        return result.toArray(new String[result.size()]);
    }

    private static class YangResourceVisitor implements IResourceVisitor {

        private List<String> result;

        public YangResourceVisitor(final List<String> result) {
            this.result = result;
        }

        @Override
        public boolean visit(IResource resource) throws CoreException {
            if (resource instanceof IContainer) {
                return true;
            }
            if (!resource.getName().endsWith("yang")) {
                return false;
            }
            // Sometime project's raw location will be null
            IContainer container = resource.getParent();
            IPath containerPath = container.getRawLocation();
            String yangContainer = null;
            if (containerPath == null && (container instanceof IProject)) {
                File osFile = resource.getRawLocation().toFile();
                yangContainer = osFile.getParent();
            } else {
                yangContainer = containerPath.toOSString();
            }
            if (yangContainer != null && !result.contains(yangContainer)) {
                result.add(yangContainer);
            }
            return false;
        }

    }

}
