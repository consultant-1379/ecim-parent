package com.ericsson.ecim.optionality.processor;

import java.io.IOException;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.OpaqueExpression;
import org.eclipse.uml2.uml.ValueSpecification;

import com.ericsson.ecim.validator.EcimValidationException;
import com.ericsson.ecim.validator.OptionalityValidator;
import com.ericsson.ecim.validator.ValidatorActivator;

/**
 * This class provides functions related to Optionality Constraint Set management.
 */
public class OptionalityConstraints {
    private static final String LANGUAGE_NAME = "Optionality";
    private EList<OptionalityConstraint> ocs = new BasicEList<OptionalityConstraint>();

    /**
     * Parse a UML Model looking for Optionality Constraints. Only do this once per transformation run as this can be
     * expensive.
     * 
     * @param model
     *            The model to parse looking for Optionality Constraints
     */
    public OptionalityConstraints(Model model) throws EcimValidationException, IOException {
        createOptionalityConstraintSet(model);
    }

    /**
     * Parse a model looking for elements which do not validate Optionality constrains
     * 
     * @param ocSet
     *            The set of constraints to validate against
     * @param fSet
     *            The set of supported features
     * @return EList Set of elements which fail validation
     */
    public EList<String> getIDsOfNonValidatingElements(EList<String> fSet) {
        Processor processor = new Processor();
        EList<String> elementIDsToDetroy = new BasicEList<String>();
        for (OptionalityConstraint oc : this.ocs) {
            Boolean result = oc.validate(fSet, processor);
            if (!result) {
                for (Element ce : oc.getConstraintElements()) {
                    elementIDsToDetroy.add(((XMLResource) ce.eResource()).getID(ce));
                }
            }
        }
        return elementIDsToDetroy;
    }

    /**
     * Parse a UML Model looking for Optionality Constraints.
     * 
     * @param model
     *            The model to parse
     * @return EList Set of Optionality Constraints
     * @throws EcimValidationException
     * @throws IOException
     */
    private void createOptionalityConstraintSet(Model model) throws EcimValidationException, IOException {
        // loop over the entire model looking for constraints
        EList<Element> elements = new BasicEList<Element>(model.allOwnedElements());

        // there could be many parse errors so have a list ready to fill up
        EList<String> parseErrorList = new BasicEList<String>();
        EcimValidationException eve = null;

        for (Element element : elements) {
            if (element instanceof org.eclipse.uml2.uml.Constraint) {
                Constraint constraint = (Constraint) element;
                ValueSpecification vs = constraint.getSpecification();
                if (!(vs instanceof OpaqueExpression)) {
                    continue;
                }
                OpaqueExpression oe = (OpaqueExpression) vs;

                if (!oe.getLanguages().isEmpty() && oe.getLanguages().get(0).equals(LANGUAGE_NAME)) {
                    // only consider optionality constraints
                    // UML allows many bodies for a given constraint, parse them all
                    eve = parseOptionalityConstraints(parseErrorList, constraint, oe);
                }
            }
        }
        if (eve != null)// there was a parse error
        {
            // repackage the exception so we can say which element(s) caused the error
            String message = eve.getStatus().getMessage() + " Location of parse error";
            if (parseErrorList.size() > 1) {
                message = message.concat("s");
            }
            message = message.concat(": ").concat(parseErrorList.toString());
            IStatus status = new Status(IStatus.ERROR, ValidatorActivator.PLUGIN_ID, message);
            throw new EcimValidationException(message, status);
        }
    }

    private EcimValidationException parseOptionalityConstraints(EList<String> parseErrorList, Constraint constraint, OpaqueExpression oe) {
        EcimValidationException eve = null;
        for (String body : oe.getBodies()) {
            com.ericsson.ecim.optionality.Model constraintModel = null;
            // ensure all constraints can be parsed
            OptionalityValidator opv = new OptionalityValidator(body);
            try {
                constraintModel = opv.parse();
            } catch (EcimValidationException e) {
                // store the exception (once) and the element (every time it occurs) it failed on, we
                // will throw it later when the whole model is parsed.
                eve = e;
                // append some details about where the error occurred.
                parseErrorList.add(((NamedElement) constraint.getOwner()).getQualifiedName());
            }
            if (constraintModel != null) {
                // store valid constraints for use later
                this.ocs.add(new OptionalityConstraint(constraintModel, constraint.getConstrainedElements(), body.toString()));
            }
        }
        return eve;
    }
}
