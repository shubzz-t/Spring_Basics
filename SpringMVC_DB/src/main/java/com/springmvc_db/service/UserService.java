package com.springmvc_db.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springmvc_db.Dao.UserDao;
import com.springmvc_db.model.User;

@Service
public class UserService {
	@Autowired
	private UserDao userDao;

	public void createAndSave(User user) {
		System.out.println("SERVICE");
		userDao.save(user);
	}
}
