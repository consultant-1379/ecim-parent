package com.ericsson.ecim.cpp.pm

import java.text.SimpleDateFormat
import java.util.Calendar
import java.util.Date
import java.util.List

/**
 * Generates a PM Counters as IMM XML attributes.
 */
class ImmPmXmlGenerator {
    
	def generateImmClass(PmClass pmClass) '''
       <class name="«pmClass.name»">
          <category>SA_CONFIG</category>
          «generateImmRdn("dummyName")»
          «FOR attr : pmClass.counters»
          «generateImmAttr(attr)»
		  «ENDFOR»
       </class>
    '''
    
    def generateImmRdn(String name) '''
    <rdn>
      <name>«name»</name>
      <type>SA_STRING_T</type>
      <category>SA_CONFIG</category>
      <flag>SA_INITIALIZED</flag>
    </rdn>
    '''
    
    def generateImmAttr(PmAttribute attr) '''
    <attr>
      <name>«attr.name»</name>
      «generateDatatype(attr)»
      <category>SA_RUNTIME</category>
      «generateFlag(attr)»
    </attr>
    '''
    
    def generateFlag(PmAttribute attr) '''
    	«IF attr.datatypeUpper != "1"»
    		<flag>SA_MULTI_VALUE</flag>
    	«ENDIF»
    '''
    
    def generateDatatype(PmAttribute attr) '''
    	«IF attr.datatypeSize == "8"»
    		<type>SA_INT64_T</type>
    	«ELSE»
    		<type>SA_INT32_T</type>
    	«ENDIF»
    '''

	def generateImmXml(List<PmClass> pmClasses)
	'''	
	<?xml version="1.0" encoding="utf-8"?>
	<!--
	Copyright (c) «Calendar::getInstance().get(Calendar::YEAR)» Ericsson AB.
	All rights reserved 

	DX ECIM Tool-chain generated this file on «time» using:
	* com.ericsson.ecim.cpp.pm «EcimPmActivator::version»
	-->
	<imm:IMM-contents xmlns:imm="http://www.saforum.org/IMMSchema" xmlns:xs="http://www.w3.org/2001/XMLSchema" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:schemaLocation="http://www.saforum.org/IMMSchema SAI-AIS-IMM-XSD-A.01.01.xsd">
	«FOR pmClass : pmClasses»
	«generateImmClass(pmClass)»
	«ENDFOR»
	</imm:IMM-contents>
    '''

 	def getTime() {
 		val sdfDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
    	val now = new Date()
    	sdfDate.format(now)
 	}

 
}