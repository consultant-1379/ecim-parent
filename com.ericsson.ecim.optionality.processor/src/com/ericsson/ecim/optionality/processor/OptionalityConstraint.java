package com.ericsson.ecim.optionality.processor;

import org.eclipse.emf.common.util.EList;
import org.eclipse.uml2.uml.Element;

import com.ericsson.ecim.optionality.Expression;
import com.ericsson.ecim.optionality.Model;
import com.ericsson.ecim.optionality.Statement;

/**
 * This class provides functions related to Optionality Constraint management.
 */
public class OptionalityConstraint 
{
    private Model constraintModel = null;
    private EList<Element> constrainedElements = null;
    private String constraintText;
    
    /**
     * 
     * Create a new OptionalityConstraint class to wrap a UML Constraint
     * 
     * @param model The constraint model
     * @param element List of constrained elements
     * @param constraint The constraint in text
     */        
    public OptionalityConstraint(Model model, EList<Element> elements, String constraint)
    {
        setModel(model);
        setConstraintElements(elements);
        setConstraintText(constraint);
    }
    
    /*
     * Set the model that the constraints are defined in
     * @param model The model containing the constraints
     */        
    public void setModel(Model model)
    {
        constraintModel = model;
    }
    
    /*
     * Set the set of constrained elements
     * @param elements A set of all the elements constrained by this constraint
     */            
    public void setConstraintElements(EList<Element> elements)
    {
        constrainedElements = elements;
    }
    
    /*
     * Set the constraint text
     * @param constraint The constraint text 
     */        
    public void setConstraintText(String constraint)
    {
        constraintText = constraint;
    }    
    
    /*
     * Retrieve the model the constraints are defined in
     * @return The model containing the constraints
     */        
    public Model getModel()
    {
        return constraintModel;
    }
    
    /*
     * Retrieve the constrained elements
     * @return A set of all the elements constrained by this constraint
     */        
    public EList<Element> getConstraintElements()
    {
        return constrainedElements;
    }
    
    /*
     * Retrieve the constraint text as a string
     * @return The constraint text
     */    
    public String getConstraintText()
    {
        return constraintText;
    }
    
    /*
     * Execute an optionality expression for a given constraint
     * @param featureSet The un-ordered set of features to consider the Expression against
     * @param processor The algorithm for processing optionality constraints 
     * @return The boolean result of the evaluation
     */        
    public Boolean validate(EList<String>featureSet, Processor processor)
    {
        EList<Statement> statements = constraintModel.getStatements();
        for (Statement statement : statements) 
        {        
            EList<Expression> expressions = statement.getExpression();
            //evaluate all the expressions. UML only really allows one so we only support one
            for (Expression expression : expressions) 
            {
                return processor.evaluateExpression(expression, featureSet);
            }
        }
        return false;//There were no statements
    }
}
