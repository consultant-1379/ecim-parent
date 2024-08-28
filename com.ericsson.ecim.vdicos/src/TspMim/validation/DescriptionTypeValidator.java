/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package TspMim.validation;

import TspMim.ExtensionType;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * A sample validator interface for {@link TspMim.DescriptionType}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface DescriptionTypeValidator {
    boolean validate();

    boolean validateMixed(FeatureMap value);
    boolean validateExtension(EList<ExtensionType> value);
}
