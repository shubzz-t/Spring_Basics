package com.spring.constructorinj;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainAppln {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/constructorinj/constructorconfig.xml");
		Construct r = (Construct) context.getBean("construct");
		System.out.println(r);
	}

}
