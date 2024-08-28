package com.ericsson.ecim.launcher.adg;

import static com.ericsson.ecim.core.uml.helpers.SelectionHelper.getSelectionResource;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IResource;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.handlers.HandlerUtil;

import com.ericsson.ecim.launcher.adg.internal.DiagramJob;
import com.ericsson.ecim.launcher.adg.internal.DiagramOptionsDialog;

public class DiagramHandler extends AbstractHandler {

    @Override
    public Object execute(ExecutionEvent event) throws ExecutionException {
        ISelection selection = HandlerUtil.getCurrentSelectionChecked(event);

        if (!(selection instanceof IStructuredSelection)) {
            return null;
        }

        try {
            IResource selectedResource = getSelectionResource(selection);
            if (selectedResource != null) {
                Shell shell = HandlerUtil.getActiveShellChecked(event);
                DiagramOptionsDialog diagramOptionsDlg = new DiagramOptionsDialog(shell, selectedResource.getRawLocation().toFile().getParentFile());

                int result = diagramOptionsDlg.open();
                if (result == IDialogConstants.OK_ID) {
                    DiagramJob myjob = new DiagramJob("Diagram Generator", selectedResource, diagramOptionsDlg.getDiagramType(),
                            diagramOptionsDlg.getImageFormat(), diagramOptionsDlg.getFilterFile());
                    myjob.setUser(true);
                    myjob.schedule();
                }
            }
        } catch (Exception e) {
            throw new ExecutionException(e.getMessage(), e);
        }

        return null;
    }

}
