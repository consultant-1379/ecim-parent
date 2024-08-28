package com.ericsson.ecim.core.oracles;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.ocl.OCL;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.Query;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.EcoreEnvironmentFactory;
import org.eclipse.ocl.expressions.OCLExpression;
import org.eclipse.ocl.helper.OCLHelper;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.NamedElement;

/**
 * This class defines reusable methods for contracts between an input model and an output model
 * Contracts are defined on source and target models or just on target models.
 * The source and target meta-models can be totally different and the only requirement is that they are EMF based.
 * 
 */
public class Contract {

    private static final Logger LOGGER = Logger.getLogger(Contract.class);

    /**
     * Convenience method to create OCL based queries
     * @param model The model to be queried
     * @param oclStatement The query to be executed
     * @param context The context onto which the query is run
     * 
     * @return result of the query
     */
    @SuppressWarnings("unchecked")
    protected Collection<NamedElement> executeQuery(Model model, String oclStatement, EClassifier context) {
        Collection<NamedElement> result = null;
        try {
            //TODO:This is Ecore based code why can't we use the regular UML code which
            //is commented out?
            //UMLEnvironmentFactory factory = new UMLEnvironmentFactory(resourceSet);
            //OCL ocl = OCL.newInstance(factory);

            OCL<?, EClassifier, ?, ?, ?, ?, ?, ?, ?, Constraint, EClass, EObject> ocl;
            ocl = OCL.newInstance(EcoreEnvironmentFactory.INSTANCE);

            OCLHelper<EClassifier, ?, ?, Constraint> helper = ocl.createOCLHelper();

            // set the OCL context classifier, which is often the model for our queries
            helper.setContext(context);

            OCLExpression<EClassifier> query = helper.createQuery(oclStatement);

            // use the query expression parsed before to create a Query
            Query<EClassifier, EClass, EObject> eval = ocl.createQuery(query);

            result = (Collection<NamedElement>) eval.evaluate(model);

        } catch (ParserException e) {
            //TODO:Improve exception handling
            // record failure to parse
            LOGGER.error(e.getLocalizedMessage(), e);
        }
        return result;
    }

    /**
     * Compare the size of two collections
     * @param source The source collection
     * @param target The target collection
     * 
     * @return true if the collections are the same size, otherwise false
     */
    @SuppressWarnings({ "unchecked", "rawtypes" })
    protected Collection<NamedElement> calculateResultBySizeEquality(Collection<?> source, Collection<?> target) {
        if (source.size() != target.size()) {
            if (LOGGER.isDebugEnabled()) {
                LOGGER.debug("Source and Target not match: S[" + source.size() + "] != T[" + target.size() + "]");
            }
            List<NamedElement> lessList = (source.size() > target.size()) ? new ArrayList(target) : new ArrayList(source);
            List<NamedElement> muchList = (source.size() > target.size()) ? new ArrayList(source) : new ArrayList(target);
            for (NamedElement lessElement : lessList) {
                String lessName = lessElement.getQualifiedName();
                int index = 0;
                for (; index < muchList.size(); index++) {
                    NamedElement muchElement = muchList.get(index);
                    String muchName = muchElement.getQualifiedName();
                    if (muchName.equals(lessName)) {
                        break;
                    }
                }
                if (index < muchList.size()) {
                    muchList.remove(index);
                }
            }
            ((ArrayList)muchList).trimToSize();
            return muchList;
        }
        if (LOGGER.isDebugEnabled()) {
            LOGGER.debug("Source and Target match: S[" + source.size() + "] == T[" + target.size() + "]");
        }
        return Collections.emptyList();
    }
}
