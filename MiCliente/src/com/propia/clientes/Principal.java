package com.propia.clientes;

import java.util.ArrayList;
import java.util.Properties;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import com.propia.clientes.utils.ResourceLocator;
import com.propia.ejemplo_tomee.ejb.ManagerBean;
import com.propia.ejemplo_tomee.ejb.ManagerBeanRemote;




public class Principal {

	public static void main(String[] args)  {
		

		try{ 
			ResourceLocator locator = new ResourceLocator();
			//Actualmente se accede por JNDI pero en un futuro tambien se podrá acceder via REST
			ManagerBeanRemote myBean = (ManagerBeanRemote) locator.lookup("ManagerBeanRemote");
			myBean.saluda();
			
		}catch(NamingException ex){
			ex.printStackTrace();
		}
		

		
	}

}
