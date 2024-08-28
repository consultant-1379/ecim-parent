package com.ericsson.ecim.mmas.cmpojo.transform

import org.eclipse.uml2.uml.Class
import org.eclipse.uml2.uml.Package

@Data class UmlClass {
	Class theClass
	Package theOwningPackage
}