package com.ericsson.ecim.stn.launcher.transformations.helpFiles.types;

import java.util.ArrayList;

import com.ericsson.ecim.stn.launcher.transformations.helpFiles.enums.EnumSimpleType;


public class SimpleTypeType {

    
    private static final String[] basic_bases = {"integer", "string", "int64"};
    
    
    private String name;
    private String base;
    private EnumSimpleType type;
    private ArrayList<String> values;
    
    
    public SimpleTypeType(String name) {
        this.name = name;
        this.type = EnumSimpleType.NONE;
        this.values = new ArrayList<String>();
    }
    
    
    //Getters
    public String name() {
        return this.name;
    }
    public String base() {
        return this.base;
    }
    public EnumSimpleType type() {
        return this.type;
    }
    public String value(int index) {
        return this.values.get(index);
    }
    public int size() {
        return this.values.size();
    }
    
    
    //Setters
    public void setBase(String base) {
        if(base.isEmpty()) return;
        if(isSimpleTypeBase(base)) base = "stn:" + base;
        else {
            if(base.equals("int64")) base = "xs:integer";
            else base = "xs:" + base;
        }
        this.base = base;
    }    
    public void setType(EnumSimpleType type) {
        this.type = type;
    }
    public void add(String value) {
        this.values.add(value);
    }
    
    
    
    //Static methods
    private static boolean isSimpleTypeBase(String base) {
        for(int index=0; index<basic_bases.length; ++index) {
            if(base.equals(basic_bases[index])) return false;
        }
        return true;
    }
    
}
