/**
 * 
 */
package com.ericsson.ecim.umlmod;

import java.io.File;

/**
 * Interface for Utilities to set previous transformation result location
 * @author eyuwehu
 *
 */
public interface IPostUtil {

    /**
     * Gets the previous input result.
     * @return
     */
    public File getInputResultLocation();

    /**
     * Sets the previous input result.
     * @param modelFile
     */
    public void setInputResultLocation(File resultLocation);

}
