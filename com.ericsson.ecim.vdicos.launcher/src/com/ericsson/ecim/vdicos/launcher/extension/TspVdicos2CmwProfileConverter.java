package com.ericsson.ecim.vdicos.launcher.extension;

import org.eclipse.uml2.uml.Model;

/**
 * This class is used to converts a model to the CoreMW profile.
 * 
 */
public class TspVdicos2CmwProfileConverter extends TspVdicosUmlUtilBase {

    public TspVdicos2CmwProfileConverter(Model model) {
        super(model);
    }

    public TspVdicos2CmwProfileConverter() {
        super();
    }

    @Override
    public String toString() {
        return "Convert from TSP/VDicos to CoreMW Profile";
    }

    @Override
    public String getConfirmationMessage() {
        return "Data particular to the TSP/VDicos profile will be lost. Do you want to proceed?";
    }

    @Override
    public boolean isApplicable() {
        if (model.getAppliedProfile(TSP_VDICOS_PROFILE_NAME) != null) {
            return true;
        }
        return false;
    }

    /**
     * Converts model to CoreMW profile
     */
    @Override
    public void run() {
        unapplyProfile(TSP_VDICOS_PROFILE_NAME);
        unapplyImsUdmProfile();
        changeTspVdicos2CmwGuideline();
    }

}
