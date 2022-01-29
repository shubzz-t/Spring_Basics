package com.spring.standalonecollections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainAppln {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/standalonecollections/standaloneconfig.xml");
		Employee employee = context.getBean("emp1" , Employee.class);
		System.out.println(employee);

		Person person = context.getBean("p1" , Person.class);
		System.out.println(person.getPerson().getClass());
	}

}
