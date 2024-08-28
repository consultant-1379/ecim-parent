package com.ericsson.ecim.coremw.launcher.extension;

import org.eclipse.uml2.uml.Model;

/**
 * This class is used to converts a model to the CoreMW profile.
 * 
 */
public class Cmw2EcimProfileConverter extends CmwUmlUtilBase {

    public Cmw2EcimProfileConverter(Model model) {
        super(model);
    }

    public Cmw2EcimProfileConverter() {
        super();
    }

    public String toString() {
        return "Convert from Core MW to ECIM Base Profile";
    }

    public String getConfirmationMessage() {
        return "Data particular to the CoreMW profile will be lost. Do you want to proceed?";
    }

    public boolean isApplicable() {
        return hasGuidelineDependencySet(COREMW_GUIDELINES_URI);
    }

    /**
     * Converts model to Ecim Base Profile
     */
    public void run() {
        unapplyProfile(COREMW_PROFILE_NAME);
        changeCmw2EcimGuideline();
    }

}
