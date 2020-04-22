package it.web;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.core.Application;
import javax.ws.rs.ApplicationPath;
import org.glassfish.jersey.jettison.JettisonFeature;
import org.glassfish.jersey.server.ResourceConfig;


@ApplicationPath("/app")
public class MainApplication extends Application  {
    @Override
    public Set<Class<?>> getClasses() {
        final Set<Class<?>> classes = new HashSet<Class<?>>();
        // register root resource
        classes.add(Labelresource.class);
        classes.add(JettisonFeature.class);
        classes.add(org.glassfish.jersey.server.mvc.jsp.JspMvcFeature.class);
        return classes;
    }
//    public MainApplication() {
//    	this.register(Labelresource.class);
//    	this.register(JettisonFeature.class);
//    	this.register(org.glassfish.jersey.server.mvc.jsp.JspMvcFeature.class);
//    }
	
}
