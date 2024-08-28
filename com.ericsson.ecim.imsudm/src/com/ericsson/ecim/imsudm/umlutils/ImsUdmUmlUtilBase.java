package com.ericsson.ecim.imsudm.umlutils;

import java.io.IOException;

import org.eclipse.core.runtime.Assert;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.EList;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.Stereotype;

import com.ericsson.ecim.core.uml.helpers.Uml2ModelHelper;
import com.ericsson.ecim.coremw.launcher.extension.CmwUmlUtilBase;
import com.ericsson.ecim.umlmod.UmlModActivator;

/**
 * Base class for CPP UML utilities.
 * 
 * @author erajaik
 *
 */
public abstract class ImsUdmUmlUtilBase extends CmwUmlUtilBase {

    public static final String IMSUDM_PROFILE_NAME = "IMSUDM";
    protected static final String IMSUDM_PROFILE_URI = "pathmap://ECIM_IMSUDM/IMSUDM.profile.uml";
    protected static final String IMSUDM_GUIDELINES_URI = "pathmap://IMSUDM_GUIDELIB/ImsUdmGuidelines.uml";

    public ImsUdmUmlUtilBase(Model model) {
        super(model);
    }

    public ImsUdmUmlUtilBase() {
        super();
    }

    @Override
    public boolean isApplicable() {
        return hasGuidelineDependencySet(COREMW_GUIDELINES_URI);
    }

    protected void applyImsUdmProfile() {
        applyProfile(IMSUDM_PROFILE_NAME, IMSUDM_PROFILE_URI);

        Stereotype cmwAttribute = getCoreMWProfile().getOwnedStereotype("CmwAttribute");
        Stereotype imsUdmAttr = getImsUdmProfile().getOwnedStereotype("ImsUdmAttr");
        EList<Package> packages = model.getNestedPackages();

        for (Package umlPackage : packages) {
            EList<Element> elements = umlPackage.getOwnedElements();
            for (Element e : elements) {
                applyElement(cmwAttribute, imsUdmAttr, e);
            }
        }
    }

    private void applyElement(Stereotype cmwAttribute, Stereotype imsUdmAttr, Element element) {
        EList<Element> subelements = element.getOwnedElements();
        for (Element e : subelements) {
            if (e.isStereotypeApplied(cmwAttribute)) {
                applyStereotype(imsUdmAttr, e);
            }
        }
    }

    protected void unapplyImsUdmProfile() {
        unapplyProfile(IMSUDM_PROFILE_NAME);
    }

    protected Profile getImsUdmProfile() {
        return model.getAppliedProfile(IMSUDM_PROFILE_NAME);
    }

    protected void changeImsUdm2CmwGuideline() {
        Uml2ModelHelper uh = null;
        try {
            uh = new Uml2ModelHelper(COREMW_GUIDELINES_URI);
            Model toGuideline = uh.loadModel();
            Assert.isNotNull(toGuideline);
            uh = new Uml2ModelHelper(IMSUDM_GUIDELINES_URI);
            Model fromGuideline = uh.loadModel();
            Assert.isNotNull(fromGuideline);

            changeGuidelineDependency(toGuideline, fromGuideline);

        } catch (IOException e) {
            if (uh != null)
                uh.unloadModel();
            logger.log(new Status(IStatus.ERROR, UmlModActivator.PLUGIN_ID, "Error when creating ECIM Guideline dependency.", e));
        }
    }

    protected void changeCmw2ImsUdmGuideline() {
        Uml2ModelHelper uh = null;
        try {
            uh = new Uml2ModelHelper(COREMW_GUIDELINES_URI);
            Model fromGuideline = uh.loadModel();
            Assert.isNotNull(fromGuideline);
            uh = new Uml2ModelHelper(IMSUDM_GUIDELINES_URI);
            Model toGuideline = uh.loadModel();
            Assert.isNotNull(toGuideline);

            changeGuidelineDependency(toGuideline, fromGuideline);

        } catch (IOException e) {
            if (uh != null)
                uh.unloadModel();
            logger.log(new Status(IStatus.ERROR, UmlModActivator.PLUGIN_ID, "Error when creating ECIM Guideline dependency.", e));
        }
    }

}
