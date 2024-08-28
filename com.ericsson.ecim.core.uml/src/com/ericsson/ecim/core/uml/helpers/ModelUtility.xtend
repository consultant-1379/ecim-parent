package com.ericsson.ecim.core.uml.helpers

import java.util.Collection
import java.util.HashSet
import java.util.Set
import org.eclipse.uml2.uml.AggregationKind
import org.eclipse.uml2.uml.Association
import org.eclipse.uml2.uml.Class
import org.eclipse.uml2.uml.Classifier
import org.eclipse.uml2.uml.Constraint
import org.eclipse.uml2.uml.Dependency
import org.eclipse.uml2.uml.Element
import org.eclipse.uml2.uml.EnumerationLiteral
import org.eclipse.uml2.uml.Generalization
import org.eclipse.uml2.uml.InstanceSpecification
import org.eclipse.uml2.uml.InstanceValue
import org.eclipse.uml2.uml.LiteralBoolean
import org.eclipse.uml2.uml.LiteralInteger
import org.eclipse.uml2.uml.LiteralString
import org.eclipse.uml2.uml.LiteralUnlimitedNatural
import org.eclipse.uml2.uml.Model
import org.eclipse.uml2.uml.Operation
import org.eclipse.uml2.uml.Package
import org.eclipse.uml2.uml.Parameter
import org.eclipse.uml2.uml.Property
import org.eclipse.uml2.uml.Slot
import org.eclipse.uml2.uml.Stereotype
import org.eclipse.uml2.uml.Type
import org.eclipse.uml2.uml.UMLFactory
import org.eclipse.uml2.uml.UMLPackage

class ModelUtility {
	
	
	def countEcimLibraryPackages(Model model) {
		model.ownedElements.filter[isStereotypeApplied(getStereotype(model, "EcimLibrary"))].size
	}
	
 	static String PRELIMINARY_STATUS = "PRELIMINARY"
	
	def getMomPackages(Model model) {
		model.ownedElements.filter[isStereotypeApplied(getStereotype(model, "EcimMom"))].map[it as Package]
	}
	
	def getMomOrLibraryPackages(Model model) {
		model.ownedElements.filter[isStereotypeApplied(getStereotype(model, "EcimMom")) || isStereotypeApplied(getStereotype(model, "EcimLibrary"))].map[it as Package]
	}
	
	def getPreliminaryElements(Package p) {
		var result = p.allOwnedElements.filter[isPreliminary(p,it)].toSet
		if (isPreliminary(p,p)) 
			result.add((p))
		addRelatedElements(result).toList
	}
	
	def dispatch isPreliminary(Package p, Package paket) {
		try {
			if (paket.isStereotypeApplied(getStereotype(p.model,"EcimMom"))) 
				hasStatus(paket, "EcimMom", PRELIMINARY_STATUS)
			else
				false
		}
		catch (Exception e) {
			false
		}
	}
	
	def dispatch isPreliminary(Package p, Property property) {
		try {
			switch property {
				case property.isStereotypeApplied(getStereotype(p.model,"EcimAttribute_RO")) :
					hasStatus(property, "EcimAttribute_RO", PRELIMINARY_STATUS)
				case property.isStereotypeApplied(getStereotype(p.model,"EcimAttribute_RW")) :
					hasStatus(property, "EcimAttribute_RW", PRELIMINARY_STATUS)		
				case property.isStereotypeApplied(getStereotype(p.model,"EcimStructMember")) :
					hasStatus(property, "EcimStructMember", PRELIMINARY_STATUS)				
				default : false		
			}
		}
		catch (Exception e) {
			false
		}
	}
	
	def dispatch isPreliminary(Package p, Class c) {
		try {
			if (c.isStereotypeApplied(getStereotype(p.model,"EcimMoClass"))) 
				hasStatus(c, "EcimMoClass", PRELIMINARY_STATUS)
			else
				false
		}
		catch (Exception e) {
			false
		}
	}
	
