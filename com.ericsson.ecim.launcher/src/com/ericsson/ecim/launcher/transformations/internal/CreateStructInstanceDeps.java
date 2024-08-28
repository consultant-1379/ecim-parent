package com.ericsson.ecim.launcher.transformations.internal;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.EList;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.InstanceSpecification;
import org.eclipse.uml2.uml.InstanceValue;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Slot;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.ValueSpecification;

import com.ericsson.ecim.umlmod.UmlModActivator;
import com.ericsson.ecim.umlmod.UmlUtilBase;

/**
 * Creates dependency from struct instance to moc instance.
 */
public class CreateStructInstanceDeps extends UmlUtilBase {
    private Stereotype instancePackageStereotype;
    private Stereotype mocInstanceStereotype;
    private Stereotype structInstanceStereotype;

    private List<InstanceSpecification> mocInstances = new ArrayList<InstanceSpecification>();
    private List<InstanceSpecification> structInstances = new ArrayList<InstanceSpecification>();

    public CreateStructInstanceDeps(Model model) {
        super(model);
    }

    public CreateStructInstanceDeps() {
        super();
    }

    @Override
    public void run() {
        lookupAllInstances();
        createDependencies();
    }

    @Override
    public String toString() {
        return "Create Struct Instance Dependencies";
    }

    @Override
    public String getConfirmationMessage() {
        return "All struct instances must have a dependency to the MO instance that has a slot with it as value. This utility creates these dependencies.";
    }

    /**
     * Migrates the model to latest meta model guidelines.
     */
    private void lookupAllInstances() {
        instancePackageStereotype = getEcimBaseProfile().getOwnedStereotype("EcimInstances");
        mocInstanceStereotype = getEcimBaseProfile().getOwnedStereotype("EcimMocInstance");
        structInstanceStereotype = getEcimBaseProfile().getOwnedStereotype("EcimStructInstance");

        extractFromPackage(model);
    }

    private void extractFromPackage(Package rootPackage) {
        EList<Package> packages = rootPackage.getNestedPackages();

        for (Package umlPackage : packages) {
            if (umlPackage.isStereotypeApplied(instancePackageStereotype)) {
                extractInstances(umlPackage);
            }
            EList<Package> subPackages = umlPackage.getNestedPackages();
            for (Package subPackage : subPackages) {
                extractFromPackage(subPackage);
            }
        }

    }

    private void extractInstances(Package instancePackage) {
        EList<Element> elements = instancePackage.getOwnedElements();
        for (Element e : elements) {
            if (e.isStereotypeApplied(mocInstanceStereotype)) {
                mocInstances.add((InstanceSpecification) e);
            }
            if (e.isStereotypeApplied(structInstanceStereotype)) {
                structInstances.add((InstanceSpecification) e);
            }
        }
    }

    /**
     * This modifier makes association's ends have the same visibility property as the association
     */
    private void createDependencies() {
        try {
            // for each moc instance, look up a slot pointing to a struct instance
            // then for this struct instance create a dependency to the moc instance
            for (InstanceSpecification mocIS : mocInstances) {
                traversalMocIS(mocIS);
            }
        } catch (RuntimeException e) {
            logger.log(new Status(IStatus.ERROR, UmlModActivator.PLUGIN_ID, "Exception in createDependencies", e));
            throw e;
        }
    }

    private void traversalMocIS(InstanceSpecification mocIS) {
        EList<Slot> slots = mocIS.getSlots();
        for (Slot slot : slots) {
            ValueSpecification vs = slot.getValues().get(0);
            if (!(vs instanceof InstanceValue)) {
                continue;
            }
            InstanceSpecification referencedIS = ((InstanceValue) vs).getInstance();
            // lets see if the referencedIS is a struct instance!
            if (structInstances.contains(referencedIS) && referencedIS.getClientDependencies().isEmpty()) {
                // match!! now create a dependency from it to the originating mocIS
                // should check that if size() == 1 that it points to the mocIS
                logger.log(new Status(IStatus.INFO, UmlModActivator.PLUGIN_ID, "Creating dependency from " + referencedIS.getQualifiedName() + " to "
                        + mocIS.getQualifiedName()));
                referencedIS.createDependency(mocIS);
            }
        }
    }

}
