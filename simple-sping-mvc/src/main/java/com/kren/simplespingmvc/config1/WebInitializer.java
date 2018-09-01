package com.kren.simplespingmvc.config1;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class WebInitializer implements WebApplicationInitializer {
    public static final String URL_PATTERN = "/config-1/*";

    @Override
    public final void onStartup(ServletContext servletContext) throws ServletException {
	AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext();
	ctx.register(AppConfig.class);
	ctx.setServletContext(servletContext);

	ServletRegistration.Dynamic servlet = servletContext.addServlet("DispatcherServlet", new DispatcherServlet(ctx));

	servlet.setLoadOnStartup(1);
	servlet.addMapping(URL_PATTERN);
    }

}