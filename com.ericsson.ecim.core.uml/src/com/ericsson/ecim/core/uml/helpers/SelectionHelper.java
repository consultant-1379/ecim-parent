package com.ericsson.ecim.core.uml.helpers;

import java.io.File;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.URIUtil;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.papyrus.infra.emf.utils.EMFHelper;
import org.eclipse.papyrus.infra.onefile.model.ISubResourceFile;
import org.eclipse.uml2.uml.Model;

import com.ericsson.ecim.core.helpers.ResourceHelper;

public class SelectionHelper {

    private SelectionHelper() {
    }
    
    /**
     * Extracts the uml model and file that the selections points to (if any).
     * 
     * @param selection
     * @return
     * @throws Exception
     */
    public static Map<IFile, Model> fetchFromSelection(ISelection selection) throws URISyntaxException {
        Map<IFile, Model> retMap = new HashMap<IFile, Model>();
        if (selection instanceof IStructuredSelection) {
            IStructuredSelection sel = (IStructuredSelection) selection;
            for (Object object : sel.toList()) {
                EObject eObject = EMFHelper.getEObject(object);
                if (eObject != null && (eObject instanceof Model)) {
                    Model model = (Model) eObject;
                    Resource resource = model.eResource();
                    URI resourceURI = resource.getURI();
                    IFile file = locateIFileByEMFURI(resourceURI);
                    retMap.put(file, model);
                }
            }
        }
        return retMap;
    }

    private static IFile locateIFileByEMFURI(URI modelURI) throws URISyntaxException {
        IResource resource = null;
        if (modelURI.isPlatform()) {
            Path platformPath = new Path(modelURI.toPlatformString(true));
            resource = ResourcesPlugin.getWorkspace().getRoot().findMember(platformPath);
        } else {
            java.net.URI fileURI = URIUtil.fromString(modelURI.toString());
            resource = ResourceHelper.file2IResource(new File(fileURI));
        }
        if (resource != null && (resource instanceof IFile)) {
            return (IFile) resource;
        }
        return null;
    }
    
    public static IResource getSelectionResource(ISelection selection) {
        IStructuredSelection structureSelection = (IStructuredSelection) selection;
        for (Object o : structureSelection.toList()) {
            if (o instanceof ISubResourceFile) {
                return ((ISubResourceFile) o).getFile();
            }
            if (o instanceof IResource) {
                return (IResource) o;
            }
        }
        return null;
    }

}
