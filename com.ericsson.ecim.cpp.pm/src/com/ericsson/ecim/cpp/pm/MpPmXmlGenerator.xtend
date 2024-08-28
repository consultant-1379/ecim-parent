package com.ericsson.ecim.cpp.pm

import java.text.SimpleDateFormat
import java.util.Calendar
import java.util.Date

/**
 * Generates a PM Counters as MP XML attributes.
 */
class MpPmXmlGenerator {
    
	def generateClass(PmClass pmClass) '''
       <class name="«pmClass.name»">
          «FOR attr : pmClass.counters»
          «generateAttr(attr)»
		  «ENDFOR»
       </class>
    '''
   
    
    def generateAttr(PmAttribute attr) '''
	<attribute name="«attr.name»">
		<description>«attr.description»</description>
		<noNotification></noNotification>
		<nonPersistent></nonPersistent>
		<readOnly></readOnly>
		«generateDatatype(attr)»
		<interfaceOnly/>
		<condition>«attr.condition»</condition>
		<counterType>«attr.counterType»</counterType>
		<counterReset>«attr.counterReset»</counterReset>
	</attribute>
    '''
    
    def generateDatatype(PmAttribute attr) '''
    	<dataType>
    		«IF attr.datatypeUpper != "1"»
    			<sequence>
    				«generateLongOrLonglong(attr)»
    			<maxLength>«attr.datatypeUpper»</maxLength>
    			</sequence>
			«ELSE»
				«generateLongOrLonglong(attr)»
    		«ENDIF»
    	</dataType>
    '''
    
    def generateLongOrLonglong(PmAttribute attr) '''
    	«IF attr.datatypeSize == "8"»
    	    <longlong></longlong>
    	«ELSE»
    	    <long></long>
    	«ENDIF»
    '''

	def generateMpXml(PmMim pmMim)
	'''	
	<?xml version="1.0" encoding="UTF-8"?>
	<!--
	Copyright (c) «Calendar::getInstance().get(Calendar::YEAR)» Ericsson AB.
	All rights reserved 

	DX ECIM Tool-chain generated this file on «time» using:
	* com.ericsson.ecim.cpp.pm «EcimPmActivator::version»
	
	Note: This file is intended for CPI documentation purposes only.
	-->
	<!DOCTYPE models SYSTEM "mp.dtd">
	<models>
	    <dtdVersion>G</dtdVersion>
	    <momMetaData>
	         <momTitle>title</momTitle>
	         <momSubTitle>sub title</momSubTitle>
	         <momIdentity>
	             <docNum>0</docNum>
	             <docLang>English</docLang>
	             <docRev>0</docRev>
	             <docDate></docDate>
	        </momIdentity>
	        <createdBy>
	            <signature></signature>
	        </createdBy>
	        <approvedBy>
	            <signature></signature>
	        </approvedBy>
		</momMetaData>
	    <mim name="«pmMim.name»" version="«pmMim.version»" release="«pmMim.release»">
			«FOR pmClass : pmMim.classes.values»
		    	«generateClass(pmClass)»
			«ENDFOR»
	    </mim>
	</models>
    '''

 	def getTime() {
 		val sdfDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
    	val now = new Date()
    	sdfDate.format(now)
 	}

}