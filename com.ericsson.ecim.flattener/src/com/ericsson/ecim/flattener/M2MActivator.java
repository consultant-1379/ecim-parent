package com.ericsson.ecim.flattener;

import org.eclipse.core.runtime.Plugin;
import org.osgi.framework.BundleContext;


public class M2MActivator extends Plugin {

    // The plug-in ID
    public static final String PLUGIN_ID = "com.ericsson.ecim.flattener";

    // The shared instance
    private static M2MActivator plugin;

    public M2MActivator() {
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
    public static M2MActivator getDefault() {
        return plugin;
    }

}


