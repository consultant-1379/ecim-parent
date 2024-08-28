package com.ericsson.ecim.validator;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.expressions.OCLExpression;
import org.eclipse.ocl.helper.OCLHelper;
import org.eclipse.ocl.uml.OCL;
import org.eclipse.ocl.util.Tuple;
import org.eclipse.uml2.common.util.CacheAdapter;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.resource.UMLResource;

import com.ericsson.ecim.core.uml.helpers.ModelCleanup;

/**
 * OCL UML Validation on M1 and M2 level.
 * 
 * @author qmahsha
 *
 */
public class OCLUMLValidator {

    private static final String INVARIANT = "invariant";

    private static final Logger LOGGER = Logger.getLogger(OCLUMLValidator.class);

    private OCL ocl;
    private OCLHelper<Classifier, Operation, Property, Constraint> oclHelper;
    private final Map<String, List<Constraint>> stereotypeToConstraints = new HashMap<String, List<Constraint>>();
    private OCLExpression<Classifier> queryConstraintsParents = null;
    private OCLExpression<Classifier> queryConstraintsElement = null;
    private ResourceSet resourceSet;
    private Package umlMetamodel;

    /**
     * Create the OCL UML Validator
     */
    public OCLUMLValidator() {
        this.resourceSet = new ResourceSetImpl();
    }

    // retrieve the metaclass of a element to provide a proper context
    // to query M2 level.
    protected Classifier getMetaclass(String name) {
        return (Classifier) umlMetamodel.getOwnedType(name);
    }

    /**
     * OCL validates constraints on UML model in UML meta-model level context and UML profile context.
     * 
     * @param file
     *            The UML model.
     * @throws EcimValidationException
     *             when UML model fails to validate successfully.
     */
    public void validate(File file) throws EcimValidationException {
        umlMetamodel = (Package) resourceSet.getResource(URI.createURI(UMLResource.UML_METAMODEL_URI), true).getContents().get(0);
        Resource resource = resourceSet.getResource(URI.createFileURI(file.getAbsolutePath().toString()), true);
        CacheAdapter cacheAdapter = new CacheAdapter();
        cacheAdapter.setTarget(resourceSet);

        EObject umlModel = resource.getContents().get(0);
        BasicDiagnostic diagnostics = new BasicDiagnostic();
        if (umlModel instanceof Element) {
            Element parentElement = (Element) umlModel;
            List<Element> childrenElements = parentElement.allOwnedElements();
            List<Element> allElements = new ArrayList<Element>();
            allElements.add(parentElement);
            allElements.addAll(childrenElements);
            ocl = org.eclipse.ocl.uml.OCL.newInstance();
            oclHelper = ocl.createOCLHelper();
            for (Element element : allElements) {
                validate(element, diagnostics);
            }
            allElements.clear();
        }
        ocl.dispose();
        ModelCleanup.cleanupResourceSet(resourceSet, cacheAdapter);

        this.resourceSet = null;
        if (diagnostics.getSeverity() == Diagnostic.ERROR) {
            BasicDiagnostic basicDiagnostic = new BasicDiagnostic(Diagnostic.ERROR, ValidatorActivator.PLUGIN_ID, 0,
                    "Failed to successfully OCL validate resource: " + file.getName(), new Object[] { null });
            basicDiagnostic.merge(diagnostics);
            throw new EcimValidationException("OCL rule(s) violation!", BasicDiagnostic.toIStatus(basicDiagnostic));
        }
    }

    private void validate(EObject eObj, BasicDiagnostic diagnostics) {
        Element element = null;
        if ((eObj instanceof Element) && (!((Element) eObj).getAppliedStereotypes().isEmpty())) {
            element = ((Element) eObj);
            if (element.getAppliedStereotypes().get(0).getOwnedRules().size() == 0) {
                return;
            }
            for (Stereotype stereotype : element.getAppliedStereotypes()) {
                if (stereotype != null) {
                    evaluateConstraintsOn(element, stereotype, diagnostics);
                }
            }
        }
    }

