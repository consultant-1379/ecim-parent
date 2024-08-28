package com.ericsson.ecim.vdicos.launcher.extension;

import org.eclipse.core.runtime.Assert;
import org.eclipse.emf.common.util.EList;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Stereotype;

/**
 * This class is used to converts a model to the CoreMW profile.
 * 
 */
public class Cmw2TspVdicosProfileConverter extends TspVdicosUmlUtilBase {

    private Stereotype vdicosMom;
    private Stereotype vdicosClass;
    private Stereotype vdicosAttribute;
    private Stereotype vdicosAction;
    private Stereotype vdicosType;
    private Stereotype ecimMom;
    private Stereotype ecimAbstractMoClass;
    private Stereotype ecimLibrary;
    private Stereotype ecimKeyAttr;
    private Stereotype ecimStructMember;
    private Stereotype cmwClass;
    private Stereotype cmwAttr;
    private Stereotype cmwAction;
    private Stereotype ecimDerivedString;
    private Stereotype ecimDerivedInteger;
    private Stereotype ecimDerivedFloat;
    private Stereotype ecimDerivedBoolean;

    public Cmw2TspVdicosProfileConverter(Model model) {
        super(model);
    }

    public Cmw2TspVdicosProfileConverter() {
        super();
    }

    @Override
    public String toString() {
        return "Convert from CoreMW to TSP/VDicos Profile";
    }

    /**
     * Converts model to TSP/VDicos Profile.
     */
    @Override
    public void run() {
        applyImsUdmProfile();
        applyProfile(TSP_VDICOS_PROFILE_NAME, TSP_VDICOS_PROFILE_URI);
        fetchOwnedStereotypes();
        applyTspVDicosStereotype();
        changeCmw2TspVdicosGuideline();
    }

    private void fetchOwnedStereotypes() {
        vdicosMom = getTspVdicosProfile().getOwnedStereotype("VDicosMom");
        vdicosClass = getTspVdicosProfile().getOwnedStereotype("VDicosClass");
        vdicosAttribute = getTspVdicosProfile().getOwnedStereotype("VDicosAttribute");
        vdicosAction = getTspVdicosProfile().getOwnedStereotype("VDicosAction");
        vdicosType = getTspVdicosProfile().getOwnedStereotype("VDicosType");
        ecimMom = getEcimBaseProfile().getOwnedStereotype("EcimMom");
        ecimAbstractMoClass = getEcimBaseProfile().getOwnedStereotype("EcimAbstractMoClass");
        ecimLibrary = getEcimBaseProfile().getOwnedStereotype("EcimLibrary");
        ecimKeyAttr = getEcimBaseProfile().getOwnedStereotype("EcimKeyAttribute");
        ecimStructMember = getEcimBaseProfile().getOwnedStereotype("EcimStructMember");
        cmwClass = getCoreMWProfile().getOwnedStereotype("CmwClass");
        cmwAttr = getCoreMWProfile().getOwnedStereotype("CmwAttribute");
        cmwAction = getCoreMWProfile().getOwnedStereotype("CmwAction");
        ecimDerivedString = getEcimBaseProfile().getOwnedStereotype("EcimDerivedString");
        ecimDerivedInteger = getEcimBaseProfile().getOwnedStereotype("EcimDerivedInteger");
        ecimDerivedFloat = getEcimBaseProfile().getOwnedStereotype("EcimDerivedFloat");
        ecimDerivedBoolean = getEcimBaseProfile().getOwnedStereotype("EcimDerivedBoolean");

        Assert.isNotNull(vdicosMom);
        Assert.isNotNull(vdicosClass);
        Assert.isNotNull(vdicosAttribute);
        Assert.isNotNull(vdicosAction);
        Assert.isNotNull(vdicosType);
        Assert.isNotNull(ecimMom);
        Assert.isNotNull(ecimKeyAttr);
        Assert.isNotNull(cmwClass);
        Assert.isNotNull(cmwAttr);
        Assert.isNotNull(cmwAction);
        Assert.isNotNull(cmwClass);
    }

    private void applyTspVDicosStereotype() {

        // Loop through the entire model and call migrate methods for matching
        // elements
        EList<Package> packages = model.getNestedPackages();
        for (Package umlPackage : packages) {
            if (elementIsAppliedToOneOf(umlPackage, new Stereotype[] { ecimMom, ecimLibrary })) {
                umlPackage.applyStereotype(vdicosMom);
            }
            EList<Element> elements = umlPackage.getOwnedElements();
            for (Element c : elements) {
                applyStereotypeForClass(c);
            }
        }
    }

    private void applyStereotypeForClass(Element c) {
        if (elementIsAppliedToOneOf(c, new Stereotype[] { cmwClass, ecimAbstractMoClass })) {
            applyStereotype(vdicosClass, c);
        } else if (c.isStereotypeApplied(ecimDerivedString)) {
            applyStereotype(vdicosType, c);
        } else if (c.isStereotypeApplied(ecimDerivedInteger)) {
            applyStereotype(vdicosType, c);
        } else if (c.isStereotypeApplied(ecimDerivedFloat)) {
            applyStereotype(vdicosType, c);
        } else if (c.isStereotypeApplied(ecimDerivedBoolean)) {
            applyStereotype(vdicosType, c);
        }

        EList<Element> attributesOrActions = c.getOwnedElements();
        for (Element a : attributesOrActions) {
            if (elementIsAppliedToOneOf(a, new Stereotype[] { cmwAttr, ecimKeyAttr, ecimStructMember })) {
                applyStereotype(vdicosAttribute, a);
            } else if (a.isStereotypeApplied(cmwAction)) {
                applyStereotype(vdicosAction, a);
            }
        }
    }

}
