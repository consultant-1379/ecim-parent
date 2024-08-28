package com.ericsson.ecim.stn.launcher.transformations.helpFiles.types;

import java.util.Comparator;

public class ElementComparator implements Comparator<ElementType>{
    @Override
    public int compare(ElementType elem1, ElementType elem2) {
        return elem1.id() - elem2.id();
    }
}