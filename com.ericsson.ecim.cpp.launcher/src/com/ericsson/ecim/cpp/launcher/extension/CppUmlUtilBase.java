package com.ericsson.ecim.cpp.launcher.extension;

import java.io.IOException;

import org.eclipse.core.runtime.Assert;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.Profile;

import com.ericsson.ecim.core.uml.helpers.Uml2ModelHelper;
import com.ericsson.ecim.coremw.launcher.extension.CmwUmlUtilBase;
import com.ericsson.ecim.umlmod.UmlModActivator;

/**
 * Base class for CPP UML utilities.
 * @author erajaik
 *
 */
public abstract class CppUmlUtilBase extends CmwUmlUtilBase {
    
    public static final String CPP_PROFILE_NAME = "CppProfile";
    protected static final String CPP_PROFILE_URI = "pathmap://CPPPROFILE/CppProfile.profile.uml";
    protected static final String CPP_GUIDELINES_URI = "pathmap://ECIM_CPP_GUIDELIB/ECIM_CPP_Guidelines.uml";

    public CppUmlUtilBase(Model model) {
        super(model);
    }
    
    public CppUmlUtilBase() {
        super();
    }

    protected Profile getCppProfile() {
        return model.getAppliedProfile(CPP_PROFILE_NAME);
    }
    

    protected void changeCpp2CmwGuideline() {
        Uml2ModelHelper uh = null;
        try {
            uh = new Uml2ModelHelper(COREMW_GUIDELINES_URI);
            Model toGuideline = uh.loadModel();
            Assert.isNotNull(toGuideline);
            uh = new Uml2ModelHelper(CPP_GUIDELINES_URI);
            Model fromGuideline = uh.loadModel();
            Assert.isNotNull(fromGuideline);
    
            changeGuidelineDependency(toGuideline, fromGuideline);
    
        } catch (IOException e) {
            if (uh != null)
                uh.unloadModel();
            logger.log(new Status(IStatus.ERROR, UmlModActivator.PLUGIN_ID, "Error when creating ECIM Guideline dependency.", e));
        }
    }
    
    protected void changeCmw2CppGuideline() {
        Uml2ModelHelper uh = null;
        try {
            uh = new Uml2ModelHelper(COREMW_GUIDELINES_URI);
            Model fromGuideline = uh.loadModel();
            Assert.isNotNull(fromGuideline);
            uh = new Uml2ModelHelper(CPP_GUIDELINES_URI);
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
