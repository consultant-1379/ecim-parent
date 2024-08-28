package com.ericsson.ecim.stn.launcher.transformations.helpFiles.types;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Class used to represent the classes and attributes in the model
 * 
 * @author ecarein
 *
 */
public class ElementType {

    private String type;
    private ElementType parent;
    private ArrayList<ElementType> children;
    private ArrayList<ValueType> vals;
    private ArrayList<TagType> tags;
    
    /**
     * Constructor for ElementType.
     * Needs a type that is either a 'class' or 'attribute' to differ between them.
     * @param type
     */
    public ElementType(String type) {
        this.type = type;
        this.parent = null;
        this.children = new ArrayList<ElementType>();
        this.vals = new ArrayList<ValueType>();
        this.tags = new ArrayList<TagType>();
    }
    
    
    //Setters
    /**
     * Sets 'parent' to this objects parent as well as adding this to the parents children.
     * Also sorts the elements according to their id.
     * @param parent
     * @param max
     * @param min
     */
    public void setParentForClass(ElementType parent, String max, String min) {
        parent.add(this);
        this.add(new ValueType("maxOccurs", max));
        this.add(new ValueType("minOccurs", min));
        this.sortElements();
    }
    
    //Getters
    public String type() {
        return this.type;
    }
    public String name() {
        return this.findValue("name");
    }
    public String documentation() {
        return this.findValue("description");
    }
    public String maxOccurs() {
        return this.findValue("maxOccurs");
    }
    public String minOccurs() {
        return this.findValue("minOccurs");
    }
    public String dataType() {
        return this.findValue("dataType");
    }
/*    public String instanceId() {
        return this.findAttributeValue("instanceId");
    }*/
    public String accessType() {
        return this.findValue("accessType");
    }
    public String restartType() {
        return this.findValue("restartType");
    }
    public String defaultValue() {
        return this.findValue("defaultValue");
    }
    /**
     * Looks at the deprecated tag.
     * Returns 'deprecated' if isDeprecated returns true
     * Otherwise returns 'current'
     * @return
     */
    public String status() {
        if(this.isDeprecated()) return "deprecated";
        return "current";
    }
    public String statusInformation() {
        return this.findValue("statusInformation");
    }


    
    //Getters PM
    public String pmDescription() {
        return this.findValue("PmDescription");
    }
    
    //Getters Counter
    /**
     * Returns at the counterType of the object.
     * Returns 'CC' if it is 'PEG' 
     * Returns 'GAUGE' if it is 'GAUGE'
     * @return
     */
    public String counterType() {
        String counterType = this.findValue("type");
        if(counterType == null) {
            System.out.println("SOMETHING WENT WRONG WITH: " + this.name());
            while(true); //TODO Debugging
        }
        if(counterType.equals("peg")) return "CC";
        else if(counterType.equals("gauge")) return "GAUGE";
        else {
            System.out.println("Something is wrong with counterType for: " + this.name() + " counterType: " + counterType);
            while(true); //TODO Debugging
        }
    }
    /**
     * Looks at the counterType to see which counterSubtype should be returned
     * Returns 'MEAN' if the type equals 'GAUGE'
     * Otherwise returns 'SUM' 
     * @return
     */
    public String counterSubtype() {
        if(this.counterType().equals("GAUGE")) return "MEAN";
        return "SUM"; //Type is CC
    }
    public String counterResultType() {
        return "decimal";
    }
    
    public ElementType parent() {
        return this.parent;
    }
    public ElementType child(int index) {
        return this.children.get(index);
    }
    
    public int id() {
        String id = this.findValue("id");
        if(id == null) {
            System.out.println("NO ID FOUND FOR: " + this.name());
            while(true); //TODO Debugging
        }
        else return Integer.parseInt(id);
    }
    public int size() {
        return this.children.size();
    }
    
    
    //Has Tags    
    public boolean isRoot() {
        return this.hasTag("root");
    }
    public boolean isDeprecated() {
        return this.hasTag("deprecated");
    }
    public boolean isSystemCreated() {
        return this.hasTag("systemCreated");
    }
    public boolean isDefaultValue() {
        return this.findValue("defaultCheckbox").equals("true");
    }
    /**
     * Goes through all of the objects children to look for a counter
     * Returns true if it finds a counter
     * Otherwise returns false
     * @return
     */
    public boolean hasCounters() {
        for(int index=0; index<this.size(); ++index) {
            if(this.child(index).isCounter()) return true;
        }
        return false;
    }
    
    
    //Attribute Type
    public boolean isAttribute() {
        return this.type().equals("attribute");
    }
    public boolean isKey() {
        return this.hasTag("key");
    }
    public boolean isCounter() {
        String counterType = this.findValue("counterType");
        if(counterType == null) return false;
        return counterType.equals("true");
    }
    public boolean isParameter() {
        return this.isAttribute() && !this.isKey() && !this.isCounter();
    }
    
    //Class Type
    public boolean isClass() {
        return this.type().equals("class");
    }
    
    //Adders
    /**
     * Adds child to the object and sets the child parent to this object
     * @param child
     */
    public void add(ElementType child) {
        this.children.add(child);
        child.parent = this;
    }
    public void add(ValueType val) {
        this.vals.add(val);
    }
    public void add(TagType tag) {
        this.tags.add(tag);
    }
    
    
    //Finders
    /**
     * Goes through the children in search of a child with the name 'name'
     * Returns the child dataType when found
     * @param name
     * @return
     */
/*    private String findAttributeValue(String name) {
        for(int index=0; index<this.size(); ++index) {
            ElementType child = this.children.get(index);
            if(child.name().equals(name)) return child.dataType();
        }
        System.out.println("found no child in findAttributeValue");
        while(true);
        
    }*/
    /**
     * Goes through all the values of the object
     * Returns the value if found
     * Otherwise returns null
     * @param type
     * @return
     */
    private String findValue(String type) {
        for(int index=0; index<this.vals.size(); ++index) {
            ValueType value = this.vals.get(index);
            if(value.type().equals(type)) return value.value();
        }
        if(!type.equals("counterType")) System.out.println("Searched in vals for: " + type + " but didn't find any!"); //TODO Debugging
        return null;
    }    
    /**
     * Goes through all the tags of the object
     * Returns true if found
     * Otherwise returns false
     * @param tagName
     * @return
     */
    private boolean hasTag(String tagName) {
        for(int index=0; index<this.tags.size(); ++index) {
            TagType tag = this.tags.get(index);
            if(tag.name().equals(tagName)) return true;
        }
        return false;
    }

    
    //Sorting
    private void sortElements() {
        Collections.sort(children, new ElementComparator());
    }

}
