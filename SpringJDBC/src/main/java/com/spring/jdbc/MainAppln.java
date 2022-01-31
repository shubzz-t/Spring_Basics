package com.spring.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.spring.jdbc.StudentDao.StudentDaoImpl;
import com.spring.jdbc.entities.Student;

public class MainAppln {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/jdbc/jdbcconfig.xml");

		StudentDaoImpl imple = context.getBean("impl", StudentDaoImpl.class);

		//INSERT
//		Student student = new Student();
//		student.setName("ARIF");
//		student.setAddress("Nagar");
//		System.out.println(imple.insert(student));

		//UPDATE
//		Student student = new Student();
//		student.setId(2);
//		System.out.println(imple.update(student));
//		System.out.println(student);

		//DELETE
//		Student student = new Student();
//		student.setId(2);
//		System.out.println("USER DELETED :- " + imple.delete(student));
		
//		//FETCH SINGLE DATA
//		Student student = new Student();
//		student.setId(3);
//		System.out.println(imple.getStudent(student));
		
		//FETCH ALL DATA
		System.out.println(imple.getData());

		
		
	}
}
