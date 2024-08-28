/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package TspMim.validation;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * A sample validator interface for {@link TspMim.Any}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface AnyValidator {
    boolean validate();

    boolean validateMixed(FeatureMap value);
    boolean validateAny(FeatureMap value);
}
