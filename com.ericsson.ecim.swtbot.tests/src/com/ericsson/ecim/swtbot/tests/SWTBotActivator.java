package com.ericsson.ecim.swtbot.tests;

import org.eclipse.core.runtime.preferences.DefaultScope;
import org.eclipse.core.runtime.preferences.IEclipsePreferences;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the plug-in life cycle
 */
public class SWTBotActivator extends AbstractUIPlugin {

    // The plug-in ID
    public static final String PLUGIN_ID = "com.ericsson.ecim.swtbot.tests"; //$NON-NLS-1$

    // The shared instance
    private static SWTBotActivator plugin;

    private static final String NEVER = "never";

    /**
     * The constructor
     */
    public SWTBotActivator() {
        @SuppressWarnings("deprecation")
        DefaultScope scope = new DefaultScope();
        IEclipsePreferences preference = scope.getNode("com.adocus.mma.core");
        if (preference != null) {
            preference.put("com.adocus.mma.open_activation", NEVER);
            preference.put("com.adocus.mma.activation_perspective", NEVER);
            preference.put("com.adocus.mma.change_wizard", NEVER);
        }
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
    public static SWTBotActivator getDefault() {
        return plugin;
    }

}
