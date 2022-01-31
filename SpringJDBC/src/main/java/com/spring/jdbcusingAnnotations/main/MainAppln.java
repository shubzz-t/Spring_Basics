package com.spring.jdbcusingAnnotations.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.spring.jdbcusingAnnotations.StudentDao.StudentDaoImpl;

public class MainAppln {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);

		StudentDaoImpl imple = context.getBean("studentDao", StudentDaoImpl.class);

		// INSERT
//		Student student = new Student();
//		student.setName("ARIF");
//		student.setAddress("Nagar");
//		System.out.println(imple.insert(student));

		// UPDATE
//		Student student = new Student();
//		student.setId(2);
//		System.out.println(imple.update(student));
//		System.out.println(student);

		// DELETE
//		Student student = new Student();
//		student.setId(2);
//		System.out.println("USER DELETED :- " + imple.delete(student));

//		//FETCH SINGLE DATA
//		Student student = new Student();
//		student.setId(3);
//		System.out.println(imple.getStudent(student));

		// FETCH ALL DATA
		System.out.println(imple.getData());

	}
}
