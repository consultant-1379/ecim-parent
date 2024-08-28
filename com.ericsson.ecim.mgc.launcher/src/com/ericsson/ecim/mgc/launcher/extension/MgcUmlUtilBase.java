package com.ericsson.ecim.mgc.launcher.extension;

import java.io.IOException;

import org.eclipse.core.runtime.Assert;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.Profile;

import com.ericsson.ecim.core.uml.helpers.Uml2ModelHelper;
import com.ericsson.ecim.imsudm.umlutils.ImsUdmUmlUtilBase;
import com.ericsson.ecim.umlmod.UmlModActivator;

/**
 * Base class for MGC profile converters.
 * 
 * @author erajaik
 *
 */
public abstract class MgcUmlUtilBase extends ImsUdmUmlUtilBase {

    protected static final String MGC_PROFILE_URI = "pathmap://MGCPROFILE/MGCProfile.profile.uml";
    protected static final String MGC_GUIDELINES_URI = "pathmap://ECIM_MGC_GUIDELIB/MGC_Guidelines.uml";
    protected static final String MGC_PROFILE_NAME = "MGCProfile";

    public MgcUmlUtilBase(Model model) {
        super(model);
    }

    public MgcUmlUtilBase() {
        super();
    }

    protected Profile getMgcProfile() {
        return model.getAppliedProfile(MGC_PROFILE_NAME);
    }

    protected void changeMgc2CmwGuideline() {
        Uml2ModelHelper uh = null;
        try {
            uh = new Uml2ModelHelper(COREMW_GUIDELINES_URI);
            Model toGuideline = uh.loadModel();
            Assert.isNotNull(toGuideline);
            uh = new Uml2ModelHelper(MGC_GUIDELINES_URI);
            Model fromGuideline = uh.loadModel();
            Assert.isNotNull(fromGuideline);

            changeGuidelineDependency(toGuideline, fromGuideline);

        } catch (IOException e) {
            if (uh != null)
                uh.unloadModel();
            logger.log(new Status(IStatus.ERROR, UmlModActivator.PLUGIN_ID, "Error when creating ECIM Guideline dependency.", e));
        }
    }

    protected void changeCmw2MgcGuideline() {
        Uml2ModelHelper uh = null;
        try {
            uh = new Uml2ModelHelper(COREMW_GUIDELINES_URI);
            Model fromGuideline = uh.loadModel();
            Assert.isNotNull(fromGuideline);
            uh = new Uml2ModelHelper(MGC_GUIDELINES_URI);
            Model toGuideline = uh.loadModel();
            Assert.isNotNull(toGuideline);

            changeGuidelineDependency(toGuideline, fromGuideline);

        } catch (IOException e) {
            if (uh != null)
                uh.unloadModel();
            logger.log(new Status(IStatus.ERROR, UmlModActivator.PLUGIN_ID, "Error when creating ECIM Guideline dependency.", e));
        }
    }

}
