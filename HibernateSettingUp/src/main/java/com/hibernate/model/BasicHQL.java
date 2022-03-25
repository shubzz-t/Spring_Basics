package com.hibernate.model;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.entity.Users;

public class BasicHQL {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Users.class)
				.buildSessionFactory();
		Session session = factory.getCurrentSession();

		try {
			session.beginTransaction();

			session.createQuery("Update Users set password='13456' where id=3").executeUpdate();

			session.getTransaction().commit();

		} finally {
			session.close();
			factory.close();
		}

	}

}

//RETRIEVE ALL DATA

//try {
//	session.beginTransaction();
//
//	List<Users> user = session.createQuery("from Users").getResultList();
//
//	for (Users users : user) {
//		System.out.println(users);
//	}
//
//	session.getTransaction().commit();
//
//}

//WHERE CLAUSE

//try {
//	session.beginTransaction();
//
//	List user = session.createQuery("from Users where first_name='Pratiksha'").getResultList();
//
//	
//		System.out.println(user);
//	
//
//	session.getTransaction().commit();
//
//}



//DELETE
//try {
//	session.beginTransaction();
//
//	session.createQuery("Delete from Users where id=4").executeUpdate();
//
//	session.getTransaction().commit();
//
//}



//Update

//try {
//	session.beginTransaction();
//
//	session.createQuery("Update Users set password='13456' where id=3").executeUpdate();
//
//	session.getTransaction().commit();
//
//}