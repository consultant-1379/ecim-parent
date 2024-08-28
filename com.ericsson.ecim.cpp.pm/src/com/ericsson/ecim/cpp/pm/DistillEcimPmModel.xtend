package com.ericsson.ecim.cpp.pm

import java.util.HashMap
import java.util.Map
import org.eclipse.uml2.uml.InstanceSpecification
import org.eclipse.uml2.uml.InstanceValue
import org.eclipse.uml2.uml.Model
import org.eclipse.uml2.uml.Slot


/** 
 * Extracts the counters from an ECIM PM model and returns a simplified data structure for the generator to process.
 * 
 */
class DistillEcimPmModel {
	Model model
	
	new(Model m) {
		this.model = m
	}

	/** 
	 * Returns the PM classes list from all the "MeasurementType" classified instance specifications.
	 */
	def lookupPmMims() {	
		// Step 1: Look up all counters
		val counters = model.allOwnedElements.filter(typeof(InstanceSpecification)).filter[getClassifier("MeasurementType") != null]

		// Step 2: Loop through all counters and put them in a map with mo class as key
		val Map<String,PmMim> mimName2MimMap = new HashMap<String,PmMim>()
		for (counter : counters) {
			val deps = counter.clientDependencies
			if (deps.size >= 1) {
				val dep = deps.head
				val target = dep.targets.head as InstanceSpecification;
				if (target.getClassifier("PmGroup") != null) {
					val moClassSlot = lookupSlot(target, "moClass")
					val vs = moClassSlot.values.head
					val mocStructIs = (vs as InstanceValue).instance
					val mocName = getSlotValue(mocStructIs, "moClassName")
					val mimName = getSlotValue(mocStructIs, "mimName")
					val mimVersion = getSlotValue(mocStructIs, "mimVersion")
					val mimRelease = getSlotValue(mocStructIs, "mimRelease")
					val description = getSlotValue(counter, "description")
					val condition = getSlotValue(counter, "condition")
					val counterType = getSlotValue(counter, "collectionMethod")
					val counterReset = getSlotValue(counter, "resetAtGranPeriod")
					val size = getSlotValue(counter, "size") 
					val upper = getSlotValue(counter, "multiplicity")
					
					val pmAttr = new PmAttribute(counter.name, description, condition, counterType, counterReset, size, upper)
					
					val pmMim = mimName2MimMap.get(mimName) ?: new PmMim(mimName+"_PM", mimVersion, mimRelease, new HashMap<String,PmClass>)
					val pmClass = pmMim.classes.get(mocName) ?: new PmClass(mocName, newArrayList())
					pmClass.counters.add(pmAttr)
					pmMim.classes.put(mocName, pmClass)		
					mimName2MimMap.put(mimName, pmMim)
				}
			}
		}
		
		// Step 3: Create the final simplified data model 
		mimName2MimMap.keySet.map[mimName| mimName2MimMap.get(mimName)].toList
	}
	
	
	def String getSlotValue(InstanceSpecification it, String name) {
		val slot = lookupSlot(it, name)
		slot.values.head.stringValue
	}
	
	/**
	 * Looks up a slot by name.
	 * @param is
	 * @param name
	 * @return
	 */
	def Slot lookupSlot(InstanceSpecification it, String name) {
		slots.findFirst[definingFeature.name == name]
	}
}