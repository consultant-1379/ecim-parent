package com.ericsson.ecim.vdicos.launcher.extension;

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
 * Base class for TSP/Vdicos UML utilities.
 * @author erajaik
 *
 */
public abstract class TspVdicosUmlUtilBase extends ImsUdmUmlUtilBase {
    
    public static final String TSP_VDICOS_PROFILE_URI = "pathmap://VDICOSPROFILE/VDicosProfile.profile.uml";
    public static final String TSP_VDICOS_GUIDELINES_URI = "pathmap://ECIM_VDICOS_GUIDELIB/ECIM_VDicos_Guidelines.uml";
    public static final String TSP_VDICOS_PROFILE_NAME = "VDicosProfile";
    
        
    public TspVdicosUmlUtilBase(Model model) {
        super(model);
    }
    
    public TspVdicosUmlUtilBase() {
        super();
    }
    

    protected Profile getTspVdicosProfile() {
        return model.getAppliedProfile(TSP_VDICOS_PROFILE_NAME);
    }
    

    protected void changeTspVdicos2CmwGuideline() {
        Uml2ModelHelper uh = null;
        try {
            uh = new Uml2ModelHelper(COREMW_GUIDELINES_URI);
            Model toGuideline = uh.loadModel();
            Assert.isNotNull(toGuideline);
            uh = new Uml2ModelHelper(TSP_VDICOS_GUIDELINES_URI);
            Model fromGuideline = uh.loadModel();
            Assert.isNotNull(fromGuideline);
    
            changeGuidelineDependency(toGuideline, fromGuideline);
    
        } catch (IOException e) {
            if (uh != null)
                uh.unloadModel();
            logger.log(new Status(IStatus.ERROR, UmlModActivator.PLUGIN_ID, "Error when creating ECIM Guideline dependency.", e));
        }
    }
    
    protected void changeCmw2TspVdicosGuideline() {
        Uml2ModelHelper uh = null;
        try {
            uh = new Uml2ModelHelper(COREMW_GUIDELINES_URI);
            Model fromGuideline = uh.loadModel();
            Assert.isNotNull(fromGuideline);
            uh = new Uml2ModelHelper(TSP_VDICOS_GUIDELINES_URI);
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
