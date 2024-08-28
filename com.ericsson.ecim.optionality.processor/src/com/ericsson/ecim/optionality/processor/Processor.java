package com.ericsson.ecim.optionality.processor;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import com.ericsson.ecim.optionality.AndExpression;
import com.ericsson.ecim.optionality.Expression;
import com.ericsson.ecim.optionality.NotExpression;
import com.ericsson.ecim.optionality.OrExpression;

public class Processor {
    /*
     * Evaluate an optionality expression.
     * 
     * @param expression The Expression to be evaluated
     * 
     * @param featureSet the un-ordered set of features to consider the Expression against
     * 
     * @return the boolean result of the evaluation
     */
    public boolean evaluateExpression(Expression expression, EList<String> featureSet) {
        // Note:The order of the expressions checking is really important! This is why XPand has the dispatcher concept.
        // The grammar dictates this importance based on precedence in the grammar and how the associativity is set. See
        // the grammar for details.
        // One must have the interface/class which is at the bottom of the inheritance chain first
        // Note:switch will not work with instanceof. Also this looks rather un-OO but it is like this because of
        // ANTLR/Xtext

        // work out if the featureSet satisfies the current expression
        if (expression instanceof OrExpression) {
            OrExpression orexpression = (OrExpression) expression;
            // evaluate both sides of the OR
            return evaluateExpression(orexpression.getLeft(), featureSet) || evaluateExpression(orexpression.getRight(), featureSet);
        } else if (expression instanceof AndExpression) {
            return evaluateAddExpression((AndExpression) expression, featureSet);
        } else if (expression instanceof NotExpression) {
            NotExpression notexpression = (NotExpression) expression;
            // evaluate both sides of the NOT, we just twist the return value of the second evaluate to make this work
            // as a NOT
            return !evaluateExpression(notexpression.getRight(), featureSet);
        }
        EList<String> requiredFeatures = getRequiredFeatures(expression);
        // The one and only feature must be satisfied
        return featureSet.containsAll(requiredFeatures);
    }

    private boolean evaluateAddExpression(AndExpression andexpression, EList<String> featureSet) {
        EList<String> requiredFeatures = getRequiredFeatures(andexpression);
        // Continue evaluation if all features are satisfied or if a compound expressions like (A AND B) AND (A AND
        // C) was encountered
        if (featureSet.containsAll(requiredFeatures) || requiredFeatures.isEmpty()) {
            // evaluate both sides of the AND
            return evaluateExpression(andexpression.getLeft(), featureSet) && evaluateExpression(andexpression.getRight(), featureSet);
        } else {
            return false;
        }
    }

    /*
     * Retrieve the features referenced by an expression.
     */
    private EList<String> getRequiredFeatures(Expression expression) {
        EList<String> requiredFeatures = new BasicEList<String>();

        if (expression instanceof OrExpression) {
            // do nothing. this is not used because if any feature is found in an Or expression it will return true
        } else if (expression instanceof AndExpression) {
            // AndExpression types can have references to features on both sides
            getFeaturesForAnd((AndExpression) expression, requiredFeatures);
        } else if (expression instanceof NotExpression) {
            // NotExpression types only have references to features on one side
            Expression right = expression.getRight();
            if (right != null && right.getRef() != null) {
                requiredFeatures.add(right.getRef());
            }
        } else if (expression.getRef() != null) {
            // Expression types have no sides they just have a feature reference
            requiredFeatures.add(expression.getRef());
        }
        return requiredFeatures;
    }

    private void getFeaturesForAnd(AndExpression andexpression, EList<String> requiredFeatures) {
        Expression left = andexpression.getLeft();
        if (left != null && left.getRef() != null) {
            requiredFeatures.add(left.getRef());
        }
        Expression right = andexpression.getRight();
        if (right != null && right.getRef() != null) {
            requiredFeatures.add(right.getRef());
        }
    }
}
