package com.ericsson.ecim.umlmod.custom;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.DataType;
import org.eclipse.uml2.uml.Generalization;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Property;

import com.ericsson.ecim.umlmod.UmlModActivator;
import com.ericsson.ecim.umlmod.UmlUtilBase;

public class BigModelGenerator extends UmlUtilBase {

    private static final String ECIM_MOM = "EcimMom";
    private static final int NUMBER_OF_ATTRIBUTES = 25;
    private static final int NUMBER_OF_TYPES = 150;

    public BigModelGenerator(Model model) {
        super(model);
    }

    public BigModelGenerator() {
        super();
    }

    @Override
    public void run() {
        try {
            Package classPackage = model.createNestedPackage("BigMom");
            applyStereotype(getEcimBaseProfile().getOwnedStereotype(ECIM_MOM), classPackage);
            setProperty(getEcimBaseProfile().getOwnedStereotype(ECIM_MOM), classPackage, "version", "1");
            setProperty(getEcimBaseProfile().getOwnedStereotype(ECIM_MOM), classPackage, "release", "1");

            Class myRoot = classPackage.createOwnedClass("BigRoot", false);
            applyStereotype(getEcimBaseProfile().getOwnedStereotype("EcimRootMoClass"), myRoot);

            Class myAbstractType = classPackage.createOwnedClass("BigAbstract", true);
            applyStereotype(getEcimBaseProfile().getOwnedStereotype("EcimAbstractMoClass"), myAbstractType);

            // The get(0) assumes there is only one imported package named
            // "EcimDataTypes"
            DataType ecimString = (DataType) model.getImportedPackages().get(0).getMember("EcimString");
            Property myRootId = myRoot.createOwnedAttribute("bigRootId", ecimString, 1, 1);
            applyStereotype(getEcimBaseProfile().getOwnedStereotype("EcimKeyAttribute"), myRootId);
            myRootId.setIsReadOnly(true);

            for (int i = 0; i < NUMBER_OF_TYPES; i++) {
                Class myClass = classPackage.createOwnedClass("Class_" + i, false);
                applyStereotype(getEcimBaseProfile().getOwnedStereotype("EcimMoClass"), myClass);
                Property classId = myClass.createOwnedAttribute("classId", ecimString, 1, 1);
                applyStereotype(getEcimBaseProfile().getOwnedStereotype("EcimKeyAttribute"), classId);
                classId.setIsReadOnly(true);
                myClass.createGeneralization(myAbstractType);
                Generalization generalization = myClass.getGeneralization(myAbstractType);
                applyStereotype(getEcimBaseProfile().getOwnedStereotype("EcimGeneralization"), generalization);

                for (int j = 0; j < NUMBER_OF_ATTRIBUTES; j++) {
                    Property prop = myClass.createOwnedAttribute("attribute_" + i + "_" + j, ecimString, 0, 1);
                    applyStereotype(getEcimBaseProfile().getOwnedStereotype("EcimAttribute_RW"), prop);
                }
            }

        } catch (RuntimeException e) {
            logger.log(new Status(IStatus.ERROR, UmlModActivator.PLUGIN_ID, "Exception in SampleModifier", e));
            throw e;
        }

    }
    
    @Override
    public boolean isApplicable() {
        return false;
    }


}
