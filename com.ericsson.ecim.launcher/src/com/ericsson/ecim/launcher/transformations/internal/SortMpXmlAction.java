package com.ericsson.ecim.launcher.transformations.internal;

import java.io.File;
import java.io.InputStream;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.handlers.HandlerUtil;

import com.ericsson.ecim.core.helpers.XmlUtil;
import com.ericsson.ecim.launcher.LauncherActivator;
import com.ericsson.ecim.launcher.MenuPropertyTester;

public class SortMpXmlAction extends AbstractHandler {

    @Override
    public Object execute(ExecutionEvent event) throws ExecutionException {
        IStructuredSelection selection = (IStructuredSelection) HandlerUtil.getCurrentSelectionChecked(event);
        Shell shell = HandlerUtil.getActiveShellChecked(event);
        MenuPropertyTester tester = new MenuPropertyTester();

        for (Object o : selection.toList()) {
            if (o instanceof IFile) {
                IFile selectedResource = (IFile) o;
                if (!tester.test(selectedResource, "isMpXmlFile", null, null)) {
                    continue;
                }
                performTransform(selectedResource, shell);
            }
        }

        MessageDialog.openInformation(shell, "Sort MP XML", "Sorting of MP XML file completed successfully!");
        return null;
    }

    private void performTransform(IFile selectedResource, Shell shell) throws ExecutionException {
        try {
            InputStream sortXslStream = LauncherActivator.getDefault().getBundle().getResource("/xsl/sortMpXml.xsl").openStream();
            File inputFile = new File(selectedResource.getRawLocation().toOSString());
            XmlUtil.runXsltOnXmlFile(inputFile, sortXslStream, true);
        } catch (Exception e) {
            MessageDialog.openError(shell, "Sorting of MP XML failed!", e.getMessage());
            throw new ExecutionException(e.getMessage(), e);
        }
    }

}
