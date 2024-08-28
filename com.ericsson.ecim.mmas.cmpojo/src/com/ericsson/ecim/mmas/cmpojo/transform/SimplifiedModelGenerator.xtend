package com.ericsson.ecim.mmas.cmpojo.transform

import java.util.ArrayList
import java.util.HashSet
import java.util.List
import java.util.Set
import org.eclipse.uml2.uml.AggregationKind
import org.eclipse.uml2.uml.Association
import org.eclipse.uml2.uml.Class
import org.eclipse.uml2.uml.Classifier
import org.eclipse.uml2.uml.Element
import org.eclipse.uml2.uml.Enumeration
import org.eclipse.uml2.uml.EnumerationLiteral
import org.eclipse.uml2.uml.Model
import org.eclipse.uml2.uml.Property
import org.eclipse.uml2.uml.Type
import org.eclipse.uml2.uml.InstanceValue
import java.util.Iterator

class SimplifiedModelGenerator {
	
	val Model model;
	val String lineSeparator = System::getProperty("line.separator");
	
	new (Model model) {
		this.model = model
	}
	
	def getJavaModelClasses() {
		val classes = getMoClasses()
		val structs = getAllUsedStructs()
		
		val classesAll = new HashSet<UmlClass>()
		classesAll.addAll(classes)
		classesAll.addAll(structs)
		
		val List<JavaClass> javaClasses = new ArrayList<JavaClass>()
		val Iterator<UmlClass> iter = classesAll.iterator
		while (iter.hasNext) {
			val clazz = iter.next
			val description = formatClassDescription(clazz.theClass)
			val className = getJavaClassName(clazz)
			val javaClass = new JavaClass(getPackageName(clazz), new HashSet<String>(), description, className, new ArrayList<JavaField>())
			assignFields(javaClass, clazz)
			
			javaClasses.add(javaClass)
		}
		javaClasses
	}

	
	def getMoClasses() {
		model.allOwnedElements.filter(typeof(Class)).filter[!it.isAbstract
			&& (it.owner.hasStereotype('ECIM Base Profile::EcimMom') || it.owner.hasStereotype('ECIM Base Profile::EcimLibrary'))  
			&& !it.hasStereotype('ECIM Base Profile::EcimStruct') && !it.hasStereotype('ECIM Base Profile::EcimException')].toSet.map[new UmlClass(it, it.nearestPackage)]
	}
	
	def getKeyCount(UmlClass umlClass){
		umlClass.theClass.attributes.filter[it.hasStereotype('ECIM Base Profile::EcimStruct')].size;
	}
	
	def getAllUsedStructs() {	
		val typedElementsFromProperties  = model.allOwnedElements.filter(typeof(Class)).map[attributes].flatten.filter[it.type.hasStereotype('ECIM Base Profile::EcimStruct')].map[new UmlClass(type as Class, it.nearestPackage)]
		val typedElementsFromParameters  = model.allOwnedElements.filter(typeof(Class)).map[ownedOperations].flatten.map[ownedParameters].flatten.filter[it.type.hasStereotype('ECIM Base Profile::EcimStruct')].map[new UmlClass(type as Class, it.nearestPackage)]
		val allTypedElements = new HashSet<UmlClass>()
		allTypedElements.addAll(typedElementsFromProperties.toSet)
		allTypedElements.addAll(typedElementsFromParameters.toSet)
		allTypedElements
	}
	
	def hasStereotype(Element e, String stereotype) {
		e.getAppliedStereotype(stereotype) != null	
	}
	
	def getJavaClassName(UmlClass umlClass) {
		var javaClassName = umlClass.theClass.name
		if(hasMomPrefix(umlClass)) {
			javaClassName = umlClass.theOwningPackage.name.toFirstUpper + umlClass.theClass.name 
		}
		javaClassName
	}
	
	def formatClassDescription(Class umlClass) {
		var classDescription = umlClass.ownedComments.map[body].join(lineSeparator, [ String s | " * " + s ]) as String
		if (isClassDeprecated(umlClass)) {
			classDescription = classDescription + lineSeparator + " * @deprecated "
		}
		var momStereoType = umlClass.nearestPackage.getAppliedStereotype("ECIM Base Profile::EcimMom")
		if (momStereoType == null)
			momStereoType = umlClass.nearestPackage.getAppliedStereotype("ECIM Base Profile::EcimLibrary")
		val version = umlClass.nearestPackage.getValue(momStereoType, "version") as String
		if( version != null && !version.trim.isEmpty ) {
			classDescription = classDescription + lineSeparator + " * @version " + version
		}
		val author = umlClass.nearestPackage.getValue(momStereoType, "author") as String
		if( author != null && !author.trim.isEmpty ) {
			classDescription = classDescription + lineSeparator + " * @author " + author
		}
		classDescription
	}
	
