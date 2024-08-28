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

import com.ericsson.yang.IfFeature;
import com.ericsson.yang.StatusKind;
import com.ericsson.yang.Uses;
import com.ericsson.yang.When;
import com.ericsson.yang.YANGPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.ericsson.yang.impl.ContainerImpl#getWhen <em>When</em>}</li>
 *   <li>{@link com.ericsson.yang.impl.ContainerImpl#getIfFeature <em>If Feature</em>}</li>
 *   <li>{@link com.ericsson.yang.impl.ContainerImpl#getPresence <em>Presence</em>}</li>
 *   <li>{@link com.ericsson.yang.impl.ContainerImpl#isConfig <em>Config</em>}</li>
 *   <li>{@link com.ericsson.yang.impl.ContainerImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link com.ericsson.yang.impl.ContainerImpl#getRestricted <em>Restricted</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ContainerImpl extends NodeImpl implements com.ericsson.yang.Container {
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
	 * The cached value of the '{@link #getIfFeature() <em>If Feature</em>}' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getIfFeature()
	 * @generated
	 * @ordered
	 */
    protected EList<IfFeature> ifFeature;

    /**
	 * The default value of the '{@link #getPresence() <em>Presence</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getPresence()
	 * @generated
	 * @ordered
	 */
    protected static final String PRESENCE_EDEFAULT = null;

    /**
	 * The cached value of the '{@link #getPresence() <em>Presence</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getPresence()
	 * @generated
	 * @ordered
	 */
    protected String presence = PRESENCE_EDEFAULT;

    /**
	 * The default value of the '{@link #isConfig() <em>Config</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #isConfig()
	 * @generated
	 * @ordered
	 */
    protected static final boolean CONFIG_EDEFAULT = true;

    /**
	 * The cached value of the '{@link #isConfig() <em>Config</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #isConfig()
	 * @generated
	 * @ordered
	 */
    protected boolean config = CONFIG_EDEFAULT;

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
	 * The default value of the '{@link #getRestricted() <em>Restricted</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getRestricted()
	 * @generated
	 * @ordered
	 */
    protected static final Boolean RESTRICTED_EDEFAULT = null;

    /**
	 * The cached value of the '{@link #getRestricted() <em>Restricted</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getRestricted()
	 * @generated
	 * @ordered
	 */
    protected Boolean restricted = RESTRICTED_EDEFAULT;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected ContainerImpl() {
		super();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected EClass eStaticClass() {
		return YANGPackage.Literals.CONTAINER;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, YANGPackage.CONTAINER__WHEN, oldWhen, newWhen);
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
				msgs = ((InternalEObject)when).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - YANGPackage.CONTAINER__WHEN, null, msgs);
			if (newWhen != null)
				msgs = ((InternalEObject)newWhen).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - YANGPackage.CONTAINER__WHEN, null, msgs);
			msgs = basicSetWhen(newWhen, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YANGPackage.CONTAINER__WHEN, newWhen, newWhen));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<IfFeature> getIfFeature() {
		if (ifFeature == null) {
			ifFeature = new EObjectContainmentEList<IfFeature>(IfFeature.class, this, YANGPackage.CONTAINER__IF_FEATURE);
		}
		return ifFeature;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public String getPresence() {
		return presence;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setPresence(String newPresence) {
		String oldPresence = presence;
		presence = newPresence;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YANGPackage.CONTAINER__PRESENCE, oldPresence, presence));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean isConfig() {
		return config;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setConfig(boolean newConfig) {
		boolean oldConfig = config;
		config = newConfig;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YANGPackage.CONTAINER__CONFIG, oldConfig, config));
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
			eNotify(new ENotificationImpl(this, Notification.SET, YANGPackage.CONTAINER__STATUS, oldStatus, status));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Boolean getRestricted() {
		return restricted;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setRestricted(Boolean newRestricted) {
		Boolean oldRestricted = restricted;
		restricted = newRestricted;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YANGPackage.CONTAINER__RESTRICTED, oldRestricted, restricted));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case YANGPackage.CONTAINER__WHEN:
				return basicSetWhen(null, msgs);
			case YANGPackage.CONTAINER__IF_FEATURE:
				return ((InternalEList<?>)getIfFeature()).basicRemove(otherEnd, msgs);
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
			case YANGPackage.CONTAINER__WHEN:
				return getWhen();
			case YANGPackage.CONTAINER__IF_FEATURE:
				return getIfFeature();
			case YANGPackage.CONTAINER__PRESENCE:
				return getPresence();
			case YANGPackage.CONTAINER__CONFIG:
				return isConfig();
			case YANGPackage.CONTAINER__STATUS:
				return getStatus();
			case YANGPackage.CONTAINER__RESTRICTED:
				return getRestricted();
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
			case YANGPackage.CONTAINER__WHEN:
				setWhen((When)newValue);
				return;
			case YANGPackage.CONTAINER__IF_FEATURE:
				getIfFeature().clear();
				getIfFeature().addAll((Collection<? extends IfFeature>)newValue);
				return;
			case YANGPackage.CONTAINER__PRESENCE:
				setPresence((String)newValue);
				return;
			case YANGPackage.CONTAINER__CONFIG:
				setConfig((Boolean)newValue);
				return;
			case YANGPackage.CONTAINER__STATUS:
				setStatus((StatusKind)newValue);
				return;
			case YANGPackage.CONTAINER__RESTRICTED:
				setRestricted((Boolean)newValue);
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
			case YANGPackage.CONTAINER__WHEN:
				setWhen((When)null);
				return;
			case YANGPackage.CONTAINER__IF_FEATURE:
				getIfFeature().clear();
				return;
			case YANGPackage.CONTAINER__PRESENCE:
				setPresence(PRESENCE_EDEFAULT);
				return;
			case YANGPackage.CONTAINER__CONFIG:
				setConfig(CONFIG_EDEFAULT);
				return;
			case YANGPackage.CONTAINER__STATUS:
				setStatus(STATUS_EDEFAULT);
				return;
			case YANGPackage.CONTAINER__RESTRICTED:
				setRestricted(RESTRICTED_EDEFAULT);
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
			case YANGPackage.CONTAINER__WHEN:
				return when != null;
			case YANGPackage.CONTAINER__IF_FEATURE:
				return ifFeature != null && !ifFeature.isEmpty();
			case YANGPackage.CONTAINER__PRESENCE:
				return PRESENCE_EDEFAULT == null ? presence != null : !PRESENCE_EDEFAULT.equals(presence);
			case YANGPackage.CONTAINER__CONFIG:
				return config != CONFIG_EDEFAULT;
			case YANGPackage.CONTAINER__STATUS:
				return status != STATUS_EDEFAULT;
			case YANGPackage.CONTAINER__RESTRICTED:
				return RESTRICTED_EDEFAULT == null ? restricted != null : !RESTRICTED_EDEFAULT.equals(restricted);
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
		result.append(" (presence: ");
		result.append(presence);
		result.append(", config: ");
		result.append(config);
		result.append(", status: ");
		result.append(status);
		result.append(", restricted: ");
		result.append(restricted);
		result.append(')');
		return result.toString();
	}

} //ContainerImpl
