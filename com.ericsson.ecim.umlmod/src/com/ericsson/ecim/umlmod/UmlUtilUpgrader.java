package com.ericsson.ecim.umlmod;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.Profile;


/**
 * Inherit this class to implement a specific Upgrade utility.
 * @author erajaik
 *
 */
public abstract class UmlUtilUpgrader extends UmlUtilBase {
    static Set<String> alreadyUpgradedModels = new HashSet<String>();

    public UmlUtilUpgrader() {
    }
    
    public UmlUtilUpgrader(Model model) {
        super(model);
    }
    
    @Override
    public void run() {
        alreadyUpgradedModels.add(constructId());
        logger.log(new Status(IStatus.INFO, 
                UmlModActivator.PLUGIN_ID, "Running " + this.getClass().getSimpleName() + " on " + model.getName()));
    }
    
    @Override
    public String toString() {
        return "Upgrade model to comply with latest " + getProfile().getName() + (hasAlreadyRun()? " (already run)" : "");
    }
    
    @Override
    public String getConfirmationMessage() {
        return "Model will be upgraded to comply with the latest " + getProfile().getName() + " profile version. Use this option only when MMA Problems view show errors after opening a model created with an earlier version of ECIM Tool-chain. \nNote: Normally this utility should have already been run automatically.";
    }
    
    private String constructId() {
        return model.getName() + ":" + getProfileName();
    }
    
    /**
     * Checks if the profile migration has already run on this model.
     * @TODO Refactor to check actual profile versions instead
     * @return
     */
    public boolean hasAlreadyRun() {
        return alreadyUpgradedModels.contains(constructId());
    }
    
    @Override
    public boolean isApplicable() {
        return model.isProfileApplied(getProfile());
    }
    
    /**
     * Returns the profile to look for on the model to be upgraded.
     * @return
     */
    public abstract Profile getProfile();
    
    /**
     * Returns the name of the profile as specified in the org.eclipse.uml2.uml.dynamic_package extension point.
     */
    public abstract String getProfileName();

}
