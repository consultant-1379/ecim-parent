package com.ericsson.ecim.launcher.transformations.internal;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.eclipse.core.runtime.Assert;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.EList;
import org.eclipse.uml2.uml.AggregationKind;
import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.MultiplicityElement;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.OpaqueExpression;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.VisibilityKind;

import com.ericsson.ecim.umlmod.UmlModActivator;
import com.ericsson.ecim.umlmod.UmlUtilUpgrader;

/**
 * Migrates the model to ECIM Base Profile.
 */
public class UpgradeEcimModel extends UmlUtilUpgrader {

    private static final String IS_SYSTEM_CREATED = "isSystemCreated";
    private static final String IS_RESERVING = "isReserving";
    private static final String IS_ASSOCIATION_END = "isAssociationEnd";

    private Stereotype roRootMOC;
    private Stereotype rwRootMOC;
    private Stereotype roMOC;
    private Stereotype rwMOC;
    private Stereotype roAT;
    private Stereotype rwAT;
    private Stereotype roAttr;
    private Stereotype rwAttr;
    private Stereotype keyAttr;
    private Stereotype structMember;
    private Stereotype ecimBiDirAssociation;
    private Stereotype biDirAssociationEnd;
    private Stereotype ecimReservingAssociation;
    private Stereotype clientAssociationEnd;
    private Stereotype serverAssociationEnd;
    private Stereotype ecimContribution;
    private Stereotype ecimContainment;

    public UpgradeEcimModel(Model model) {
        super(model);
    }

    public UpgradeEcimModel() {
        super();
    }

    @Override
    public void run() {
        super.run();
        fetchOwnedStereotypes();
        migrateModelToEcimMM();
        associationVisibilityModifier();
        fixContributionArrows();
    }

    private void fetchOwnedStereotypes() {
        roRootMOC = getEcimBaseProfile().getOwnedStereotype("EcimRootMoClass_RO");
        rwRootMOC = getEcimBaseProfile().getOwnedStereotype("EcimRootMoClass");
        roMOC = getEcimBaseProfile().getOwnedStereotype("EcimMoClass_RO");
        rwMOC = getEcimBaseProfile().getOwnedStereotype("EcimMoClass");
        roAT = getEcimBaseProfile().getOwnedStereotype("EcimAbstractType_RO");
        rwAT = getEcimBaseProfile().getOwnedStereotype("EcimAbstractMoClass");
        roAttr = getEcimBaseProfile().getOwnedStereotype("EcimAttribute_RO");
        rwAttr = getEcimBaseProfile().getOwnedStereotype("EcimAttribute_RW");
        keyAttr = getEcimBaseProfile().getOwnedStereotype("EcimKeyAttribute");
        structMember = getEcimBaseProfile().getOwnedStereotype("EcimStructMember");
        ecimBiDirAssociation = getEcimBaseProfile().getOwnedStereotype("EcimBiDirAssociation");
        biDirAssociationEnd = getEcimBaseProfile().getOwnedStereotype("EcimBiDirAssociationEnd");
        ecimReservingAssociation = getEcimBaseProfile().getOwnedStereotype("EcimBiDirAssociation_CS");
        clientAssociationEnd = getEcimBaseProfile().getOwnedStereotype("EcimClientAssociationEnd");
        serverAssociationEnd = getEcimBaseProfile().getOwnedStereotype("EcimServerAssociationEnd");
        ecimContribution = getEcimBaseProfile().getOwnedStereotype("EcimContribution");
        ecimContainment = getEcimBaseProfile().getOwnedStereotype("EcimContainment");

        Assert.isNotNull(roRootMOC);
        Assert.isNotNull(rwRootMOC);
        Assert.isNotNull(roMOC);
        Assert.isNotNull(rwMOC);
        Assert.isNotNull(roAT);
        Assert.isNotNull(rwAT);
        Assert.isNotNull(roAttr);
        Assert.isNotNull(rwAttr);
    }

    /**
     * Migrates the model to latest meta model guidelines.
     */
    private void migrateModelToEcimMM() {

        EList<Package> packages = model.getNestedPackages();

        // Fix classes and attributes
        for (Package umlPackage : packages) {

            EList<Element> elements = umlPackage.getOwnedElements();

            for (Element c : elements) {
                if (!(c instanceof Class))
                    continue;
                migrateClassElement(c);
            }
        }

        // Fix associations
        for (Package umlPackage : packages) {
            fixPackageAssociations(umlPackage);
        }
    }

