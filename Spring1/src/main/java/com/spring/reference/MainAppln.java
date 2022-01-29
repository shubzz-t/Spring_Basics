package com.spring.reference;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainAppln {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/reference/refconfig.xml");
		A a = (A)context.getBean("aref");
		System.out.println(a);
		System.out.println(a.getOb());
	}

}
