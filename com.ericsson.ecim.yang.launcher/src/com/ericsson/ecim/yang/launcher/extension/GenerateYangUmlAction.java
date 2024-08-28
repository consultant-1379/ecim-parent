package com.ericsson.ecim.yang.launcher.extension;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.ILog;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.papyrus.infra.onefile.model.ISubResourceFile;
import org.eclipse.ui.handlers.HandlerUtil;

import com.ericsson.ecim.yang.launcher.YangActivator;

public class GenerateYangUmlAction extends AbstractHandler {

    @Override
    public Object execute(ExecutionEvent event) throws ExecutionException {
        ISelection selection = HandlerUtil.getCurrentSelectionChecked(event);
        if (!(selection instanceof IStructuredSelection)) {
            return null;
        }

        List<IFile> selectedResources = new ArrayList<IFile>();
        IStructuredSelection structureSelection = (IStructuredSelection) selection;
        for (Object o : structureSelection.toList()) {
            if (o instanceof ISubResourceFile) {
                selectedResources.add(((ISubResourceFile) o).getFile());
            }
            if (o instanceof IFile) {
                selectedResources.add((IFile) o);
            }
        }

        try {
            PyangPlantUMLGenerator yangUmlGenerator = new PyangPlantUMLGenerator();
            String[] yangFilePaths = new String[selectedResources.size()];
            for (int i = 0; i < selectedResources.size(); i++) {
                yangFilePaths[i] = selectedResources.get(i).getRawLocation().toOSString();
            }
            yangUmlGenerator.generateYangUmlDiagram(yangFilePaths);

            selectedResources.get(0).getProject().refreshLocal(IResource.DEPTH_INFINITE, null);
        } catch (Exception e) {
            ILog yangLog = YangActivator.getDefault().getLog();
            yangLog.log(new Status(IStatus.ERROR, YangActivator.PLUGIN_ID, e.getMessage()));
            throw new ExecutionException(e.getMessage(), e);
        }
        return null;
    }

}
