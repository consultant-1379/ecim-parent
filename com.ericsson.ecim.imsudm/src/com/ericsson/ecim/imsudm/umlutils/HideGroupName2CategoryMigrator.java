package com.ericsson.ecim.imsudm.umlutils;

import org.eclipse.emf.common.util.EList;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Enumeration;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.Stereotype;

/**
 * Checks for specific values in the hideGroupName property and sets the category property accordingly.
 * 
 * @author ERAJAIK
 *
 */
public class HideGroupName2CategoryMigrator extends ImsUdmUmlUtilBase {

    public static final String CATEGORY = "category";
    private static final String HIDE_GROUP_NAME = "hideGroupName";

    @Override
    public void run() throws Exception {
        Stereotype cmwAttribute = getCoreMWProfile().getOwnedStereotype("CmwAttribute");
        Stereotype imsUdmAttr = getImsUdmProfile().getOwnedStereotype("ImsUdmAttr");
        Stereotype roAttr = getEcimBaseProfile().getOwnedStereotype("EcimAttribute_RO");
        Stereotype rwAttr = getEcimBaseProfile().getOwnedStereotype("EcimAttribute_RW");
        Stereotype keyAttr = getEcimBaseProfile().getOwnedStereotype("EcimKeyAttribute");
        EList<Package> packages = model.getNestedPackages();

        for (Package umlPackage : packages) {

            EList<Element> elements = umlPackage.getOwnedElements();
            for (Element c : elements) {
                recursiveInSubElements(c, cmwAttribute, imsUdmAttr, roAttr, rwAttr, keyAttr);
            }
        }
    }

    private void recursiveInSubElements(Element e, Stereotype cmwAttribute, Stereotype imsUdmAttr, Stereotype roAttr, Stereotype rwAttr, Stereotype keyAttr) {
        EList<Element> subelements = e.getOwnedElements();

        for (Element element : subelements) {
            if (element.isStereotypeApplied(cmwAttribute)) {
                migrateFromHideGroupNameValue(element, imsUdmAttr, roAttr, rwAttr, keyAttr);
            }
        }
    }

    private void migrateFromHideGroupNameValue(Element element, Stereotype imsUdmAttr, Stereotype roAttr, Stereotype rwAttr, Stereotype keyAttr) {
        String hideGroupName = null;
        if (element.isStereotypeApplied(keyAttr))
            hideGroupName = (String) getProperty(keyAttr, element, HIDE_GROUP_NAME);
        else if (element.isStereotypeApplied(rwAttr))
            hideGroupName = (String) getProperty(rwAttr, element, HIDE_GROUP_NAME);
        else if (element.isStereotypeApplied(roAttr))
            hideGroupName = (String) getProperty(roAttr, element, HIDE_GROUP_NAME);

        NamedElement categoryValue = HideGroupName2CategoryMigrator.mapCategoryStringToEnumLiteralValue(getImsUdmProfile(), hideGroupName);

        if (categoryValue != null) {
            setProperty(imsUdmAttr, element, CATEGORY, categoryValue);
            clearHideGroupName(element, keyAttr, rwAttr, roAttr);
        }
    }

    public static NamedElement mapCategoryStringToEnumLiteralValue(Profile imsUdmProfile, String categoryInput) {
        Enumeration categoryType = (Enumeration) imsUdmProfile.getOwnedType("CategoryType");
        NamedElement categoryOutput = null;

        if (categoryInput != null && categoryInput.replaceAll("\\s", "").toLowerCase().contains("operatorconfigurable")) {
            categoryOutput = categoryType.getMember("OperatorConfigurable");
        } else if (categoryInput != null && categoryInput.replaceAll("\\s", "").toLowerCase().contains("sitespecific")) {
            categoryOutput = categoryType.getMember("SiteSpecific");
        } else if (categoryInput != null
                && (categoryInput.replaceAll("\\s", "").toLowerCase().contains("systemintegration") || categoryInput.replaceAll("\\s", "").toLowerCase()
                        .contains("solutionintegration"))) {
            categoryOutput = categoryType.getMember("SystemIntegration");
        } else if (categoryInput != null && categoryInput.toLowerCase().contains("internal")) {
            categoryOutput = categoryType.getMember("Internal");
        }

        return categoryOutput;
    }

    private void clearHideGroupName(Element e, Stereotype s1, Stereotype s2, Stereotype s3) {
        if (e.isStereotypeApplied(s1))
            setProperty(s1, e, HIDE_GROUP_NAME, "");
        else if (e.isStereotypeApplied(s2))
            setProperty(s2, e, HIDE_GROUP_NAME, "");
        else if (e.isStereotypeApplied(s3))
            setProperty(s3, e, HIDE_GROUP_NAME, "");
    }

    @Override
    public String toString() {
        return "Migrate hideGroupName values to IMSUDM category";
    }

    @Override
    public String getConfirmationMessage() {
        return "If a MO attribute's hideGroupName property contains one of 'Internal', 'Operator Configurable', 'Site Specific' or 'System Integration' then \nthe hideGroupName is cleared and value is migrated to the category property in the "
                + getProfileName() + " profile.";
    }

    @Override
    public boolean isApplicable() {
        return model.isProfileApplied(getImsUdmProfile());
    }

    private String getProfileName() {
        return IMSUDM_PROFILE_NAME;
    }

}
