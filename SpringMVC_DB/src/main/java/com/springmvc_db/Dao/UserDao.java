package com.springmvc_db.Dao;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.springmvc_db.model.User;

@Repository
public class UserDao {

	@Autowired
	private HibernateTemplate hibernateTemplate;

	@Transactional
	public int save(User user) {
		System.out.println("Dao...");
		Integer i = (Integer) hibernateTemplate.save(user);
		return i;
	}

}
