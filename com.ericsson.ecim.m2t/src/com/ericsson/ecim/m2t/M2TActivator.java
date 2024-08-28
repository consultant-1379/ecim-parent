package com.ericsson.ecim.m2t;

import org.eclipse.core.runtime.Plugin;
import org.osgi.framework.BundleContext;

public class M2TActivator extends Plugin {
	
	public M2TActivator() {
		super();
	}
	
	// The plug-in ID
	public static final String PLUGIN_ID = "com.ericsson.ecim.m2t";

	// The shared instance
	private static M2TActivator plugin;
	

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext)
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
	public static M2TActivator getDefault() {
		return plugin;
	}
	
	/**
	 * Returns the bundle version
	 *
	 * @return the bundle version
	 */
	public static String getVersion() {
		return (String) getDefault().getBundle().getHeaders().get(org.osgi.framework.Constants.BUNDLE_VERSION);
	}

}

