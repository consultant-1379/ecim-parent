package com.ericsson.ecim.junit.tests;

import org.eclipse.core.runtime.Plugin;
import org.eclipse.core.runtime.preferences.DefaultScope;
import org.eclipse.core.runtime.preferences.IEclipsePreferences;
import org.osgi.framework.BundleContext;

import com.ericsson.ecim.core.CoreActivator;

/**
 * The activator class controls the plug-in life cycle
 */
public class TestsActivator extends Plugin {

    // The plug-in ID
    public static final String PLUGIN_ID = "com.ericsson.ecim.tests";

    // The shared instance
    private static TestsActivator plugin;

    private static String timeStamp = TestLogger.getTime();

    /**
     * The constructor
     */
    public TestsActivator() {
        DefaultScope scope = new DefaultScope();
        IEclipsePreferences preference = scope.getNode("com.adocus.mma.core");
        if (preference != null) {
            preference.put("com.adocus.mma.open_activation", "never");
            preference.put("com.adocus.mma.activation_perspective", "never");
            preference.put("com.adocus.mma.change_wizard", "never");
        }
        
        String noMMA = System.getProperty("noMMA");
        if(noMMA != null) {
            CoreActivator.setRunningWithMMA(false);
        }
    }
    
    /*
     * (non-Javadoc)
     * @see org.eclipse.core.runtime.Plugins#start(org.osgi.framework.BundleContext)
     */
    public void start(BundleContext context) throws Exception {
        super.start(context);
        plugin = this;
    }

    /*
     * (non-Javadoc)
     * @see org.eclipse.core.runtime.Plugin#stop(org.osgi.framework.BundleContext)
     */
    public void stop(BundleContext context) throws Exception {
        plugin = null;
        super.stop(context);
    }

    /**
     * Returns the shared instance
     *
     * @return the shared instance
     */
    public static TestsActivator getDefault() {
        return plugin;
    }

    public static String getTimeStamp() {
        return timeStamp;
    }

}
