package com.ericsson.ecim.cpp.pm;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class EcimPmActivator implements BundleActivator {

    private static BundleContext context;

    public static BundleContext getContext() {
        return context;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext)
     */
    @Override
    public void start(BundleContext bundleContext) throws Exception {
        EcimPmActivator.context = bundleContext;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
     */
    @Override
    public void stop(BundleContext bundleContext) throws Exception {
        EcimPmActivator.context = null;
    }

    /**
     * Returns the bundle version
     *
     * @return the bundle version
     */
    public static String getVersion() {
        if (getContext() != null)
            return getContext().getBundle().getHeaders().get(org.osgi.framework.Constants.BUNDLE_VERSION);
        else
            return "";
    }

}
