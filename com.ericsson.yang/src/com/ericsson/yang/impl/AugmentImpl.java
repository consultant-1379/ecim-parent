/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.ericsson.yang.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import com.ericsson.yang.Augment;
import com.ericsson.yang.Case;
import com.ericsson.yang.DataDefinition;
import com.ericsson.yang.IfFeature;
import com.ericsson.yang.ModuleStatement;
import com.ericsson.yang.NamedElement;
import com.ericsson.yang.Property;
import com.ericsson.yang.StatusKind;
import com.ericsson.yang.Uses;
import com.ericsson.yang.When;
import com.ericsson.yang.YANGPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Augment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.ericsson.yang.impl.AugmentImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link com.ericsson.yang.impl.AugmentImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link com.ericsson.yang.impl.AugmentImpl#getReference <em>Reference</em>}</li>
 *   <li>{@link com.ericsson.yang.impl.AugmentImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link com.ericsson.yang.impl.AugmentImpl#getElements <em>Elements</em>}</li>
 *   <li>{@link com.ericsson.yang.impl.AugmentImpl#getIfFeature <em>If Feature</em>}</li>
 *   <li>{@link com.ericsson.yang.impl.AugmentImpl#getUses <em>Uses</em>}</li>
 *   <li>{@link com.ericsson.yang.impl.AugmentImpl#getWhen <em>When</em>}</li>
 *   <li>{@link com.ericsson.yang.impl.AugmentImpl#getCase <em>Case</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AugmentImpl extends NamedElementImpl implements Augment {
    /**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
    protected static final String DESCRIPTION_EDEFAULT = null;

    /**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
    protected String description = DESCRIPTION_EDEFAULT;

    /**
	 * The cached value of the '{@link #getProperties() <em>Properties</em>}' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getProperties()
	 * @generated
	 * @ordered
	 */
    protected EList<Property> properties;

    /**
	 * The default value of the '{@link #getReference() <em>Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getReference()
	 * @generated
	 * @ordered
	 */
    protected static final String REFERENCE_EDEFAULT = null;

    /**
	 * The cached value of the '{@link #getReference() <em>Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getReference()
	 * @generated
	 * @ordered
	 */
    protected String reference = REFERENCE_EDEFAULT;

    /**
	 * The default value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
    protected static final StatusKind STATUS_EDEFAULT = StatusKind.CURRENT;

    /**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
    protected StatusKind status = STATUS_EDEFAULT;

    /**
	 * The cached value of the '{@link #getElements() <em>Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getElements()
	 * @generated
	 * @ordered
	 */
    protected EList<DataDefinition> elements;

    /**
	 * The cached value of the '{@link #getIfFeature() <em>If Feature</em>}' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getIfFeature()
	 * @generated
	 * @ordered
	 */
    protected EList<IfFeature> ifFeature;

    /**
	 * The cached value of the '{@link #getUses() <em>Uses</em>}' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getUses()
	 * @generated
	 * @ordered
	 */
    protected EList<Uses> uses;

    /**
	 * The cached value of the '{@link #getWhen() <em>When</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getWhen()
	 * @generated
	 * @ordered
	 */
    protected When when;

    /**
	 * The cached value of the '{@link #getCase() <em>Case</em>}' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getCase()
	 * @generated
	 * @ordered
	 */
    protected EList<Case> case_;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected AugmentImpl() {
		super();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected EClass eStaticClass() {
		return YANGPackage.Literals.AUGMENT;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public String getDescription() {
		return description;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YANGPackage.AUGMENT__DESCRIPTION, oldDescription, description));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<Property> getProperties() {
		if (properties == null) {
			properties = new EObjectContainmentEList<Property>(Property.class, this, YANGPackage.AUGMENT__PROPERTIES);
		}
		return properties;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public String getReference() {
		return reference;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setReference(String newReference) {
		String oldReference = reference;
		reference = newReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YANGPackage.AUGMENT__REFERENCE, oldReference, reference));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public StatusKind getStatus() {
		return status;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setStatus(StatusKind newStatus) {
		StatusKind oldStatus = status;
		status = newStatus == null ? STATUS_EDEFAULT : newStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YANGPackage.AUGMENT__STATUS, oldStatus, status));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<DataDefinition> getElements() {
		if (elements == null) {
			elements = new EObjectContainmentEList<DataDefinition>(DataDefinition.class, this, YANGPackage.AUGMENT__ELEMENTS);
		}
		return elements;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<IfFeature> getIfFeature() {
		if (ifFeature == null) {
			ifFeature = new EObjectContainmentEList<IfFeature>(IfFeature.class, this, YANGPackage.AUGMENT__IF_FEATURE);
		}
		return ifFeature;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<Uses> getUses() {
		if (uses == null) {
			uses = new EObjectContainmentEList<Uses>(Uses.class, this, YANGPackage.AUGMENT__USES);
		}
		return uses;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public When getWhen() {
		return when;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetWhen(When newWhen, NotificationChain msgs) {
		When oldWhen = when;
		when = newWhen;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, YANGPackage.AUGMENT__WHEN, oldWhen, newWhen);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setWhen(When newWhen) {
		if (newWhen != when) {
			NotificationChain msgs = null;
			if (when != null)
				msgs = ((InternalEObject)when).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - YANGPackage.AUGMENT__WHEN, null, msgs);
			if (newWhen != null)
				msgs = ((InternalEObject)newWhen).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - YANGPackage.AUGMENT__WHEN, null, msgs);
			msgs = basicSetWhen(newWhen, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YANGPackage.AUGMENT__WHEN, newWhen, newWhen));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<Case> getCase() {
		if (case_ == null) {
			case_ = new EObjectContainmentEList<Case>(Case.class, this, YANGPackage.AUGMENT__CASE);
		}
		return case_;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case YANGPackage.AUGMENT__PROPERTIES:
				return ((InternalEList<?>)getProperties()).basicRemove(otherEnd, msgs);
			case YANGPackage.AUGMENT__ELEMENTS:
				return ((InternalEList<?>)getElements()).basicRemove(otherEnd, msgs);
			case YANGPackage.AUGMENT__IF_FEATURE:
				return ((InternalEList<?>)getIfFeature()).basicRemove(otherEnd, msgs);
			case YANGPackage.AUGMENT__USES:
				return ((InternalEList<?>)getUses()).basicRemove(otherEnd, msgs);
			case YANGPackage.AUGMENT__WHEN:
				return basicSetWhen(null, msgs);
			case YANGPackage.AUGMENT__CASE:
				return ((InternalEList<?>)getCase()).basicRemove(otherEnd, msgs);
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
			case YANGPackage.AUGMENT__DESCRIPTION:
				return getDescription();
			case YANGPackage.AUGMENT__PROPERTIES:
				return getProperties();
			case YANGPackage.AUGMENT__REFERENCE:
				return getReference();
			case YANGPackage.AUGMENT__STATUS:
				return getStatus();
			case YANGPackage.AUGMENT__ELEMENTS:
				return getElements();
			case YANGPackage.AUGMENT__IF_FEATURE:
				return getIfFeature();
			case YANGPackage.AUGMENT__USES:
				return getUses();
			case YANGPackage.AUGMENT__WHEN:
				return getWhen();
			case YANGPackage.AUGMENT__CASE:
				return getCase();
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
			case YANGPackage.AUGMENT__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case YANGPackage.AUGMENT__PROPERTIES:
				getProperties().clear();
				getProperties().addAll((Collection<? extends Property>)newValue);
				return;
			case YANGPackage.AUGMENT__REFERENCE:
				setReference((String)newValue);
				return;
			case YANGPackage.AUGMENT__STATUS:
				setStatus((StatusKind)newValue);
				return;
			case YANGPackage.AUGMENT__ELEMENTS:
				getElements().clear();
				getElements().addAll((Collection<? extends DataDefinition>)newValue);
				return;
			case YANGPackage.AUGMENT__IF_FEATURE:
				getIfFeature().clear();
				getIfFeature().addAll((Collection<? extends IfFeature>)newValue);
				return;
			case YANGPackage.AUGMENT__USES:
				getUses().clear();
				getUses().addAll((Collection<? extends Uses>)newValue);
				return;
			case YANGPackage.AUGMENT__WHEN:
				setWhen((When)newValue);
				return;
			case YANGPackage.AUGMENT__CASE:
				getCase().clear();
				getCase().addAll((Collection<? extends Case>)newValue);
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
			case YANGPackage.AUGMENT__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case YANGPackage.AUGMENT__PROPERTIES:
				getProperties().clear();
				return;
			case YANGPackage.AUGMENT__REFERENCE:
				setReference(REFERENCE_EDEFAULT);
				return;
			case YANGPackage.AUGMENT__STATUS:
				setStatus(STATUS_EDEFAULT);
				return;
			case YANGPackage.AUGMENT__ELEMENTS:
				getElements().clear();
				return;
			case YANGPackage.AUGMENT__IF_FEATURE:
				getIfFeature().clear();
				return;
			case YANGPackage.AUGMENT__USES:
				getUses().clear();
				return;
			case YANGPackage.AUGMENT__WHEN:
				setWhen((When)null);
				return;
			case YANGPackage.AUGMENT__CASE:
				getCase().clear();
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
			case YANGPackage.AUGMENT__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case YANGPackage.AUGMENT__PROPERTIES:
				return properties != null && !properties.isEmpty();
			case YANGPackage.AUGMENT__REFERENCE:
				return REFERENCE_EDEFAULT == null ? reference != null : !REFERENCE_EDEFAULT.equals(reference);
			case YANGPackage.AUGMENT__STATUS:
				return status != STATUS_EDEFAULT;
			case YANGPackage.AUGMENT__ELEMENTS:
				return elements != null && !elements.isEmpty();
			case YANGPackage.AUGMENT__IF_FEATURE:
				return ifFeature != null && !ifFeature.isEmpty();
			case YANGPackage.AUGMENT__USES:
				return uses != null && !uses.isEmpty();
			case YANGPackage.AUGMENT__WHEN:
				return when != null;
			case YANGPackage.AUGMENT__CASE:
				return case_ != null && !case_.isEmpty();
		}
		return super.eIsSet(featureID);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == ModuleStatement.class) {
			switch (derivedFeatureID) {
				case YANGPackage.AUGMENT__DESCRIPTION: return YANGPackage.MODULE_STATEMENT__DESCRIPTION;
				case YANGPackage.AUGMENT__PROPERTIES: return YANGPackage.MODULE_STATEMENT__PROPERTIES;
				case YANGPackage.AUGMENT__REFERENCE: return YANGPackage.MODULE_STATEMENT__REFERENCE;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == ModuleStatement.class) {
			switch (baseFeatureID) {
				case YANGPackage.MODULE_STATEMENT__DESCRIPTION: return YANGPackage.AUGMENT__DESCRIPTION;
				case YANGPackage.MODULE_STATEMENT__PROPERTIES: return YANGPackage.AUGMENT__PROPERTIES;
				case YANGPackage.MODULE_STATEMENT__REFERENCE: return YANGPackage.AUGMENT__REFERENCE;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (description: ");
		result.append(description);
		result.append(", reference: ");
		result.append(reference);
		result.append(", status: ");
		result.append(status);
		result.append(')');
		return result.toString();
	}

} //AugmentImpl
