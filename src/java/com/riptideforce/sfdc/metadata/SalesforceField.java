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

    String name();

    boolean createable() default false;

    boolean updateable() default false;

    boolean isId() default false;

}
