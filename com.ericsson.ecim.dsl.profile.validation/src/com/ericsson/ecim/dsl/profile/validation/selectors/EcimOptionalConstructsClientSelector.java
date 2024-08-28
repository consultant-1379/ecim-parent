/**
 * Created by the Papyrus DSML plugin generator
 */

package com.ericsson.ecim.dsl.profile.validation.selectors;

import org.eclipse.emf.validation.model.IClientSelector;
import org.eclipse.papyrus.uml.service.validation.StereotypeUtil;

/**
 * This class filters (selects) passed stereotype applications. It returns true, if the
 * associated stereotype (or one of its super-stereotypes) has the name '[stereotype.name/]'.
 *
 * @generated
 */
public class EcimOptionalConstructsClientSelector implements IClientSelector {

    public boolean selects(Object stereoApplicationObj) {
        return StereotypeUtil.checkStereoApplication(stereoApplicationObj, "EcimOptionalConstructs"); //$NON-NLS-1$
    }
}