    private void fixPackageAssociations(Package umlPackage) {
        EList<Element> elements = umlPackage.getOwnedElements();
        for (Element c : elements) {
            if (elementIsAppliedToOneOf(c, new Stereotype[] { ecimContainment, ecimContribution })) {
                Association a = (Association) c;
                convertIsSystemCreated(a);
                /*
                 * Upgrading to ET2.12 sets isNotifiable to true unconditionally since it is default in ECIM MM RevC
                 */
                Stereotype target = c.isStereotypeApplied(ecimContainment) ? ecimContainment : ecimContribution;
                setProperty(target, a, "isNotifiable", true);
            } else if (c.isStereotypeApplied(ecimBiDirAssociation)) {
                Association a = (Association) c;
                checkCSBiDir(a);
            }
        }
    }

    private void migrateClassElement(Element c) {
        if (c.isStereotypeApplied(roRootMOC)) {
            switchStereotypeOnClass(c, roRootMOC, rwRootMOC);
            setProperty(rwRootMOC, c, IS_SYSTEM_CREATED, true);
        } else if (c.isStereotypeApplied(roMOC)) {
            switchStereotypeOnClass(c, roMOC, rwMOC);
            setProperty(rwMOC, c, IS_SYSTEM_CREATED, true);
        } else if (c.isStereotypeApplied(roAT)) {
            switchStereotypeOnClass(c, roAT, rwAT);
        } else if (c.isStereotypeApplied(rwMOC) || c.isStereotypeApplied(rwRootMOC)) {
            // Nothing to do
        }

        if (c.isStereotypeApplied(rwMOC)) {
            setProperty(rwMOC, c, "allowContribution", true);
        }
        if (c.isStereotypeApplied(rwRootMOC)) {
            switchStereotypeOnClass(c, rwRootMOC, rwMOC);
            setProperty(rwMOC, c, "isLegacyRoot", true);
        }

        EList<Element> cOwnedElements = c.getOwnedElements();
        for (Element a : cOwnedElements) {
            setPropertyForOwnedElement(a);
        }
    }

    private void setPropertyForOwnedElement(Element a) {
        try {
            if (a instanceof Constraint) {
                handleSchematronConstraint((Constraint) a);
            }
            if (a.isStereotypeApplied(keyAttr)) {
                // Lets wait with this... Doesn't have to be set.
                // The CoreMW transform anyway outputs SA_NOTIFY for all rdn attributes.
            } else if (a.isStereotypeApplied(structMember)) {
                setKeyMultiplicity(a);
            }
            // Check if data type is pointing to EcimMoClass or
            // EcimRootMoClass, then set isAssociationEnd=true
            if (a instanceof Property && elementIsAppliedToOneOf(a, new Stereotype[] { rwAttr, roAttr, structMember })) {
                setPropertyAssociation(a);
            }
        } catch (RuntimeException e) {
            logger.log(new Status(IStatus.ERROR, UmlModActivator.PLUGIN_ID, "Exception in migrateModelToEcimMM() when handling attributes", e));
        }
    }

    private void setKeyMultiplicity(Element a) {
        Object isKey = getProperty(structMember, a, "isKey");
        if (isKey != null && ((Boolean) isKey)) {
            MultiplicityElement mE = (MultiplicityElement) a;
            if (mE.getLower() != 1 || mE.getUpper() != 1) {
                mE.setLower(1);
                mE.setUpper(1);
                logger.log(new Status(IStatus.INFO, UmlModActivator.PLUGIN_ID, "Setting upper and lower to 1 on key struct member "
                        + ((NamedElement) a).getName()));
            }
        }
    }

    private void setPropertyAssociation(Element a) {
        Property p = (Property) a;
        Type t = p.getType();
        if (elementIsAppliedToOneOf(t, new Stereotype[] { rwMOC, rwRootMOC, rwAT })) {
            if (a.isStereotypeApplied(rwAttr)) {
                setProperty(rwAttr, a, IS_ASSOCIATION_END, true);
            } else if (a.isStereotypeApplied(roAttr)) {
                setProperty(roAttr, a, IS_ASSOCIATION_END, true);
            } else if (a.isStereotypeApplied(structMember)) {
                setProperty(structMember, a, IS_ASSOCIATION_END, true);
            }
        }
    }

