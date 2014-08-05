package com.cao.whereislover.ws;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import java.util.HashSet;
import java.util.Set;
@ApplicationPath("rest")
public class MyService extends Application {
	
	public Set<Class<?>> getClasses() {
		Set<Class<?>> classes = new HashSet<Class<?>>();
		classes.add(LoverPosition.class);
		return classes;
	}
	
	public Set<Object> getSingletons() {
		return null;
		// nothing to do, no singletons
	}

}
