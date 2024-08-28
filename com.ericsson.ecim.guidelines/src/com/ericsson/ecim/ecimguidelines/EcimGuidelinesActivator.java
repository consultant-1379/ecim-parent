package com.ericsson.ecim.ecimguidelines;

import org.eclipse.core.runtime.Plugin;
import org.osgi.framework.BundleContext;

public class EcimGuidelinesActivator extends Plugin {

    public static final String PLUGIN_ID = "com.ericsson.ecim.guidelines";

    private static EcimGuidelinesActivator plugin = null;

    @Override
    public void start(BundleContext context) throws Exception {
        super.start(context);
        plugin = this;
    }

    @Override
    public void stop(BundleContext context) throws Exception {
        plugin = null;
        super.stop(context);
    }

    public static EcimGuidelinesActivator getDefault() {
        return plugin;
    }
}
