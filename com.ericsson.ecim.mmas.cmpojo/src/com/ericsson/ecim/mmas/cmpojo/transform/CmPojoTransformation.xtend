package com.ericsson.ecim.mmas.cmpojo.transform

import java.util.List
import org.eclipse.core.runtime.IProgressMonitor
import org.eclipse.core.runtime.Status
import com.ericsson.ecim.launcher.transformations.Transformation
import com.ericsson.ecim.mmas.cmpojo.CmPojoActivator
import com.ericsson.ecim.core.uml.helpers.Uml2ModelHelper

class CmPojoTransformation extends Transformation {
	
	//transform model
	override run(IProgressMonitor monitor) {
		val modelFile = getFlattenedModelFile
		val modelHelper = new Uml2ModelHelper(modelFile)
		val model = modelHelper.loadModel
		
		val fsa = XtextSetup::run()
		fsa.setOutputPath(getOutputFolder().absolutePath);
		
		val simplifiedModelGenerator = new SimplifiedModelGenerator(model)
		val jcg = new JavaClassGenerator()
		val List<JavaClass> classes = simplifiedModelGenerator.getJavaModelClasses()
		for (clazz : classes) {
			var packagePath = fromPackageName(clazz.packageName)
			fsa.generateFile(packagePath +"/"+clazz.className+".java", jcg.generate(clazz))
		}
		
		Status::OK_STATUS
	}
	
	def fromPackageName(String packageName) {
		packageName.replaceAll("\\.", "/")
	}
	
	override getPluginVersions() {
		" mmas.cmpojo = " + CmPojoActivator::getVersion() + "\n"
	}

}