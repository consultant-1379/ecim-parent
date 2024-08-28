/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package imm.util;

import imm.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see imm.ImmPackage
 * @generated
 */
public class ImmAdapterFactory extends AdapterFactoryImpl {
    /**
     * The cached model package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static ImmPackage modelPackage;

    /**
     * Creates an instance of the adapter factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ImmAdapterFactory() {
        if (modelPackage == null) {
            modelPackage = ImmPackage.eINSTANCE;
        }
    }

    /**
     * Returns whether this factory is applicable for the type of the object.
     * <!-- begin-user-doc -->
     * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
     * <!-- end-user-doc -->
     * @return whether this factory is applicable for the type of the object.
     * @generated
     */
    @Override
    public boolean isFactoryForType(Object object) {
        if (object == modelPackage) {
            return true;
        }
        if (object instanceof EObject) {
            return ((EObject)object).eClass().getEPackage() == modelPackage;
        }
        return false;
    }

    /**
     * The switch that delegates to the <code>createXXX</code> methods.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ImmSwitch<Adapter> modelSwitch =
        new ImmSwitch<Adapter>() {
            @Override
            public Adapter caseAttrDef(AttrDef object) {
                return createAttrDefAdapter();
            }
            @Override
            public Adapter caseAttrType(AttrType object) {
                return createAttrTypeAdapter();
            }
            @Override
            public Adapter caseClassDef(ClassDef object) {
                return createClassDefAdapter();
            }
            @Override
            public Adapter caseDocumentRoot(DocumentRoot object) {
                return createDocumentRootAdapter();
            }
            @Override
            public Adapter caseIMMContentsType(IMMContentsType object) {
                return createIMMContentsTypeAdapter();
            }
            @Override
            public Adapter caseObjectDef(ObjectDef object) {
                return createObjectDefAdapter();
            }
            @Override
            public Adapter caseRdnDef(RdnDef object) {
                return createRdnDefAdapter();
            }
            @Override
            public Adapter defaultCase(EObject object) {
                return createEObjectAdapter();
            }
        };

    /**
     * Creates an adapter for the <code>target</code>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param target the object to adapt.
     * @return the adapter for the <code>target</code>.
     * @generated
     */
    @Override
    public Adapter createAdapter(Notifier target) {
        return modelSwitch.doSwitch((EObject)target);
    }


    /**
     * Creates a new adapter for an object of class '{@link imm.AttrDef <em>Attr Def</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see imm.AttrDef
     * @generated
     */
    public Adapter createAttrDefAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link imm.AttrType <em>Attr Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see imm.AttrType
     * @generated
     */
    public Adapter createAttrTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link imm.ClassDef <em>Class Def</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see imm.ClassDef
     * @generated
     */
    public Adapter createClassDefAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link imm.DocumentRoot <em>Document Root</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see imm.DocumentRoot
     * @generated
     */
    public Adapter createDocumentRootAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link imm.IMMContentsType <em>IMM Contents Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see imm.IMMContentsType
     * @generated
     */
    public Adapter createIMMContentsTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link imm.ObjectDef <em>Object Def</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see imm.ObjectDef
     * @generated
     */
    public Adapter createObjectDefAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link imm.RdnDef <em>Rdn Def</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see imm.RdnDef
     * @generated
     */
    public Adapter createRdnDefAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for the default case.
     * <!-- begin-user-doc -->
     * This default implementation returns null.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @generated
     */
    public Adapter createEObjectAdapter() {
        return null;
    }

} //ImmAdapterFactory
