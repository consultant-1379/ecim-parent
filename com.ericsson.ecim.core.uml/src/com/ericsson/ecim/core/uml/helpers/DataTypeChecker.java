package com.ericsson.ecim.core.uml.helpers;

import org.eclipse.emf.common.util.EList;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Type;

public class DataTypeChecker {

    private DataTypeChecker() {
    }
    
    /**
     * Checks if there is any parent data type associated with type variable.
     * If that is the case, it means we are handling a derived data type and 
     * the root data type should be used instead
     * 
     * @param type
     *            the type name (can be EcimString, EcimInt32 etc)
     */
    public static String getParentDataType(Type type) {
        String typeName = null;
        EList<Classifier> listOfParents = ((Classifier)type).allParents();
        if(listOfParents.isEmpty()) {
            typeName = type.getName();
        } else {
            // we are assuming that there is only one parent or the last element in the list is the most correct to choose.
            for(Classifier parentDataType : ((Classifier)type).allParents()) {
                typeName = parentDataType.getName();
            }
        }

        return typeName;
    }
}
