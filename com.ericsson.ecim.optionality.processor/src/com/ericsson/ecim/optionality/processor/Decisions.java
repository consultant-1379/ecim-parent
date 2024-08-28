package com.ericsson.ecim.optionality.processor;

import java.util.List;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.Stereotype;

/**
 * 
 * Class to manage Decision Packages
 * 
 */
public class Decisions {

    private static final String ECIM_PROFILE_NAME = "ECIM Base Profile";
    private static final String DECISION_STEREOTYPE_NAME = "EcimDecision";

    private Decisions() {
    }

    /**
     * 
     * Retrieve all the Decisions in a given model
     * 
     * @param modelFile
     *            The model in which to look for decisions
     * @return EList The decisions found
     */
    public static List<Decision> getDecisions(Model model) {
        List<Decision> decisions = new BasicEList<Decision>();
        if (model != null) {
            Profile ecimProfile = model.getAppliedProfile(ECIM_PROFILE_NAME);

            if (ecimProfile != null) {
                // retrieve the required stereotypes from the ECIM profile
                EList<Stereotype> stereotypes = ecimProfile.getOwnedStereotypes();
                getDecisionsByStereotype(model, decisions, stereotypes);
            }
        }

        return decisions;
    }

    private static void getDecisionsByStereotype(Model model, List<Decision> decisions, EList<Stereotype> stereotypes) {
        Stereotype decisionStereotype = null;
        for (Stereotype s : stereotypes) {
            if (s.getName().equals(DECISION_STEREOTYPE_NAME)) {
                decisionStereotype = s;
            }
        }

        // retrieve all the decisions
        if (decisionStereotype != null) {
            EList<Element> elements = model.allOwnedElements();
            for (Element element : elements) {
                if (element instanceof Class && element.isStereotypeApplied(decisionStereotype)) {
                    Decision decision = new Decision((Class) element);
                    decisions.add(decision);
                }
            }
        }
    }
}
