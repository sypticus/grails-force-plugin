/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.riptideforce.sfdc.metadata;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 *
 * @author Carlos.Munoz
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface SalesforceField {

    /** Actual Salesforce field name mapped */
    String name();

    /** Field can be set on create */
    boolean createable() default false;

    /** Field can be changed on update */
    boolean updateable() default false;

    /** Field is the object's Id */
    boolean isId() default false;
    
    /** Field is required */
    boolean required() default false;
    
    /** Default Value */
    String defaultValue() default "";

}