	def dispatch isPreliminary(Package p, Parameter param) {
		try {
			if (param.isStereotypeApplied(getStereotype(p.model,"EcimParameter"))) 
				hasStatus(param, "EcimParameter", PRELIMINARY_STATUS)
			else if (param.isStereotypeApplied(getStereotype(p.model,"EcimResult"))) 
				hasStatus(param, "EcimResult", PRELIMINARY_STATUS)
			else
				false
		}
		catch (Exception e) {
			false
		}
	}
	
	def dispatch isPreliminary(Package p, Operation o) {
		try {
			if (o.isStereotypeApplied(getStereotype(p.model,"EcimAction"))) 
				hasStatus(o, "EcimAction", PRELIMINARY_STATUS)
			else
				false
		}
		catch (Exception e) {
			false
		}
	}
	
	def dispatch isPreliminary(Package p, EnumerationLiteral enumLiteral) {
		try {
			if (enumLiteral.isStereotypeApplied(getStereotype(p.model,"EcimEnumerationLiteral"))) 
				hasStatus(enumLiteral, "EcimEnumerationLiteral", PRELIMINARY_STATUS)
			else
				false
		}
		catch (Exception e) {
			false
		}
	}
	
	def dispatch isPreliminary(Package p, Association association) {
		try {
			switch association {
				case association.isStereotypeApplied(getStereotype(p.model,"EcimContainment")) :
					hasStatus(association, "EcimContainment", PRELIMINARY_STATUS)
				case association.isStereotypeApplied(getStereotype(p.model,"EcimContribution")) :
					hasStatus(association, "EcimContribution", PRELIMINARY_STATUS)		
				case association.isStereotypeApplied(getStereotype(p.model,"EcimBiDirAssociation")) :
					hasStatus(association, "EcimBiDirAssociation", PRELIMINARY_STATUS)		
				case association.isStereotypeApplied(getStereotype(p.model,"EcimBiDirAssociation_CS")) :
					hasStatus(association, "EcimBiDirAssociation_CS", PRELIMINARY_STATUS)		
				case association.isStereotypeApplied(getStereotype(p.model,"EcimUniDirAssociation")) :
					hasStatus(association, "EcimUniDirAssociation", PRELIMINARY_STATUS)				
				default : false		
			}
		}
		catch (Exception e) {
			false
		}
	}
	
	def dispatch isPreliminary(Package p, Element element) {
		false
	}
	
	def addRelatedElements(Set<Element> in) {
		var out = new HashSet<Element>()
		out.addAll(in)
		out.addAll(getRelatedElements(in))
		out
	}
	
	def mergeElements(Collection<Element> set1, Collection<Element> set2) {
		var out = new HashSet<Element>()
		out.addAll(set1)
		out.addAll(set2)
		out
	}
	
	
	def getRelatedElements(Collection<Element> in) {
		// Add class's relationships
		var tmp = new HashSet<Element>()
		for (Element e:in) {
			if (e instanceof Class) {
				val c = e as Class
				tmp.addAll(c.relationships)
				tmp.addAll(findInstanceSpecifications(c))
			}	
		}
		// Add all associations' members
		var out = new HashSet<Element>()
		out.addAll(tmp)
		for (Element e:tmp) {
			switch e {
				Association : out.addAll((e as Association).memberEnds)
				InstanceSpecification : out.addAll(addRelatedIS(e))
			}			
		}	
		out
	}
	
	/**
	 * Returns a set of instance specifications that depend on the supplied is.
	 * @TBD Not fully implemented.
	 * 
	 */
	def addRelatedIS(InstanceSpecification is) {	
		val iss = new HashSet<Element>()		
		val rels = is.relationships
		
		for (rel:rels) { 
			if (rel instanceof Dependency) {
				val sources = (rel as Dependency).sources
				for (e:sources) {
					if (e instanceof InstanceSpecification) {
						iss.add(rel)
						iss.add(e)
						//iss.addAll(addRelatedIS(e as InstanceSpecification))
					}
				}
			}			
		}	
		iss
	}
	
	
	def findInstanceSpecifications(Class c) {
		c.model.allOwnedElements.filter(typeof(InstanceSpecification)).filter[it.classifiers.get(0).name == c.name]	
	}
	
	
	def hasStatus(Element element, String stereotypeName, String statusName) {
		val value = element.getValue(getStereotype(element.model, stereotypeName), 'status') as EnumerationLiteral
		statusName.equals(value.name)
	}
	
