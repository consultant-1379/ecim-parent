/*------------------------------------------------------------------------------
 * COPYRIGHT Ericsson 2010
 *
 * The copyright to the computer program(s) herein is the property of
 * Ericsson Inc. The programs may be used and/or copied only with written
 * permission from Ericsson Inc. or in accordance with the terms and
 * conditions stipulated in the agreement/contract under which the
 * program(s) have been supplied.
 *----------------------------------------------------------------------------*/
package com.ericsson.caf.cm.modeling;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/**
 * This annotation is used to mark a configurable bean.
 * 
 * Typical attributes are specified as elements, others are provided as properties
 *  
 * @author emartgu qmartjo, lmchuzh
 *
 */
@Target(TYPE)
@Retention(RUNTIME)
@Documented
public @interface Configurable{
    
    /**
     * Configuration name used in the original UML model, default empty string means the class name in UML model is 
     * the same as annotated JAVA class name. 
     */
    String name() default "";
    
    /**
     * The description can be used for documentation and by administration interfaces.
     * 
     * 
     * @return description of this configurable
     */
    String description() default "";
    
    /**
     * 
     * String array allowing defining any specific properties, can be a list of name value pairs
     * 
     * @return String array 
     */
    String[] properties() default {};
    
}
