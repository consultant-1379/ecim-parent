/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package TspMim.validation;

import TspMim.DescriptionType;
import TspMim.ExtensionType;

import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link TspMim.ChildType}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface ChildTypeValidator {
    boolean validate();

    boolean validateDescription(DescriptionType value);
    boolean validateExtension(EList<ExtensionType> value);
    boolean validateMax(Object value);
    boolean validateMin(Object value);
    boolean validateName(Object value);
}
