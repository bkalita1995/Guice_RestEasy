package com.restdemo.config;

import java.util.*;

import javax.servlet.ServletContext;

import org.jboss.resteasy.plugins.guice.GuiceResteasyBootstrapServletContextListener;

import com.google.inject.Injector;
import com.google.inject.Module;
import com.google.inject.persist.PersistService;
import com.google.inject.persist.jpa.JpaPersistModule;
import com.restdemo.module.MyModule;


public class GuiceConfig extends GuiceResteasyBootstrapServletContextListener{
	
	@Override
	protected java.util.List<? extends Module> getModules(ServletContext context) {
	return Arrays.asList(new JpaPersistModule("demo"), new MyModule());
	}
	    
	    @Override
	    public void withInjector(Injector injector)
	    {
	        injector.getInstance(PersistService.class).start();
	    }

}
