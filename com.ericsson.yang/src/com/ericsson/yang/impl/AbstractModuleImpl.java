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
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import com.ericsson.yang.AbstractModule;
import com.ericsson.yang.Deviation;
import com.ericsson.yang.Feature;
import com.ericsson.yang.Import;
import com.ericsson.yang.Include;
import com.ericsson.yang.ModuleStatement;
import com.ericsson.yang.Property;
import com.ericsson.yang.Revision;
import com.ericsson.yang.YANGPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Module</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.ericsson.yang.impl.AbstractModuleImpl#getYangVersion <em>Yang Version</em>}</li>
 *   <li>{@link com.ericsson.yang.impl.AbstractModuleImpl#getOrganization <em>Organization</em>}</li>
 *   <li>{@link com.ericsson.yang.impl.AbstractModuleImpl#getContact <em>Contact</em>}</li>
 *   <li>{@link com.ericsson.yang.impl.AbstractModuleImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link com.ericsson.yang.impl.AbstractModuleImpl#getReference <em>Reference</em>}</li>
 *   <li>{@link com.ericsson.yang.impl.AbstractModuleImpl#getImports <em>Imports</em>}</li>
 *   <li>{@link com.ericsson.yang.impl.AbstractModuleImpl#getRevisions <em>Revisions</em>}</li>
 *   <li>{@link com.ericsson.yang.impl.AbstractModuleImpl#getStatements <em>Statements</em>}</li>
 *   <li>{@link com.ericsson.yang.impl.AbstractModuleImpl#getFeatures <em>Features</em>}</li>
 *   <li>{@link com.ericsson.yang.impl.AbstractModuleImpl#getIncludeModules <em>Include Modules</em>}</li>
 *   <li>{@link com.ericsson.yang.impl.AbstractModuleImpl#getDeviation <em>Deviation</em>}</li>
 *   <li>{@link com.ericsson.yang.impl.AbstractModuleImpl#getProperties <em>Properties</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class AbstractModuleImpl extends NamedElementImpl implements AbstractModule {
    /**
	 * The default value of the '{@link #getYangVersion() <em>Yang Version</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getYangVersion()
	 * @generated
	 * @ordered
	 */
    protected static final int YANG_VERSION_EDEFAULT = 0;

    /**
	 * The cached value of the '{@link #getYangVersion() <em>Yang Version</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getYangVersion()
	 * @generated
	 * @ordered
	 */
    protected int yangVersion = YANG_VERSION_EDEFAULT;

    /**
	 * The default value of the '{@link #getOrganization() <em>Organization</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getOrganization()
	 * @generated
	 * @ordered
	 */
    protected static final String ORGANIZATION_EDEFAULT = null;

    /**
	 * The cached value of the '{@link #getOrganization() <em>Organization</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getOrganization()
	 * @generated
	 * @ordered
	 */
    protected String organization = ORGANIZATION_EDEFAULT;

    /**
	 * The default value of the '{@link #getContact() <em>Contact</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getContact()
	 * @generated
	 * @ordered
	 */
    protected static final String CONTACT_EDEFAULT = null;

    /**
	 * The cached value of the '{@link #getContact() <em>Contact</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getContact()
	 * @generated
	 * @ordered
	 */
    protected String contact = CONTACT_EDEFAULT;

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
	 * The cached value of the '{@link #getImports() <em>Imports</em>}' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getImports()
	 * @generated
	 * @ordered
	 */
    protected EList<Import> imports;

    /**
	 * The cached value of the '{@link #getRevisions() <em>Revisions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getRevisions()
	 * @generated
	 * @ordered
	 */
    protected EList<Revision> revisions;

    /**
	 * The cached value of the '{@link #getStatements() <em>Statements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getStatements()
	 * @generated
	 * @ordered
	 */
    protected EList<ModuleStatement> statements;

    /**
	 * The cached value of the '{@link #getFeatures() <em>Features</em>}' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getFeatures()
	 * @generated
	 * @ordered
	 */
    protected EList<Feature> features;

    /**
	 * The cached value of the '{@link #getIncludeModules() <em>Include Modules</em>}' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getIncludeModules()
	 * @generated
	 * @ordered
	 */
    protected EList<Include> includeModules;

    /**
	 * The cached value of the '{@link #getDeviation() <em>Deviation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getDeviation()
	 * @generated
	 * @ordered
	 */
    protected EList<Deviation> deviation;

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
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected AbstractModuleImpl() {
		super();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected EClass eStaticClass() {
		return YANGPackage.Literals.ABSTRACT_MODULE;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public int getYangVersion() {
		return yangVersion;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setYangVersion(int newYangVersion) {
		int oldYangVersion = yangVersion;
		yangVersion = newYangVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YANGPackage.ABSTRACT_MODULE__YANG_VERSION, oldYangVersion, yangVersion));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<Include> getIncludeModules() {
		if (includeModules == null) {
			includeModules = new EObjectContainmentEList<Include>(Include.class, this, YANGPackage.ABSTRACT_MODULE__INCLUDE_MODULES);
		}
		return includeModules;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<Deviation> getDeviation() {
		if (deviation == null) {
			deviation = new EObjectContainmentEList<Deviation>(Deviation.class, this, YANGPackage.ABSTRACT_MODULE__DEVIATION);
		}
		return deviation;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<Property> getProperties() {
		if (properties == null) {
			properties = new EObjectContainmentEList<Property>(Property.class, this, YANGPackage.ABSTRACT_MODULE__PROPERTIES);
		}
		return properties;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public String getOrganization() {
		return organization;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setOrganization(String newOrganization) {
		String oldOrganization = organization;
		organization = newOrganization;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YANGPackage.ABSTRACT_MODULE__ORGANIZATION, oldOrganization, organization));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public String getContact() {
		return contact;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setContact(String newContact) {
		String oldContact = contact;
		contact = newContact;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YANGPackage.ABSTRACT_MODULE__CONTACT, oldContact, contact));
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
			eNotify(new ENotificationImpl(this, Notification.SET, YANGPackage.ABSTRACT_MODULE__DESCRIPTION, oldDescription, description));
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
			eNotify(new ENotificationImpl(this, Notification.SET, YANGPackage.ABSTRACT_MODULE__REFERENCE, oldReference, reference));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<Import> getImports() {
		if (imports == null) {
			imports = new EObjectContainmentEList<Import>(Import.class, this, YANGPackage.ABSTRACT_MODULE__IMPORTS);
		}
		return imports;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<Revision> getRevisions() {
		if (revisions == null) {
			revisions = new EObjectContainmentEList<Revision>(Revision.class, this, YANGPackage.ABSTRACT_MODULE__REVISIONS);
		}
		return revisions;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<ModuleStatement> getStatements() {
		if (statements == null) {
			statements = new EObjectContainmentEList<ModuleStatement>(ModuleStatement.class, this, YANGPackage.ABSTRACT_MODULE__STATEMENTS);
		}
		return statements;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<Feature> getFeatures() {
		if (features == null) {
			features = new EObjectContainmentEList<Feature>(Feature.class, this, YANGPackage.ABSTRACT_MODULE__FEATURES);
		}
		return features;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case YANGPackage.ABSTRACT_MODULE__IMPORTS:
				return ((InternalEList<?>)getImports()).basicRemove(otherEnd, msgs);
			case YANGPackage.ABSTRACT_MODULE__REVISIONS:
				return ((InternalEList<?>)getRevisions()).basicRemove(otherEnd, msgs);
			case YANGPackage.ABSTRACT_MODULE__STATEMENTS:
				return ((InternalEList<?>)getStatements()).basicRemove(otherEnd, msgs);
			case YANGPackage.ABSTRACT_MODULE__FEATURES:
				return ((InternalEList<?>)getFeatures()).basicRemove(otherEnd, msgs);
			case YANGPackage.ABSTRACT_MODULE__INCLUDE_MODULES:
				return ((InternalEList<?>)getIncludeModules()).basicRemove(otherEnd, msgs);
			case YANGPackage.ABSTRACT_MODULE__DEVIATION:
				return ((InternalEList<?>)getDeviation()).basicRemove(otherEnd, msgs);
			case YANGPackage.ABSTRACT_MODULE__PROPERTIES:
				return ((InternalEList<?>)getProperties()).basicRemove(otherEnd, msgs);
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
			case YANGPackage.ABSTRACT_MODULE__YANG_VERSION:
				return getYangVersion();
			case YANGPackage.ABSTRACT_MODULE__ORGANIZATION:
				return getOrganization();
			case YANGPackage.ABSTRACT_MODULE__CONTACT:
				return getContact();
			case YANGPackage.ABSTRACT_MODULE__DESCRIPTION:
				return getDescription();
			case YANGPackage.ABSTRACT_MODULE__REFERENCE:
				return getReference();
			case YANGPackage.ABSTRACT_MODULE__IMPORTS:
				return getImports();
			case YANGPackage.ABSTRACT_MODULE__REVISIONS:
				return getRevisions();
			case YANGPackage.ABSTRACT_MODULE__STATEMENTS:
				return getStatements();
			case YANGPackage.ABSTRACT_MODULE__FEATURES:
				return getFeatures();
			case YANGPackage.ABSTRACT_MODULE__INCLUDE_MODULES:
				return getIncludeModules();
			case YANGPackage.ABSTRACT_MODULE__DEVIATION:
				return getDeviation();
			case YANGPackage.ABSTRACT_MODULE__PROPERTIES:
				return getProperties();
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
			case YANGPackage.ABSTRACT_MODULE__YANG_VERSION:
				setYangVersion((Integer)newValue);
				return;
			case YANGPackage.ABSTRACT_MODULE__ORGANIZATION:
				setOrganization((String)newValue);
				return;
			case YANGPackage.ABSTRACT_MODULE__CONTACT:
				setContact((String)newValue);
				return;
			case YANGPackage.ABSTRACT_MODULE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case YANGPackage.ABSTRACT_MODULE__REFERENCE:
				setReference((String)newValue);
				return;
			case YANGPackage.ABSTRACT_MODULE__IMPORTS:
				getImports().clear();
				getImports().addAll((Collection<? extends Import>)newValue);
				return;
			case YANGPackage.ABSTRACT_MODULE__REVISIONS:
				getRevisions().clear();
				getRevisions().addAll((Collection<? extends Revision>)newValue);
				return;
			case YANGPackage.ABSTRACT_MODULE__STATEMENTS:
				getStatements().clear();
				getStatements().addAll((Collection<? extends ModuleStatement>)newValue);
				return;
			case YANGPackage.ABSTRACT_MODULE__FEATURES:
				getFeatures().clear();
				getFeatures().addAll((Collection<? extends Feature>)newValue);
				return;
			case YANGPackage.ABSTRACT_MODULE__INCLUDE_MODULES:
				getIncludeModules().clear();
				getIncludeModules().addAll((Collection<? extends Include>)newValue);
				return;
			case YANGPackage.ABSTRACT_MODULE__DEVIATION:
				getDeviation().clear();
				getDeviation().addAll((Collection<? extends Deviation>)newValue);
				return;
			case YANGPackage.ABSTRACT_MODULE__PROPERTIES:
				getProperties().clear();
				getProperties().addAll((Collection<? extends Property>)newValue);
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
			case YANGPackage.ABSTRACT_MODULE__YANG_VERSION:
				setYangVersion(YANG_VERSION_EDEFAULT);
				return;
			case YANGPackage.ABSTRACT_MODULE__ORGANIZATION:
				setOrganization(ORGANIZATION_EDEFAULT);
				return;
			case YANGPackage.ABSTRACT_MODULE__CONTACT:
				setContact(CONTACT_EDEFAULT);
				return;
			case YANGPackage.ABSTRACT_MODULE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case YANGPackage.ABSTRACT_MODULE__REFERENCE:
				setReference(REFERENCE_EDEFAULT);
				return;
			case YANGPackage.ABSTRACT_MODULE__IMPORTS:
				getImports().clear();
				return;
			case YANGPackage.ABSTRACT_MODULE__REVISIONS:
				getRevisions().clear();
				return;
			case YANGPackage.ABSTRACT_MODULE__STATEMENTS:
				getStatements().clear();
				return;
			case YANGPackage.ABSTRACT_MODULE__FEATURES:
				getFeatures().clear();
				return;
			case YANGPackage.ABSTRACT_MODULE__INCLUDE_MODULES:
				getIncludeModules().clear();
				return;
			case YANGPackage.ABSTRACT_MODULE__DEVIATION:
				getDeviation().clear();
				return;
			case YANGPackage.ABSTRACT_MODULE__PROPERTIES:
				getProperties().clear();
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
			case YANGPackage.ABSTRACT_MODULE__YANG_VERSION:
				return yangVersion != YANG_VERSION_EDEFAULT;
			case YANGPackage.ABSTRACT_MODULE__ORGANIZATION:
				return ORGANIZATION_EDEFAULT == null ? organization != null : !ORGANIZATION_EDEFAULT.equals(organization);
			case YANGPackage.ABSTRACT_MODULE__CONTACT:
				return CONTACT_EDEFAULT == null ? contact != null : !CONTACT_EDEFAULT.equals(contact);
			case YANGPackage.ABSTRACT_MODULE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case YANGPackage.ABSTRACT_MODULE__REFERENCE:
				return REFERENCE_EDEFAULT == null ? reference != null : !REFERENCE_EDEFAULT.equals(reference);
			case YANGPackage.ABSTRACT_MODULE__IMPORTS:
				return imports != null && !imports.isEmpty();
			case YANGPackage.ABSTRACT_MODULE__REVISIONS:
				return revisions != null && !revisions.isEmpty();
			case YANGPackage.ABSTRACT_MODULE__STATEMENTS:
				return statements != null && !statements.isEmpty();
			case YANGPackage.ABSTRACT_MODULE__FEATURES:
				return features != null && !features.isEmpty();
			case YANGPackage.ABSTRACT_MODULE__INCLUDE_MODULES:
				return includeModules != null && !includeModules.isEmpty();
			case YANGPackage.ABSTRACT_MODULE__DEVIATION:
				return deviation != null && !deviation.isEmpty();
			case YANGPackage.ABSTRACT_MODULE__PROPERTIES:
				return properties != null && !properties.isEmpty();
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
		result.append(" (yangVersion: ");
		result.append(yangVersion);
		result.append(", organization: ");
		result.append(organization);
		result.append(", contact: ");
		result.append(contact);
		result.append(", description: ");
		result.append(description);
		result.append(", reference: ");
		result.append(reference);
		result.append(')');
		return result.toString();
	}

} //AbstractModuleImpl
