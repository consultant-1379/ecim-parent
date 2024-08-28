package com.ericsson.ecim.mmas.cmpojo.launcher.transformation;

import org.eclipse.core.runtime.Assert;
import org.eclipse.emf.common.util.EList;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Stereotype;

/**
 * This class is used to convert a model to the MMAS profile.
 * 
 */
public class Cmw2MmasProfileConverter extends MmasUmlUtilBase {

    public Cmw2MmasProfileConverter() {
        super();
    }

    public Cmw2MmasProfileConverter(Model model) {
        super(model);
    }

    @Override
    public String toString() {
        return "Convert from CoreMW to JavaOAM Profile";
    }

    /**
     * Converts model to MMAS Profile.
     */
    @Override
    public void run() {
        applyImsUdmProfile();
        applyProfile(MMAS_PROFILE_NAME, MMAS_PROFILE_URI);
        applyMmasStereotype();
        changeCmw2MmasGuideline();
    }

    private void applyMmasStereotype() {
        final Stereotype mmasMom = getMmasProfile().getOwnedStereotype("MmasMom");

        final Stereotype ecimMom = getEcimBaseProfile().getOwnedStereotype("EcimMom");
        final Stereotype ecimLibrary = getEcimBaseProfile().getOwnedStereotype("EcimLibrary");

        Assert.isNotNull(mmasMom);
        Assert.isNotNull(ecimMom);

        // Loop through the entire model and call migrate methods for matching
        // elements
        EList<Package> packages = model.getNestedPackages();
        for (Package umlPackage : packages) {
            if ((umlPackage.isStereotypeApplied(ecimMom) || umlPackage.isStereotypeApplied(ecimLibrary)) && applyStereotype(mmasMom, umlPackage)) {
                setProperty(mmasMom, umlPackage, "javaPackageSuffix", "");
            }
        }
    }

}
