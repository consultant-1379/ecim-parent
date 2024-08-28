package com.ericsson.ecim.cpp.launcher.utils

import com.ericsson.ecim.core.uml.helpers.Uml2ModelHelper
import com.ericsson.ecim.cpp.launcher.CppLauncherActivator
import com.ericsson.ecim.umlmod.UmlUtilBase
import java.io.File
import java.io.IOException
import org.eclipse.core.runtime.IStatus
import org.eclipse.core.runtime.Status
import org.eclipse.emf.common.util.URI
import org.eclipse.uml2.uml.Enumeration
import org.eclipse.uml2.uml.Model
import org.eclipse.uml2.uml.TypedElement


/**
 * This utility replaces references to any AvailabilityStatus enumerations to the one defined in the ECIM Common Library,
 * which must be present in the same directory as the model file.
 */
class AvailabilityStatusReassigner extends UmlUtilBase {
		override toString() {
		"Assign AvailabilityStatus from ECIM Common Library"
	}

	override getConfirmationMessage() {
		"This utility looks up all attributes having a local AvailabilityStatus enumeration as type and replace them with the AvailabilityStatus enumeration from the EcimCommonLibrary model.\n"+
		"A copy of the 'ECIM_CommonLibrary.emx' file must exist in the same directory as the model file!"
	}

	override isApplicable() {
		if (model.getAppliedProfile("CppProfile") != null) {
			return true;
		}
		return false;
	}
	
	override run() throws Exception {
		val Model ecimCommonLibraryModel = getEcimCommonLibrary()
		val Enumeration availabilityStatusEnum = ecimCommonLibraryModel.allOwnedElements.filter(typeof(Enumeration)).findFirst[name=="AvailabilityStatus"]
		val typedElementsWithAvailabilityStatusAsType = model.allOwnedElements.filter(typeof(TypedElement)).filter[type?.name=="AvailabilityStatus"]
		
		for (te : typedElementsWithAvailabilityStatusAsType) {
			logger.log(new Status(IStatus::INFO,
							CppLauncherActivator::PLUGIN_ID, "Setting "
									+ te.qualifiedName + " to type "
									+ availabilityStatusEnum.qualifiedName))
			te.type = availabilityStatusEnum	
		}
	}		

	def Model getEcimCommonLibrary() throws IOException {	
		val URI modelUri = model.eResource.URI
		var modelUriString = modelUri.path
		if (modelUri.path.startsWith("/resource"))
			modelUriString = modelUri.path.substring("/resource".length)
		val parentUriString = modelUriString.substring(0,modelUriString.lastIndexOf("/"))	
		// val ecimLibraryModelUri = URI::createPlatformResourceURI(parentUriString + File::separator + "ECIM_CommonLibrary.emx", true)
		val Uml2ModelHelper umh = new Uml2ModelHelper(parentUriString + File::separator + "ECIM_CommonLibrary.emx");
		val commonLibraryModel = umh.loadModel();
		commonLibraryModel	
	}
	
}