/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package imm.impl;

import imm.ClassDef;
import imm.IMMContentsType;
import imm.ImmPackage;
import imm.ObjectDef;

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
 * An implementation of the model object '<em><b>IMM Contents Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link imm.impl.IMMContentsTypeImpl#getClass_ <em>Class</em>}</li>
 *   <li>{@link imm.impl.IMMContentsTypeImpl#getObject <em>Object</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IMMContentsTypeImpl extends EObjectImpl implements IMMContentsType {
    /**
     * The cached value of the '{@link #getClass_() <em>Class</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getClass_()
     * @generated
     * @ordered
     */
    protected EList<ClassDef> class_;

    /**
     * The cached value of the '{@link #getObject() <em>Object</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getObject()
     * @generated
     * @ordered
     */
    protected EList<ObjectDef> object;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected IMMContentsTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ImmPackage.eINSTANCE.getIMMContentsType();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<ClassDef> getClass_() {
        if (class_ == null) {
            class_ = new EObjectContainmentEList<ClassDef>(ClassDef.class, this, ImmPackage.IMM_CONTENTS_TYPE__CLASS);
        }
        return class_;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<ObjectDef> getObject() {
        if (object == null) {
            object = new EObjectContainmentEList<ObjectDef>(ObjectDef.class, this, ImmPackage.IMM_CONTENTS_TYPE__OBJECT);
        }
        return object;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case ImmPackage.IMM_CONTENTS_TYPE__CLASS:
                return ((InternalEList<?>)getClass_()).basicRemove(otherEnd, msgs);
            case ImmPackage.IMM_CONTENTS_TYPE__OBJECT:
                return ((InternalEList<?>)getObject()).basicRemove(otherEnd, msgs);
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
            case ImmPackage.IMM_CONTENTS_TYPE__CLASS:
                return getClass_();
            case ImmPackage.IMM_CONTENTS_TYPE__OBJECT:
                return getObject();
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
            case ImmPackage.IMM_CONTENTS_TYPE__CLASS:
                getClass_().clear();
                getClass_().addAll((Collection<? extends ClassDef>)newValue);
                return;
            case ImmPackage.IMM_CONTENTS_TYPE__OBJECT:
                getObject().clear();
                getObject().addAll((Collection<? extends ObjectDef>)newValue);
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
            case ImmPackage.IMM_CONTENTS_TYPE__CLASS:
                getClass_().clear();
                return;
            case ImmPackage.IMM_CONTENTS_TYPE__OBJECT:
                getObject().clear();
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
            case ImmPackage.IMM_CONTENTS_TYPE__CLASS:
                return class_ != null && !class_.isEmpty();
            case ImmPackage.IMM_CONTENTS_TYPE__OBJECT:
                return object != null && !object.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //IMMContentsTypeImpl
