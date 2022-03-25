package com.security.Config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class DispatcherConfiguration extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		Class configclasses[] = { BeansConfig.class };
		return configclasses;
	}

	@Override
	protected String[] getServletMappings() {
		String mapping[] = { "/" };
		return mapping;
	}

}
