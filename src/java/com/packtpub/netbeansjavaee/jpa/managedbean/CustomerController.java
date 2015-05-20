/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.packtpub.netbeansjavaee.jpa.managedbean;

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author A_RB
 */
@Named(value = "customerController")
@RequestScoped
public class CustomerController {

    /**
     * Creates a new instance of CustomerController
     */
    public CustomerController() {
    }
    
}
