package com.propia.ejemplo_tomee.ejb;

import javax.ejb.Remote;


@Remote
public interface ManagerBeanRemote {
	
	public String saluda();

}
