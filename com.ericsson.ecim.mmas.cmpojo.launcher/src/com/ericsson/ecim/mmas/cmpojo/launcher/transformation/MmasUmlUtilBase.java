package com.ericsson.ecim.mmas.cmpojo.launcher.transformation;

import java.io.IOException;

import org.eclipse.core.runtime.Assert;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.Profile;
import com.ericsson.ecim.imsudm.umlutils.ImsUdmUmlUtilBase;
import com.ericsson.ecim.core.uml.helpers.Uml2ModelHelper;
import com.ericsson.ecim.mmas.cmpojo.launcher.CmPojoLauncherActivator;

/**
 * Base class for MMAS UML Utilities.
 * 
 * @author erajaik
 *
 */
public abstract class MmasUmlUtilBase extends ImsUdmUmlUtilBase {

    protected static final String MMAS_PROFILE_URI = "pathmap://MMASPROFILE/MMASProfile.profile.uml";
    protected static final String MMAS_GUIDELINES_URI = "pathmap://ECIM_MMAS_GUIDELIB/ECIM_MMAS_Guidelines.uml";
    protected static final String MMAS_PROFILE_NAME = "MMASProfile";

    public MmasUmlUtilBase(Model model) {
        super(model);
    }

    public MmasUmlUtilBase() {
        super();
    }

    protected Profile getMmasProfile() {
        return model.getAppliedProfile(MMAS_PROFILE_NAME);
    }

    protected void changeMmas2CmwGuideline() {
        Uml2ModelHelper uh = null;
        try {
            uh = new Uml2ModelHelper(COREMW_GUIDELINES_URI);
            Model toGuideline = uh.loadModel();
            Assert.isNotNull(toGuideline);
            uh = new Uml2ModelHelper(MMAS_GUIDELINES_URI);
            Model fromGuideline = uh.loadModel();
            Assert.isNotNull(fromGuideline);

            changeGuidelineDependency(toGuideline, fromGuideline);

        } catch (IOException e) {
            if (uh != null)
                uh.unloadModel();
            logger.log(new Status(IStatus.ERROR, CmPojoLauncherActivator.PLUGIN_ID, "Error when switching from MMAS to CMW Guidleine dependency.", e));
        }
    }

    protected void changeCmw2MmasGuideline() {
        Uml2ModelHelper uh = null;
        try {
            uh = new Uml2ModelHelper(COREMW_GUIDELINES_URI);
            Model fromGuideline = uh.loadModel();
            Assert.isNotNull(fromGuideline);
            uh = new Uml2ModelHelper(MMAS_GUIDELINES_URI);
            Model toGuideline = uh.loadModel();
            Assert.isNotNull(toGuideline);

            changeGuidelineDependency(toGuideline, fromGuideline);

        } catch (IOException e) {
            if (uh != null)
                uh.unloadModel();
            logger.log(new Status(IStatus.ERROR, CmPojoLauncherActivator.PLUGIN_ID, "Error when switching from CMA to MMAS dependency.", e));
        }
    }

}
