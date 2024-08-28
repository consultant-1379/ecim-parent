package com.ericsson.ecim.cpp.pm

import org.eclipse.xtend.lib.Data
import java.util.Map

@Data class PmMim {
	String name
	String version
	String release
	Map<String,PmClass> classes
}