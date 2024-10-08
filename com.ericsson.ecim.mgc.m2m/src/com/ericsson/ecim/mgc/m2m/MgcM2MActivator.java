
package com.ericsson.ecim.mgc.m2m;

import org.eclipse.core.runtime.Plugin;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the plug-in life cycle.
 */
public class MgcM2MActivator extends Plugin {

    /**
     * The plug-in ID.
     */
    public static final String PLUGIN_ID = "com.ericsson.ecim.mgc.m2m";

    /**
     * The shared instance.
     */
    private static MgcM2MActivator plugin;
    
    /**
     * The constructor.
     */
    public MgcM2MActivator() {
    }

    /**{@inheritDoc}
     *
     * @see org.eclipse.core.runtime.Plugin#start(org.osgi.framework.BundleContext)
     */
    @Override
    public void start(BundleContext context) throws Exception {
        super.start(context);
        plugin = this;
    }

    /**{@inheritDoc}
     *
     * @see org.eclipse.core.runtime.Plugin#stop(org.osgi.framework.BundleContext)
     */
    @Override
    public void stop(BundleContext context) throws Exception {
        plugin = null;
        super.stop(context);
    }

    /**
     * Returns the shared instance.
     *
     * @return the shared instance
     */
    public static MgcM2MActivator getDefault() {
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
