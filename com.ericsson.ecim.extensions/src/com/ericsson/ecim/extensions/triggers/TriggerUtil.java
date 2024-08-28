package com.ericsson.ecim.extensions.triggers;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.uml2.uml.InstanceSpecification;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.Stereotype;

import com.ericsson.ecim.core.uml.helpers.EcimStereotypeNames;

public class TriggerUtil {

    private TriggerUtil() {
    }
    
    static org.eclipse.uml2.uml.Class getUmlClass(Notification notification) {
        if (!(notification.getNewValue() instanceof org.eclipse.uml2.uml.Class))
            return null;
    
        final org.eclipse.uml2.uml.Class c = (org.eclipse.uml2.uml.Class) notification.getNewValue();
    
        if (c == null)
            return null;
        return c;
    }

    static org.eclipse.uml2.uml.Class getUmlClass(Notification notification, final InstanceSpecification is) {
        if (!(notification.getNewValue() instanceof org.eclipse.uml2.uml.Class))
            return null;
    
        final org.eclipse.uml2.uml.Class c = (org.eclipse.uml2.uml.Class) notification.getNewValue();
    
        if (c == null)
            return null;
    
        final Stereotype appliedMocInstanceStereotype = is.getAppliedStereotype(EcimStereotypeNames.MOC_INSTANCE);
    
        // We shouldn't apply the Stereotype if someone has already been so friendly to us, and already applied it
        if (appliedMocInstanceStereotype != null)
            return null;
    
        final Stereotype appliedStructInstanceStereotype = is.getAppliedStereotype(EcimStereotypeNames.STRUCT_INSTANCE);
    
        // We shouldn't apply the Stereotype if someone has already been so friendly to us, and already applied it
        if (appliedStructInstanceStereotype != null)
            return null;
        return c;
    }

    static InstanceSpecification getInstanceSpecification(Notification notification) {
        if (notification.getEventType() != Notification.ADD)
            return null;
    
        Object notifier = notification.getNotifier();
    
        if (!(notifier instanceof InstanceSpecification))
            return null;
    
        final InstanceSpecification is = (InstanceSpecification) notifier;
        Model model = is.getModel();
    
        if (model == null)
            return null;
    
        Stereotype modelStereotype = model.getAppliedStereotype(EcimStereotypeNames.MODEL);
    
        if (modelStereotype == null)
            return null;
        return is;
    }

    static Stereotype getInstanceSpecificationStereotype(final InstanceSpecification is, final org.eclipse.uml2.uml.Class c) {
        // Check if class is a MOC or Struct and decide instanceStereotype based on that
        Stereotype tmpInstanceSpecification = null;
        EList<Stereotype> classSterotypes = c.getAppliedStereotypes();
        for (Stereotype s : classSterotypes) {
            // I know these strings are kind of magic numbers, please forgive me. My only excuse
            // is that the trigger code begs for a larger refactoring anyway.
            if (s.getName().contains("EcimMoClass") || s.getName().contains("EcimRootMoClass")) {
                tmpInstanceSpecification = is.getApplicableStereotype(EcimStereotypeNames.MOC_INSTANCE);
            } else if (s.getName().contains("EcimStruct")) {
                tmpInstanceSpecification = is.getApplicableStereotype(EcimStereotypeNames.STRUCT_INSTANCE);
            }
        }
    
        return tmpInstanceSpecification;
    }

}