	def createPreliminaryFilteringOptionalityRule(Package p, Iterable<Element> constrainedElements, String PRELIMINARY_FEATURE_NAME) {
		val rule_name = "Not"+PRELIMINARY_FEATURE_NAME+"Rule"
		var Constraint existingRule = p.ownedRules.findFirst([it.name==rule_name])
		if (existingRule != null)
			existingRule.destroy
		var rule = p.createOwnedRule(rule_name)
		var oe = UMLFactory::eINSTANCE.createOpaqueExpression()
		oe.getLanguages().add("Optionality")
		oe.getBodies().add("if-feature NOT " + PRELIMINARY_FEATURE_NAME)
		rule.specification = oe
		rule.constrainedElements.addAll(constrainedElements)
		rule		
	}
	
	def getElementsWithHideGroupNameValue(Package p, String hideGroupName) {
		p.allOwnedElements.filter[getHideGroupName(p,it) == hideGroupName]	
	}
	
	def dispatch getHideGroupName(Package p, Element element) {
		""
	}
	
//	def dispatch getHideGroupName(Package p, Class element) {
//		try {
//			element.getValue(getStereotype(p.model, "EcimMoClass"),'hideGroupName') as String
//		}
//		catch (Exception e) {
//			""
//		}
//	}
//	
//	def dispatch getHideGroupName(Package p, Association association) {
//		try {
//			switch association {
//				case association.isStereotypeApplied(getStereotype(p.model,"EcimContainment")) :
//					association.getValue(getStereotype(p.model, "EcimContainment"),'hideGroupName') as String
//				case association.isStereotypeApplied(getStereotype(p.model,"EcimContribution")) :
//					association.getValue(getStereotype(p.model, "EcimContribution"),'hideGroupName') as String
//				default : ""		
//			}
//		}
//		catch (Exception e) {
//			""
//		}
//	}
	
	def dispatch getHideGroupName(Package p, Property property) {
		try {
			switch property {
				case property.isStereotypeApplied(getStereotype(p.model,"EcimAttribute_RO")) :
					property.getValue(getStereotype(p.model, "EcimAttribute_RO"),'hideGroupName') as String
				case property.isStereotypeApplied(getStereotype(p.model,"EcimAttribute_RW")) :
					property.getValue(getStereotype(p.model, "EcimAttribute_RW"),'hideGroupName') as String
				case property.isStereotypeApplied(getStereotype(p.model,"EcimStructMember")) :
					property.getValue(getStereotype(p.model, "EcimStructMember"),'hideGroupName') as String
				default : ""		
			}
		}
		catch (Exception e) {
			""
		}
	}
	
	
	def getClassifier(Model model, String name) {
		model.allOwnedElements.filter(typeof(Classifier)).findFirst([it.name==name])
	}
	
	
	def createCmwContribution(Type from, Type to) {
		val contribution = to.createAssociation(false, AggregationKind::NONE_LITERAL, from.name.toFirstLower, 1, 1,
         	from, 
         	false, AggregationKind::COMPOSITE_LITERAL, to.name.toFirstLower, 0, LiteralUnlimitedNatural::UNLIMITED)
         
         contribution.applyStereotype(getStereotype(to.model, "EcimContribution"))
         contribution.applyStereotype(getStereotype(to.model, "CmwContribution"))
         contribution.setValue(getStereotype(to.model, "CmwContribution"),"splitImmDn", "false")
	}
	
