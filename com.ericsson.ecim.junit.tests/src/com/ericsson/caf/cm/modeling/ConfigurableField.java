package com.ericsson.caf.cm.modeling;

/*------------------------------------------------------------------------------
 * COPYRIGHT Ericsson 2010
 *
 * The copyright to the computer program(s) herein is the property of
 * Ericsson Inc. The programs may be used and/or copied only with written
 * permission from Ericsson Inc. or in accordance with the terms and
 * conditions stipulated in the agreement/contract under which the
 * program(s) have been supplied.
 *----------------------------------------------------------------------------*/

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/**
 * 
 * This annotation is used to mark a configurable field.
 * 
 * Typical attributes are specified as an annotation attribute, others are provided in the properties.
 *  
 * @author emartgu qmartjo, lmchuzh
 *  
 * 
 */
@Target(FIELD)
@Retention(RUNTIME)
@Documented
public @interface ConfigurableField {

    /**
     * Configuration name used in the model, empty name means the attribute name from the class 
     * is same as attribute name in the model.
     */
    String name() default "";
    
    /**
     * The description can be used for documentation and by administration interfaces.
     * 
     * @return description of this configurable
     */
    String description() default "";
    
    /**
     * String array allowing defining any specific properties, can be a list of name value pairs
     * 
     * @return String array 
     */
    String[] properties() default {};
}
