package com.ericsson.ecim.extensions.helpers;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Stereotype;

import com.ericsson.ecim.core.uml.helpers.EcimStereotypeNames;

public class ClassHelper {
    
    private ClassHelper() {
    }
    
    public static Property getKeyAttribute(final Class c) {
        List<Property> attributes = c.getAttributes();
        for (Property attribute : attributes) {
            if (isKeyAttribute(attribute))
                return attribute;
        }
        return null;
    }

    public static boolean isKeyAttribute(final Property p) {
        Stereotype stereotype = p
                .getAppliedStereotype(EcimStereotypeNames.KEY_ATTRIBUTE);
        return stereotype != null;
    }

    public static List<Property> getMandatoryAttributes(Class c) {
        final List<Property> list = new ArrayList<Property>();
        List<Property> attributes = c.getAllAttributes();
        for (Property attribute : attributes) {
            if (attribute.lowerBound() > 0) {
                list.add(attribute);
            }
        }
        return list;
    }

    public static List<Property> getStructMembers(Class c) {
        final List<Property> list = new ArrayList<Property>();
        if (c.getAppliedStereotype(EcimStereotypeNames.STRUCT) != null) {
            List<Property> attributes = c.getAllAttributes();
            for (Property attribute : attributes) {
                list.add(attribute);
            }
        }
        return list;
    }

    public static List<Property> getReadWriteAttributes(
            List<Property> mandatoryAttributes) {
        List<Property> returnList = new ArrayList<Property>(mandatoryAttributes
                .size());

        for (Property attribute : mandatoryAttributes) {
            if (attribute
                    .getAppliedStereotype(EcimStereotypeNames.ATTRIBUTE_MANDATORY_READWRITE) != null
                    || attribute
                            .getAppliedStereotype(EcimStereotypeNames.ATTRIBUTE_READWRITE) != null
                    || attribute
                            .getAppliedStereotype(EcimStereotypeNames.KEY_ATTRIBUTE) != null) {
                returnList.add(attribute);
            }
        }

        return returnList;
    }
}
