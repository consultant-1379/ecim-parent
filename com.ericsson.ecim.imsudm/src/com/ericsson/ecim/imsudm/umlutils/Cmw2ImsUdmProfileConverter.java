package com.ericsson.ecim.imsudm.umlutils;

import org.eclipse.uml2.uml.Model;

/**
 * This class is used to convert a model to the CPP profile.
 * 
 */
public class Cmw2ImsUdmProfileConverter extends ImsUdmUmlUtilBase {

    public Cmw2ImsUdmProfileConverter(Model model) {
        super(model);
    }

    public Cmw2ImsUdmProfileConverter() {
        super();
    }

    @Override
    public String toString() {
        return "Convert from CoreMW to IMSUDM Profile";
    }

    @Override
    public boolean isApplicable() {
        return hasGuidelineDependencySet(COREMW_GUIDELINES_URI);
    }

    @Override
    public void run() throws Exception {
        applyImsUdmProfile();
        changeCmw2ImsUdmGuideline();
    }

}
