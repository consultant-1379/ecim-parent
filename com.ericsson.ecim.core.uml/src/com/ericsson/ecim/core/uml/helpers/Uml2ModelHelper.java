package com.ericsson.ecim.core.uml.helpers;

import java.io.File;
import java.io.IOException;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.uml2.uml.Model;

/**
 * This class is used to manage the lifecycle of UML2 models. It also provides
 * some useful UML2 Model manipulation methods
 * 
 */
public class Uml2ModelHelper {

    private Resource modelResource;
    private Model model;

    private static final TransactionalEditingDomain sharedEditingDomain;
    private ResourceSet resourceSet;

    static {
        sharedEditingDomain = TransactionalEditingDomain.Factory.INSTANCE.createEditingDomain();
    }

    /**
     * This constructor is used to manipulate models based on a pathmap URI, for
     * example "pathmap://ECIM_GUIDELIB/ECIM_Guidelines.emx"
     * 
     * @param uri
     * @throws IOException
     */
    public Uml2ModelHelper(String uri) {
        this(URI.createURI(uri), true);
    }

    /**
     * This constructor is used to manipulate models based on a File
     * 
     * @param modelFile
     * @throws IOException
     */
    public Uml2ModelHelper(File modelFile) throws IOException {
        this(URI.createFileURI(modelFile.getCanonicalPath()), true);
    }

    public Uml2ModelHelper(File modelFile, boolean shareEditingDomain) throws IOException {
        this(URI.createFileURI(modelFile.getCanonicalPath()), shareEditingDomain);
    }

    public Uml2ModelHelper(URI modelURI, boolean shareEditingDomain) {
        if (shareEditingDomain) {
            resourceSet = sharedEditingDomain.getResourceSet();
        } else {
            TransactionalEditingDomain editingDomain = TransactionalEditingDomain.Factory.INSTANCE.createEditingDomain();
            resourceSet = editingDomain.getResourceSet();
        }
        modelResource = resourceSet.createResource(modelURI);
    }

    /**
     * Loads the model and stores it in the resource
     */
    public Model loadModel() throws IOException {
        EObject object = loadObject();
        if (object == null || !(object instanceof Model)) {
            throw new IOException("Could not cast EObject to UML 2 Model: " + modelResource.getURI());
        }
        model = (Model) object;
        // associate the model resource with the Eclipse resource so profiles
        // data will be save-able later
        modelResource = model.eResource();
        return model;
    }

    public Model getModel() {
        return model;
    }

    /**
     * TODO:Comment me!
     * 
     * @return the EMF representation of the file passed to the constructor, can
     *         be <i>null</i>
     * @throws IOException
     *             can be cast if the loading of the file fails
     */
    public EObject loadObject() throws IOException {
        modelResource.load(null);
        EList<EObject> l = modelResource.getContents();

        if (!l.isEmpty()) {
            return l.get(0);
        }
        return null;
    }

    public Resource getResource() throws IOException {
        modelResource.load(null);
        return modelResource;
    }

    /**
     * Save a complete model (including any associated profile/stereotype
     * values) to the file system
     * 
     * @file File to be saved to
     */
    public void saveModel(File file) throws IOException {
        if (file == null)
            return;
        URI modelURI = URI.createFileURI(file.getAbsolutePath());
        modelResource.setURI(modelURI);

        try {
            modelResource.save(null);
        } catch (IOException ioe) {
            throw new IOException("Could not save UML 2 Model to file: " + modelURI, ioe);
        }
    }

    /**
     * Save a complete model (including any associated profile/stereotype
     * values) to the file system
     * 
     */
    public void saveModel() throws IOException {
        try {
            modelResource.save(null);
        } catch (IOException ioe) {
            throw new IOException("Could not save UML 2 Model to a file", ioe);
        }
    }

    /**
     * This method must be called when you are done with the loaded model.
     */
    public void unloadModel() {
        ModelCleanup.unload(modelResource);
    }

}
