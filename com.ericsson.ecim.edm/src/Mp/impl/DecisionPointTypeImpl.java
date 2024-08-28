/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Mp.impl;

import Mp.DecisionPointType;
import Mp.DecisionStatementType;
import Mp.MpPackage;

import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Decision Point Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Mp.impl.DecisionPointTypeImpl#getDecisionStatement <em>Decision Statement</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DecisionPointTypeImpl extends EObjectImpl implements DecisionPointType {
    /**
	 * The cached value of the '{@link #getDecisionStatement() <em>Decision Statement</em>}' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getDecisionStatement()
	 * @generated
	 * @ordered
	 */
    protected EList<DecisionStatementType> decisionStatement;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected DecisionPointTypeImpl() {
		super();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected EClass eStaticClass() {
		return MpPackage.eINSTANCE.getDecisionPointType();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<DecisionStatementType> getDecisionStatement() {
		if (decisionStatement == null) {
			decisionStatement = new EObjectContainmentEList<DecisionStatementType>(DecisionStatementType.class, this, MpPackage.DECISION_POINT_TYPE__DECISION_STATEMENT);
		}
		return decisionStatement;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MpPackage.DECISION_POINT_TYPE__DECISION_STATEMENT:
				return ((InternalEList<?>)getDecisionStatement()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MpPackage.DECISION_POINT_TYPE__DECISION_STATEMENT:
				return getDecisionStatement();
		}
		return super.eGet(featureID, resolve, coreType);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MpPackage.DECISION_POINT_TYPE__DECISION_STATEMENT:
				getDecisionStatement().clear();
				getDecisionStatement().addAll((Collection<? extends DecisionStatementType>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public void eUnset(int featureID) {
		switch (featureID) {
			case MpPackage.DECISION_POINT_TYPE__DECISION_STATEMENT:
				getDecisionStatement().clear();
				return;
		}
		super.eUnset(featureID);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public boolean eIsSet(int featureID) {
		switch (featureID) {
			case MpPackage.DECISION_POINT_TYPE__DECISION_STATEMENT:
				return decisionStatement != null && !decisionStatement.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DecisionPointTypeImpl