	def isClassDeprecated(Class umlClass) {
		val generalStereoType = umlClass.getAppliedStereotype("ECIM Base Profile::EcimGeneralProperties")
		val isObsolete = if (generalStereoType == null) false else (umlClass.getValue(generalStereoType, "status") as EnumerationLiteral).name == "OBSOLETE"
		val moStatusStereoType = umlClass.getAppliedStereotype("ECIM Base Profile::EcimMoClass")
		val isDeprecated = if (moStatusStereoType == null) false else (umlClass.getValue(moStatusStereoType, "status") as EnumerationLiteral).name == "DEPRECATED"
		isObsolete || isDeprecated
	}
	
	def assignFields(JavaClass javaClass, UmlClass umlClass) {
		if (umlClass.theClass.hasStereotype('ECIM Base Profile::EcimStruct')) {
			val javaField = new JavaField(null, "String", "id", null)
			javaClass.fields.add(javaField)
		}
		
		if(umlClass.getKeyCount != 1) //Generate a special key for zero/multi-key classes
		{
			val javaField = new JavaField("", "String", getKeyAttributeName(umlClass), null)
			javaClass.fields.add(javaField)
		}			

		val attributes = umlClass.theClass.ownedAttributes
		for (attr : attributes) {
			val description = attr.ownedComments.map[body].join(lineSeparator, [ String s | " * " + s ]) as String
			val typeString = mapType(attr, javaClass.extraImports)
			
			var fieldName = attr.name 
			
			if (isKeyAttribute(attr) && umlClass.getKeyCount == 1) { // Key attribute for single keyed classes
				fieldName = getKeyAttributeName(umlClass)
			}
			else { // Non key attribute
				if (attr.name.equals(getKeyAttributeName(umlClass)))
					fieldName = fieldName + "Ref" // Apppend Ref to avoid clash with key attribute	
			
				/*
			 	 * For fields pointing to child class in containment hierarchy. In this case the name
			 	 * of the field must be equal to the RDN name of the IMM child class.
			  	 */	
				if (attr.aggregation.value == AggregationKind::COMPOSITE && attr.appliedStereotypes.size() == 0) {
					val childKeyAttributeName = getKeyAttributeName(new UmlClass(attr.type as Class, attr.type.nearestPackage))	
					fieldName = childKeyAttributeName
				}
			}
					
			var defaultValue = fetchDefaultValue(attr)
			defaultValue = if (defaultValue != null && !defaultValue.trim.isEmpty && !defaultValue.trim.equals("\"\"")) defaultValue else null
			val javaField = new JavaField(description, typeString, fieldName, defaultValue)
			javaClass.fields.add(javaField)
		}
		
		for (relationship: umlClass.theClass.relationships) {
			if (relationship.getAppliedStereotype('ECIM Base Profile::EcimContribution') != null) {
				val contrib = relationship as Association
				val childAssociationEnd = contrib.memberEnds.findFirst[it.aggregation.value == AggregationKind::COMPOSITE]
				val childUmlClass = new UmlClass(childAssociationEnd.type as Class, childAssociationEnd.type.nearestPackage)
				if (javaClass.className != getJavaClassName(childUmlClass)) {			
					val typeString = mapType(childAssociationEnd, javaClass.extraImports)
					val fieldName = getKeyAttributeName(childUmlClass)
					val javaField = new JavaField("", typeString, fieldName, null)
					javaClass.fields.add(javaField)	
				}		
			}		
		}	
	}
	
	def getKeyAttributeName(UmlClass umlClass) {
		//use the special name "id" for generating a key in the struct, zero key, multi-key scenarios.
		if ((umlClass.theClass.hasStereotype('ECIM Base Profile::EcimStruct') || umlClass.getKeyCount != 1))
			generateKeyName(umlClass,"")
		else {
			val keyAttr = umlClass.theClass.attributes.findFirst[it.hasStereotype('ECIM Base Profile::EcimKeyAttribute')]
			var attrPrefix = ""
			if (isRootMoc(umlClass.theClass) && hasMomPrefix(umlClass))
				attrPrefix = umlClass.theOwningPackage.name
			attrPrefix+keyAttr.name
		}
	}
	
	//generate a key name for no/multi-key classes
	def generateKeyName(UmlClass umlClass, String postFix){
		val keyName = umlClass.theClass.name.toFirstLower + postFix + "Id"
		
		//check to see if this name clashes with existing attribute names. if it does suffix the name with an underscore, if even that causes
		//a clash keep adding underscores till we have no clash
		if (umlClass.theClass.attributes.exists[it.name==keyName]) {
			generateKeyName(umlClass,postFix.concat('_')).toString
		}
		else
		{
			keyName	
		}
	}
		
	def hasMomPrefix(UmlClass umlClass) {
		val coreMwStereoType = umlClass.theOwningPackage.getAppliedStereotype("CoreMW Profile::CmwMom")
		if (coreMwStereoType == null) false else (umlClass.theOwningPackage.getValue(coreMwStereoType, "immNamespace") as EnumerationLiteral).name == "MOM_NAME"
	}
			
