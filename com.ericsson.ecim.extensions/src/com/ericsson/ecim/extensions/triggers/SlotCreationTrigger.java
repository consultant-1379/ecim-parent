package com.ericsson.ecim.extensions.triggers;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.ILog;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.TriggerListener;
import org.eclipse.emf.workspace.EMFOperationCommand;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.commands.core.command.AbstractTransactionalCommand;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.EnumerationLiteral;
import org.eclipse.uml2.uml.InstanceSpecification;
import org.eclipse.uml2.uml.InstanceValue;
import org.eclipse.uml2.uml.LiteralBoolean;
import org.eclipse.uml2.uml.LiteralInteger;
import org.eclipse.uml2.uml.LiteralString;
import org.eclipse.uml2.uml.OpaqueExpression;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Slot;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.ValueSpecification;

import com.ericsson.ecim.core.exceptions.EcimException;
import com.ericsson.ecim.core.helpers.UIHelper;
import com.ericsson.ecim.extensions.ExtensionsActivator;
import com.ericsson.ecim.extensions.helpers.ClassHelper;
import com.ericsson.ecim.extensions.helpers.InstanceHelper;

public final class SlotCreationTrigger extends TriggerListener {

    private static final ILog ILOG = ExtensionsActivator.getDefault().getLog();

    /*
     * This trigger should activate all Slots (including inherited ones) where the defining Feature is if Mandatory
     * type. If there is a default value, it should be assigned, otherwise the value is left empty
     */
    @Override
    protected Command trigger(TransactionalEditingDomain domain, Notification notification) {
        try {
            final InstanceSpecification is = TriggerUtil.getInstanceSpecification(notification);
            if (is == null) {
                return null;
            }

            final org.eclipse.uml2.uml.Class c = TriggerUtil.getUmlClass(notification);
            if (c == null) {
                return null;
            }

            return new EMFOperationCommand(domain, new SlotCreationCommand(domain, "Auto-creating slots", is, c));
        } catch (Exception e) {
            ILOG.log(new Status(IStatus.ERROR, ExtensionsActivator.PLUGIN_ID, "Exception during Slot Creation Trigger execution evaluation", e));
        }
        return null;
    }

    private static class SlotCreationCommand extends AbstractTransactionalCommand {

        private InstanceSpecification is;
        private org.eclipse.uml2.uml.Class clazz;

        public SlotCreationCommand(TransactionalEditingDomain domain, String label, InstanceSpecification is, org.eclipse.uml2.uml.Class c) {
            super(domain, label, null);
            this.is = is;
            this.clazz = c;
        }

        @Override
        protected CommandResult doExecuteWithResult(IProgressMonitor monitor, IAdaptable info) throws ExecutionException {
            try {
                // This list will include the Key Attribute
                final List<Property> mandatoryAttributes = ClassHelper.getMandatoryAttributes(clazz);
                final List<Property> structMembers = ClassHelper.getStructMembers(clazz);
                final List<Property> toBeCreatedAttributes = ClassHelper.getReadWriteAttributes(mandatoryAttributes);

                final List<Slot> slots = is.getSlots();

                List<Property> toBeAdded = null;
                if (!structMembers.isEmpty()) {
                    toBeAdded = new ArrayList<Property>(structMembers);
                } else {
                    toBeAdded = new ArrayList<Property>(toBeCreatedAttributes);
                }

                // Sort out the ones that are already activated
                for (Slot s : slots) {
                    if (toBeAdded.contains(s.getDefiningFeature())) {
                        toBeAdded.remove(s.getDefiningFeature());
                    }
                }
                // Create Slots for required Attributes
                for (Property addAttribute : toBeAdded) {
                    Type attributeType = addAttribute.getType();
                    if (attributeType == null) {
                        ILOG.log(new Status(IStatus.ERROR, ExtensionsActivator.PLUGIN_ID, "The Slot for Property \"" + addAttribute.getQualifiedName()
                                + "\" could not be activated, because it has no Type"));
                        continue;
                    }
                    Slot newSlot = is.createSlot();
                    newSlot.setDefiningFeature(addAttribute);

                    addValue(newSlot, addAttribute);
                }
            } catch (Exception e) {
                ILOG.log(new Status(IStatus.ERROR, ExtensionsActivator.PLUGIN_ID, "Exception during Slot Creation Trigger execution", e));
                return CommandResult.newWarningCommandResult("Slot Creation Trigger Execution caused Exception", null);
            }
            return CommandResult.newOKCommandResult();
        }

        private void addValue(Slot slot, Property addAttribute) throws EcimException {
            ValueSpecification defaultVal = addAttribute.getDefaultValue();

            if ((defaultVal != null && !defaultVal.isNull()) || ClassHelper.isKeyAttribute(addAttribute)) {
                Type attributeType = addAttribute.getType();
                EClass literalType = InstanceHelper.getLiteralType(attributeType, defaultVal);

                if (ClassHelper.isKeyAttribute(addAttribute)) {
                    // Key attributes should always have String
                    // Classifiers, and no deafultValue, so we give
                    // them "1"
                    ValueSpecification valSpec = slot.createValue(null, attributeType, literalType);
                    if (valSpec instanceof LiteralString) {
                        ((LiteralString) valSpec).setValue("1");
                    }
                } else {
                    // This code should normally not run, so it's
                    // been commented out for the time being,
                    // to avoid unnecessary bugs
                    handleAddAttribute(slot, addAttribute, defaultVal, attributeType, literalType);
                }
            }
        }

