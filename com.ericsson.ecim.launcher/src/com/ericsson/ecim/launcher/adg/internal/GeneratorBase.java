package com.ericsson.ecim.launcher.adg.internal;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.osgi.framework.Bundle;

import com.ericsson.ecim.core.exceptions.EcimException;
import com.ericsson.ecim.core.helpers.ProcessMessageHook;
import com.ericsson.ecim.core.helpers.PythonEnvHelper;
import com.ericsson.ecim.launcher.LauncherActivator;
import com.ericsson.ecim.validator.EcimValidationException;

public abstract class GeneratorBase {

    private static final String PDIAG = "pdiag";

    private static final Logger LOGGER = Logger.getLogger(GeneratorBase.class);

    private static final String JYTHON_STANDALONE_JAR = "jython-standalone-2.7-b1.jar";
    private static final String ADG_VERSION = "AutoDiagramTool-1.1.0";
    private static final String ADG_ARCHIVE = ".zip";
    private static final String MAIN_GENDIAGRAM_SCRIPT_NAME = "mainGenDiagram.py";

    private static int BUFFER_SIZE = 2048;
    protected String jythonJarPath;
    protected String adgScriptPath;
    protected File workingDirectory;

    public GeneratorBase() throws IOException, URISyntaxException {
        Bundle launcherBundle = Platform.getBundle(LauncherActivator.PLUGIN_ID);
        IPath launcherStatePath = Platform.getStateLocation(launcherBundle);
        String launcherPluginPath = launcherStatePath.toOSString();
        File jythonJarFile = new File(launcherPluginPath + File.separator + JYTHON_STANDALONE_JAR);
        if (!jythonJarFile.exists()) {
            InputStream jythonURLInputStream = FileLocator.openStream(launcherBundle, new Path("lib" + File.separator + JYTHON_STANDALONE_JAR), false);
            FileUtils.copyInputStreamToFile(jythonURLInputStream, jythonJarFile);
        }
        this.jythonJarPath = jythonJarFile.getAbsolutePath();

        File adgDeploymentLocation = new File(launcherPluginPath + File.separator + ADG_VERSION);
        if (!adgAvailable(adgDeploymentLocation)) {
            InputStream adgPackageInputStream = FileLocator.openStream(launcherBundle, new Path("lib" + File.separator + ADG_VERSION + ADG_ARCHIVE), false);
            prepareADG(adgPackageInputStream, launcherPluginPath);
        }

        this.workingDirectory = new File(adgDeploymentLocation.getAbsolutePath() + File.separator + PDIAG);
        this.adgScriptPath = adgDeploymentLocation.getAbsolutePath() + File.separator + PDIAG + File.separator + MAIN_GENDIAGRAM_SCRIPT_NAME;
    }

    public abstract void runScript(String[] mpXmlPaths, IProgressMonitor monitor) throws EcimException;

    protected final void runForkProcess(List<String> cmdList, IProgressMonitor monitor) throws EcimException {
        int exitValue = 0;
        final StringBuilder errorMessages = new StringBuilder();

        try {
            checkGraphvizDotEnv();

            String[] cmdArrays = cmdList.toArray(new String[cmdList.size()]);
            String cmdLine = Arrays.toString(cmdArrays).replaceAll(", ", " ").replaceAll("\\[|\\]", "");
            LOGGER.info(cmdLine);
            exitValue = forkADGProcess(cmdList, errorMessages, monitor);
        } catch (Exception e) {
            throw new EcimException(e.getMessage(), e);
        }
        if (exitValue != 0) {
            throw new EcimValidationException(errorMessages.toString().trim());
        }
    }

    private int forkADGProcess(List<String> cmdList, final StringBuilder errorMessages, final IProgressMonitor monitor) throws IOException,
            InterruptedException {
        final Process forkProcess = Runtime.getRuntime().exec(cmdList.toArray(new String[cmdList.size()]), null, workingDirectory);
        
        ProcessMessageHook exceptionHook = new ProcessMessageHook(this + ":ExceptionHook", forkProcess.getErrorStream(), errorMessages);
        exceptionHook.start();
        
        Thread messageHook = new Thread(this + ":MessageHook") {
            @Override
            public void run() {
                try {
                    BufferedReader messageReader = new BufferedReader(new InputStreamReader(forkProcess.getInputStream()));
                    do {
                        String message = messageReader.readLine();
                        if (message != null) {
                            monitor.subTask(message);
                        } else {
                            break;
                        }
                    } while (true);
                    messageReader.close();
                } catch (IOException e) {
                    LOGGER.warn(e.getMessage(), e);
                }
            }
        };
        messageHook.start();
        return forkProcess.waitFor();
    }

    protected void checkGraphvizDotEnv() {
        String graphvizDotEnv = System.getenv("GRAPHVIZ_DOT");
        if (graphvizDotEnv == null || !(new File(graphvizDotEnv)).exists()) {
            LOGGER.warn("\'GRAPHVIZ_DOT\' env variable is not available or is invalid.");
        }
    }

    protected List<String> prepareCommandList() {
        List<String> cmdList = new ArrayList<String>();
        String pythonVersion = PythonEnvHelper.getDefaultPythonVersion();
        if (pythonVersion == null) {
            cmdList.add("java");
            cmdList.add("-Djline.terminal=jline.UnsupportedTerminal");
            cmdList.add("-jar");
            cmdList.add(jythonJarPath);
        } else {
            cmdList.add("python");
        }
        return cmdList;
    }

    private static boolean adgAvailable(File adgDeploymentLocation) {
        if (!adgDeploymentLocation.exists()) {
            return false;
        }
        return new File(adgDeploymentLocation, File.separator + PDIAG + File.separator + MAIN_GENDIAGRAM_SCRIPT_NAME).exists();
    }

    private static void prepareADG(InputStream adgPackageInputStream, String dest) throws IOException {
        ZipInputStream adgZipInput = new ZipInputStream(adgPackageInputStream);
        ZipEntry zipEntry = adgZipInput.getNextEntry();
        while (zipEntry != null) {
            // create a file with the same name as the zipEntry
            File outputFile = new File(dest + File.separatorChar + zipEntry.getName());
            if (zipEntry.getName().endsWith("/")) {
                outputFile.mkdirs();
                zipEntry = adgZipInput.getNextEntry();
                continue;
            }
            outputFile.getParentFile().mkdirs();
            FileOutputStream destination = new FileOutputStream(outputFile);
            byte[] data = new byte[BUFFER_SIZE];
            int len;
            while ((len = adgZipInput.read(data)) > 0) {
                destination.write(data, 0, len);
            }
            destination.close();
            zipEntry = adgZipInput.getNextEntry();
        }
        adgZipInput.close();
    }

}