package com.spring.beanlifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class UsingAnnotations {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("(USINGANNOTATIONS) SETTER METHOD CALLED");
		this.name = name;
	}

	public UsingAnnotations() {
		System.out.println("(USINGANNOTATIONS) OBJECT CREATED DEFAULT CONSTRUCTOR");
	}

	@Override
	public String toString() {
		return "UsingAnnotations [name=" + name + "]";
	}

	@PostConstruct
	public void start() {
		System.out.println("(USINGANNOTATIONS) THE INIT METHOD");
	}

	@PreDestroy
	public void destroy() {
		System.out.println("(USINGANNOTATIONS) DESTROY MEHTOD CALLED");
	}
}
