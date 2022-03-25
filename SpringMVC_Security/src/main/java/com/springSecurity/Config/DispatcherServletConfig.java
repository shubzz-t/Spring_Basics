package com.springSecurity.Config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class DispatcherServletConfig extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		Class configclasses[] = { BeansConfiguration.class };
		return configclasses;
	}

	@Override
	protected String[] getServletMappings() {
		String mapping[] = { "/" };
		return mapping;
	}

}
