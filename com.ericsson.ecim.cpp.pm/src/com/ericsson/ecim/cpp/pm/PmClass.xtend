package com.ericsson.ecim.cpp.pm

import org.eclipse.xtend.lib.Data
import java.util.List

@Data class PmClass {
	String name
	List<PmAttribute> counters
}