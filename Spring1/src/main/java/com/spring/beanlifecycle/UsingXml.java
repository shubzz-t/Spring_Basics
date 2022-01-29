package com.spring.beanlifecycle;

public class UsingXml {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("(USING XML) SETTING METHOD CALLED");
		this.name = name;
	}

	@Override
	public String toString() {
		return "USING XML [name=" + name + "]";
	}

	public UsingXml() {
		System.out.println("(USING XML) OBJECT CREATED DEFAULT CONSTRUCTOR");
	}

	public void init() {
		System.out.println("(USING XML) INSIDE INIT");
	}

	public void destroy() {
		System.out.println("(USING XML)INSIDE DESTROY");
	}

}
