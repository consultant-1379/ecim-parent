package com.ericsson.ecim.yang.launcher.extension;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.zip.GZIPInputStream;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.tools.tar.TarEntry;
import org.apache.tools.tar.TarInputStream;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.osgi.framework.Bundle;

import com.ericsson.ecim.core.helpers.ProcessMessageHook;
import com.ericsson.ecim.core.helpers.PythonEnvHelper;
import com.ericsson.ecim.launcher.LauncherActivator;
import com.ericsson.ecim.yang.launcher.YangActivator;

public class PyangRunner {

    private static final Logger LOGGER = Logger.getLogger(PyangRunner.class);
    private static final String JYTHON_STANDALONE_JAR = "jython-standalone-2.7-b1.jar";
    private static final String PYANG_VERSION = "pyang-1.4.1";
    private static final String PYANG_ARCHIVE = PYANG_VERSION + ".tar.gz";
    private String jythonJarPath;
    private String pyangHomePath;
    private StringBuilder outputMessageBuilder;
    private StringBuilder errorMessageBuilder;

    /**
     * Use the embedded jython and pyang to initialize PyangValidator
     * 
     * @throws IOException
     */
    public PyangRunner() throws IOException {
        Bundle ecimlauncherBundle = Platform.getBundle(LauncherActivator.PLUGIN_ID);
        Bundle yanglauncherBundle = Platform.getBundle(YangActivator.PLUGIN_ID);
        IPath ecimLauncherStatePath = Platform.getStateLocation(ecimlauncherBundle);
        IPath yangLauncherStatePath = Platform.getStateLocation(yanglauncherBundle);
        String ecimLauncerPluginPath = ecimLauncherStatePath.toOSString();
        String yangLauncerPluginPath = yangLauncherStatePath.toOSString();
        File jythonJarFile = new File(ecimLauncerPluginPath + File.separator + JYTHON_STANDALONE_JAR);
        if (!jythonJarFile.exists()) {
            InputStream jythonURLInputStream = FileLocator.openStream(ecimlauncherBundle, new Path("lib" + File.separator + JYTHON_STANDALONE_JAR), false);
            FileUtils.copyInputStreamToFile(jythonURLInputStream, jythonJarFile);
        }
        this.jythonJarPath = jythonJarFile.getAbsolutePath();
        File pyangHome = new File(yangLauncerPluginPath + File.separator + PYANG_VERSION);
        if (!pyangAvailable(pyangHome)) {
            InputStream pyangInputStream = FileLocator.openStream(yanglauncherBundle, new Path("lib" + File.separator + PYANG_ARCHIVE), false);
            preparePyang(pyangInputStream, yangLauncerPluginPath);
        }
        this.pyangHomePath = pyangHome.getAbsolutePath();
    }

    /**
     * PYangValidator Constructor
     * 
     * @param pyangHome
     *            The pyang home path.
     */
    PyangRunner(String pyangHome, String jythonStandaloneJarPath) {
        this.pyangHomePath = pyangHome;
        this.jythonJarPath = jythonStandaloneJarPath;
    }

    private static boolean pyangAvailable(File pyangHome) {
        if (!pyangHome.exists()) {
            return false;
        }
        return new File(pyangHome, "bin/pyang").exists();
    }

    public static String preparePyang(InputStream pyangArchiveInputStream, String dest) throws IOException {
        TarInputStream pyangTarIn = new TarInputStream(new GZIPInputStream(pyangArchiveInputStream));
        TarEntry tarEntry = pyangTarIn.getNextEntry();
        String libPath = null;
        while (tarEntry != null) {
            // create a file with the same name as the tarEntry
            File destPath = new File(dest + File.separatorChar + tarEntry.getName());
            if (tarEntry.isDirectory()) {
                destPath.mkdirs();
                if (libPath == null) {
                    libPath = destPath.getAbsolutePath();
                }
            } else {
                FileOutputStream fout = new FileOutputStream(destPath);
                pyangTarIn.copyEntryContents(fout);
                fout.close();
            }
            tarEntry = pyangTarIn.getNextEntry();
        }
        pyangTarIn.close();
        return libPath;
    }

    public List<String> initializeCommandList() {
        List<String> commandList = new ArrayList<String>();
        if (PythonEnvHelper.getDefaultPythonVersion() == null) {
            commandList.add("java");
            commandList.add("-Djline.terminal=jline.UnsupportedTerminal");
            commandList.add("-jar");
            commandList.add(jythonJarPath);
        } else {
            commandList.add("python");
        }
        String pyangPath = pyangHomePath + File.separator + "bin" + File.separator + "pyang";
        commandList.add(pyangPath);
        return commandList;
    }

    int launchPythonProcess(List<String> commandList) throws IOException, InterruptedException {
        String[] cmdArrays = commandList.toArray(new String[commandList.size()]);
        String cmdLine = Arrays.toString(cmdArrays).replaceAll(", ", " ").replaceAll("\\[|\\]", "");
        LOGGER.info(cmdLine);

        String[] envp = (PythonEnvHelper.getDefaultPythonVersion() == null) ? new String[] { "JYTHONPATH=" + pyangHomePath } : new String[] { "PYTHONPATH="
                + pyangHomePath };
        final Process forkProcess = Runtime.getRuntime().exec(cmdLine, envp);

        errorMessageBuilder = new StringBuilder();
        ProcessMessageHook exceptionHook = new ProcessMessageHook(this + ":ExceptionHook", forkProcess.getErrorStream(), errorMessageBuilder);
        exceptionHook.start();

        outputMessageBuilder = new StringBuilder();
        ProcessMessageHook messageHook = new ProcessMessageHook(this + ":MessageHook", forkProcess.getInputStream(), outputMessageBuilder);
        messageHook.start();

        return forkProcess.waitFor();
    }

    public String getOutputMessage() {
        return (outputMessageBuilder != null) ? outputMessageBuilder.toString() : null;
    }

    public String getErrorMessage() {
        return (errorMessageBuilder != null) ? errorMessageBuilder.toString() : null;
    }

}
