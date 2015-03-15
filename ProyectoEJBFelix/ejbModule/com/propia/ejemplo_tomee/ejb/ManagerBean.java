package com.propia.ejemplo_tomee.ejb;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;



/**
 * Session Bean implementation class ManagerBean
 */
@Stateless
@LocalBean
public class ManagerBean implements ManagerBeanRemote {

    /**
     * Default constructor. 
     */
    public ManagerBean() {
        // TODO Auto-generated constructor stub
    }
    public String saluda(){
    	System.out.println("Write hola");
    	return "return hola";
    }

}
