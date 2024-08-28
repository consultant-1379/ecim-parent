package com.ericsson.ecim.vdicos.launcher.extension;

import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.Package;

import com.ericsson.ecim.core.uml.helpers.ModelUtility;
import com.ericsson.ecim.umlmod.UmlUtilBase;

public class Hidden2OptionalityUtility extends UmlUtilBase {

    public static final String OPERATOR_CONFIGURABLE = "Operator Configurable";
    public static final String SITE_SPECIFIC = "Site Specific";
    public static final String SOLUTION_INTEGRATION = "Solution Integration";
    public static final String INTERNAL = "Internal";

    @Override
    public String toString() {
        return "Generate Optionality model from IMS attribute categories";
    }

    @Override
    public void run() throws Exception {
        final Model m = getModel();

        Iterable<Package> moms = ModelUtility.INSTANCE().getMomPackages(m);
        for (Package mom : moms) {

            Package featuresPackage = ModelUtility.INSTANCE().createFeaturesPackage(mom, "Features");
            ModelUtility.INSTANCE().createFeature(featuresPackage, INTERNAL);
            Class ssFeature = ModelUtility.INSTANCE().createFeature(featuresPackage, SITE_SPECIFIC.replaceAll("\\s+", ""));
            Class siFeature = ModelUtility.INSTANCE().createFeature(featuresPackage, SOLUTION_INTEGRATION.replaceAll("\\s+", ""));
            Class ocFeature = ModelUtility.INSTANCE().createFeature(featuresPackage, OPERATOR_CONFIGURABLE.replaceAll("\\s+", ""));

            Package decisionsPackage = ModelUtility.INSTANCE().createDecisionsPackage(mom, "Decisions");
            Class cpiDecision = ModelUtility.INSTANCE().createDecision(decisionsPackage, "CPI");
            cpiDecision.createUsage(ssFeature);
            cpiDecision.createUsage(siFeature);
            cpiDecision.createUsage(ocFeature);

            Iterable<Element> internalElements = ModelUtility.INSTANCE().getElementsWithHideGroupNameValue(mom, INTERNAL);
            Iterable<Element> siteSpecificElements = ModelUtility.INSTANCE().getElementsWithHideGroupNameValue(mom, SITE_SPECIFIC);
            Iterable<Element> solutionIntegrationElements = ModelUtility.INSTANCE().getElementsWithHideGroupNameValue(mom, SOLUTION_INTEGRATION);
            Iterable<Element> operatorConfigurableElements = ModelUtility.INSTANCE().getElementsWithHideGroupNameValue(mom, OPERATOR_CONFIGURABLE);

            ModelUtility.INSTANCE().createImsOptionalityRule(mom, INTERNAL, internalElements);
            ModelUtility.INSTANCE().createImsOptionalityRule(mom, SITE_SPECIFIC.replaceAll("\\s+", ""), siteSpecificElements);
            ModelUtility.INSTANCE().createImsOptionalityRule(mom, SOLUTION_INTEGRATION.replaceAll("\\s+", ""), solutionIntegrationElements);
            ModelUtility.INSTANCE().createImsOptionalityRule(mom, OPERATOR_CONFIGURABLE.replaceAll("\\s+", ""), operatorConfigurableElements);

        }
    }

    @Override
    public String getConfirmationMessage() {
        return "This UML Utility creates an Optionality model based on IMS attribute categories. It is assumed that the original model has 'Operator Configurable', 'Site Specific', 'Solution Integration' and 'Internal' values in the hideGroupName properties. Any other values are ignored. Matched hideGroupName values are erased after the transformation has run.";
    }

    @Override
    public String getUtilId() {
        return this.getClass().getSimpleName();
    }

    @Override
    public boolean isApplicable() {
        if (model.getAppliedProfile(TspVdicosUmlUtilBase.TSP_VDICOS_PROFILE_NAME) != null) {
            return true;
        }
        return false;
    }
}