    /**
     * Identifies if constraint contains schematron code, and if so sets right stereotype and default values.
     * 
     * @param stereotype
     * @param constraint
     */
    private void handleSchematronConstraint(Constraint constraint) {
        final Stereotype stereotype = getEcimBaseProfile().getOwnedStereotype("EcimSchematronConstraint");
        String body = "";
        if (constraint.getSpecification() instanceof OpaqueExpression) {
            OpaqueExpression oe = (OpaqueExpression) constraint.getSpecification();
            if (oe != null && oe.isSetBodies())
                body = oe.getBodies().get(0);
            if (body.contains("schematron")) {
                boolean isStereotypeApplied = constraint.isStereotypeApplied(stereotype);
                applyStereotype(stereotype, constraint);
                if (!isStereotypeApplied || !isValueSet(constraint, stereotype, "interfaceName"))
                    setProperty(stereotype, constraint, "interfaceName", "ECIM_Schematron");
                if (!isStereotypeApplied || !isValueSet(constraint, stereotype, "interfaceVersion"))
                    setProperty(stereotype, constraint, "interfaceVersion", "1.0");

                oe.unsetLanguages();
                oe.getLanguages().add(0, "Schematron");
            }
        }
    }

    private boolean isValueSet(Element e, Stereotype s, String name) {
        Object o = getProperty(s, e, name);
        return o != null && !o.toString().trim().isEmpty();
    }

    /**
     * Sets the canCreate/canDelete properties on EcimContribuiton and EcimContainment associations based on the child
     * class' isSystemCreated value. If isSystemCreated is true then canCreate/canDelete is false, otherwise true.
     * 
     */
    private void convertIsSystemCreated(Association a) {
        Class childClass = null;

        if (a.getMemberEnds().get(0).getAggregation().getValue() == AggregationKind.COMPOSITE) {
            childClass = (Class) a.getMemberEnds().get(0).getType();
        } else {
            childClass = (Class) a.getMemberEnds().get(1).getType();
        }

        if (childClass.isAbstract()) {
            // OK we have a containment where child class is abstract
            // darn, since we cannot easily navigate to implementing classes
            // so for now, just warn that the upgrade has encountered a problem
            logger.log(new Status(
                    IStatus.WARNING,
                    UmlModActivator.PLUGIN_ID,
                    "The association named '"
                            + a.getName()
                            + "' has abstract class as child ("
                            + childClass.getQualifiedName()
                            + "). The setting of canCreate/canDelete could therefore not be derived. Please check for correctness. If isSystemCreated=true, then canCreate/canDelete must be false, and vice versa."));
            return;
        }

        boolean isSystemCreated = (Boolean) getProperty(rwMOC, childClass, IS_SYSTEM_CREATED);
        Stereotype target = a.isStereotypeApplied(ecimContainment) ? ecimContainment : ecimContribution;
        setCanCreateCanDeleteProperties(target, a, isSystemCreated);
    }

    private void setCanCreateCanDeleteProperties(final Stereotype ecimContainmentOrContribution, Association a, boolean isSystemCreated) {
        try {
            boolean canCreate = (Boolean) getProperty(ecimContainmentOrContribution, a, "canCreate");
            boolean canDelete = (Boolean) getProperty(ecimContainmentOrContribution, a, "canDelete");
            // Lets only set property if they have same value. If values are
            // different (a xor b returns true)
            // then do not set them to false because the modeler wants them that
            // way.
            if (!(canCreate ^ canDelete) && isSystemCreated) {
                setProperty(ecimContainmentOrContribution, a, "canCreate", false);
                setProperty(ecimContainmentOrContribution, a, "canDelete", false);
            }
        } catch (Exception e) {
            logger.log(new Status(IStatus.WARNING, UmlModActivator.PLUGIN_ID, "Ignoring setting CanCreateCanDelete properties on " + a.getQualifiedName()
                    + " which could not be get due to " + e));
        }
    }

    private void checkCSBiDir(Association a) {
        try {
            for (Property ae : a.getOwnedEnds()) {
                applyStereotype(biDirAssociationEnd, ae);
            }
            // Check if this bi-dir association is client-server and convert to
            // other stereotypes
            if (a.getOwnedEnds().size() == 2) {
                updateAssociationEndReserving(a);
            }
        } catch (RuntimeException e) {
            logger.log(new Status(IStatus.ERROR, UmlModActivator.PLUGIN_ID, "Exception in checkCSBiDir()", e));
        }
    }

    private void updateAssociationEndReserving(Association a) {
        Property ae1 = a.getOwnedEnds().get(0);
        Property ae2 = a.getOwnedEnds().get(1);
        Boolean isReserving1 = (Boolean) ae1.getValue(biDirAssociationEnd, IS_RESERVING);
        Boolean isReserving2 = (Boolean) ae2.getValue(biDirAssociationEnd, IS_RESERVING);
        if ((isReserving1 || isReserving2) && !(isReserving1 && isReserving2)) {
            // We have a client-server style bi-dir association
            a.unapplyStereotype(ecimBiDirAssociation);
            applyStereotype(ecimReservingAssociation, a);
            ae1.unapplyStereotype(biDirAssociationEnd);
            ae2.unapplyStereotype(biDirAssociationEnd);
            if (isReserving1) {
                applyStereotype(clientAssociationEnd, ae1);
                applyStereotype(serverAssociationEnd, ae2);
                setProperty(clientAssociationEnd, ae1, IS_RESERVING, true);
                setProperty(serverAssociationEnd, ae2, IS_RESERVING, false);
            } else {
                applyStereotype(clientAssociationEnd, ae2);
                applyStereotype(serverAssociationEnd, ae1);
                setProperty(clientAssociationEnd, ae2, IS_RESERVING, true);
                setProperty(serverAssociationEnd, ae1, IS_RESERVING, false);
            }
        }
    }