    /*
     * evaluate constraints on a stereotype.
     */
    private void evaluateConstraintsOn(Element element, Stereotype stereotype, BasicDiagnostic diagnostics) {
        List<Constraint> constraints = stereotypeToConstraints.get(stereotype.getName());
        if (constraints == null) {
            Classifier metaClass = getMetaclass("Stereotype");
            oclHelper.setContext(metaClass);
            if (queryConstraintsParents == null) {
                try {
                    // query to retrieve parent constraints.
                    // type of specification is unchecked. We hypothese that
                    // they are OCL OpaqueExpression
                    // I reported bug:
                    // https://bugs.eclipse.org/bugs/show_bug.cgi?id=194390
                    queryConstraintsParents = oclHelper.createQuery("self.allParents().ownedRule->iterate("
                            + " c : Constraint; s : Sequence(Tuple(invariant:String, constraintName:String)) = Sequence{} |"
                            // +
                            // "  if c.specification.oclIsKindOf(OpaqueExpression) then"
                            + " if not c.oclIsUndefined() then"
                            /*
                             * + " let e : OpaqueExpression = c.specification.oclAsType(OpaqueExpression)," +
                             * " i : Integer = e.language->indexOf('OCL') in" +
                             * " if not i.oclIsUndefined() then s->append(e.body->at(i)) else s endif"
                             */
                            + " s->append(Tuple{invariant = c.specification.stringValue(), constraintName = c.name})" + " else" + " s" + " endif)");
                } catch (ParserException e1) {
                    diagnostics.add(e1.getDiagnostic());
                    LOGGER.warn(e1.getMessage(), e1);
                }
            }
            if (queryConstraintsElement == null) {
                try {
                    queryConstraintsElement = oclHelper.createQuery("self.ownedRule->iterate("
                            + " c : Constraint; s : Sequence(Tuple(invariant:String, constraintName:String)) = Sequence{} |"
                            + " if not c.oclIsUndefined() then" + " s->append(Tuple{invariant = c.specification.stringValue(), constraintName = c.name})"
                            + " else" + " s" + " endif)");
                } catch (ParserException e1) {
                    diagnostics.add(e1.getDiagnostic());
                    LOGGER.warn(e1.getMessage(), e1);
                }
            }

            constraints = createConstraintsFrom(element, stereotype, queryConstraintsParents);
            constraints.addAll(createConstraintsFrom(element, stereotype, queryConstraintsElement));
            stereotypeToConstraints.put(stereotype.getName(), constraints);
        }
        for (Constraint constraint : constraints) {
            boolean isInvariantSatisfied = ocl.check(element, constraint);
            if (!isInvariantSatisfied) {
                diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR, ValidatorActivator.PLUGIN_ID, 0, constraint.getName() + " in Stereotype "
                        + stereotype.getName(), new Object[] { OCLUMLValidator.class }));
            }
        }
    }

    private List<Constraint> createConstraintsFrom(Element element, Stereotype stereotype, OCLExpression<Classifier> query) {
        Classifier metaClass = getMetaclass(element.eClass().getName());
        oclHelper.setContext(metaClass);
        List<?> result = (List<?>) ocl.evaluate(stereotype, query); //$NON-NLS-1$                
        List<Constraint> constraints = new ArrayList<Constraint>();
        Constraint oclInv = null;
        // oclHelper.setAttributeContext
        oclHelper.setInstanceContext(element);
        for (Object invariant : result)
            if (invariant instanceof Tuple<?, ?>) {
                Tuple<?, ?> tuple = (Tuple<?, ?>) invariant;
                // We do not know the context before hand, therefore we try M1
                // context, if fails, try M2 context.
                // TODO: Instead of brute forcing the retrieval of correct
                // context, do it in a more clever way if possible.
                try {
                    oclHelper.setContext(stereotype);
                    oclInv = oclHelper.createInvariant((String) tuple.getValue(INVARIANT));
                }
                // if context is not in M1, surely it must be in M2. Otherwise
                // something is very bad.
                catch (Exception e) {
                    LOGGER.warn(e.getMessage(), e);
                    try {
                        oclHelper.setContext(metaClass);
                        oclInv = oclHelper.createInvariant((String) tuple.getValue(INVARIANT));
                    } catch (ParserException e1) {
                        LOGGER.warn(e1.getMessage(), e1);
                        try {
                            oclHelper.setInstanceContext(element);
                            oclInv = oclHelper.createInvariant((String) tuple.getValue(INVARIANT));
                        } catch (ParserException e2) {
                            LOGGER.warn(e2.getMessage(), e2);
                        }
                    }
                }
                oclInv.setName((String) tuple.getValue("constraintName"));
                constraints.add(oclInv);
            }
        return constraints;
    }

}
