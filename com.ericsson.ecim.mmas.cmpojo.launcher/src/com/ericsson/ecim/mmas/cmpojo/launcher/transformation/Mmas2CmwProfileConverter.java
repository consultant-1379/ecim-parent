package com.ericsson.ecim.mmas.cmpojo.launcher.transformation;

import org.eclipse.uml2.uml.Model;

/**
 * This class is used to convert a MMAS model to the CoreMW profile.
 * 
 */
public class Mmas2CmwProfileConverter extends MmasUmlUtilBase {

    public Mmas2CmwProfileConverter(Model model) {
        super(model);
    }

    public Mmas2CmwProfileConverter() {
        super();
    }

    public String toString() {
        return "Convert from JavaOAM to CoreMW Profile";
    }

    public String getConfirmationMessage() {
        return "Data particular to the JavaOAM (MMAS) profile will be lost. Do you want to proceed?";
    }

    public boolean isApplicable() {
        return hasGuidelineDependencySet(MMAS_GUIDELINES_URI);
    }

    /**
     * Converts model to CoreMW Profile
     */
    public void run() {
        unapplyProfile(MMAS_PROFILE_NAME);
        unapplyImsUdmProfile();
        changeMmas2CmwGuideline();
    }

}
