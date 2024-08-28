package com.ericsson.ecim.stn.launcher.transformations.helpFiles.types;

public class TagType {
    
    private String tagName;
    
    public TagType(String tagName) {
        this.tagName = tagName;
    }
    
    
    //Getters
    
    public String name(){
        return this.tagName;
    }
}
