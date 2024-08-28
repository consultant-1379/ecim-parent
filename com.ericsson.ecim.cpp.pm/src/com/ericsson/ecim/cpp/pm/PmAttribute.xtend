package com.ericsson.ecim.cpp.pm

import org.eclipse.xtend.lib.Data

@Data class PmAttribute {
	String name
	String description
	String condition
	String counterType
	String counterReset
	String datatypeSize
	String datatypeUpper
}