    /**
     * This modifier makes association's ends have the same visibility property as the association
     */
    private void associationVisibilityModifier() {
        try {
            Collection<Package> packages = model.getNestedPackages();

            // loop over all the packages in the model
            for (Iterator<Package> packageIter = packages.iterator(); packageIter.hasNext();) {
                Package myPackage = packageIter.next();
                setVisibilityForAssociationEnds(myPackage);
            }

        } catch (RuntimeException e) {
            logger.log(new Status(IStatus.ERROR, UmlModActivator.PLUGIN_ID, "Exception in associationVisibilityModifier", e));
            throw e;
        }
    }

    private void setVisibilityForAssociationEnds(Package myPackage) {
        Collection<Element> elements = myPackage.getOwnedElements();

        // loop over all the elements
        for (Iterator<Element> elementIter = elements.iterator(); elementIter.hasNext();) {
            Element myElement = elementIter.next();

            // pick out the associations
            if (!(myElement instanceof Association)) {
                continue;
            }
            // cast the element to an association and retrieve its
            // member ends
            Association myAssociation = (Association) myElement;
            Collection<Property> ends = myAssociation.getMemberEnds();

            // retrieve the associations visibility so we can assign
            // it to the ends later
            VisibilityKind assocVisibility = myAssociation.getVisibility();

            // loop over all the ends in the association
            for (Iterator<Property> endIter = ends.iterator(); endIter.hasNext();) {
                // make the ends visibility the same as the
                // association
                Property myEnd = endIter.next();

                VisibilityKind propVisibility = myEnd.getVisibility();
                // only change visibility if they are different
                if (!assocVisibility.equals(propVisibility)) {
                    myEnd.setVisibility(assocVisibility);
                    logger.log(new Status(IStatus.INFO, UmlModActivator.PLUGIN_ID, "Changing visibility on " + myEnd.getName() + " with value '"
                            + assocVisibility + "'"));
                }
            }
        }
    }

    /**
     * Makes the navigable association ends in an EcimContribution non-navigable.
     */
    private void fixContributionArrows() {
        FixContributionArrows fca = new FixContributionArrows(getModel());
        fca.run();
    }

    /**
     * Switches stereotype on an element while making sure property values are retained.
     */
    private void switchStereotype(Element el, Stereotype from, Map<String, Object> fromStereotypePropertyValues, Stereotype to) {
        el.unapplyStereotype(from);
        applyStereotype(to, el);
        for (Map.Entry<String, Object> name : fromStereotypePropertyValues.entrySet()) {
            Object savedValue = fromStereotypePropertyValues.get(name.getKey());
            try {
                Object currentValue = el.getValue(to, name.getKey());
                if (!savedValue.equals(currentValue)) {
                    el.setValue(to, name.getKey(), savedValue);
                    logger.log(new Status(IStatus.INFO, UmlModActivator.PLUGIN_ID, "Copying property " + name.getKey() + " with value '" + savedValue + "'"));
                }
            } catch (Exception e) {
                logger.log(new Status(IStatus.WARNING, UmlModActivator.PLUGIN_ID, "Ignoring property " + name.getKey() + " which could not be set due to " + e));
            }
        }
    }

    /**
     * Switches stereotype on a MO Class element while making sure property values are retained.
     */
    private void switchStereotypeOnClass(Element el, Stereotype from, Stereotype to) {
        EList<Property> fromProps = from.getAllAttributes();
        Map<String, Object> fromStereotypePropertyValues = new HashMap<String, Object>();
        for (Property p : fromProps) {
            String n = p.getName();
            Object v = el.getValue(from, p.getName());
            if (!(n.startsWith("base_") || "isReadOnly".equalsIgnoreCase(n)))
                fromStereotypePropertyValues.put(n, v);
        }
        switchStereotype(el, from, fromStereotypePropertyValues, to);
    }

    @Override
    public Profile getProfile() {
        return getEcimBaseProfile();
    }

    @Override
    public String getProfileName() {
        return "ECIMBaseProfile";
    }

}
