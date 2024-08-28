package com.ericsson.ecim.extensions.helpers;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.uml2.uml.Enumeration;
import org.eclipse.uml2.uml.OpaqueExpression;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.ValueSpecification;

import com.ericsson.ecim.core.uml.helpers.DataTypeChecker;
import com.ericsson.ecim.core.uml.helpers.EcimStereotypeNames;

public class InstanceHelper {

    private InstanceHelper() {
    }

    public static EClass getLiteralType(Type attributeType, ValueSpecification defaultValue) {

        if (defaultValue != null && defaultValue instanceof OpaqueExpression) {
            return UMLPackage.eINSTANCE.getOpaqueExpression();
        }
        
        return returnWithoutDefault(attributeType);
    }

    private static EClass returnWithoutDefault(Type attributeType) {
        if (attributeType instanceof org.eclipse.uml2.uml.Class || attributeType instanceof Enumeration) {
            return UMLPackage.eINSTANCE.getInstanceValue();
        }
        if (attributeType.getAppliedStereotype(EcimStereotypeNames.DERIVED_NUMERIC) != null) {
            return UMLPackage.eINSTANCE.getLiteralInteger();
        }
        if (attributeType.getAppliedStereotype(EcimStereotypeNames.DERIVED_STRING) != null) {
            return UMLPackage.eINSTANCE.getLiteralString();
        }

        return returnEcimDataType(attributeType);
    }

    private static EClass returnEcimDataType(Type attributeType) {
        String typeName = DataTypeChecker.getParentDataType(attributeType);
        if ("EcimString".equals(typeName)) {
            return UMLPackage.eINSTANCE.getLiteralString();
        }
        if ("EcimBoolean".equals(typeName)) {
            return UMLPackage.eINSTANCE.getLiteralBoolean();
        }
        if ("EcimFloat".equals(typeName)) {
            return UMLPackage.eINSTANCE.getOpaqueExpression();
        }
        Matcher m = Pattern.compile("EcimU?Int\\d+").matcher(typeName);
        if (m.matches()) {
            return UMLPackage.eINSTANCE.getLiteralInteger();
        }
        return null;
    }
}
