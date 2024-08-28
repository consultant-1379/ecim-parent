package com.ericsson.ecim.umlmod;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.Assert;
import org.eclipse.core.runtime.ILog;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.uml2.uml.Dependency;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.Stereotype;

import com.ericsson.ecim.core.uml.helpers.Uml2ModelHelper;

/**
 * Inherit this class to define your own UML utility that can be called via the ECIM Tool-chain->Run Utility menu. In
 * order for it to be shown in menu list, you need to register the concrete class using the "com.ericsson.ecim.umlmod"
 * extension point.
 * 
 * @author erajaik
 * 
 */
public abstract class UmlUtilBase implements IUmlUtil {

    private static final Logger LOGGER = Logger.getLogger(UmlUtilBase.class);

    public static final String ECIM_GUIDELINES_URI = "pathmap://ECIM_GUIDELIB/ECIM_Guidelines.uml";
    public static final String ECIM_PROFILE_NAME = "ECIM Base Profile";

    protected static final ILog logger = UmlModActivator.getDefault().getLog();

    private static Map<String, Model> guidelineModels = new HashMap<String, Model>();

    private Exception exception;

    protected Model model;
    protected IFile modelFile;
    protected File rawFile;

    public UmlUtilBase() {
    }

    public UmlUtilBase(Model model) {
        setModel(model);
    }

    @Override
    public final Model getModel() {
        return model;
    }

    @Override
    public final void setModel(Model model) {
        this.model = model;
    }

    @Override
    public final IFile getModelFile() {
        return modelFile;
    }

    @Override
    public final void setModelFile(IFile modelFile) {
        this.modelFile = modelFile;
    }

    @Override
    public final File getRawFile() {
        return rawFile;
    }

    @Override
    public final void setRawFile(File rawFile) {
        this.rawFile = rawFile;
    }

    /**
     * Override this method to conditionally include the UML utility in the dialog.
     */
    @Override
    public boolean isApplicable() {
        return true;
    }

    /**
     * Override this method to have a confirmation message shown before the UML utility is run.
     */
    @Override
    public String getConfirmationMessage() {
        return null;
    }

    /**
     * Override to give the UML Utilities ID, default ID is same as class name.
     */
    @Override
    public String getUtilId() {
        return this.getClass().getName();
    }

    /**
     * Override to give the UML modifier a better name than just the class name.
     */
    @Override
    public String toString() {
        return this.getClass().getName();
    }

    public static boolean elementIsAppliedToOneOf(Element e, Stereotype[] stereoTypes) {
        boolean applied = false;
        for (Stereotype stereo : stereoTypes) {
            applied |= e.isStereotypeApplied(stereo);
            if (applied)
                break;
        }
        return applied;
    }

    protected final Profile getEcimBaseProfile() {
        return model.getAppliedProfile(ECIM_PROFILE_NAME);
    }

    protected final TransactionalEditingDomain getTransactionalEditingDomain() {
        return TransactionUtil.getEditingDomain(model);
    }

    /**
     * Applies a stereotype if not already applied.
     * 
     * @return true if the stereotype was applied first time, false otherwise
     */
    protected final boolean applyStereotype(Stereotype stereotype, Element c) {
        if (stereotype != null && !c.isStereotypeApplied(stereotype)) {
            logger.log(new Status(IStatus.INFO, UmlModActivator.PLUGIN_ID, "Applying " + stereotype.getName() + " stereotype on "
                    + ((NamedElement) c).getQualifiedName()));
            c.applyStereotype(stereotype);
            return true;
        }
        return false;
    }

    /**
     * Sets property value on a stereotyped model element.
     */
    protected final void setProperty(Stereotype stereotype, Element element, String propertyName, Object value) {
        String name = ((NamedElement) element).getQualifiedName() == null ? element.toString() : ((NamedElement) element).getQualifiedName();
        try {
            if (stereotype != null && value != null && !value.equals(element.getValue(stereotype, propertyName))) {
                logger.log(new Status(IStatus.INFO, UmlModActivator.PLUGIN_ID, "Setting " + propertyName + " property on " + name + " to '" + value + "'"));
                element.setValue(stereotype, propertyName, value);
            }
        } catch (Exception e) {
            logger.log(new Status(IStatus.WARNING, UmlModActivator.PLUGIN_ID, "Ignoring property " + propertyName + " on " + name
                    + " which could not be set due to " + e));
        }
    }

