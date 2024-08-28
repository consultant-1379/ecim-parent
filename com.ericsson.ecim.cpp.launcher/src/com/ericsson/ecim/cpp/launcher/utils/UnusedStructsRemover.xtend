package com.ericsson.ecim.cpp.launcher.utils

import com.ericsson.ecim.core.uml.helpers.ModelUtility
import com.ericsson.ecim.umlmod.UmlUtilBase
import org.eclipse.uml2.uml.Class
import org.eclipse.uml2.uml.TypedElement
import com.ericsson.ecim.cpp.re.CppReActivator
import org.eclipse.core.runtime.Status
import org.eclipse.core.runtime.IStatus

/**
 * This utility removes unused structs. It is to be used as a post step after the REMP transformation, which creates
 * two structs (one RW and RO) for each struct in the MP XML.
 */
class UnusedStructsRemover extends UmlUtilBase {
	
	
	override toString() {
		"Remove unused structs"
	}

	override getConfirmationMessage() {
		"This utility removes structs that are not referenced by any element in the current model."
	}

	override isApplicable() {
		if (model.getAppliedProfile("CppProfile") != null) {
			return true;
		}
		return false;
	}
	
	override run() throws Exception {
		logger.log(new Status(IStatus::INFO, CppReActivator::PLUGIN_ID, 
						"Running utility '" + this.toString + "'"))
		// 1. Lookup all structs and put in set
		var structs = model.allOwnedElements.filter[isStereotypeApplied(ModelUtility::INSTANCE().getStereotype(model, "EcimStruct"))].map[it as Class].toSet
		
		// 2. Loop through all typed elements
		var typedElements = model.allOwnedElements.filter(typeof(TypedElement))
		for (te:typedElements) {
			// 3. Check if element's type is any of the structs
			if (structs.exists[it==te.type]) {
				// if yes, then remove struct from set
				structs.remove(te.type)
			}		
		}
		
		// 4. Remove all remaining structs, since no typed element references them!
		structs.forEach[destroy]		
	}
	
}