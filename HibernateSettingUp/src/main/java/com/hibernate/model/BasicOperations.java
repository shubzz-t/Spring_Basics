package com.hibernate.model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.entity.Users;
import com.mysql.cj.exceptions.ClosedOnExpiredPasswordException;

public class BasicOperations {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Users.class)
				.buildSessionFactory();
		Session session = factory.getCurrentSession();
		
		try {
		//CREATE OBJ OF ENTITY CLASS TYPE
		Users users = new Users( "oy" , "joy", "noy", "foy");
		
		//BEGIN THE TRANSACTION
		session.beginTransaction();
		
		//PERFORM OPERATION
		session.save(users);
		
		//COMMIT THE TRANSACTION
		session.getTransaction().commit();
		System.out.println("USER SAVED");
		} finally {
			session.close();
			factory.close();
		}
	}

}

//INSERT

//try {
//	//CREATE OBJ OF ENTITY CLASS TYPE
//	Users users = new Users( "Kiran" , "Roy", "Kirna", "Roy");
//	
//	//BEGIN THE TRANSACTION
//	session.beginTransaction();
//	
//	//PERFORM OPERATION
//	session.save(users);
//	
//	//COMMIT THE TRANSACTION
//	session.getTransaction().commit();
//	System.out.println("USER SAVED");
//	
//}

//RETRIEVE

//try {
//	// CREATE OBJ OF ENTITY CLASS TYPE
//	Users users = new Users();
//
//	// BEGIN THE TRANSACTION
//	session.beginTransaction();
//
//	// PERFORM OPERATION
//	users = session.get(Users.class , 5);
//
//	// COMMIT THE TRANSACTION
//	session.getTransaction().commit();
//	System.out.println(users);
//
//}

//UPDATE

//try {
//	// CREATE OBJ OF ENTITY CLASS TYPE
//	Users user = new Users();
//
//	// BEGIN THE TRANSACTION
//	session.beginTransaction();
//
//	// PERFORM OPERATION
//	user = session.get(Users.class, 5);
//	user.setFirstname("Sushant");
//	user.setLastname("Rajput");
//	user.setPassword("sushraj");
//	user.setUsername("sushantrajput");
//
//	session.save(user);
//
//	// COMMIT THE TRANSACTION
//	session.getTransaction().commit();
//	System.out.println("UPDATED");
//
//}

//DELETE

//try {
//	// CREATE OBJ OF ENTITY CLASS TYPE
//	Users user = new Users();
//
//	// BEGIN THE TRANSACTION
//	session.beginTransaction();
//
//	// PERFORM OPERATION
//	user = session.get(Users.class, 5);
//	session.delete(user);
//
//	// COMMIT THE TRANSACTION
//	session.getTransaction().commit();
//	System.out.println("DELETED");
//
//}