    /**
     * Gets property value on a stereotyped model element.
     */
    protected final Object getProperty(Stereotype stereotype, Element element, String propertyName) {
        Object result = null;
        try {
            if (stereotype != null) {
                result = element.getValue(stereotype, propertyName);
            }
        } catch (Exception e) {
            logger.log(new Status(IStatus.WARNING, UmlModActivator.PLUGIN_ID, "Ignoring property " + propertyName + " on "
                    + ((NamedElement) element).getQualifiedName() + " which could not be get due to " + e));
        }
        return result;
    }

    /**
     * Unapplies a given profile to the model.
     * 
     * @param profileName
     */
    protected final void unapplyProfile(String profileName) {
        Profile profile = model.getAppliedProfile(profileName);
        if (profile != null) {
            model.unapplyProfile(profile);
        }
    }

    protected final Model lookupGuidelineModel(String guidelineURI) {
        if (guidelineModels.containsKey(guidelineURI))
            return guidelineModels.get(guidelineURI);

        Uml2ModelHelper uh = null;
        try {
            uh = new Uml2ModelHelper(guidelineURI);
            Model guideline = uh.loadModel();
            guidelineModels.put(guidelineURI, guideline);
            return guideline;
        } catch (IOException e) {
            if (uh != null)
                uh.unloadModel();
            logger.log(new Status(IStatus.ERROR, UmlModActivator.PLUGIN_ID, "Error when looking up guideline model.", e));
            return null;
        }
    }

    protected final boolean hasGuidelineDependencySet(String guidelineURI) {
        Model guidelineModel = lookupGuidelineModel(guidelineURI);
        if (guidelineModel != null) {
            EList<Dependency> dependencies = model.getClientDependencies();
            for (Dependency dependency : dependencies) {
                if (dependency.getSupplier(guidelineModel.getName()) != null) {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * Changes dependency from one guideline to another.
     * 
     * @param toGuideline
     * @param removeGuideline
     */
    protected final void changeGuidelineDependency(Model toGuideline, Model removeGuideline) {
        Dependency dependencyToRemove = null;
        boolean dependencyAlreadyExists = false;
        EList<Element> elements = model.getOwnedElements();
        for (Element el : elements) {
            if (el instanceof Dependency) {
                Dependency d = (Dependency) el;
                if (d.getSupplier(toGuideline.getName()) != null) {
                    dependencyAlreadyExists = true;
                }
                if (d.getSupplier(removeGuideline.getName()) != null) {
                    dependencyToRemove = d;
                }
            }
        }
        if (!dependencyAlreadyExists)
            model.createDependency(toGuideline);
        if (dependencyToRemove != null)
            dependencyToRemove.destroy();

    }

    /**
     * Activates MMA by assuming that the first model there is a dependency to is the guideline model
     */
    protected final void activateMMA() {
        try {
            EList<Element> elements = model.getOwnedElements();
            for (Element el : elements) {
                if (!(el instanceof Dependency)) {
                    continue;
                }
                Dependency d = (Dependency) el;
                if (d.getSuppliers().get(0) instanceof Model) {
                    com.adocus.mma.api.UiActivation.run(d.getSuppliers().get(0), model);
                    return;
                }
            }
        } catch (Exception e) {
            LOGGER.warn(e.getMessage(), e);
        }
    }

    /**
     * Applies a given profile to the model.
     * 
     * @param profileName
     * @param profileURI
     */
    protected final void applyProfile(String profileName, String profileURI) {
        if (model.getAppliedProfile(profileName) != null)
            return;

        Uml2ModelHelper uh = null;
        try {
            uh = new Uml2ModelHelper(profileURI);
            EObject profile = uh.loadObject();
            Assert.isNotNull(profile);
            Assert.isTrue(profile instanceof Profile);
            model.applyProfile((Profile) profile);
        } catch (IOException e) {
            if (uh != null)
                uh.unloadModel();
            logger.log(new Status(IStatus.ERROR, UmlModActivator.PLUGIN_ID, "Error when applying Profile.", e));
        }
    }

    @Override
    public void postTxWork() {
        activateMMA();
    }

    @Override
    public final void handleException(Throwable exception) {
        logger.log(new Status(IStatus.ERROR, UmlModActivator.PLUGIN_ID, "Exception in " + this.getClass().getCanonicalName(), exception));
        this.exception = new Exception(exception);
    }

    @Override
    public final Exception getException() {
        return exception;
    }

}