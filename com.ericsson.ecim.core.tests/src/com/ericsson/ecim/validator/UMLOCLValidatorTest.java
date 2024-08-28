package com.ericsson.ecim.validator;

import static org.junit.Assert.fail;

import java.io.File;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.resource.UMLResource;
import org.junit.BeforeClass;
import org.junit.Test;

import com.ericsson.ecim.core.uml.helpers.Uml2ModelHelper;

public class UMLOCLValidatorTest {
    
    private static String unitTestResourcePath;
    
    @BeforeClass
    public static void setUp() {
        Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(UMLResource.FILE_EXTENSION, UMLResource.Factory.INSTANCE);

        EPackage.Registry.INSTANCE.put(UMLResource.UML_METAMODEL_URI, UMLPackage.eINSTANCE);
        EPackage.Registry.INSTANCE.put("http://www.eclipse.org/uml2/2.0.0/UML", UMLPackage.eINSTANCE); //$NON-NLS-1$
        EPackage.Registry.INSTANCE.put("http://www.eclipse.org/uml2/2.1.0/UML", UMLPackage.eINSTANCE); //$NON-NLS-1$
        
        unitTestResourcePath = System.getProperty("user.dir") + "/resources/unittest/";
    }

    @Test
    public void testValidateModel() {
        UMLOCLValidator umloclValidator = new UMLOCLValidator();
        try {
            File modelFile = new File(unitTestResourcePath + "MyModelTest.uml");
            Uml2ModelHelper modelHelper = new Uml2ModelHelper(modelFile, true);
            umloclValidator.validate(modelHelper.loadModel(), null);
        } catch (Exception e) {
            fail(e.getMessage());
        }
    }

}
