package com.spring.setterinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainAppln {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/setterinjection/configuration.xml");
		Student student = (Student)context.getBean("student1");
		
 System.out.println(student);
 
	}

}
