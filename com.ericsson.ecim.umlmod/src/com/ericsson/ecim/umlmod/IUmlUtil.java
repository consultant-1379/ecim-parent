package com.ericsson.ecim.umlmod;

import java.io.File;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.ISafeRunnable;
import org.eclipse.uml2.uml.Model;

/**
 * Implement this interface to define your own UML utility that can be called via the
 * ECIM Tool-chain->Run Utility menu. In order for it to be shown in menu list,
 * you need to register the concrete class using the "com.ericsson.ecim.umlmod"
 * extension point.
 * @author ERAJAIK
 *
 */
public interface IUmlUtil extends ISafeRunnable {
    
    /**
     * Implement this method to conditionally include the UML utility in the
     * dialog. When this method is called, it is safe to access the model.
     */
    public boolean isApplicable();
    
    /**
     * Get the uml util id
     * @return
     */
    public String getUtilId();
    
    /**
     * Gets the model.
     * @return
     */
    public Model getModel();

    /**
     * Sets the model. 
     * @param model
     */
    public void setModel(Model model);
    
    /**
     * Gets the model file.
     * @return
     */
    public IFile getModelFile();
    
    /**
     * Sets the model file.
     * @param modelFile
     */
    public void setModelFile(IFile modelFile);
    
    /**
     * Gets the model file.
     * @return
     */
    public File getRawFile();
    
    /**
     * Sets the model file.
     * @param modelFile
     */
    public void setRawFile(File rawFile);
    
    
    /**
     * Implement this method to have a confirmation message shown before the UML
     * utility is run.
     */
    public String getConfirmationMessage();

    /**
     * Implement this method to give the UML utility a descriptive name.
     */
    @Override
    public String toString();
    
    /**
     * Gets the exception.
     * @return
     */
    public Exception getException();
    
    /**
     * Called outside the transaction after the @ISafeRunnable#run method has been called.
     */
    public void postTxWork();
    
}