	def isRootMoc(Class umlClass){
		if (hasStereotype(umlClass, "ECIM Base Profile::EcimMoClass")) {
			val contributions = umlClass.nearestPackage.allOwnedElements.filter[hasStereotype(it,"ECIM Base Profile::EcimContribution")].map[it as Association]
			val hasContribution = contributions.map([e|e.memberEnds.filter[m|m.type==umlClass]]).flatten.size()>0			
			hasContribution || (umlClass.getValue(umlClass.getAppliedStereotype('ECIM Base Profile::EcimMoClass'), "isLegacyRoot") as Boolean).booleanValue
		} 
		else
			false
	}
	
	def isStructType(Type type) {
		type.getAppliedStereotype("ECIM Base Profile::EcimStruct") != null
	}

	def isKeyAttribute(Property attr) {
		attr.getAppliedStereotype("ECIM Base Profile::EcimKeyAttribute") != null
	}
	
	def fetchDefaultValue(Property attr) {
		if (hasType(attr.type, "EcimEmpty")) {
			"false"
		} else if(attr.defaultValue != null && attr.upper == 1) {
			val type = attr.type
			var valueString = attr.defaultValue.stringValue
			if(valueString.equals("\"\"")) {
				valueString = ""
			}
			if(valueString.contains("\"")) {
				valueString = valueString.replaceAll("\"", "\\\\\"")
			}
			val valueResult = switch type {
				case hasType(type, "EcimString") : "\"" + valueString + "\""
				case hasType(type, "EcimFloat") : valueString + "D" // D is not needed
				case hasType(type, "EcimInteger") || hasType(type, "EcimInt64") || hasType(type, "EcimUInt32") : valueString + "L"
				case hasType(type, "EcimUInt64") : "BigInteger.valueOf(" + valueString + "L)"
				Enumeration : (attr.defaultValue as InstanceValue).instance.specification.stringValue
				default : valueString
			}
			valueResult.trim
		}
	}
	
	/*
	 */
	def mapType(Property attr, Set<String> extraImports) {
		
		val type = attr.type
		var javaType = switch type {
			case hasType(type, "EcimString") : "String"
			case hasType(type, "EcimBoolean") || hasType(type, "EcimEmpty") : "Boolean"
			case hasType(type, "EcimInt8") : "Byte"
			case hasType(type, "EcimInt16") : "Short"
			case hasType(type, "EcimFloat") : "Double"
			case hasType(type, "EcimInt32") || hasType(type, "EcimUInt8") || hasType(type, "EcimUInt16") : "Integer"
			case hasType(type, "EcimInteger") || hasType(type, "EcimInt64") || hasType(type, "EcimUInt32") : "Long"
			case hasType(type, "EcimUInt64") : handleJavaTypeImport("java.math.BigInteger", extraImports)
			Enumeration : "Integer"
			Class case type.isAbstract() : "Object"
			Class case !type.isAbstract() && !type.hasStereotype('ECIM Base Profile::EcimStruct'): getReferredClassName(new UmlClass(type, type.nearestPackage), extraImports)
			Class case !type.isAbstract() && type.hasStereotype('ECIM Base Profile::EcimStruct'): getReferredClassName(new UmlClass(type, attr.nearestPackage), extraImports)
			default : "UnknownType"
		}
		if(attr.upper != 1) {
			javaType = "List<" + javaType + ">"
			extraImports.add("java.util.List")
		}		
		
		javaType
	}
	
	def hasType(Type type, String typeName) {
		type.name == typeName
		||
		try {if ((type as Classifier).generals.iterator.hasNext) 
			(type as Classifier).generals.iterator.next.name == typeName
		else
			false
		}
		catch (ClassCastException e) {
		 	e.printStackTrace
    		false
  		}
	}
	
	def getReferredClassName(UmlClass umlClass, Set<String> extraImports) {
		handleJavaTypeImport(getPackageName(umlClass) + "." + getJavaClassName(umlClass), extraImports)
	}
	
	
	def getPackageName(UmlClass umlClass) {
		val mmasProfile = model.getAppliedProfile('MMASProfile')
		val mmasMomStereotype = mmasProfile.getOwnedStereotype('MmasMom')

		val jps = umlClass.theOwningPackage.getValue(mmasMomStereotype, 'javaPackageSuffix') as String
		if (jps != null && jps != "")
			'com.ericsson.ecim.'+jps
		else
			'com.ericsson.ecim.'+umlClass.theOwningPackage.name.toLowerCase
	}
	
	def handleJavaTypeImport(String javaType, Set<String> extraImports) {
		extraImports.add(javaType)
		javaType.substring(javaType.lastIndexOf(".") + 1)
	}
	
	def getModelName() {
		model.name
	}
}