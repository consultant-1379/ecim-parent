package com.ericsson.ecim.cpp.re;

import org.eclipse.core.runtime.Plugin;
import org.osgi.framework.BundleContext;

public class CppReActivator extends Plugin {

    // The plug-in ID
    public static final String PLUGIN_ID = "com.ericsson.ecim.cpp.re";

    // The shared instance
    private static CppReActivator plugin;
    
    public CppReActivator() {
        super();
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
    public static CppReActivator getDefault() {
        return plugin;
    }
    
    /**
     * Returns the bundle version
     *
     * @return the bundle version
     */
    public static String getVersion() {
        return getDefault().getBundle().getHeaders().get(org.osgi.framework.Constants.BUNDLE_VERSION);
    }

}
