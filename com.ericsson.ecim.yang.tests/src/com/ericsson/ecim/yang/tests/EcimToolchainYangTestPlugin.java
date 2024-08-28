/*******************************************************************************
 * Copyright Ericsson AB 2012.
 * All Rights Reserved. No part of this software may be reproduced
 * in any form without the written permission of the copyright owner.
 *
 * Contributors:
 *   Bernd Hufmann - Initial API and implementation
 *******************************************************************************/
package com.ericsson.ecim.yang.tests;

import org.eclipse.core.runtime.Plugin;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the plug-in life cycle
 */
public class EcimToolchainYangTestPlugin extends Plugin {

    /** The plug-in ID */
    public static final String PLUGIN_ID = "com.ericsson.ecim.core.tests"; //$NON-NLS-1$

    // The shared instance
    private static EcimToolchainYangTestPlugin plugin;

    /**
     * The constructor
     */
    public EcimToolchainYangTestPlugin() {
    }

    /*
     * (non-Javadoc)
     * @see org.eclipse.core.runtime.Plugin#start(org.osgi.framework.BundleContext)
     */
    @Override
    public void start(BundleContext context) throws Exception {
        super.start(context);
        plugin = this;
    }

    /*
     * (non-Javadoc)
     * @see org.eclipse.core.runtime.Plugin#stop(org.osgi.framework.BundleContext)
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
    public static EcimToolchainYangTestPlugin getDefault() {
        return plugin;
    }

}
