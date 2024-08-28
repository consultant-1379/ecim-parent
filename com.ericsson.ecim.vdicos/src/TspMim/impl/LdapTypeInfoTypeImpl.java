/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package TspMim.impl;

import TspMim.LdapTypeInfoType;
import TspMim.TspMimPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ldap Type Info Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link TspMim.impl.LdapTypeInfoTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link TspMim.impl.LdapTypeInfoTypeImpl#getEquality <em>Equality</em>}</li>
 *   <li>{@link TspMim.impl.LdapTypeInfoTypeImpl#getSubstr <em>Substr</em>}</li>
 *   <li>{@link TspMim.impl.LdapTypeInfoTypeImpl#getOrdering <em>Ordering</em>}</li>
 *   <li>{@link TspMim.impl.LdapTypeInfoTypeImpl#getSyntax <em>Syntax</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LdapTypeInfoTypeImpl extends EObjectImpl implements LdapTypeInfoType {
    /**
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
    protected FeatureMap group;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected LdapTypeInfoTypeImpl() {
		super();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected EClass eStaticClass() {
		return TspMimPackage.Literals.LDAP_TYPE_INFO_TYPE;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, TspMimPackage.LDAP_TYPE_INFO_TYPE__GROUP);
		}
		return group;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<String> getEquality() {
		return getGroup().list(TspMimPackage.Literals.LDAP_TYPE_INFO_TYPE__EQUALITY);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<String> getSubstr() {
		return getGroup().list(TspMimPackage.Literals.LDAP_TYPE_INFO_TYPE__SUBSTR);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<String> getOrdering() {
		return getGroup().list(TspMimPackage.Literals.LDAP_TYPE_INFO_TYPE__ORDERING);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<String> getSyntax() {
		return getGroup().list(TspMimPackage.Literals.LDAP_TYPE_INFO_TYPE__SYNTAX);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TspMimPackage.LDAP_TYPE_INFO_TYPE__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
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
			case TspMimPackage.LDAP_TYPE_INFO_TYPE__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case TspMimPackage.LDAP_TYPE_INFO_TYPE__EQUALITY:
				return getEquality();
			case TspMimPackage.LDAP_TYPE_INFO_TYPE__SUBSTR:
				return getSubstr();
			case TspMimPackage.LDAP_TYPE_INFO_TYPE__ORDERING:
				return getOrdering();
			case TspMimPackage.LDAP_TYPE_INFO_TYPE__SYNTAX:
				return getSyntax();
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
			case TspMimPackage.LDAP_TYPE_INFO_TYPE__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case TspMimPackage.LDAP_TYPE_INFO_TYPE__EQUALITY:
				getEquality().clear();
				getEquality().addAll((Collection<? extends String>)newValue);
				return;
			case TspMimPackage.LDAP_TYPE_INFO_TYPE__SUBSTR:
				getSubstr().clear();
				getSubstr().addAll((Collection<? extends String>)newValue);
				return;
			case TspMimPackage.LDAP_TYPE_INFO_TYPE__ORDERING:
				getOrdering().clear();
				getOrdering().addAll((Collection<? extends String>)newValue);
				return;
			case TspMimPackage.LDAP_TYPE_INFO_TYPE__SYNTAX:
				getSyntax().clear();
				getSyntax().addAll((Collection<? extends String>)newValue);
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
			case TspMimPackage.LDAP_TYPE_INFO_TYPE__GROUP:
				getGroup().clear();
				return;
			case TspMimPackage.LDAP_TYPE_INFO_TYPE__EQUALITY:
				getEquality().clear();
				return;
			case TspMimPackage.LDAP_TYPE_INFO_TYPE__SUBSTR:
				getSubstr().clear();
				return;
			case TspMimPackage.LDAP_TYPE_INFO_TYPE__ORDERING:
				getOrdering().clear();
				return;
			case TspMimPackage.LDAP_TYPE_INFO_TYPE__SYNTAX:
				getSyntax().clear();
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
			case TspMimPackage.LDAP_TYPE_INFO_TYPE__GROUP:
				return group != null && !group.isEmpty();
			case TspMimPackage.LDAP_TYPE_INFO_TYPE__EQUALITY:
				return !getEquality().isEmpty();
			case TspMimPackage.LDAP_TYPE_INFO_TYPE__SUBSTR:
				return !getSubstr().isEmpty();
			case TspMimPackage.LDAP_TYPE_INFO_TYPE__ORDERING:
				return !getOrdering().isEmpty();
			case TspMimPackage.LDAP_TYPE_INFO_TYPE__SYNTAX:
				return !getSyntax().isEmpty();
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
		result.append(" (group: ");
		result.append(group);
		result.append(')');
		return result.toString();
	}

} //LdapTypeInfoTypeImpl