	def mapCounterType2CollectionMethod(String counterType) {
		switch counterType.trim().toUpperCase() {
			case "GAUGE" : "GAUGE"
			case "PEG" : "CC"
			case "DDM" : "CC"
			default : "CC"
		}
	}
	
	def getEnumerationLiteral(Model model, String name) {
		model.allOwnedElements.filter(typeof(EnumerationLiteral)).findFirst([it.name.toUpperCase() == name.toUpperCase()])		
	}
	
	def getPmClasses(Model model) {
		model.allOwnedElements.filter(typeof(Class)).filter[attributes.exists[name.startsWith("pm")]]
	}
	
	def getPmAttributes(Class pmClass) {
		pmClass.ownedAttributes.filter(typeof(Property)).filter[name.startsWith("pm")]
	}
	
	def createFeature(Package featuresPackage, String name) {	
		var c = featuresPackage.allOwnedElements.filter(typeof(Class)).findFirst([it.name==name])
		if (c!=null)
			return c
		c = featuresPackage.createOwnedClass(name, false);
		val s = getStereotype(featuresPackage.model, "EcimFeature")
		if (!c.isStereotypeApplied(s)) 
			c.applyStereotype(s)			
		c
	}
	
	def createDecision(Package decisionsPackage, String name) {	
		var c = decisionsPackage.allOwnedElements.filter(typeof(Class)).findFirst([it.name==name])
		if (c!=null)
			return c
		c = decisionsPackage.createOwnedClass(name, false);
		val s = getStereotype(decisionsPackage.model, "EcimDecision")
		if (!c.isStereotypeApplied(s)) 
			c.applyStereotype(s)			
		c
	}
	
	def createImsOptionalityRule(Package p, String name, Iterable<Element> constrainedElements) {
		var rule = p.createOwnedRule(name+"Rule")
		var oe = UMLFactory::eINSTANCE.createOpaqueExpression()
		oe.getLanguages().add("Optionality")
		oe.getBodies().add("if-feature " + name)
		rule.specification = oe
		rule.constrainedElements.addAll(constrainedElements)
		rule		
	}

	def createFeaturesPackage(Package rootPackage, String name) {	
		var p = rootPackage.allOwnedElements.filter(typeof(Package)).findFirst([it.name==name])
		if (p!=null)
			return p
		p = rootPackage.createNestedPackage(name);
		val s = getStereotype(rootPackage.model, "EcimFeatures")
		if (!p.isStereotypeApplied(s)) 
			p.applyStereotype(s)				
		p
	}	
	
	def createDecisionsPackage(Package rootPackage, String name) {	
		var p = rootPackage.allOwnedElements.filter(typeof(Package)).findFirst([it.name==name])
		if (p!=null)
			return p
		p = rootPackage.createNestedPackage(name);
		val s = getStereotype(rootPackage.model, "EcimDecisions")
		if (!p.isStereotypeApplied(s)) 
			p.applyStereotype(s)				
		p
	}	
	
	def createMomPackage(Package rootPackage, String name) {	
		var p = rootPackage.allOwnedElements.filter(typeof(Package)).findFirst([it.name==name])
		if (p!=null)
			return p
		p = rootPackage.createNestedPackage(name);
		val s = getStereotype(rootPackage.model, "EcimMom")
		if (!p.isStereotypeApplied(s)) 
			p.applyStereotype(s)
		p.setValue(s,"version", "1")	
		p.setValue(s,"release", "0")				
		p
	}
	
	def createInstancePackage(Model model, String name) {	
		var p = model.allOwnedElements.filter(typeof(Package)).findFirst([it.name==name])
		if (p!=null)
			return p
		p = model.createNestedPackage(name);
		val s = getStereotype(model, "EcimInstances")
		if (!p.isStereotypeApplied(s)) 
			p.applyStereotype(s)
		p.setValue(s,"version", "1")	
		p.setValue(s,"release", "0")				
		p
	}
	
	def convertToFirstLower(String s) {
		s.toFirstLower()
	}
	