        private void handleAddAttribute(Slot slot, Property addAttribute, ValueSpecification defaultVal, Type attributeType, EClass literalType)
                throws EcimException {
            for (int i = 1; i <= ((addAttribute.lowerBound() == 0) ? 1 : addAttribute.lowerBound()); i++) {
                ValueSpecification valSpec = slot.createValue(null, attributeType, literalType);

                applyDefaultValue(slot, addAttribute, defaultVal, valSpec);
            }
        }

        private void applyDefaultValue(Slot slot, Property addAttribute, ValueSpecification defaultVal, ValueSpecification valSpec) throws EcimException {
            if (valSpec instanceof LiteralInteger) {
                int litInt = defaultVal.integerValue();
                ((LiteralInteger) valSpec).setValue(litInt);
            } else if (valSpec instanceof LiteralBoolean) {
                boolean litBool = defaultVal.booleanValue();
                ((LiteralBoolean) valSpec).setValue(litBool);
            } else if (valSpec instanceof LiteralString) {
                ((LiteralString) valSpec).setValue(defaultVal.stringValue());
            } else if (valSpec instanceof OpaqueExpression) {
                ((OpaqueExpression) valSpec).getBodies().add(defaultVal.stringValue());
            } else if (valSpec instanceof InstanceValue) {
                // handle special case when the attribute's defaultValue is not an instance of
                // InstanceValue
                if (defaultVal instanceof LiteralString) {
                    // removes empty value from slot
                    valSpec.destroy();
                    // copy all string values from attribute's default value into slot as
                    // EnumerationLiteral/InstanceValue
                    addEnumerationLiteralsToSlot(slot, addAttribute, defaultVal);
                } else {
                    // user provided a single enumeration as InstanceValue
                    InstanceSpecification instSpec = ((InstanceValue) defaultVal).getInstance();
                    ((InstanceValue) valSpec).setInstance(instSpec);
                }
            }
        }

        /**
         * Copies all values from a given value specification structure into a slot as EnumerationLiteral/InstanceValue
         * 
         * @param slot
         *            the target slot we want to add the enumeration literals
         * @param addAttribute
         *            the attribute's properties that provide useful information about the Enumeration we are using
         * @param defaultVal
         *            the data container where the enumLiterals are stored
         */
        private void addEnumerationLiteralsToSlot(Slot slot, Property addAttribute, ValueSpecification defaultVal) throws EcimException {

            // retrieves all enumeration literal that belong to enumeration
            List<Element> listOfAllEnumLiterals = addAttribute.getType().getOwnedElements();

            // retrieves all enumeration literal defined in defaultValue box
            String[] arrayOfSelectedEnumLiterals = null;
            String defaultValueLitStr = ((LiteralString) defaultVal).getValue();
            if (defaultValueLitStr.contains(",")) {
                // multiple values
                arrayOfSelectedEnumLiterals = ((LiteralString) defaultVal).getValue().split(",");
            } else {
                // single value
                arrayOfSelectedEnumLiterals = new String[1];
                arrayOfSelectedEnumLiterals[0] = defaultValueLitStr;
            }

            // checks that each value is valid
            for (String selectedEnumLiteral : arrayOfSelectedEnumLiterals) {

                // flag that tells whether a certain value is part of enumeration
                boolean invalidEnumLiteral = true;

                // try to match with any value in the enumeration
                for (Element e : listOfAllEnumLiterals) {
                    String enumLiteralName = ((EnumerationLiteral) e).getName();
                    if (selectedEnumLiteral.equals(enumLiteralName)) {
                        // creates new entry in slot
                        ValueSpecification vs = slot.createValue(null, addAttribute.getType(), UMLPackage.eINSTANCE.getInstanceValue());
                        // adds enum literal to that entry
                        ((InstanceValue) vs).setInstance((InstanceSpecification) e);
                        // move to next element
                        invalidEnumLiteral = false;
                        break;
                    }
                }

                // checks whether provided value is invalid, if so returns error immediately
                if (invalidEnumLiteral) {
                    // display error message to warn the user
                    String title = "Problem Occurred";
                    String errorMessage = "Exception during Slot Creation:\n" + addAttribute.getQualifiedName() + " (Enumeration literal '"
                            + selectedEnumLiteral + "' " + "doesn't exist in " + addAttribute.getType().getName() + ").";
                    UIHelper.popupErrorMessage(ExtensionsActivator.PLUGIN_ID, title, errorMessage);
                    // throw exception to interrupt further operations
                    throw new EcimException(errorMessage);
                }
            }
        }

    }

}