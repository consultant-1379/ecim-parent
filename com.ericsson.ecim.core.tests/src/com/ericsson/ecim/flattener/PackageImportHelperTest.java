package com.ericsson.ecim.flattener;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.util.List;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.resource.UMLResource;
import org.junit.BeforeClass;
import org.junit.Test;

public class PackageImportHelperTest {

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
    public void testCount() {
        File modelFile = new File(unitTestResourcePath + "PackageImportModel.uml");
        int importedPackageCount = PackageImportHelper.count(modelFile);
        assertEquals(1, importedPackageCount);
    }

    @Test
    public void testGet() {
        File modelFile = new File(unitTestResourcePath + "PackageImportModel.uml");
        List<String> packageImports = PackageImportHelper.get(modelFile);
        assertEquals(1, packageImports.size());
    }

}
