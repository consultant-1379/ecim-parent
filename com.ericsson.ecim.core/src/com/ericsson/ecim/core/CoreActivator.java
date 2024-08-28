package com.ericsson.ecim.core;

import org.eclipse.core.runtime.Plugin;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the plug-in life cycle
 */
public class CoreActivator extends Plugin {

    // The plug-in ID
    public static final String PLUGIN_ID = "com.ericsson.ecim.core";

    // The shared instance
    private static CoreActivator plugin;

    private static boolean runningWithMMA = true;
    private static boolean runningWithValidation = true;

    private static boolean runningHeadless = false;

    // to keep track of validationErrorLog option usage
    private static boolean runningWithValidationErrorLog = false;
    private static String errorOutputFilepath = null;

    /**
     * The constructor
     */
    public CoreActivator() {
    }

    /*
     * (non-Javadoc)
     * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext)
     */
    @Override
    public void start(BundleContext context) throws Exception {
        super.start(context);
        plugin = this;
    }

    /*
     * (non-Javadoc)
     * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext)
     */
    @Override
    public void stop(BundleContext context) throws Exception {
        plugin = null;
        super.stop(context);
    }

    /**
     * Returns the shared instance
     *
     * @return the shared instance
     */
    public static CoreActivator getDefault() {
        return plugin;
    }

    /**
     * Set to true if running in headless mode
     * @param runningHeadless
     */
    public static void setRunningHeadless(boolean runningHeadless) {
        CoreActivator.runningHeadless = runningHeadless;
    }

    /**
     * Returns true if running in headless mode, otherwise false
     * @return
     */
    public static boolean isRunningHeadless() {
        return runningHeadless;
    }

    public static boolean isRunningWithMMA() {
        return runningWithMMA;
    }

    public static void setRunningWithMMA(boolean runningWithMMA) {
        CoreActivator.runningWithMMA = runningWithMMA;
    }

    public static boolean isRunningWithValidation() {
        return runningWithValidation;
    }

    public static void setRunningWithValidation(boolean runningWithValidation) {
        CoreActivator.runningWithValidation = runningWithValidation;
    }

    public static boolean isRunningWithValidationErrorLog() {
        return runningWithValidationErrorLog;
    }

    public static void setRunningWithValidationErrorLog(boolean status) {
        runningWithValidationErrorLog = status;
    }

    public static String getErrorOutputFilepath() {
        return errorOutputFilepath;
    }

    public static void setErrorOutputFilepath(String path) {
        errorOutputFilepath = path;
    }
}
