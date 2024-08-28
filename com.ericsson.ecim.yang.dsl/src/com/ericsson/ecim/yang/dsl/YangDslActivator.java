package com.ericsson.ecim.yang.dsl;

import org.eclipse.core.runtime.Plugin;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the plug-in life cycle
 */
public class YangDslActivator extends Plugin {

    // The plug-in ID
    public static final String PLUGIN_ID = "com.ericsson.ecim.yang.dsl"; //$NON-NLS-1$

    // The shared instance
    private static YangDslActivator plugin;
    
    /**
     * The constructor
     */
    public YangDslActivator() {
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
    public static YangDslActivator getDefault() {
        return plugin;
    }

}
