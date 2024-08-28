package com.ericsson.ecim.mmas.cmpojo.transform

import java.text.SimpleDateFormat
import java.util.Calendar
import java.util.Date
import com.ericsson.ecim.mmas.cmpojo.CmPojoActivator

class JavaClassGenerator {
	
	def generate(JavaClass clazz) {
		'''
		/**
		 * Copyright (c) «Calendar::getInstance().get(Calendar::YEAR)» Ericsson AB.
		 * All rights reserved 
		 *
		 * DX ECIM Tool-chain generated this file on «time» using: «CmPojoActivator::PLUGIN_ID» («CmPojoActivator::version»)
		 */ 
		package «clazz.packageName»;
		
		//The following imports are required for all CM POJOs
		import com.ericsson.caf.cm.ConfigurableBean;
		import com.ericsson.caf.cm.modeling.Configurable;
		import com.ericsson.caf.cm.modeling.ConfigurableField;
		«FOR extraImport : clazz.extraImports»
		import «extraImport»;
		«ENDFOR»
		
		/**
		«clazz.description»
		 * @generated
		 */
		@Configurable
		public class «clazz.className» extends ConfigurableBean {
			
			«FOR javaField : clazz.fields»
			«generateJavaField(javaField)»
			«ENDFOR»
			
			private static final long serialVersionUID =  1L;
			
			public «clazz.className»(){}
		}
		'''
	}
	
	def generateJavaField(JavaField javaField) 
	'''
		«IF javaField.description != null && !javaField.description.trim.isEmpty»
		/**
		«javaField.description»
		 */«ENDIF»
		@ConfigurableField«IF javaField.type == "BigInteger"» (properties={"datatype=EcimUInt64"})«ENDIF»
		public «javaField.type» «javaField.name»«getDefaultValue(javaField)»;
		
    '''
	
	def getDefaultValue(JavaField javaField)
	'''
	«IF javaField.defaultValue != null» = «javaField.defaultValue»«ENDIF»'''
	
	def getTime() {
 		val sdfDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
    	val now = new Date()
    	sdfDate.format(now)
 	}
}