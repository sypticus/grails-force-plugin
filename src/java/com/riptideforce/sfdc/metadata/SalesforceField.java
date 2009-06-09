/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.riptideforce.sfdc.metadata;

/**
 *
 * @author Carlos.Munoz
 */
public @interface SalesforceField {

    String name();

    boolean createable() default false;

    boolean updateable() default false;

}
