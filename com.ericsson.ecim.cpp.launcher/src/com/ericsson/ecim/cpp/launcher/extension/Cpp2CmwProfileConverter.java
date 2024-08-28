package com.ericsson.ecim.cpp.launcher.extension;

import org.eclipse.uml2.uml.Model;

/**
 * This class is used to converts a model to the CoreMW profile.
 * 
 */
public class Cpp2CmwProfileConverter extends CppUmlUtilBase {

    public Cpp2CmwProfileConverter(Model model) {
        super(model);
    }

    public Cpp2CmwProfileConverter() {
        super();
    }

    public String toString() {
        return "Convert from CPP to CoreMW Profile";
    }

    public String getConfirmationMessage() {
        return "Data particular to the CPP profile will be lost. Do you want to proceed?";
    }

    public boolean isApplicable() {
        if (model.getAppliedProfile(CPP_PROFILE_NAME) != null) {
            return true;
        }
        return false;
    }

    /**
     * Converts model to Ecim Base Profile
     */
    public void run() {
        unapplyProfile(CPP_PROFILE_NAME);
        changeCpp2CmwGuideline();
    }

}
