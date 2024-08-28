/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Mp.impl;

import Mp.AssociationEndType;
import Mp.BiDirectionalAssociationType;
import Mp.MandatoryType;
import Mp.MpPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bi Directional Association Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Mp.impl.BiDirectionalAssociationTypeImpl#getMandatory <em>Mandatory</em>}</li>
 *   <li>{@link Mp.impl.BiDirectionalAssociationTypeImpl#getAssociationEnd <em>Association End</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BiDirectionalAssociationTypeImpl extends EObjectImpl implements BiDirectionalAssociationType {
    /**
	 * The cached value of the '{@link #getMandatory() <em>Mandatory</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getMandatory()
	 * @generated
	 * @ordered
	 */
    protected MandatoryType mandatory;

    /**
	 * The cached value of the '{@link #getAssociationEnd() <em>Association End</em>}' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getAssociationEnd()
	 * @generated
	 * @ordered
	 */
    protected EList<AssociationEndType> associationEnd;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected BiDirectionalAssociationTypeImpl() {
		super();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected EClass eStaticClass() {
		return MpPackage.eINSTANCE.getBiDirectionalAssociationType();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public MandatoryType getMandatory() {
		return mandatory;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetMandatory(MandatoryType newMandatory, NotificationChain msgs) {
		MandatoryType oldMandatory = mandatory;
		mandatory = newMandatory;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpPackage.BI_DIRECTIONAL_ASSOCIATION_TYPE__MANDATORY, oldMandatory, newMandatory);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setMandatory(MandatoryType newMandatory) {
		if (newMandatory != mandatory) {
			NotificationChain msgs = null;
			if (mandatory != null)
				msgs = ((InternalEObject)mandatory).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MpPackage.BI_DIRECTIONAL_ASSOCIATION_TYPE__MANDATORY, null, msgs);
			if (newMandatory != null)
				msgs = ((InternalEObject)newMandatory).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MpPackage.BI_DIRECTIONAL_ASSOCIATION_TYPE__MANDATORY, null, msgs);
			msgs = basicSetMandatory(newMandatory, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.BI_DIRECTIONAL_ASSOCIATION_TYPE__MANDATORY, newMandatory, newMandatory));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<AssociationEndType> getAssociationEnd() {
		if (associationEnd == null) {
			associationEnd = new EObjectContainmentEList<AssociationEndType>(AssociationEndType.class, this, MpPackage.BI_DIRECTIONAL_ASSOCIATION_TYPE__ASSOCIATION_END);
		}
		return associationEnd;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MpPackage.BI_DIRECTIONAL_ASSOCIATION_TYPE__MANDATORY:
				return basicSetMandatory(null, msgs);
			case MpPackage.BI_DIRECTIONAL_ASSOCIATION_TYPE__ASSOCIATION_END:
				return ((InternalEList<?>)getAssociationEnd()).basicRemove(otherEnd, msgs);
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
			case MpPackage.BI_DIRECTIONAL_ASSOCIATION_TYPE__MANDATORY:
				return getMandatory();
			case MpPackage.BI_DIRECTIONAL_ASSOCIATION_TYPE__ASSOCIATION_END:
				return getAssociationEnd();
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
			case MpPackage.BI_DIRECTIONAL_ASSOCIATION_TYPE__MANDATORY:
				setMandatory((MandatoryType)newValue);
				return;
			case MpPackage.BI_DIRECTIONAL_ASSOCIATION_TYPE__ASSOCIATION_END:
				getAssociationEnd().clear();
				getAssociationEnd().addAll((Collection<? extends AssociationEndType>)newValue);
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
			case MpPackage.BI_DIRECTIONAL_ASSOCIATION_TYPE__MANDATORY:
				setMandatory((MandatoryType)null);
				return;
			case MpPackage.BI_DIRECTIONAL_ASSOCIATION_TYPE__ASSOCIATION_END:
				getAssociationEnd().clear();
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
			case MpPackage.BI_DIRECTIONAL_ASSOCIATION_TYPE__MANDATORY:
				return mandatory != null;
			case MpPackage.BI_DIRECTIONAL_ASSOCIATION_TYPE__ASSOCIATION_END:
				return associationEnd != null && !associationEnd.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //BiDirectionalAssociationTypeImpl
