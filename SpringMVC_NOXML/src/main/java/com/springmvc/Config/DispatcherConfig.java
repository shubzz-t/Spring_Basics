package com.springmvc.Config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class DispatcherConfig extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		Class[] classes = {BeanConfigurer.class};
		return classes;
	}

	@Override
	protected String[] getServletMappings() {
		String path[] = {"/"}; 
		return path;
	}

}
