package com.ericsson.ecim.yang.launcher.listeners;

import java.io.InputStream;

import org.apache.log4j.Logger;
import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.ISelectionListener;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;

public class YangSelectionListener implements ISelectionListener {

    private static final Logger LOGGER = Logger.getLogger(YangSelectionListener.class);

    @Override
    public void selectionChanged(IWorkbenchPart part, ISelection selection) {
        if (selection instanceof IStructuredSelection) {
            IStructuredSelection sel = (IStructuredSelection) selection;
            for (Object o : sel.toList()) {
                if (!(o instanceof IFile)) {
                    continue;
                }
                IFile selectedResource = (IFile) o;
                if (selectedResource.getName().toLowerCase().endsWith(".yang")) {
                    validateFileAsYangEMFResource(selectedResource);
                }
            }
        }
    }

    /**
     * Check if supplied file can be loaded as YANG EMF resource
     * 
     * @param iFile
     *            Selected input file
     * @return True if input is a valid YANG model
     */
    private boolean validateFileAsYangEMFResource(IFile iFile) {
        try {

            URI modelURI = URI.createFileURI(iFile.getFullPath().toString());
            XtextResourceSet resourceSet = new XtextResourceSet();
            XtextResource resource = (XtextResource) resourceSet.createResource(modelURI);
            InputStream inputStream = iFile.getContents();
            // load the body text and parse to ensure it is well formed
            resource.load(inputStream, null);
            if (resource.getParseResult().hasSyntaxErrors()) {
                return false;
            } else {
                return !resource.getContents().isEmpty();
            }
        } catch (Exception e) {
            LOGGER.warn(e.getMessage(), e);
            return false;
        }
    }

}