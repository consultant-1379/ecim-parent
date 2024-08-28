package com.ericsson.ecim.junit.oracles;

/**
 * This interface defines the methods all contracts implemtations should implement
 * 
 */
public interface IContract {
    
    /**
     * Test the source and target models against a number of contracts. This should be
     * over written by implementers of the contract
     * @return true if all contract pass otherwise false
     */
    public Boolean test();
}
