package com.ericsson.ecim.mgc.launcher.extension;

import org.eclipse.core.runtime.Assert;
import org.eclipse.emf.common.util.EList;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Enumeration;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.Stereotype;

import com.ericsson.ecim.imsudm.umlutils.HideGroupName2CategoryMigrator;
import com.ericsson.ecim.imsudm.umlutils.ImsUdmUmlUtilBase;

/**
 * This class is used to converts a model to the CoreMW profile.
 * 
 */
public class MgcImsUdmMigrator extends MgcUmlUtilBase {

    private Stereotype mgcClass;
    private Stereotype mgcAttribute;
    private Stereotype ecimKeyAttr;
    private Stereotype cmwClass;
    private Stereotype cmwAttr;
    private Stereotype imsUdmAttr;

    public MgcImsUdmMigrator(Model model) {
        super(model);
    }

    public MgcImsUdmMigrator() {
        super();
    }

    @Override
    public String toString() {
        return "Migrate from MGC Profile category values to the IMSUDM category";
    }

    @Override
    public boolean isApplicable() {
        return hasGuidelineDependencySet(MGC_GUIDELINES_URI) && model.getAppliedProfile(ImsUdmUmlUtilBase.IMSUDM_PROFILE_NAME) != null;
    }

    /**
     * Converts model to MGC Profile.
     */
    @Override
    public void run() {
        fetchOwnedStereotypes();
        migrateCategoryValues();
    }

    private void fetchOwnedStereotypes() {
        mgcClass = getMgcProfile().getOwnedStereotype("MgcClass");
        mgcAttribute = getMgcProfile().getOwnedStereotype("MgcAttribute");
        ecimKeyAttr = getEcimBaseProfile().getOwnedStereotype("EcimKeyAttribute");
        cmwClass = getCoreMWProfile().getOwnedStereotype("CmwClass");
        cmwAttr = getCoreMWProfile().getOwnedStereotype("CmwAttribute");
        imsUdmAttr = model.getAppliedProfile(ImsUdmUmlUtilBase.IMSUDM_PROFILE_NAME).getOwnedStereotype("ImsUdmAttr");

        Assert.isNotNull(mgcClass);
        Assert.isNotNull(mgcAttribute);
        Assert.isNotNull(ecimKeyAttr);
        Assert.isNotNull(cmwClass);
        Assert.isNotNull(cmwAttr);
        Assert.isNotNull(imsUdmAttr);
    }

    /**
     * Migrates category values in the MGC profile to the IMSUDM Profile
     */
    private void migrateCategoryValues() {
        Profile imsUdmProfile = model.getAppliedProfile(ImsUdmUmlUtilBase.IMSUDM_PROFILE_NAME);
        EList<Package> packages = model.getNestedPackages();
        for (Package umlPackage : packages) {
            EList<Element> elements = umlPackage.getOwnedElements();
            for (Element c : elements) {
                migrateCategoryInSubElements(imsUdmProfile, c);
            }
        }
    }

    private void migrateCategoryInSubElements(Profile imsUdmProfile, Element element) {
        EList<Element> subelements = element.getOwnedElements();
        for (Element subElement : subelements) {
            if (subElement.isStereotypeApplied(mgcAttribute)) {
                // Migrate category from MgcAttribute to ImsUdmAttr
            	String mgcCategoryValue = "";
                Object mgcCategoryValueObject = getProperty(mgcAttribute, subElement, "category");
                if (mgcCategoryValueObject != null)
                	mgcCategoryValue = mgcCategoryValueObject.toString();
                NamedElement imsUdmCategoryValue = mapCategoryStringToEnumLiteralValue(imsUdmProfile, mgcCategoryValue);

                if (imsUdmCategoryValue != null) {
                    setProperty(imsUdmAttr, subElement, HideGroupName2CategoryMigrator.CATEGORY, imsUdmCategoryValue);
                }
            }
        }
    }

    /**
     * Maps MGC category string to the new IMSUDM enum literal.
     * 
     * @param imsUdmProfile
     * @param categoryRawInput
     * @return
     */
    private NamedElement mapCategoryStringToEnumLiteralValue(Profile imsUdmProfile, String categoryRawInput) {
        Enumeration categoryType = (Enumeration) imsUdmProfile.getOwnedType("CategoryType");
        NamedElement categoryOutput = null;
        final String categoryInput = categoryRawInput.replaceAll("\\s", "").toLowerCase();

        if ("3".equals(categoryInput)) {
            categoryOutput = categoryType.getMember("OperatorConfigurable");
        } else if ("4".equals(categoryInput)) {
            categoryOutput = categoryType.getMember("SiteSpecific");
        } else if ("2".equals(categoryInput)) {
            categoryOutput = categoryType.getMember("SystemIntegration");
        } else if ("1".equals(categoryInput)) {
            categoryOutput = categoryType.getMember("Internal");
        }

        return categoryOutput;
    }

}
