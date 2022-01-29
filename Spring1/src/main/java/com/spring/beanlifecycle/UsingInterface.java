package com.spring.beanlifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class UsingInterface implements InitializingBean , DisposableBean{
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("(USINGINTERFACE) SETTING VALUE USING SETTER");
		this.name = name;
	}

	public UsingInterface() {
		System.out.println("(USINGINTERFACE) OBJECT CREATED DEFAULT CONSTRUCTOR ");
	}

	@Override
	public String toString() {
		return "UsingInterface [name=" + name + "]";
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("(USINGINTERFACE) INIT METHOD");
		
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("(USINGINTERFACE) DESTROY METHOD");
		
	}

}
