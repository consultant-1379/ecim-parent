package com.ericsson.ecim.coremw.launcher.extension;

import org.eclipse.core.runtime.Assert;
import org.eclipse.emf.common.util.EList;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Enumeration;
import org.eclipse.uml2.uml.EnumerationLiteral;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.Stereotype;

import com.ericsson.ecim.umlmod.UmlUtilUpgrader;

/**
 * Migrates the model to CoreMW Profile.
 */
public class UpgradeCoreMwModel extends UmlUtilUpgrader {

    private static final String IMM_NAMESPACE = "immNamespace";
    private static final String IS_PERSISTENT = "isPersistent";
    private Stereotype ecimMom;
    private Stereotype ecimContribution;
    private Stereotype cmwContribution;
    private Stereotype cmwMom;
    private Stereotype cmwAttribute;
    private Stereotype ecimModel;
    private Stereotype cmwModel;
    private Stereotype roAttr;
    private Stereotype keyAttr;

    public UpgradeCoreMwModel(Model model) {
        super(model);
    }

    public UpgradeCoreMwModel() {
        super();
    }

    @Override
    public void run() {
        super.run();
        fetchOwnedStereotype();
        migrateModelToImmMM();
    }

    private void fetchOwnedStereotype() {
        ecimMom = getEcimBaseProfile().getOwnedStereotype("EcimMom");
        ecimContribution = getEcimBaseProfile().getOwnedStereotype("EcimContribution");
        cmwContribution = getCoreMWProfile().getOwnedStereotype("CmwContribution");
        cmwMom = getCoreMWProfile().getOwnedStereotype("CmwMom");
        cmwAttribute = getCoreMWProfile().getOwnedStereotype("CmwAttribute");
        ecimModel = getEcimBaseProfile().getOwnedStereotype("EcimModel");
        cmwModel = getCoreMWProfile().getOwnedStereotype("CmwModel");
        roAttr = getEcimBaseProfile().getOwnedStereotype("EcimAttribute_RO");
        keyAttr = getEcimBaseProfile().getOwnedStereotype("EcimKeyAttribute");

        Assert.isNotNull(ecimMom);
        Assert.isNotNull(ecimContribution);
        Assert.isNotNull(cmwContribution);
        Assert.isNotNull(cmwMom);
        Assert.isNotNull(cmwAttribute);
        Assert.isNotNull(ecimModel);
        Assert.isNotNull(cmwModel);
        Assert.isNotNull(roAttr);
        Assert.isNotNull(keyAttr);
    }

    /**
     * Migrates the model to latest CoreMW profile.
     */
    void migrateModelToImmMM() {

        if (model.isStereotypeApplied(ecimModel)) {
            applyStereotype(cmwModel, model);
        }
        EList<Package> packages = model.getNestedPackages();

        // Loop through the entire model and call migrate methods for matching
        // elements
        for (Package umlPackage : packages) {

            if (umlPackage.isStereotypeApplied(ecimMom)) {
                applyStereotype(cmwMom, umlPackage);
                EnumerationLiteral enumLiteral = (EnumerationLiteral) getProperty(cmwMom, umlPackage, IMM_NAMESPACE);

                if ("NONE".equals(enumLiteral.getName())) {
                    // Only set the immNamespace property to NONE if it is set to NONE
                    // by flipping values like this it seems the NONE value is actually stuck in uml file...
                    Enumeration immNameStateType = (Enumeration) getCoreMWProfile().getOwnedType("ImmNamespaceType");
                    NamedElement enumValue = immNameStateType.getMember("MOM_NAME");
                    setProperty(cmwMom, umlPackage, IMM_NAMESPACE, enumValue);
                    enumValue = immNameStateType.getMember("NONE");
                    setProperty(cmwMom, umlPackage, IMM_NAMESPACE, enumValue);
                }
            }

            EList<Element> elements = umlPackage.getOwnedElements();

            for (Element e : elements) {
                if (e.isStereotypeApplied(ecimContribution)) {
                    applyStereotype(cmwContribution, e);
                }
            }

            for (Element c : elements) {
                EList<Element> attributes = c.getOwnedElements();
                applyAttributesProperty(attributes);
            }
        }
    }

    private void applyAttributesProperty(EList<Element> attributes) {
        for (Element a : attributes) {
            if (a.isStereotypeApplied(roAttr)) {
                boolean ecimIsPersistent = (Boolean) getProperty(roAttr, a, IS_PERSISTENT);
                setProperty(cmwAttribute, a, IS_PERSISTENT, ecimIsPersistent);
            } else if (a.isStereotypeApplied(keyAttr)) {
                boolean keyIsPersistent = (Boolean) getProperty(keyAttr, a, IS_PERSISTENT);
                applyStereotype(cmwAttribute, a);
                setProperty(cmwAttribute, a, IS_PERSISTENT, keyIsPersistent);
            }
        }
    }

    private Profile getCoreMWProfile() {
        return model.getAppliedProfile(CmwUmlUtilBase.COREMW_PROFILE_NAME);
    }

    @Override
    public Profile getProfile() {
        return getCoreMWProfile();
    }

    @Override
    public String getProfileName() {
        return "CoreMWProfile";
    }

}
