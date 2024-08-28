package com.ericsson.ecim.stn.launcher.transformations.helpFiles.types;

//TODO Add Don't forget javadocs on all classes!

public class IntType {

    private int value;
    
    public IntType() {
        this(0);
    }
    public IntType(int value) {
        this.value = value;
    }
    
    public void inc() {
        this.value++;
    }
    public void dec() {
        this.value--;
    }
    public void inc(int inc) {
        this.value+=inc;
    }
    public void dec(int dec) {
        this.value-=dec;
    }
    
    public void set(int val) {
        this.value = val;
    }

    public int val() {
        return this.value;
    }

    
    
}
