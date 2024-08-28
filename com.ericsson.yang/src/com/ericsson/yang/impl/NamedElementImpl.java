/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.ericsson.yang.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import com.ericsson.yang.NamedElement;
import com.ericsson.yang.YANGPackage;
import com.ericsson.yang.util.Helpers;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Named Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.ericsson.yang.impl.NamedElementImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class NamedElementImpl extends MinimalEObjectImpl.Container implements NamedElement {
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
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected NamedElementImpl() {
		super();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected EClass eStaticClass() {
		return YANGPackage.Literals.NAMED_ELEMENT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, YANGPackage.NAMED_ELEMENT__NAME, oldName, name));
	}

    /**
     * Augments and deviate names specify paths using local namespace prefixes. These prefixes must be changed to 
     * their original prefixes when checking to see if there is an augment/deviate path match. This function does
     * the mapping.
     * 
     * @generated NOT
     */
    public String convertLocalPathToOriginalPath() {
        Helpers helpers = new Helpers();
        String convertedName = helpers.mapPrefixes(name,eResource(),this);
        return convertedName;
    }

    /**
     * LeafRefs specifiy paths using local namespace prefixes. These prefixes must be changed to 
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


    
    /**
     * LeafRefs specify paths using local namespace prefixes. These prefixes must be changed to 
     * their original prefixes when checking to see if there is a match. This function does
     * the mapping, including resolving a relative path to an absolute path.
     * @param currentPos
     * @param path
     * @return 
     * @generated NOT
     */
    public String convertLocalPathToOriginalPath(String currentPos, String path) {
        Helpers helpers = new Helpers();
        String absolutePath = helpers.getAbsolutePath(currentPos, path);
        String convertedName = helpers.mapPrefixes(absolutePath,eResource(),this);
        return convertedName;
    }

    

    /**
     * <!-- begin-user-doc -->
     * Compares string paths ignoring namespace prefixes.
     * <!-- end-user-doc -->
     * @generated NOT
     */
    public Boolean comparePathIgnoringNs(String a, String b) {
        Helpers helpers = new Helpers();
        return helpers.samePathIgnorePrefixes(a, b);
    }

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case YANGPackage.NAMED_ELEMENT__NAME:
				return getName();
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
			case YANGPackage.NAMED_ELEMENT__NAME:
				setName((String)newValue);
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
			case YANGPackage.NAMED_ELEMENT__NAME:
				setName(NAME_EDEFAULT);
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
			case YANGPackage.NAMED_ELEMENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(')');
		return result.toString();
	}

} //NamedElementImpl
