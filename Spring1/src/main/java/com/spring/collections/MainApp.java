package com.spring.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/collections/configuration.xml");
		Collec collec = (Collec) context.getBean("coll");
		System.out.println(collec);

	}

}



