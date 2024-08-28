package com.ericsson.ecim.validator;

import java.io.IOException;
import java.util.List;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.uml2.uml.Dependency;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.NamedElement;

import com.ericsson.ecim.core.exceptions.EcimException;
import com.ericsson.ecim.core.uml.helpers.ModelSearch;

public class ModelGuidelineValidation {

    private static final Logger LOGGER = Logger.getLogger(ModelGuidelineValidation.class);

    public void checkModelGuidelineHierarchy(Model model) throws EcimException {
        Resource modelGuidelineResource = null;
        if (LOGGER.isDebugEnabled()) {
            LOGGER.debug("Validating model " + model.getName());
        }

        EList<Dependency> clientDependencies = model.getClientDependencies();
        for (Dependency dependency : clientDependencies) {
            EList<NamedElement> suppliers = dependency.getSuppliers();
            for (NamedElement namedElement : suppliers) {
                modelGuidelineResource = namedElement.eResource();
                break;
            }
        }

        List<Resource> platformResources = ModelSearch.fetchPlatformResource(model.eResource());
        for (Resource resource : platformResources) {
            checkResource(model, modelGuidelineResource, resource);
        }
    }

    private void checkResource(Model model, Resource modelGuidelineResource, Resource resource) throws EcimException {
        try {
            if (resource.getURI().equals(model.eResource().getURI())) {
                return;
            }
            resource.load(null);
            EList<EObject> objectList = resource.getContents();
            if (objectList == null || objectList.isEmpty()) {
                return;
            }
            EObject eObj = objectList.get(0);
            if (eObj instanceof Model) {
                Model platformModel = (Model) eObj;
                checkDependencyGuideline(modelGuidelineResource, platformModel);
            }
        } catch (IOException e) {
            throw new EcimException("Load dependency resource error. Resource: " + resource.getURI(), e);
        }
    }

    private void checkDependencyGuideline(Resource modelGuidelineResource, Model platformModel) throws EcimException {
        EList<Dependency> dependencies = platformModel.getClientDependencies();
        for (Dependency dependency : dependencies) {
            EList<NamedElement> suppliers = dependency.getSuppliers();
            for (NamedElement namedElement : suppliers) {
                Resource elementResource = namedElement.eResource();
                checkGuidlineResource(modelGuidelineResource, elementResource);
            }
        }
    }

    private void checkGuidlineResource(Resource modelGuidelineResource, Resource elementResource) throws EcimException {
        if (modelGuidelineResource != null && elementResource != null) {
            if (!modelGuidelineResource.getURI().equals(elementResource.getURI())) {
                throw new EcimException("Model guidelines and it's dependencies guideline must be consistent. \n" + modelGuidelineResource.getURI() + ",\n"
                        + elementResource.getURI());
            }
            return;
        }
        throw new EcimException("Can't compare with model and dependency guideline resource!");
    }

}
