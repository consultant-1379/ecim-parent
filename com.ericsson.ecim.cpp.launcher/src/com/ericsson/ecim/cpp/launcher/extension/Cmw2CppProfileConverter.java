package com.ericsson.ecim.cpp.launcher.extension;

import org.eclipse.core.runtime.Assert;
import org.eclipse.emf.common.util.EList;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Stereotype;

/**
 * This class is used to convert a model to the CPP profile.
 * 
 */
public class Cmw2CppProfileConverter extends CppUmlUtilBase {

    private Stereotype cppClass;
    private Stereotype cppAttribute;
    private Stereotype cppStructMember;
    private Stereotype cppAction;
    private Stereotype cppParameter;
    private Stereotype ecimStructMember;
    private Stereotype ecimParameter;
    private Stereotype cmwClass;
    private Stereotype cmwAttr;
    private Stereotype cmwAction;

    public Cmw2CppProfileConverter(Model model) {
        super(model);
    }

    public Cmw2CppProfileConverter() {
        super();
    }

    @Override
    public String toString() {
        return "Convert from CoreMW to CPP Profile";
    }

    @Override
    public boolean isApplicable() {
        return hasGuidelineDependencySet(COREMW_GUIDELINES_URI);
    }

    /**
     * Converts model to CPP Profile.
     */
    @Override
    public void run() {
        applyProfile(CPP_PROFILE_NAME, CPP_PROFILE_URI);
        fetchOwnedStereotypes();
        applyCppStereotype();
        changeCmw2CppGuideline();
    }
    
    private void fetchOwnedStereotypes() {
        cppClass = getCppProfile().getOwnedStereotype("CppClass");
        cppAttribute = getCppProfile().getOwnedStereotype("CppAttribute");
        cppStructMember = getCppProfile().getOwnedStereotype("CppStructMember");
        cppAction = getCppProfile().getOwnedStereotype("CppAction");
        cppParameter = getCppProfile().getOwnedStereotype("CppParameter");
        ecimStructMember = getEcimBaseProfile().getOwnedStereotype("EcimStructMember");
        ecimParameter = getEcimBaseProfile().getOwnedStereotype("EcimParameter");
        cmwClass = getCoreMWProfile().getOwnedStereotype("CmwClass");
        cmwAttr = getCoreMWProfile().getOwnedStereotype("CmwAttribute");
        cmwAction = getCoreMWProfile().getOwnedStereotype("CmwAction");

        Assert.isNotNull(cppClass);
        Assert.isNotNull(cppAttribute);
        Assert.isNotNull(cppStructMember);
        Assert.isNotNull(cppParameter);
        Assert.isNotNull(cppAction);
        Assert.isNotNull(cmwClass);
        Assert.isNotNull(cmwAttr);
        Assert.isNotNull(cmwAction);
        Assert.isNotNull(cmwClass);
    }

    private void applyCppStereotype() {
        // Loop through the entire model and call migrate methods for matching
        // elements
        EList<Package> packages = model.getNestedPackages();
        for (Package umlPackage : packages) {
            EList<Element> elements = umlPackage.getOwnedElements();
            for (Element c : elements) {
                if (c.isStereotypeApplied(cmwClass)) {
                    applyStereotype(cppClass, c);
                }

                EList<Element> attributesOrActions = c.getOwnedElements();
                for (Element a : attributesOrActions) {
                    applyStereotypeForOwnedElement(a);
                }
            }
        }
    }

    private void applyStereotypeForOwnedElement(Element a) {
        if (a.isStereotypeApplied(cmwAttr)) {
            applyStereotype(cppAttribute, a);
        } else if (a.isStereotypeApplied(cmwAction)) {
            applyStereotype(cppAction, a);
            EList<Element> params = a.getOwnedElements();
            for (Element p : params) {
                if (p.isStereotypeApplied(ecimParameter)) {
                    applyStereotype(cppParameter, p);
                }
            }
        } else if (a.isStereotypeApplied(ecimStructMember)) {
            applyStereotype(cppStructMember, a);
        }
    }

}
