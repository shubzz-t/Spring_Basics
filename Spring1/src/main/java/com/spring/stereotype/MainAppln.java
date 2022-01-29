package com.spring.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainAppln {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/stereotype/stereotype.xml");
		Student student = context.getBean("student" , Student.class);
		System.out.println(student);
	}

}
