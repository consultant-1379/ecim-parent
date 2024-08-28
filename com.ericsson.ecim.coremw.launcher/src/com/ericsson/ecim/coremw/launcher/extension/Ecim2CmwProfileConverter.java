package com.ericsson.ecim.coremw.launcher.extension;

import org.eclipse.core.runtime.Assert;
import org.eclipse.emf.common.util.EList;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Enumeration;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Stereotype;

/**
 * This class is used to converts a model to the CoreMW profile.
 * 
 */
public class Ecim2CmwProfileConverter extends CmwUmlUtilBase {

    private static final String IS_CONFIGURABLE = "isConfigurable";
    private Stereotype rwAttr;
    private Stereotype roAttr;
    private Stereotype keyAttr;
    private Stereotype ecimAction;
    private Stereotype cmwAttr;
    private Stereotype cmwAction;
    private Stereotype ecimClass;
    private Stereotype ecimRootClass;
    private Stereotype cmwClass;
    private Stereotype ecimMom;
    private Stereotype cmwMom;
    private Stereotype ecimStruct;
    private Stereotype ecimStructMember;
    private Stereotype cmwStruct;
    private Stereotype cmwStructMember;
    private Stereotype cmwContribution;
    private Stereotype ecimContribution;
    private Stereotype ecimModel;
    private Stereotype cmwModel;

    public Ecim2CmwProfileConverter(Model model) {
        super(model);
    }

    public Ecim2CmwProfileConverter() {
        super();
    }

    @Override
    public String toString() {
        return "Convert from ECIM Base to CoreMW Profile";
    }

    @Override
    public boolean isApplicable() {
        return hasGuidelineDependencySet(ECIM_GUIDELINES_URI);
    }

    /**
     * Converts model to CoreMW Profile.
     */
    @Override
    public void run() {
        applyCoreMwProfile();
        fetchOwnedStereotypes();
        applyCoreMwStereotype();
        changeEcim2CmwGuideline();
    }

    private void fetchOwnedStereotypes() {
        rwAttr = getEcimBaseProfile().getOwnedStereotype("EcimAttribute_RW");
        roAttr = getEcimBaseProfile().getOwnedStereotype("EcimAttribute_RO");
        keyAttr = getEcimBaseProfile().getOwnedStereotype("EcimKeyAttribute");
        ecimAction = getEcimBaseProfile().getOwnedStereotype("EcimAction");
        cmwAttr = getCoreMWProfile().getOwnedStereotype("CmwAttribute");
        cmwAction = getCoreMWProfile().getOwnedStereotype("CmwAction");
        ecimClass = getEcimBaseProfile().getOwnedStereotype("EcimMoClass");
        ecimRootClass = getEcimBaseProfile().getOwnedStereotype("EcimRootMoClass");
        cmwClass = getCoreMWProfile().getOwnedStereotype("CmwClass");
        ecimMom = getEcimBaseProfile().getOwnedStereotype("EcimMom");
        cmwMom = getCoreMWProfile().getOwnedStereotype("CmwMom");
        ecimStruct = getEcimBaseProfile().getOwnedStereotype("EcimStruct");
        ecimStructMember = getEcimBaseProfile().getOwnedStereotype("EcimStructMember");
        cmwStruct = getCoreMWProfile().getOwnedStereotype("CmwStruct");
        cmwStructMember = getCoreMWProfile().getOwnedStereotype("CmwStructMember");
        cmwContribution = getCoreMWProfile().getOwnedStereotype("CmwContribution");
        ecimContribution = getEcimBaseProfile().getOwnedStereotype("EcimContribution");
        ecimModel = getEcimBaseProfile().getOwnedStereotype("EcimModel");
        cmwModel = getCoreMWProfile().getOwnedStereotype("CmwModel");

        Assert.isNotNull(rwAttr);
        Assert.isNotNull(roAttr);
        Assert.isNotNull(ecimAction);
        Assert.isNotNull(cmwAttr);
        Assert.isNotNull(cmwAction);
        Assert.isNotNull(ecimClass);
        Assert.isNotNull(ecimRootClass);
        Assert.isNotNull(cmwClass);
    }

    private void applyCoreMwStereotype() {
        EList<Package> packages = model.getNestedPackages();

        // Loop through the entire model and call migrate methods for matching
        // elements

        if (model.isStereotypeApplied(ecimModel)) {
            applyStereotype(cmwModel, model); // Not needed probably since CmwModel is required stereotype
        }
        for (Package umlPackage : packages) {
            if (umlPackage.isStereotypeApplied(ecimMom)) {
                applyStereotype(cmwMom, umlPackage);
                Enumeration immNameStateType = (Enumeration) getCoreMWProfile().getOwnedType("ImmNamespaceType");
                NamedElement momNameLiteral = immNameStateType.getMember("MOM_NAME");
                setProperty(cmwMom, umlPackage, "immNamespace", momNameLiteral);
            }
            applyPackageElement(umlPackage);
        }
    }

    private void applyPackageElement(Package umlPackage) {
        EList<Element> elements = umlPackage.getOwnedElements();

        for (Element c : elements) {

            if (c.isStereotypeApplied(ecimContribution)) {
                c.applyStereotype(cmwContribution);
            }
            if (elementIsAppliedToOneOf(c, new Stereotype[] { ecimClass, ecimRootClass })) {
                if (!c.isStereotypeApplied(cmwClass))
                    c.applyStereotype(cmwClass);
                c.setValue(cmwClass, IS_CONFIGURABLE, true);
            }
            if (c.isStereotypeApplied(ecimStruct) && applyStereotype(cmwStruct, c)) {
                c.setValue(cmwStruct, IS_CONFIGURABLE, true);
            }

            applyClassAttributes(c);
        }
    }

    private void applyClassAttributes(Element c) {
        EList<Element> attributesOrActions = c.getOwnedElements();
        for (Element a : attributesOrActions) {
            applyStereotypes(a);
        }
    }

    private void applyStereotypes(Element e) {
        if (e.isStereotypeApplied(rwAttr)) {
            applyRWAttribute(e);
        } else if (e.isStereotypeApplied(roAttr) && !e.isStereotypeApplied(cmwAttr)) {
            e.applyStereotype(cmwAttr);
        } else if (e.isStereotypeApplied(keyAttr) && !e.isStereotypeApplied(cmwAttr)) {
            e.applyStereotype(cmwAttr);
        } else if (e.isStereotypeApplied(ecimAction) && !e.isStereotypeApplied(cmwAction)) {
            e.applyStereotype(cmwAction);
        } else if (e.isStereotypeApplied(ecimStructMember) && applyStereotype(cmwStructMember, e)) {
            e.setValue(cmwStructMember, IS_CONFIGURABLE, true);
        }
    }

    private void applyRWAttribute(Element e) {
        if (!e.isStereotypeApplied(cmwAttr))
            e.applyStereotype(cmwAttr);
        e.setValue(cmwAttr, IS_CONFIGURABLE, true);
    }

    private void applyCoreMwProfile() {
        applyProfile("CoreMW Profile", COREMW_PROFILE_URI);
    }

}
