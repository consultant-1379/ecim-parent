/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package TspMim.validation;

import TspMim.RangeType;
import TspMim.ValidValuesType;

/**
 * A sample validator interface for {@link TspMim.IntegerType}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface IntegerTypeValidator {
    boolean validate();

    boolean validateRange(RangeType value);
    boolean validatePattern(String value);
    boolean validateValidValues(ValidValuesType value);
    boolean validateDefaultValue(String value);
}
