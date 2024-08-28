package com.ericsson.ecim.cpp.launcher.extension;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.papyrus.infra.onefile.model.ISubResourceFile;
import org.eclipse.ui.handlers.HandlerUtil;

/**
 * Handler for the ECIM->MP XML to UML Transformation.
 * 
 * @author erajaik
 *
 */
public class CppReAction extends AbstractHandler {

    @Override
    public Object execute(ExecutionEvent event) throws ExecutionException {

        ISelection selection = HandlerUtil.getCurrentSelectionChecked(event);
        IFile selectedResource = null;

        if (selection instanceof IStructuredSelection) {
            IStructuredSelection structureSelection = (IStructuredSelection) selection;
            for (Object o : structureSelection.toList()) {
                if (o instanceof ISubResourceFile) {
                    selectedResource = ((ISubResourceFile) o).getFile();
                    break;
                }
                if (o instanceof IFile) {
                    selectedResource = (IFile) o;
                }
            }

            try {
                if (selectedResource != null) {
                    CppReTransformationJob myjob = new CppReTransformationJob("MP XML to UML Transformation", selectedResource.getRawLocation().toFile());
                    myjob.setUser(true);
                    myjob.schedule();
                }
            } catch (Exception e) {
                throw new ExecutionException(e.getMessage(), e);
            }
        }

        return null;
    }

}
