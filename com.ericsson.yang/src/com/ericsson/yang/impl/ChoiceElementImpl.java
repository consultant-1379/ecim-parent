/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.ericsson.yang.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import com.ericsson.yang.ChoiceElement;
import com.ericsson.yang.YANGPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Choice Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public abstract class ChoiceElementImpl extends MinimalEObjectImpl.Container implements ChoiceElement {
    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected ChoiceElementImpl() {
		super();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected EClass eStaticClass() {
		return YANGPackage.Literals.CHOICE_ELEMENT;
	}

} //ChoiceElementImpl
