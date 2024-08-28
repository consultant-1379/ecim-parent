package com.ericsson.ecim.mgc.launcher.extension;

import org.eclipse.uml2.uml.Model;

/**
 * This class is used to converts a model to the CoreMW profile.
 * 
 */
public class Mgc2CmwProfileConverter extends MgcUmlUtilBase {

    public Mgc2CmwProfileConverter(Model model) {
        super(model);
    }

    public Mgc2CmwProfileConverter() {
        super();
    }

    public String toString() {
        return "Convert from MGC to CoreMW Profile";
    }

    public String getConfirmationMessage() {
        return "Data particular to the MGC profile will be lost. Do you want to proceed?";
    }

    public boolean isApplicable() {
        return hasGuidelineDependencySet(MGC_GUIDELINES_URI);
    }

    /**
     * Converts model to CoreMW Profile
     */
    public void run() {
        unapplyProfile(MGC_PROFILE_NAME);
        unapplyImsUdmProfile();
        changeMgc2CmwGuideline();
    }

}
