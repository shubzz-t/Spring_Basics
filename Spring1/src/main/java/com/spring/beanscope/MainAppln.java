package com.spring.beanscope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainAppln {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/beanscope/beanscope.xml");
		Student student = context.getBean("student", Student.class);
		Student student1 = context.getBean("student", Student.class);
		System.out.println(student.hashCode());
		System.out.println(student1.hashCode());

		Person person = context.getBean("per1", Person.class);
		Person person1 = context.getBean("per1", Person.class);
		System.out.println(person.hashCode());
		System.out.println(person1.hashCode());

	}

}
