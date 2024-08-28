package com.ericsson.ecim.launcher.mpmerge;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.handlers.HandlerUtil;

import com.ericsson.ecim.launcher.LauncherActivator;
import com.ericsson.ecim.launcher.MenuPropertyTester;
import com.ericsson.ecim.launcher.mpmerge.internal.MpXmlMergeOptionsDialog;
import com.ericsson.ecim.tools.MpXmlMerge;

public class MpXmlMergeHandler extends AbstractHandler {

    private IResource container = null;

    @Override
    public Object execute(final ExecutionEvent event) throws ExecutionException {
        IStructuredSelection selection = (IStructuredSelection) HandlerUtil.getCurrentSelectionChecked(event);
        final List<File> inputFiles = fetchMpXmlFiles(selection);

        Shell shell = HandlerUtil.getActiveShellChecked(event);
        MpXmlMergeOptionsDialog mergeOptionDlg = new MpXmlMergeOptionsDialog(shell, inputFiles);
        int result = mergeOptionDlg.open();
        if (result == IDialogConstants.OK_ID) {
            final Map<String, String> momMetaData = mergeOptionDlg.getMergeOptions();
            final File outputFile = mergeOptionDlg.getOutputFile();
            launchMergeJob(inputFiles, momMetaData, outputFile);
        }

        return null;
    }

    private void launchMergeJob(final List<File> inputFiles, final Map<String, String> momMetaData, final File outputFile) throws ExecutionException {
        try {
            Job mergeJob = new MerageJob("Merge MP XML File", inputFiles, momMetaData, outputFile);
            mergeJob.setUser(true);
            mergeJob.schedule();
            mergeJob.join();
            if (container != null) {
                container.refreshLocal(IResource.DEPTH_INFINITE, null);
            }
        } catch (Exception e) {
            throw new ExecutionException(e.getMessage(), e);
        }
    }

    private class MerageJob extends Job {

        private List<File> inputFiles;
        private Map<String, String> momMetaData;
        private File outputFile;

        public MerageJob(String name, final List<File> inputs, final Map<String, String> metaData, final File output) {
            super(name);
            this.inputFiles = inputs;
            this.momMetaData = metaData;
            this.outputFile = output;
        }

        @Override
        protected IStatus run(IProgressMonitor monitor) {
            monitor.beginTask("Mp Xml Merge start...", 10);
            monitor.worked(2);
            MpXmlMerge xmlMerge = new MpXmlMerge(inputFiles, outputFile, momMetaData);
            monitor.worked(2);
            try {
                xmlMerge.run();
            } catch (Exception e) {
                return new Status(Status.ERROR, LauncherActivator.PLUGIN_ID, e.getMessage(), e);
            }
            monitor.done();
            return Status.OK_STATUS;
        }
    }

    private List<File> fetchMpXmlFiles(IStructuredSelection selection) throws ExecutionException {
        int count = selection.size();
        final List<File> inputFiles = new ArrayList<File>();
        MenuPropertyTester tester = new MenuPropertyTester();
        if (count == 1) {
            Object object = selection.getFirstElement();
            if (object instanceof IFolder) {
                IFolder iFolder = (IFolder) object;
                getMpXmlFromFolder(inputFiles, tester, iFolder);
            }
        } else if (count > 1) {
            List<?> selectedObjects = selection.toList();
            for (Object member : selectedObjects) {
                if (tester.isMpXmlFile(member)) {
                    container = ((IFile) member).getParent();
                    inputFiles.add(((IFile) member).getRawLocation().toFile());
                }
            }
        }
        return inputFiles;
    }

    private void getMpXmlFromFolder(final List<File> inputFiles, MenuPropertyTester tester, IFolder iFolder) throws ExecutionException {
        try {
            container = iFolder;
            IResource[] members = iFolder.members();
            for (IResource member : members) {
                if (tester.isMpXmlFile(member)) {
                    inputFiles.add(((IFile) member).getRawLocation().toFile());
                }
            }
        } catch (CoreException e) {
            throw new ExecutionException(e.getMessage(), e);
        }
    }

}
