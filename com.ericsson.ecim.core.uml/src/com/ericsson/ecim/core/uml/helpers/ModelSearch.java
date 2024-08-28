package com.ericsson.ecim.core.uml.helpers;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.log4j.Logger;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Model;

/**
 * This class is used to provide help when searching for UML elements
 * 
 */
public class ModelSearch {

    private static final Logger LOGGER = Logger.getLogger(ModelSearch.class);
    
    private ModelSearch() {
    }

    /**
     * Parse a model looking for elements based on their UML element IDs
     * 
     * @param model
     *            The model to parse
     * @param elementIDs
     *            Element IDs to search for
     * @return EList Set of matching elements
     */
    public static EList<Element> getElementsByID(Model model, EList<String> elementIDs) {
        EList<Element> matchingElements = new BasicEList<Element>();
        for (String id : elementIDs) {
            EList<Element> modelElements = new BasicEList<Element>(model.allOwnedElements());
            for (Element element : modelElements) {
                // check for model matches based on UML element IDs
                if (id.equals(((XMLResource) element.eResource()).getID(element))) {
                    matchingElements.add(element);
                }
            }
        }
        return matchingElements;
    }

    public static List<Resource> fetchPlatformResource(Resource modelResource) {
        IProject containingProject = parseContainingProject(modelResource);
        List<IProject> referencedProjects = new ArrayList<IProject>();
        try {
            if (containingProject != null) {
                IProject[] referenceds = containingProject.getReferencedProjects();
                referencedProjects = Arrays.asList(referenceds);
            }
        } catch (Exception e) {
            LOGGER.warn(e.getMessage(), e);
        }

        List<Resource> platformResources = new ArrayList<Resource>();
        EList<Resource> resourceInSet = modelResource.getResourceSet().getResources();
        for (Resource resource : resourceInSet) {
            URI eUri = resource.getURI();
            if (!eUri.isPlatform()) {
                continue;
            }
            IProject parentProject = parseContainingProject(resource);
            if (containingProject.equals(parentProject) || referencedProjects.contains(parentProject)) {
                platformResources.add(resource);
            }
        }

        return platformResources;
    }

    private static IProject parseContainingProject(Resource resource) {
        URI eUri = resource.getURI();
        if (!eUri.isPlatform()) {
            return null;
        }
        String platformString = eUri.toPlatformString(true);
        IResource platformResource = ResourcesPlugin.getWorkspace().getRoot().findMember(platformString);
        if (platformResource == null) {
            return null;
        }
        return platformResource.getProject();
    }

    /**
     * Iterates over a UML model looking for UML InstaceSpecifications that have
     * a specific stereotype
     * 
     * @param umlModelFile
     * @return true of model contains instances otherwise fail
     */
    public static boolean modelContainsInstances(File umlModelFile) {
        Uml2ModelHelper uml2ModelHelper = null;
        try {
            uml2ModelHelper = new Uml2ModelHelper(umlModelFile);
            Model model = uml2ModelHelper.loadModel();

            EList<Element> elements = model.allOwnedElements();
            for (Element element : elements) {
                // match a specific stereotype than indicates a UML
                // InstanceSpecification. these stereotypes are defined in class
                // XXXX.
                if ((element.getAppliedStereotype(EcimStereotypeNames.MOC_INSTANCE) != null)
                        || (element.getAppliedStereotype(EcimStereotypeNames.STRUCT_INSTANCE)) != null) {
                    return true;
                }
            }
            return false;
        } catch (IOException e) {
            LOGGER.warn(e.getMessage(), e);
            return false;
        } finally {
            // you must unload the model to avoid holding the model in memory
            // after this transform.
            if (uml2ModelHelper != null)
                uml2ModelHelper.unloadModel();
        }
    }

}
