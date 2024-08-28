package com.ericsson.ecim.umlmod.custom;

import org.apache.log4j.Logger;
import org.eclipse.core.runtime.Assert;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.EList;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Dependency;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.InstanceSpecification;
import org.eclipse.uml2.uml.InstanceValue;
import org.eclipse.uml2.uml.LiteralBoolean;
import org.eclipse.uml2.uml.LiteralInteger;
import org.eclipse.uml2.uml.LiteralString;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Slot;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.ValueSpecification;

import com.ericsson.ecim.umlmod.UmlModActivator;
import com.ericsson.ecim.umlmod.UmlUtilBase;

/**
 * Generates a number of FmAlarmType objects.
 * 
 * @author erajaik
 *
 */
public class FmAlarmTypeObjectGenerator extends UmlUtilBase {

    private static final Logger LOGGER = Logger.getLogger(FmAlarmTypeObjectGenerator.class);

    public FmAlarmTypeObjectGenerator(Model model) {
        super(model);
    }

    public FmAlarmTypeObjectGenerator() {
        super();
    }

    @Override
    public String toString() {
        return "Generate FM Alarm Type Objects";
    }

    @Override
    public String getConfirmationMessage() {
        return "The generator expects the model to contain an FmAlarmType object named 'FmAlarmTypeObjectTemplate'. Do you want to proceed?";
    }

    @Override
    public boolean isApplicable() {
        return true;
    }

    /**
     * Change this method to create other FmAlarmType objects, by for example reading an external file with alarm types.
     */
    @Override
    public void run() throws Exception {
        try {

            InstanceSpecification fmAlarmObjectTemplate = lookupFmAlarmObjectTemplate(model);

            Assert.isNotNull(fmAlarmObjectTemplate);

            createFmAlarmTypeObject(fmAlarmObjectTemplate, "FmAlarmTypeX", 193, 77777, 418, "My Specific Problem X", true);
            createFmAlarmTypeObject(fmAlarmObjectTemplate, "FmAlarmTypeY", 193, 44444, 418, "My Specific Problem Y", true);
            createFmAlarmTypeObject(fmAlarmObjectTemplate, "FmAlarmTypeZ", 193, 33333, 418, "My Specific Problem Z", false);
            createFmAlarmTypeObject(fmAlarmObjectTemplate, "FmAlarmTypeQ", 193, 22222, 418, "My Specific Problem Q", true);
            createFmAlarmTypeObject(fmAlarmObjectTemplate, "FmAlarmTypeW", 391, 11111, 418, "My Specific Problem W", true);

        } catch (RuntimeException e) {
            logger.log(new Status(IStatus.ERROR, UmlModActivator.PLUGIN_ID, "Exception in FmAlarmTypeObjectGenerator", e));
            throw e;
        }

    }

    /**
     * Looks up the template FmAlarmType object. It is required that an object named "FmAlarmTypeObjectTemplate" has
     * been defined in an EcimInstances package placed directly under the model.
     * 
     * @param model
     * @return
     */
    InstanceSpecification lookupFmAlarmObjectTemplate(Model model) {

        EList<Package> packages = model.getNestedPackages();
        final Stereotype ecimInstancePackage = getEcimBaseProfile().getOwnedStereotype("EcimInstances");
        final Stereotype ecimInstance = getEcimBaseProfile().getOwnedStereotype("EcimMocInstance");

        for (Package umlPackage : packages) {
            if (!umlPackage.isStereotypeApplied(ecimInstancePackage)) {
                continue;
            }
            EList<Element> elements = umlPackage.getOwnedElements();
            for (Element e : elements) {
                if (!e.isStereotypeApplied(ecimInstance)) {
                    continue;
                }
                InstanceSpecification result = (InstanceSpecification) e;
                if ("FmAlarmTypeObjectTemplate".equals(result.getName())) {
                    LOGGER.info("Found FmAlarmTypeObjectTemplate!");
                    return result;
                }
            }
        }

        return null;
    }

