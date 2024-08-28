package com.ericsson.ecim.imsudm.umlutils;

import org.eclipse.uml2.uml.Model;

/**
 * This class is used to converts a model to the CoreMW profile.
 * 
 */
public class ImsUdm2CmwProfileConverter extends ImsUdmUmlUtilBase {

    public ImsUdm2CmwProfileConverter(Model model) {
        super(model);
    }

    public ImsUdm2CmwProfileConverter() {
        super();
    }

    @Override
    public String toString() {
        return "Convert from IMSUDM to CoreMW Profile";
    }

    @Override
    public String getConfirmationMessage() {
        return "Data particular to the IMSUDM profile will be lost. Do you want to proceed?";
    }

    @Override
    public boolean isApplicable() {
        return hasGuidelineDependencySet(IMSUDM_GUIDELINES_URI);
    }

    @Override
    public void run() {
        unapplyImsUdmProfile();
        changeImsUdm2CmwGuideline();
    }

}
