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
@Target(ElementType.TYPE)
public @interface SalesforceObject {

    String name();
}
