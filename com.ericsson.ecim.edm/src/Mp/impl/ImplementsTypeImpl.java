/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Mp.impl;

import Mp.ImplementsType;
import Mp.MpPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Implements Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Mp.impl.ImplementsTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link Mp.impl.ImplementsTypeImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link Mp.impl.ImplementsTypeImpl#getRelease <em>Release</em>}</li>
 *   <li>{@link Mp.impl.ImplementsTypeImpl#getCorrection <em>Correction</em>}</li>
 *   <li>{@link Mp.impl.ImplementsTypeImpl#getVariant <em>Variant</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ImplementsTypeImpl extends EObjectImpl implements ImplementsType {
    /**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
    protected static final String NAME_EDEFAULT = null;

    /**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
    protected String name = NAME_EDEFAULT;

    /**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
    protected static final Object VERSION_EDEFAULT = null;

    /**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
    protected Object version = VERSION_EDEFAULT;

    /**
	 * The default value of the '{@link #getRelease() <em>Release</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getRelease()
	 * @generated
	 * @ordered
	 */
    protected static final Object RELEASE_EDEFAULT = null;

    /**
	 * The cached value of the '{@link #getRelease() <em>Release</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getRelease()
	 * @generated
	 * @ordered
	 */
    protected Object release = RELEASE_EDEFAULT;

    /**
	 * The default value of the '{@link #getCorrection() <em>Correction</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getCorrection()
	 * @generated
	 * @ordered
	 */
    protected static final Object CORRECTION_EDEFAULT = null;

    /**
	 * The cached value of the '{@link #getCorrection() <em>Correction</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getCorrection()
	 * @generated
	 * @ordered
	 */
    protected Object correction = CORRECTION_EDEFAULT;

    /**
	 * The default value of the '{@link #getVariant() <em>Variant</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getVariant()
	 * @generated
	 * @ordered
	 */
    protected static final Object VARIANT_EDEFAULT = null;

    /**
	 * The cached value of the '{@link #getVariant() <em>Variant</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getVariant()
	 * @generated
	 * @ordered
	 */
    protected Object variant = VARIANT_EDEFAULT;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected ImplementsTypeImpl() {
		super();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected EClass eStaticClass() {
		return MpPackage.eINSTANCE.getImplementsType();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Object getVersion() {
		return version;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setVersion(Object newVersion) {
		Object oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.IMPLEMENTS_TYPE__VERSION, oldVersion, version));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Object getRelease() {
		return release;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setRelease(Object newRelease) {
		Object oldRelease = release;
		release = newRelease;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.IMPLEMENTS_TYPE__RELEASE, oldRelease, release));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Object getCorrection() {
		return correction;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setCorrection(Object newCorrection) {
		Object oldCorrection = correction;
		correction = newCorrection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.IMPLEMENTS_TYPE__CORRECTION, oldCorrection, correction));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public String getName() {
		return name;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.IMPLEMENTS_TYPE__NAME, oldName, name));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Object getVariant() {
		return variant;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setVariant(Object newVariant) {
		Object oldVariant = variant;
		variant = newVariant;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.IMPLEMENTS_TYPE__VARIANT, oldVariant, variant));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MpPackage.IMPLEMENTS_TYPE__NAME:
				return getName();
			case MpPackage.IMPLEMENTS_TYPE__VERSION:
				return getVersion();
			case MpPackage.IMPLEMENTS_TYPE__RELEASE:
				return getRelease();
			case MpPackage.IMPLEMENTS_TYPE__CORRECTION:
				return getCorrection();
			case MpPackage.IMPLEMENTS_TYPE__VARIANT:
				return getVariant();
		}
		return super.eGet(featureID, resolve, coreType);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MpPackage.IMPLEMENTS_TYPE__NAME:
				setName((String)newValue);
				return;
			case MpPackage.IMPLEMENTS_TYPE__VERSION:
				setVersion(newValue);
				return;
			case MpPackage.IMPLEMENTS_TYPE__RELEASE:
				setRelease(newValue);
				return;
			case MpPackage.IMPLEMENTS_TYPE__CORRECTION:
				setCorrection(newValue);
				return;
			case MpPackage.IMPLEMENTS_TYPE__VARIANT:
				setVariant(newValue);
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
			case MpPackage.IMPLEMENTS_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case MpPackage.IMPLEMENTS_TYPE__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case MpPackage.IMPLEMENTS_TYPE__RELEASE:
				setRelease(RELEASE_EDEFAULT);
				return;
			case MpPackage.IMPLEMENTS_TYPE__CORRECTION:
				setCorrection(CORRECTION_EDEFAULT);
				return;
			case MpPackage.IMPLEMENTS_TYPE__VARIANT:
				setVariant(VARIANT_EDEFAULT);
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
			case MpPackage.IMPLEMENTS_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case MpPackage.IMPLEMENTS_TYPE__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
			case MpPackage.IMPLEMENTS_TYPE__RELEASE:
				return RELEASE_EDEFAULT == null ? release != null : !RELEASE_EDEFAULT.equals(release);
			case MpPackage.IMPLEMENTS_TYPE__CORRECTION:
				return CORRECTION_EDEFAULT == null ? correction != null : !CORRECTION_EDEFAULT.equals(correction);
			case MpPackage.IMPLEMENTS_TYPE__VARIANT:
				return VARIANT_EDEFAULT == null ? variant != null : !VARIANT_EDEFAULT.equals(variant);
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
		result.append(" (name: ");
		result.append(name);
		result.append(", version: ");
		result.append(version);
		result.append(", release: ");
		result.append(release);
		result.append(", correction: ");
		result.append(correction);
		result.append(", variant: ");
		result.append(variant);
		result.append(')');
		return result.toString();
	}

} //ImplementsTypeImpl
