package com.hibernate.model;

import java.nio.file.Files;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.entity.Images;

public class ImageModel {

	SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Images.class)
			.buildSessionFactory();

	public void addimages(Images img) {
		Session session = factory.getCurrentSession();
		session.beginTransaction();
		session.save(img);
		session.getTransaction().commit();
		System.out.println(img.getFilename() + " GOT ADDED....");
	}
}
