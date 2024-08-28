package com.ericsson.ecim.launcher.umlutilities;

import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.Package;

import com.ericsson.ecim.core.uml.helpers.ModelUtility;
import com.ericsson.ecim.umlmod.UmlUtilBase;

/**
 * This utility search for all status=PRELIMINARY tagged modeling elements, and creates
 * a rule pointing them out as constrained elements with logic "NOT PRELIMINARY". This
 * way the optionality decision model is filtering out all preliminary elements.
 * @author ERAJAIK
 *
 */
public class Preliminary2OptionalityUtility extends UmlUtilBase {
    public static final String PRELIMINARY_FEATURE_NAME = "PreliminaryFeature";

    public String toString() {
        return "Filter out Preliminary elements using Optionality";
    }
    
    @Override
    public String getConfirmationMessage() {
        return "This utility creates a decision model that allows filtering of all elements with status=PRELIMINARY.\n" +
                "Note 1: MMA preferences should have Enable change wizard set to false, in order to avoid MMA popup dialogs.\n" +
                "Note 2: If a class is marked with status=PRELIMINARY, then the association end attribute pointing to this class must be manually added to the constrained elements.";
    }

    @Override
    public void run() throws Exception {
        final Model m = getModel();

        Iterable<Package> moms = ModelUtility.INSTANCE().getMomOrLibraryPackages(m);
        for (Package mom : moms) {

            Package featuresPackage = ModelUtility.INSTANCE().createFeaturesPackage(mom, "GeneratedFeatures");
            Class prelFeature = ModelUtility.INSTANCE().createFeature(featuresPackage, PRELIMINARY_FEATURE_NAME);

            Package decisionsPackage = ModelUtility.INSTANCE().createDecisionsPackage(mom, "GenereatedDecisions");
            Class prelDecision = ModelUtility.INSTANCE().createDecision(decisionsPackage, "NoPreliminaryStatus");
            prelDecision.createUsage(prelFeature);

            Iterable<Element> prelElements = ModelUtility.INSTANCE().getPreliminaryElements(mom);

            ModelUtility.INSTANCE().createPreliminaryFilteringOptionalityRule(mom, prelElements, PRELIMINARY_FEATURE_NAME);
        }
    }

    @Override
    public String getUtilId() {
        return this.getClass().getSimpleName();
    }

    public boolean isApplicable() {
        if (model.getAppliedProfile(UmlUtilBase.ECIM_PROFILE_NAME) != null) {
            return true;
        }
        return false;
    }
}
