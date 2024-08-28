package com.ericsson.ecim.cpp.launcher;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class CppLauncherActivator implements BundleActivator {

    // The plug-in ID
    public static final String PLUGIN_ID = "com.ericsson.ecim.cpp.launcher";

    private static BundleContext context;

    static BundleContext getContext() {
        return context;
    }

    /*
     * (non-Javadoc)
     * @see org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext)
     */
    @Override
    public void start(BundleContext bundleContext) throws Exception {
        CppLauncherActivator.context = bundleContext;
    }

    /*
     * (non-Javadoc)
     * @see org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
     */
    @Override
    public void stop(BundleContext bundleContext) throws Exception {
        CppLauncherActivator.context = null;
    }

}
