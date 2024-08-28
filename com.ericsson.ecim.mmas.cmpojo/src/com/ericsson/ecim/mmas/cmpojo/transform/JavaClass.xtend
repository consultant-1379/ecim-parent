package com.ericsson.ecim.mmas.cmpojo.transform

import java.util.List
import java.util.Set

@Data class JavaClass {
	String packageName
	Set<String> extraImports
	
	String description
	String className
	
	List<JavaField> fields 
	
}