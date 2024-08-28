package com.ericsson.ecim.stn.launcher.transformations.helpFiles.types;

import java.util.ArrayList;

public class MomType {

    private ArrayList<SimpleTypeType> simpleTypes;
    private ArrayList<ValueType> vals;
    private ElementType root;
    
    public MomType() {
        this.root = null;
        simpleTypes = new ArrayList<SimpleTypeType>();
        vals = new ArrayList<ValueType>();
    }
    
    
    //Getters
    public String contact() {
        return this.findValue("contact");
    }
    public String lastUpdated() {
        return this.findValue("date");
    }
    public String documentNumber() {
        return this.findValue("docNo");
    }
    public String documentation() {
        return this.findValue("description");
    }
    public String name() {
        return this.findValue("name");
    }
    public String changeHistory() {
        return this.findValue("changeHistory");
    }
    public String attributes() {
        return this.findValue("attributes");
    }

    //Getters-SchemaRow Attribute
    public String version() {
        return this.findValue("version")  + "." + this.findValue("release");
    }
    public String type() {
        return this.findValue("type");
    }
    public String xs() {
        return this.findValue("xs");
    }
    public String targetNamespace() {
        return this.findValue("targetNamespace");
    }
    public String stn() {
        return this.findValue("stn");
    }
    public String appInfo() {
        return this.findValue("appInfo");
    }
    public String elemFormDefault() {
        return this.findValue("elementFormDefault");
    }
    public String attrFormDefault() {
        return this.findValue("attributeFormDefault");
    }

    //Getters PM
    public String pmVersion() {
        String pmVersion = this.version();
        for(int index=pmVersion.length()-1; index>0; --index) {
            if(pmVersion.charAt(index) == '.') return pmVersion.substring(0, index);
        }
        return pmVersion;
    }
    public String pmTimestamp() {
        return this.findValue("PmTimestamp");
    }
    public String pmMimVersion() {
        return this.findValue("PmMimVersion");
    }
    public String pmDescription() {
        return this.findValue("PmDescription");
    }
    public String pmXi() {
        return this.findValue("PmXi");
    }
    /**
     * Finds and returns the PmId
     * If the Id is "OclUndefined" it will return "" instead
     * @return
     */
    public String pmId() {
        String PmId = this.findValue("PmId");
        if(PmId.equals("OclUndefined")) return "";
        else return PmId;
    }
    
    public ElementType root() {
        return this.root;
    }
    public SimpleTypeType simpleType(int index) {
        return this.simpleTypes.get(index);
    }
    public int simpleTypeSize() {
        return this.simpleTypes.size();
    }
    
    
    //Setters
    public void setRoot(ElementType root) {
        if(this.root == null) this.root = root;
        else {
            //TODO Debugging
            System.out.println("Adding root when already exists one!");
            System.out.println("old root: " + this.root.name());
            System.out.println("New root: " + root.name());
            while(true);
        }
    }
    
    
    //Adders    
    public void addValue(ValueType val) {
        if(val.type() == null) {
            System.out.println("Something is wrong in momType add value!");
            System.out.println("Type: " + val.type());
            System.out.println("Value: " + val.value());
        }
        this.vals.add(val);
    }
    public void addSimpleType(SimpleTypeType simpleType) {
        this.simpleTypes.add(simpleType);
    }
    
    
    //Finders
    private String findValue(String type) {
        for(int index=0; index<vals.size(); ++index) {
            ValueType val = vals.get(index);
            if(val.type() == null) System.out.println("the fuck??");
            if(val.type().equals(type)) return val.value();
        }
        return null;
    }
    
}
