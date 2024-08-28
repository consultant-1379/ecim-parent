package com.ericsson.ecim.launcher.transformations.internal;

import java.util.Collection;
import java.util.Iterator;

import org.eclipse.core.runtime.Assert;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Stereotype;

import com.ericsson.ecim.umlmod.UmlModActivator;
import com.ericsson.ecim.umlmod.UmlUtilBase;

/**
 * Turns off navigability of the association ends so that we don't get a confusing back arrow
 */
public class FixContributionArrows extends UmlUtilBase {

    public FixContributionArrows(Model model) {
        super(model);
    }

    public FixContributionArrows() {
        super();
    }

    @Override
    public void run() {
        associationNavigationModifier();
    }

    @Override
    public String toString() {
        return "Fix EcimContribution Arrows";
    }

    /**
     * This modifier makes associations' (EcimContributions) ends have isNavigable set to false
     */
    private void associationNavigationModifier() {
        try {
            final Stereotype ecimContribution = getEcimBaseProfile().getOwnedStereotype("EcimContribution");

            Assert.isNotNull(ecimContribution);

            Collection<Package> packages = model.getNestedPackages();

            // loop over all the packages in the model
            for (Iterator<Package> packageIter = packages.iterator(); packageIter.hasNext();) {
                Package myPackage = packageIter.next();
                traversalPackage(ecimContribution, myPackage);
            }

        } catch (RuntimeException e) {
            logger.log(new Status(IStatus.ERROR, UmlModActivator.PLUGIN_ID, "Exception in associationNavigationModifier", e));
            throw e;
        }
    }

    private void traversalPackage(final Stereotype ecimContribution, Package myPackage) {
        Collection<Element> elements = myPackage.getOwnedElements();

        // loop over all the elements
        for (Iterator<Element> elementIter = elements.iterator(); elementIter.hasNext();) {
            Element myElement = elementIter.next();
            traversalElement(myElement, ecimContribution);
        }
    }

    private void traversalElement(Element myElement, Stereotype ecimContribution) {
        // pick out the associations
        if (!(myElement instanceof Association)) {
            return;
        }
        // cast the element to an association and retrieve its member ends
        Association myAssociation = (Association) myElement;
        // only do this for Contributions
        if (!myAssociation.isStereotypeApplied(ecimContribution)) {
            return;
        }

        Collection<Property> ends = myAssociation.getMemberEnds();
        // loop over all the ends in the association
        for (Iterator<Property> endIter = ends.iterator(); endIter.hasNext();) {
            Property myEnd = endIter.next();

            // toggle the navigability if needed
            if (myEnd.isNavigable()) {
                myEnd.setIsNavigable(false);
                logger.log(new Status(IStatus.INFO, UmlModActivator.PLUGIN_ID, "Changing navigability on " + myEnd.getName() + " with value '"
                        + myEnd.isNavigable() + "'"));
            }
        }
    }
}
