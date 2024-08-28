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
import org.eclipse.emf.ecore.util.InternalEList;

import com.ericsson.yang.ChoiceElement;
import com.ericsson.yang.DataDefinition;
import com.ericsson.yang.ModuleStatement;
import com.ericsson.yang.Must;
import com.ericsson.yang.Property;
import com.ericsson.yang.YANGPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.ericsson.yang.impl.DataDefinitionImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link com.ericsson.yang.impl.DataDefinitionImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link com.ericsson.yang.impl.DataDefinitionImpl#getReference <em>Reference</em>}</li>
 *   <li>{@link com.ericsson.yang.impl.DataDefinitionImpl#getMusts <em>Musts</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class DataDefinitionImpl extends NamedElementImpl implements DataDefinition {
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
	 * The cached value of the '{@link #getMusts() <em>Musts</em>}' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getMusts()
	 * @generated
	 * @ordered
	 */
    protected EList<Must> musts;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected DataDefinitionImpl() {
		super();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected EClass eStaticClass() {
		return YANGPackage.Literals.DATA_DEFINITION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, YANGPackage.DATA_DEFINITION__DESCRIPTION, oldDescription, description));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<Property> getProperties() {
		if (properties == null) {
			properties = new EObjectContainmentEList<Property>(Property.class, this, YANGPackage.DATA_DEFINITION__PROPERTIES);
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
			eNotify(new ENotificationImpl(this, Notification.SET, YANGPackage.DATA_DEFINITION__REFERENCE, oldReference, reference));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<Must> getMusts() {
		if (musts == null) {
			musts = new EObjectContainmentEList<Must>(Must.class, this, YANGPackage.DATA_DEFINITION__MUSTS);
		}
		return musts;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case YANGPackage.DATA_DEFINITION__PROPERTIES:
				return ((InternalEList<?>)getProperties()).basicRemove(otherEnd, msgs);
			case YANGPackage.DATA_DEFINITION__MUSTS:
				return ((InternalEList<?>)getMusts()).basicRemove(otherEnd, msgs);
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
			case YANGPackage.DATA_DEFINITION__DESCRIPTION:
				return getDescription();
			case YANGPackage.DATA_DEFINITION__PROPERTIES:
				return getProperties();
			case YANGPackage.DATA_DEFINITION__REFERENCE:
				return getReference();
			case YANGPackage.DATA_DEFINITION__MUSTS:
				return getMusts();
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
			case YANGPackage.DATA_DEFINITION__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case YANGPackage.DATA_DEFINITION__PROPERTIES:
				getProperties().clear();
				getProperties().addAll((Collection<? extends Property>)newValue);
				return;
			case YANGPackage.DATA_DEFINITION__REFERENCE:
				setReference((String)newValue);
				return;
			case YANGPackage.DATA_DEFINITION__MUSTS:
				getMusts().clear();
				getMusts().addAll((Collection<? extends Must>)newValue);
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
			case YANGPackage.DATA_DEFINITION__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case YANGPackage.DATA_DEFINITION__PROPERTIES:
				getProperties().clear();
				return;
			case YANGPackage.DATA_DEFINITION__REFERENCE:
				setReference(REFERENCE_EDEFAULT);
				return;
			case YANGPackage.DATA_DEFINITION__MUSTS:
				getMusts().clear();
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
			case YANGPackage.DATA_DEFINITION__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case YANGPackage.DATA_DEFINITION__PROPERTIES:
				return properties != null && !properties.isEmpty();
			case YANGPackage.DATA_DEFINITION__REFERENCE:
				return REFERENCE_EDEFAULT == null ? reference != null : !REFERENCE_EDEFAULT.equals(reference);
			case YANGPackage.DATA_DEFINITION__MUSTS:
				return musts != null && !musts.isEmpty();
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
				case YANGPackage.DATA_DEFINITION__DESCRIPTION: return YANGPackage.MODULE_STATEMENT__DESCRIPTION;
				case YANGPackage.DATA_DEFINITION__PROPERTIES: return YANGPackage.MODULE_STATEMENT__PROPERTIES;
				case YANGPackage.DATA_DEFINITION__REFERENCE: return YANGPackage.MODULE_STATEMENT__REFERENCE;
				default: return -1;
			}
		}
		if (baseClass == ChoiceElement.class) {
			switch (derivedFeatureID) {
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
				case YANGPackage.MODULE_STATEMENT__DESCRIPTION: return YANGPackage.DATA_DEFINITION__DESCRIPTION;
				case YANGPackage.MODULE_STATEMENT__PROPERTIES: return YANGPackage.DATA_DEFINITION__PROPERTIES;
				case YANGPackage.MODULE_STATEMENT__REFERENCE: return YANGPackage.DATA_DEFINITION__REFERENCE;
				default: return -1;
			}
		}
		if (baseClass == ChoiceElement.class) {
			switch (baseFeatureID) {
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
		result.append(')');
		return result.toString();
	}

} //DataDefinitionImpl
