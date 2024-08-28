package com.ericsson.ecim.cpp.launcher.utils

import com.ericsson.ecim.core.uml.helpers.Uml2ModelHelper
import com.ericsson.ecim.cpp.re.CppReActivator
import com.ericsson.ecim.umlmod.UmlUtilBase
import java.io.IOException
import java.util.ArrayList
import java.util.List
import java.util.StringTokenizer
import org.eclipse.core.runtime.IStatus
import org.eclipse.core.runtime.Status
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.uml2.uml.Class
import org.eclipse.uml2.uml.Property
import org.apache.commons.io.FilenameUtils

import java.io.File
import org.eclipse.core.resources.ResourcesPlugin
import org.eclipse.core.resources.IResource

/**
 * This utility looks up all properties that has no type set with default value = "MomName:ClassName", and
 * tries to resolve class from models in the same folder or sub-folders.
 */
class RemoteTypeResolver extends UmlUtilBase {
	
	override toString() {
		"Resolve missing types"
	}

	override getConfirmationMessage() {
		"Looks up all properties that has no type set and with default value equal to '<MomName>:<ClassName>', and "+
		"then searches and sets the type to a matching class in any model found in the same folder or sub-folders."
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
		var propertiesWithNoType = model.allOwnedElements.filter(typeof(Property)).filter[it.type==null].toSet
		if (propertiesWithNoType.size>0) {
			logger.log(new Status(IStatus::INFO, CppReActivator::PLUGIN_ID, "Found " + propertiesWithNoType.size + " properties to resolve."));
			val otherModels = otherModels
			if (otherModels.size == 0) {
					logger.log(new Status(IStatus::ERROR, CppReActivator::PLUGIN_ID, "No models found to search types in."));
					return
			}
			for (p:propertiesWithNoType) {
				val defaultValue = p.defaultValue.stringValue
				val st = new StringTokenizer(defaultValue,":")
				if (st.countTokens == 2) {
					val momName = st.nextToken
					val className = st.nextToken
					val type = searchClass(momName, className, otherModels)
					logger.log(new Status(IStatus::INFO, CppReActivator::PLUGIN_ID, 
						"Resolving type of " + p.qualifiedName + " to " + type.qualifiedName))		
					if (type != null) {
						p.type = type
						p.defaultValue.destroy
					}
				}	
			}
			otherModels.forEach[unloadModel]	
		}
	}
	
	/**
	 * Searches for named class in the supplied models.
	 */
	def Class searchClass(String momName, String className, Uml2ModelHelper[] models) {
		for (Uml2ModelHelper umh : models) {
			val model = umh.model		
			val x = model.allOwnedElements.filter(typeof(Class))
						.findFirst[name==className && (momName == "" || nearestPackage.name == momName)]
			if (x !=  null) {
				return x
			}	
		}
		null
	}

	/**
	 * Returns the model's File object.
	 */
	def File getModelResource() {
		val Resource eResource = model.eResource()
		val URI eUri = eResource.getURI()
		if (eUri.isPlatformResource()) {
			val platformString = eUri.toPlatformString(true);
			val IResource modelResource = ResourcesPlugin::workspace.root.findMember(platformString);
			modelResource.rawLocation.toFile();
		} else if (eUri.isFile) {
			new File(eUri.toFileString)
		}
	}
	
	/*
	 * Looks up all emx resources found in supplied folder and recursively down
	 */
	def List<File> getAllModels(File folder) {
		val result = new ArrayList<File>() 
		val folders = folder.listFiles.filter[directory].filter[!name.contains("intermediate")]
		for (File c:folders) {
			val r = getAllModels(c)
			result.addAll(r)
		}
		val children = folder.listFiles.filter[FilenameUtils::getExtension(path)=="uml"]
		result.addAll(children)	
		result
	}
	
	
	/**
	 * Returns a list of Uml2ModelHelper objects which holds other models in project
	 */
	def Uml2ModelHelper[] getOtherModels() throws IOException {	
		val modelResource = modelResource
		val parentResource = modelResource.parentFile
		val modelResources = getAllModels(parentResource)
	
		val models = modelResources.filter[name != modelResource.name]
						.map[new Uml2ModelHelper(it)]
						.toList						
		models.forEach[loadModel]
		models					
	}
	
	
}