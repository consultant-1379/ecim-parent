package com.ericsson.ecim.imsudm.umlutils;

/**
 * Applies the IMSUDM Profile. This is to be called by user when upgrading CoreMW based models.
 * 
 * @author ERAJAIK
 *
 */
public class ImsUdmProfileApplier extends ImsUdmUmlUtilBase {

    @Override
    public String toString() {
        return "Apply the IMSUDM Profile";
    }

    @Override
    public boolean isApplicable() {
        return !(model.getAppliedProfile(IMSUDM_PROFILE_NAME) != null) && !hasGuidelineDependencySet(COREMW_GUIDELINES_URI)
                && !hasGuidelineDependencySet(ECIM_GUIDELINES_URI);
    }

    @Override
    public void run() throws Exception {
        applyImsUdmProfile();
    }

}
