package it.web;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.core.Application;
import javax.ws.rs.ApplicationPath;



@ApplicationPath("/")
public class MainApplication extends Application {
    @Override
    public Set<Class<?>> getClasses() {
        final Set<Class<?>> classes = new HashSet<Class<?>>();
        // register root resource
        classes.add(Labelresource.class);
        
        return classes;
    }
}