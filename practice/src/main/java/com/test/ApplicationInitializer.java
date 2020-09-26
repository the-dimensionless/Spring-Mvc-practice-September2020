package com.test;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class ApplicationInitializer implements WebApplicationInitializer {

	public void onStartup(ServletContext servletContext) throws ServletException {
		// bootstrap the dispatcher servlet
		AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
		context.register(ApplicationConfig.class);
		
		ServletRegistration.Dynamic servletRegistration = 
				servletContext.addServlet("mvc", new DispatcherServlet(context));
		
		servletRegistration.setLoadOnStartup(1); //default is -1 for lazy loading procedure
		servletRegistration.addMapping("/"); // url for intercepting
		
	}
	

}
