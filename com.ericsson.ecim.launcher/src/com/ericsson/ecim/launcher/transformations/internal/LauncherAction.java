package com.ericsson.ecim.launcher.transformations.internal;

import java.util.List;
import java.util.Map;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.uml2.uml.Model;

import com.ericsson.ecim.launcher.LauncherActivator;
import com.ericsson.ecim.launcher.transformations.internal.TransformationRegistry.TransformationData;

public class LauncherAction extends EcimMenuActionHandler {

    public LauncherAction() {
        super();
    }

    /**
     * Checks if model to be transformed has been saved.
     * 
     * @param shell
     * @param model
     * @return true if model is saved or user is OK with continuing anyway
     */
    private boolean checkIfModelHasBeenSaved(Shell shell, Model model) {
        if (model.eResource().isModified()) {
            // TBD Tried to save model, it works, but other dialogs appear (for reload
            // or reload+save, which was confusing.
            return MessageDialog.openConfirm(shell, "Model is modified.", "Model has not been saved. Press OK to continue with transformation anyway.");
        } else {
            return true;
        }
    }

    /**
     * Menu Handler
     */
    @Override
    public Object execute(ExecutionEvent event) {
        try {
            // We bring the models and the corresponding files from selection
            selection = (IStructuredSelection) HandlerUtil.getCurrentSelectionChecked(event);
            shell = HandlerUtil.getActiveShellChecked(event);
            Map<IFile, Model> selected = fetchFromSelection(selection);

            for (Map.Entry<IFile, Model> selMapEntry : selected.entrySet()) {
                Model selModel = selected.get(selMapEntry.getKey());
                if (!checkIfModelHasBeenSaved(shell, selModel))
                    continue;
                // Create the dialog dynamically
                List<TransformationData> allData = TransformationRegistry.getTransformationsFromRegistry();
                IFile modelFile = selMapEntry.getKey();
                GenerateArtifactsWizard generateWizard = new GenerateArtifactsWizard(allData, selModel, modelFile);
                WizardDialog generateDialog = new WizardDialog(shell, generateWizard);
                generateDialog.open();
            }

        } catch (Exception e) {
            LauncherActivator.getDefault().getLog().log(new Status(IStatus.WARNING, LauncherActivator.PLUGIN_ID, e.getMessage(), e));
        }

        return null;
    }

}
