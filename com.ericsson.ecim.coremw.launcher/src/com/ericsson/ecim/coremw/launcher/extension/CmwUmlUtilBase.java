package com.ericsson.ecim.coremw.launcher.extension;

import java.io.IOException;

import org.eclipse.core.runtime.Assert;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.Profile;

import com.ericsson.ecim.core.uml.helpers.Uml2ModelHelper;
import com.ericsson.ecim.umlmod.UmlModActivator;
import com.ericsson.ecim.umlmod.UmlUtilBase;

/**
 * Base class for CoreMW UML Utilities.
 * 
 * @author erajaik
 * 
 */
public abstract class CmwUmlUtilBase extends UmlUtilBase {

    public static final String COREMW_PROFILE_URI = "pathmap://COREMW_PROFILE/CoreMW_Profile.profile.uml";
    public static final String COREMW_GUIDELINES_URI = "pathmap://ECIM_COREMW_GUIDELIB/ECIM_Core_MW_Guidelines.uml";
    public static final String COREMW_PROFILE_NAME = "CoreMW Profile";

    public CmwUmlUtilBase(Model model) {
        super(model);
    }

    public CmwUmlUtilBase() {
        super();
    }

    protected Profile getCoreMWProfile() {
        return model.getAppliedProfile(COREMW_PROFILE_NAME);
    }
    
    @Override
    public String getUtilId() {
        return this.getClass().getSimpleName();
    }

    protected void changeCmw2EcimGuideline() {
        Uml2ModelHelper uh = null;
        try {
            uh = new Uml2ModelHelper(COREMW_GUIDELINES_URI);
            Model cmwGuidelines = uh.loadModel();
            Assert.isNotNull(cmwGuidelines);
            uh = new Uml2ModelHelper(ECIM_GUIDELINES_URI);
            Model ecimGuidelines = uh.loadModel();
            Assert.isNotNull(ecimGuidelines);

            changeGuidelineDependency(ecimGuidelines, cmwGuidelines);

        } catch (IOException e) {
            if (uh != null)
                uh.unloadModel();
            logger.log(new Status(IStatus.ERROR, UmlModActivator.PLUGIN_ID,
                    "Error when creating ECIM Guideline dependency.", e));
        }
    }

    protected void changeEcim2CmwGuideline() {
        Uml2ModelHelper uh = null;
        try {
            uh = new Uml2ModelHelper(COREMW_GUIDELINES_URI);
            Model cmwGuidelines = uh.loadModel();
            Assert.isNotNull(cmwGuidelines);
            uh = new Uml2ModelHelper(ECIM_GUIDELINES_URI);
            Model ecimGuidelines = uh.loadModel();
            Assert.isNotNull(ecimGuidelines);

            changeGuidelineDependency(cmwGuidelines, ecimGuidelines);

        } catch (IOException e) {
            if (uh != null)
                uh.unloadModel();
            logger.log(new Status(IStatus.ERROR, UmlModActivator.PLUGIN_ID,
                    "Error when creating CoreMW Guideline dependency.", e));
        }
    }

}
