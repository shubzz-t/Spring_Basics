package com.spring.NOXML;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainAppln {

	public static void main(String[] args) {
//		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/NOXML/config.xml");
		Student student = context.getBean("student" , Student.class);
		student.display();
	}
}
