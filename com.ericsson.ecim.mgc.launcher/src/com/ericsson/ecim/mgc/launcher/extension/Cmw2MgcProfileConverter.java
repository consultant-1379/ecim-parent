package com.ericsson.ecim.mgc.launcher.extension;

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
public class Cmw2MgcProfileConverter extends MgcUmlUtilBase {

    private Stereotype mgcClass;
    private Stereotype mgcAttribute;
    private Stereotype ecimKeyAttr;
    private Stereotype cmwClass;
    private Stereotype cmwAttr;

    public Cmw2MgcProfileConverter() {
        super();
    }

    public Cmw2MgcProfileConverter(Model model) {
        super(model);
    }

    @Override
    public String toString() {
        return "Convert from CoreMW to MGC Profile";
    }

    /**
     * Converts model to MGC Profile.
     */
    @Override
    public void run() {
        applyImsUdmProfile();
        applyProfile(MGC_PROFILE_NAME, MGC_PROFILE_URI);
        fetchOwnedStereotypes();
        applyMgcStereotype();
        changeCmw2MgcGuideline();
    }

    private void fetchOwnedStereotypes() {
        mgcClass = getMgcProfile().getOwnedStereotype("MgcClass");
        mgcAttribute = getMgcProfile().getOwnedStereotype("MgcAttribute");
        ecimKeyAttr = getEcimBaseProfile().getOwnedStereotype("EcimKeyAttribute");
        cmwClass = getCoreMWProfile().getOwnedStereotype("CmwClass");
        cmwAttr = getCoreMWProfile().getOwnedStereotype("CmwAttribute");

        Assert.isNotNull(mgcClass);
        Assert.isNotNull(mgcAttribute);
        Assert.isNotNull(ecimKeyAttr);
        Assert.isNotNull(cmwClass);
        Assert.isNotNull(cmwAttr);
        Assert.isNotNull(cmwClass);
    }

    private void applyMgcStereotype() {
        // Loop through the entire model and call migrate methods for matching
        // elements
        EList<Package> packages = model.getNestedPackages();
        for (Package umlPackage : packages) {
            EList<Element> elements = umlPackage.getOwnedElements();
            for (Element c : elements) {
                applyStereotypeForClass(c);
            }
        }
    }

    private void applyStereotypeForClass(Element c) {
        if (c.isStereotypeApplied(cmwClass)) {
            applyStereotype(mgcClass, c);
        }

        EList<Element> attributesOrActions = c.getOwnedElements();
        for (Element a : attributesOrActions) {
            if (a.isStereotypeApplied(cmwAttr) && !a.isStereotypeApplied(ecimKeyAttr)) {
                applyStereotype(mgcAttribute, a);
            }
        }
    }

}
