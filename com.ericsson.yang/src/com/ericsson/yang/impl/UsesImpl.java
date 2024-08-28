/**
 */
package com.ericsson.yang.impl;

import com.ericsson.yang.Augment;
import com.ericsson.yang.IfFeature;
import com.ericsson.yang.NamedElement;
import com.ericsson.yang.Prefix;
import com.ericsson.yang.Refine;
import com.ericsson.yang.StatusKind;
import com.ericsson.yang.Uses;
import com.ericsson.yang.When;
import com.ericsson.yang.YANGPackage;
import com.ericsson.yang.util.Helpers;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Uses</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.ericsson.yang.impl.UsesImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link com.ericsson.yang.impl.UsesImpl#getIfFeature <em>If Feature</em>}</li>
 *   <li>{@link com.ericsson.yang.impl.UsesImpl#getAugment <em>Augment</em>}</li>
 *   <li>{@link com.ericsson.yang.impl.UsesImpl#getWhen <em>When</em>}</li>
 *   <li>{@link com.ericsson.yang.impl.UsesImpl#getRefine <em>Refine</em>}</li>
 *   <li>{@link com.ericsson.yang.impl.UsesImpl#getPrefix <em>Prefix</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UsesImpl extends DataDefinitionImpl implements Uses {
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
	 * The cached value of the '{@link #getIfFeature() <em>If Feature</em>}' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getIfFeature()
	 * @generated
	 * @ordered
	 */
    protected EList<IfFeature> ifFeature;

    /**
	 * The cached value of the '{@link #getAugment() <em>Augment</em>}' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getAugment()
	 * @generated
	 * @ordered
	 */
    protected EList<Augment> augment;

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
	 * The cached value of the '{@link #getRefine() <em>Refine</em>}' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getRefine()
	 * @generated
	 * @ordered
	 */
    protected EList<Refine> refine;

    /**
	 * The cached value of the '{@link #getPrefix() <em>Prefix</em>}' reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getPrefix()
	 * @generated
	 * @ordered
	 */
    protected Prefix prefix;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected UsesImpl() {
		super();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected EClass eStaticClass() {
		return YANGPackage.Literals.USES;
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
			eNotify(new ENotificationImpl(this, Notification.SET, YANGPackage.USES__STATUS, oldStatus, status));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<IfFeature> getIfFeature() {
		if (ifFeature == null) {
			ifFeature = new EObjectContainmentEList<IfFeature>(IfFeature.class, this, YANGPackage.USES__IF_FEATURE);
		}
		return ifFeature;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<Augment> getAugment() {
		if (augment == null) {
			augment = new EObjectContainmentEList<Augment>(Augment.class, this, YANGPackage.USES__AUGMENT);
		}
		return augment;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, YANGPackage.USES__WHEN, oldWhen, newWhen);
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
				msgs = ((InternalEObject)when).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - YANGPackage.USES__WHEN, null, msgs);
			if (newWhen != null)
				msgs = ((InternalEObject)newWhen).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - YANGPackage.USES__WHEN, null, msgs);
			msgs = basicSetWhen(newWhen, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YANGPackage.USES__WHEN, newWhen, newWhen));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<Refine> getRefine() {
		if (refine == null) {
			refine = new EObjectContainmentEList<Refine>(Refine.class, this, YANGPackage.USES__REFINE);
		}
		return refine;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Prefix getPrefix() {
		if (prefix != null && prefix.eIsProxy()) {
			InternalEObject oldPrefix = (InternalEObject)prefix;
			prefix = (Prefix)eResolveProxy(oldPrefix);
			if (prefix != oldPrefix) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, YANGPackage.USES__PREFIX, oldPrefix, prefix));
			}
		}
		return prefix;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Prefix basicGetPrefix() {
		return prefix;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setPrefix(Prefix newPrefix) {
		Prefix oldPrefix = prefix;
		prefix = newPrefix;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YANGPackage.USES__PREFIX, oldPrefix, prefix));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case YANGPackage.USES__IF_FEATURE:
				return ((InternalEList<?>)getIfFeature()).basicRemove(otherEnd, msgs);
			case YANGPackage.USES__AUGMENT:
				return ((InternalEList<?>)getAugment()).basicRemove(otherEnd, msgs);
			case YANGPackage.USES__WHEN:
				return basicSetWhen(null, msgs);
			case YANGPackage.USES__REFINE:
				return ((InternalEList<?>)getRefine()).basicRemove(otherEnd, msgs);
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
			case YANGPackage.USES__STATUS:
				return getStatus();
			case YANGPackage.USES__IF_FEATURE:
				return getIfFeature();
			case YANGPackage.USES__AUGMENT:
				return getAugment();
			case YANGPackage.USES__WHEN:
				return getWhen();
			case YANGPackage.USES__REFINE:
				return getRefine();
			case YANGPackage.USES__PREFIX:
				if (resolve) return getPrefix();
				return basicGetPrefix();
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
			case YANGPackage.USES__STATUS:
				setStatus((StatusKind)newValue);
				return;
			case YANGPackage.USES__IF_FEATURE:
				getIfFeature().clear();
				getIfFeature().addAll((Collection<? extends IfFeature>)newValue);
				return;
			case YANGPackage.USES__AUGMENT:
				getAugment().clear();
				getAugment().addAll((Collection<? extends Augment>)newValue);
				return;
			case YANGPackage.USES__WHEN:
				setWhen((When)newValue);
				return;
			case YANGPackage.USES__REFINE:
				getRefine().clear();
				getRefine().addAll((Collection<? extends Refine>)newValue);
				return;
			case YANGPackage.USES__PREFIX:
				setPrefix((Prefix)newValue);
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
			case YANGPackage.USES__STATUS:
				setStatus(STATUS_EDEFAULT);
				return;
			case YANGPackage.USES__IF_FEATURE:
				getIfFeature().clear();
				return;
			case YANGPackage.USES__AUGMENT:
				getAugment().clear();
				return;
			case YANGPackage.USES__WHEN:
				setWhen((When)null);
				return;
			case YANGPackage.USES__REFINE:
				getRefine().clear();
				return;
			case YANGPackage.USES__PREFIX:
				setPrefix((Prefix)null);
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
			case YANGPackage.USES__STATUS:
				return status != STATUS_EDEFAULT;
			case YANGPackage.USES__IF_FEATURE:
				return ifFeature != null && !ifFeature.isEmpty();
			case YANGPackage.USES__AUGMENT:
				return augment != null && !augment.isEmpty();
			case YANGPackage.USES__WHEN:
				return when != null;
			case YANGPackage.USES__REFINE:
				return refine != null && !refine.isEmpty();
			case YANGPackage.USES__PREFIX:
				return prefix != null;
		}
		return super.eIsSet(featureID);
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
		result.append(" (status: ");
		result.append(status);
		result.append(')');
		return result.toString();
	}

    /**
     * Uses specifiy paths using local namespace prefixes. These prefixes must be changed to 
     * their original prefixes when checking to see if there is a match. This function does
     * the mapping.
     * 
     * @generated NOT
     */
    public String convertLocalPathToOriginalPath(String path) {
        Helpers helpers = new Helpers();
        String convertedName = helpers.mapPrefixes(path,eResource(),this);
        return convertedName;
    }
    
} //UsesImpl
