package com.springorm.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

import org.hibernate.internal.build.AllowSysOut;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.springorm.daos.StudentDao;
import com.springorm.entities.Student;

public class MainAppln {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("ormconfig.xml");

		StudentDao studentDao = context.getBean("studdao", StudentDao.class);

//		Student student = new Student("Kushal", "UTTARAKHAND");
//		System.out.println("DATA INSERTED := "+ studentDao.insert(student));

		// Student student = new Student();

//		System.out.println("DATA INSERTED := " + studentDao.select(student));

//		System.out.println("DATA INSERTED := " + studentDao.selectall());

//		// UPDATE
//		Student student = new Student();
//		student.setId(5);
//		student.setName("Pradeep");
//		student.setAddress("KARNATAK");
//		studentDao.update(student);

//		// DELETE
//		Student student = new Student();
//		student.setId(5);
//		student.setName("Pradeep");
//		student.setAddress("KARNATAK");
//		studentDao.delete(student);

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while (true) {
			System.out.println("DATABASE OPERATIONS......");
			System.out.println("1  TO SAVE DATA OF THE STUDENT.");
			System.out.println("2  TO UPDATE DATA OF THE STUDENT.");
			System.out.println("3  TO DELETE DATA OF THE STUDENT");
			System.out.println("4  TO SELECT DATA OF ONE STUDENT.");
			System.out.println("5  TO SELECT ALL DATA OF STUDENTS");
			System.out.println("6  TO EXIT FROM THE APPLICATION");
			try {
				int i = Integer.parseInt(br.readLine());

				switch (i) {
				case 1:
					System.out.println("...........SAVE OPERATION SELECTED...");
					Student student = new Student();
					System.out.println("ENTER THE NAME OF THE STUDENT :- ");
					student.setName(br.readLine());
					System.out.println("ENTER THE ADDRESS OF THE STUDENT :- ");
					student.setAddress(br.readLine());
					Integer integer = studentDao.insert(student);
					System.out.println( integer + "DATA SAVED..............................");
					break;

				case 2:
					System.out.println("...........UPDATE OPERATION SELECTED...");
					Student student1 = new Student();
					System.out.println("ENTER THE ID TO UPDATE :-");
					student1.setId(Integer.parseInt(br.readLine()));
					System.out.println("ENTER THE NAME OF THE STUDENT :- ");
					student1.setName(br.readLine());
					System.out.println("ENTER THE ADDRESS OF THE STUDENT :- ");
					student1.setAddress(br.readLine());
					studentDao.update(student1);
					System.out.println("DATA UPDATED............................");

					break;
				case 3:
					System.out.println("...........DELETE OPERATION SELECTED...");
					Student student2 = new Student();
					System.out.println("ENTER THE ID TO DELETE :- ");
					student2.setId(Integer.parseInt(br.readLine()));
					studentDao.delete(student2);
					System.out.println("DATA DELETED............................");
					break;
				case 4:
					System.out.println("...........SELECT ONE DATA OPERATION SELECTED...");
					Student student3 = new Student();
					System.out.println("ENTER THE ID TO SELECT DATA :- ");
					student3.setId(Integer.parseInt(br.readLine()));
					System.out.println(studentDao.select(student3));
					System.out.println("DATA SELECTED............................");
					break;
				case 5:
					System.out.println("...........SELECT ALL DATA OPERATION SELECTED...");
					List<Student> list = studentDao.selectall();
					for (Student student4 : list) {
						System.out.println(student4);
					}
					System.out.println("ALL DATA SELECTED............................");
					break;
				case 6:
					System.out.println("EXITING THE PROCESS...");
					System.exit(0);
				}

			} catch (Exception e) {
				System.out.println("INVALID INPUT TRY WITH ANOTHER INPUT.....");
				System.out.println(e);
			}
		}

	}

}
