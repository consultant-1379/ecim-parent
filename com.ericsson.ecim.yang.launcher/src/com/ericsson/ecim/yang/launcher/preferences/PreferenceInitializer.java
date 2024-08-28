package com.ericsson.ecim.yang.launcher.preferences;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;

import com.ericsson.ecim.core.CoreActivator;
import com.ericsson.ecim.yang.launcher.YangActivator;

/**
 * Class used to initialize default preference values.
 */
public class PreferenceInitializer extends AbstractPreferenceInitializer {

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer#
     * initializeDefaultPreferences()
     */
    @Override
    public void initializeDefaultPreferences() {
        IPreferenceStore store = YangActivator.getDefault().getPreferenceStore();
        if (!CoreActivator.isRunningHeadless()) {
            store.setDefault(PreferenceConstants.CMD_LINE_OPTIONS, PreferenceConstants.DEFAULT_CMD_LINE_OPTIONS);
        }
    }

}
