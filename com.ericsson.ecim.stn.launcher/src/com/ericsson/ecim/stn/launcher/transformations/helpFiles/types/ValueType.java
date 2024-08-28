package com.ericsson.ecim.stn.launcher.transformations.helpFiles.types;

public class ValueType {
    
    private String type;
    private String value;
    
    public ValueType(String type, String value) {
        this.type = type;
        this.value = value;
    }
    
    public ValueType(String type) {
        this(type, null);
    }
    
    
    
    //Getters 
    
    public String type() {
        return this.type;
    }
    
    public String value() {
        return this.value;
    }
    
    
    //Setters
    
    public void setValue(String value) {
        if(this.value == null) this.value = value;
        else {
            //TODO Debugging
            System.out.println("THIS VALUETYPE ALREADY HAS A VALUE!");
            System.out.println("ValueType: " + this.type);
            System.out.println("ValueValue: " + this.value);
            System.out.println("New value: " + value);
            while(true);
        }
    }
    
}
