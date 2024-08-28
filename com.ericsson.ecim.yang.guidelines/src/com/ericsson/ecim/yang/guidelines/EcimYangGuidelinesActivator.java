package com.ericsson.ecim.yang.guidelines;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class EcimYangGuidelinesActivator implements BundleActivator {

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
        EcimYangGuidelinesActivator.context = bundleContext;
    }

    /*
     * (non-Javadoc)
     * @see org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
     */
    @Override
    public void stop(BundleContext bundleContext) throws Exception {
        EcimYangGuidelinesActivator.context = null;
    }

}