	def getMimInfo(Package p) {
		newLinkedHashMap('name' -> p.name, 
						 'release' -> p.getValue(getStereotype(p.model, "EcimMom"),'release') as String, 
						 'version' -> p.getValue(getStereotype(p.model, "EcimMom"),'version') as String)
	}
	
	def getCounterInfo(Property p) {
		newLinkedHashMap('name' -> p.name, 
						 'description' -> p.ownedComments.map[body].join() as String,
						 'condition' -> p.getValue(getStereotype(p.model, "CppAttribute"),'condition')+"" as String, 
						 'reset' -> p.getValue(getStereotype(p.model, "CppAttribute"),'counterReset')+"" as String, 
						 'context' -> p.getValue(getStereotype(p.model, "CppAttribute"),'counterContext')+"" as String, 
						 'type' -> p.getValue(getStereotype(p.model, "CppAttribute"),'counterType') as String,
						 'multiplicity' -> p.upper+"" as String,
						 'size' -> p.getSize+"" as String)
	}
	
	def getSize(Property p) {
		var type = p.type
		if (type.name == "EcimInt64" || type.name == "EcimUInt64")
			8
		else
			4
	}
		
	def createMocInstance(Package p, String name, Classifier classifier) {	
		createIS(name, getStereotype(p.model, "EcimMocInstance"), classifier, p)	
	}
	
	def createStructInstance(Package p, String name, Classifier classifier) {	
		createIS(name, getStereotype(p.model, "EcimStructInstance"), classifier, p)	
	}
	
    def createIS(String id, Stereotype s, Classifier classifier, Package instancePackage) {
		val is = UMLFactory::eINSTANCE.createInstanceSpecification()
		is.name = id
		is.classifiers += classifier 
		instancePackage.packagedElements += is 
		is.applyStereotype(s)
		is
	}
	
	def createDependency(Model model, InstanceSpecification from, InstanceSpecification to) {
		val d = from.createDependency(to)
		d.applyStereotype(getStereotype(model, "EcimInstanceDependency"))
	}
	
	def createSlot(String name, InstanceSpecification is,
			Classifier classifier, Object value) {
		val slot = is.createSlot()
		val prop = classifier.getAttribute(name, null)
		slot.definingFeature = prop;

		switch value {
		  String : slot.createValue(null, prop.getType(), UMLPackage::eINSTANCE.getLiteralString())	=> [(it as LiteralString).value = value as String]			 
		  Boolean : slot.createValue(null, prop.getType(), UMLPackage::eINSTANCE.getLiteralBoolean()) => [(it as LiteralBoolean).value = value as Boolean]
		  Integer : slot.createValue(null, prop.getType(), UMLPackage::eINSTANCE.getLiteralInteger()) => [(it as LiteralInteger).value = value as Integer]
		  InstanceSpecification : slot.createValue(null, prop.getType(), UMLPackage::eINSTANCE.getInstanceValue()) => [(it as InstanceValue).instance = value as InstanceSpecification]
		}
		slot
	}
	
	def getStereotype(Model model, String name) {
		switch name {
			case name.startsWith("Ecim"): getEcimBaseProfile(model).getOwnedStereotype(name)
			case name.startsWith("Cmw"): getCmwProfile(model).getOwnedStereotype(name)
			case name.startsWith("Cpp"): getCppProfile(model).getOwnedStereotype(name)
		}	
	}
	
	def getEcimBaseProfile(Model model) {
		model.getAppliedProfile("ECIM Base Profile")
	}
	
	def getCmwProfile(Model model) {
		model.getAppliedProfile("CoreMW Profile")
	}
	
	def getCppProfile(Model model) {
		model.getAppliedProfile("CppProfile")
	}

	def String getSlotValue(InstanceSpecification it, String name) {
		slots.findFirst[definingFeature.name == name].values.take(1).toString()
	}
	
	static var ModelUtility instance
	
	def static INSTANCE() {	
		if (instance == null) 
			instance = new ModelUtility()
		instance
	}
}