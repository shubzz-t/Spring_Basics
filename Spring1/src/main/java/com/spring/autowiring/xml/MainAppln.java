package com.spring.autowiring.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MainAppln {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/autowiring/xml/bynameconfig.xml");
        Employee employee = context.getBean("empl" , Employee.class);
        System.out.println(employee);
	}

}
