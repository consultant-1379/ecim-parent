package com.ericsson.ecim.umlmod.custom;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.DataType;
import org.eclipse.uml2.uml.InstanceSpecification;
import org.eclipse.uml2.uml.LiteralString;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Slot;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.ValueSpecification;

import com.ericsson.ecim.umlmod.UmlModActivator;
import com.ericsson.ecim.umlmod.UmlUtilBase;

public class SampleModifier extends UmlUtilBase {

    private static final String ECIM_MOM = "EcimMom";

    public SampleModifier() {
        super();
    }

    public SampleModifier(Model model) {
        super(model);
    }

    @Override
    public boolean isApplicable() {
        return false;
    }

    @Override
    public void run() {
        try {
            Package classPackage = model.createNestedPackage("MyClassPackage");
            applyStereotype(getEcimBaseProfile().getOwnedStereotype(ECIM_MOM), classPackage);
            setProperty(getEcimBaseProfile().getOwnedStereotype(ECIM_MOM), classPackage, "version", "1");
            setProperty(getEcimBaseProfile().getOwnedStereotype(ECIM_MOM), classPackage, "release", "1");

            Class myRoot = classPackage.createOwnedClass("MyRoot", false);
            applyStereotype(getEcimBaseProfile().getOwnedStereotype("EcimRootMoClass"), myRoot);
            DataType ecimString = (DataType) model.getImportedPackages().get(0).getMember("EcimString");
            Property myRootId = myRoot.createOwnedAttribute("myRootId", ecimString, 1, 1);
            myRootId.setIsReadOnly(true);
            applyStereotype(getEcimBaseProfile().getOwnedStereotype("EcimKeyAttribute"), myRootId);

            Package instancePackage = model.createNestedPackage("MyInstancePackage");
            applyStereotype(getEcimBaseProfile().getOwnedStereotype("EcimInstances"), instancePackage);

            InstanceSpecification is = UMLFactory.eINSTANCE.createInstanceSpecification();
            is.setName("MyRootInstance");
            is.getClassifiers().add(myRoot);
            instancePackage.getPackagedElements().add(is);
            applyStereotype(getEcimBaseProfile().getOwnedStereotype("EcimMocInstance"), is);

            Slot keySlot = is.createSlot();
            keySlot.setDefiningFeature(myRootId);
            ValueSpecification valSpec = keySlot.createValue(null, myRootId.getType(),
                    org.eclipse.uml2.uml.UMLPackage.eINSTANCE.getLiteralString());
            ((LiteralString) valSpec).setValue("1");

        } catch (RuntimeException e) {
            logger.log(new Status(IStatus.ERROR, UmlModActivator.PLUGIN_ID, "Exception in SampleModifier", e));
            throw e;
        }

    }

}
