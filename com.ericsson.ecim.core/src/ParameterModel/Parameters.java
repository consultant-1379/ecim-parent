/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ParameterModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameters</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ParameterModel.Parameters#getParameter <em>Parameter</em>}</li>
 * </ul>
 * </p>
 *
 * @see ParameterModel.ParameterModelPackage#getParameters()
 * @model
 * @generated
 */
public interface Parameters extends EObject {
    /**
     * Returns the value of the '<em><b>Parameter</b></em>' containment reference list.
     * The list contents are of type {@link ParameterModel.Parameter}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Parameter</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parameter</em>' containment reference list.
     * @see ParameterModel.ParameterModelPackage#getParameters_Parameter()
     * @model containment="true"
     * @generated
     */
    EList<Parameter> getParameter();

} // Parameters