    /**
     * Creates an FmAlarmType object with the values specified in the parameter list. The eventType value is taken from
     * the template. This too can be configurable, but I was too lazy to do it right now.
     * 
     * @param fmAlarmObjectTemplate
     * @param id
     * @param majorType
     * @param minorType
     * @param probableCause
     * @param specificProblem
     * @param isStateful
     */
    void createFmAlarmTypeObject(InstanceSpecification fmAlarmObjectTemplate, String id, int majorType, int minorType, int probableCause,
            String specificProblem, boolean isStateful) {

        Classifier classifier = fmAlarmObjectTemplate.getClassifiers().get(0);
        Package instancePackage = fmAlarmObjectTemplate.getNearestPackage();

        InstanceSpecification is = createObject(id, classifier, instancePackage);

        Dependency dependency = fmAlarmObjectTemplate.getClientDependency(null);
        is.createDependency(dependency.getSupplier(null));
        final Stereotype ecimInstanceDependency = getEcimBaseProfile().getOwnedStereotype("EcimInstanceDependency");
        is.getClientDependency(null).applyStereotype(ecimInstanceDependency);

        createSlot("fmAlarmTypeId", is, classifier, id);
        createSlot("majorType", is, classifier, majorType);
        createSlot("minorType", is, classifier, minorType);
        createSlot("specificProblem", is, classifier, specificProblem);
        createSlot("probableCause", is, classifier, probableCause);
        createSlot("isStateful", is, classifier, isStateful);

        // For event type we just take same value as defined in the template
        Slot eventTypeSlot = lookupSlot(fmAlarmObjectTemplate, "eventType");
        if (eventTypeSlot != null) {
            InstanceValue eventInstanceValue = (InstanceValue) eventTypeSlot.getValues().get(0);
            LOGGER.info("eventInstanceValue=" + eventInstanceValue);
            createSlot("eventType", is, classifier, eventInstanceValue.getInstance());
        }
    }

    /**
     * Creates a new object
     * 
     * @param id
     *            the name of object
     * @param classifier
     *            its classifier
     * @param instancePackage
     *            its nearest package
     * @return
     */
    private InstanceSpecification createObject(String id, Classifier classifier, Package instancePackage) {
        InstanceSpecification is = UMLFactory.eINSTANCE.createInstanceSpecification();
        is.setName(id);
        is.getClassifiers().add(classifier);
        instancePackage.getPackagedElements().add(is);
        applyStereotype(getEcimBaseProfile().getOwnedStereotype("EcimMocInstance"), is);
        return is;
    }

    /**
     * Looks up a slot by name.
     * 
     * @param is
     * @param name
     * @return
     */
    private Slot lookupSlot(InstanceSpecification is, String name) {
        EList<Slot> slots = is.getSlots();
        for (Slot slot : slots) {
            if (slot.getDefiningFeature().getName().equals(name)) {
                return slot;
            }
        }
        return null;
    }

    /**
     * Creates a slot.
     * 
     * @param name
     *            the defining feature name of the slot to be created
     * @param is
     *            the template
     * @param classifier
     * @param value
     * @return
     */
    private Slot createSlot(String name, InstanceSpecification is, Classifier classifier, Object value) {
        Slot slot = is.createSlot();
        Property prop = classifier.getAttribute(name, null);
        slot.setDefiningFeature(prop);

        ValueSpecification valSpec = null;
        if (value instanceof String) {
            valSpec = slot.createValue(null, prop.getType(), org.eclipse.uml2.uml.UMLPackage.eINSTANCE.getLiteralString());
            ((LiteralString) valSpec).setValue((String) value);
        } else if (value instanceof Boolean) {
            valSpec = slot.createValue(null, prop.getType(), org.eclipse.uml2.uml.UMLPackage.eINSTANCE.getLiteralBoolean());
            ((LiteralBoolean) valSpec).setValue((Boolean) value);
        } else if (value instanceof Integer) {
            valSpec = slot.createValue(null, prop.getType(), org.eclipse.uml2.uml.UMLPackage.eINSTANCE.getLiteralInteger());
            ((LiteralInteger) valSpec).setValue((Integer) value);
        } else if (value instanceof InstanceSpecification) {
            valSpec = slot.createValue(null, prop.getType(), org.eclipse.uml2.uml.UMLPackage.eINSTANCE.getInstanceValue());
            ((InstanceValue) valSpec).setInstance((InstanceSpecification) value);
        }

        return slot;
    }

}
