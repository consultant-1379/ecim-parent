package com.ericsson.ecim.yang.launcher.preferences;

import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.preference.StringFieldEditor;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;

import com.ericsson.ecim.yang.launcher.YangActivator;

/**
 *
 */

public class PyangPreferencePage extends FieldEditorPreferencePage implements IWorkbenchPreferencePage {

    private StringFieldEditor cmdLineEditor;

    public PyangPreferencePage() {
        super(GRID);
        setPreferenceStore(YangActivator.getDefault().getPreferenceStore());
        setDescription("Pyang validation options");
    }

    /**
     * Creates the field editors. Field editors are abstractions of the common
     * GUI blocks needed to manipulate various types of preferences. Each field
     * editor knows how to save and restore itself.
     */
    @Override
    public void createFieldEditors() {
        cmdLineEditor = new StringFieldEditor(PreferenceConstants.CMD_LINE_OPTIONS, "Commandline options:", getFieldEditorParent());
        addField(cmdLineEditor);
        IPreferenceStore store = getPreferenceStore();
        cmdLineEditor.setStringValue(store.getString(PreferenceConstants.CMD_LINE_OPTIONS));
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.eclipse.ui.IWorkbenchPreferencePage#init(org.eclipse.ui.IWorkbench)
     */
    @Override
    public void init(IWorkbench workbench) {
        // Not Used
    }

}