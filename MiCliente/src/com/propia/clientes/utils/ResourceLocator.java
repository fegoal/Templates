package com.propia.clientes.utils;

import java.util.Properties;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

public class ResourceLocator {
	
    private final Context context;
    private final String  commonPrefix;

    public ResourceLocator() throws NamingException {
        this(null);
    }

    public ResourceLocator(String commonPrefix) throws NamingException {
        Properties p = new Properties();
        p.put("java.naming.factory.initial", "org.apache.openejb.client.RemoteInitialContextFactory");
        p.put("java.naming.provider.url", "http://127.0.0.1:8080/tomee/ejb");

        this.commonPrefix = commonPrefix;
        this.context = new InitialContext(p);
    }

    public Object lookup(String name) {
        try {
            if ( commonPrefix != null) name = commonPrefix + "/" +name;
            return context.lookup(name);
        } catch (NamingException e) {
            throw new IllegalArgumentException(e);
        }
    }
    
    
    @SuppressWarnings("unchecked")
	public <T> T lookup(Class<T> type) {
        return (T) lookup(type.getName());
    }
    
    
    
}