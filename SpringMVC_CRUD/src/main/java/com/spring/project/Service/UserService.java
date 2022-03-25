package com.spring.project.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.project.Dao.UserDao;
import com.spring.project.entity.Users;


@Service
public class UserService {
	@Autowired
	private UserDao userDao;
	
	public Users getSingle(int id)
	{
		Users user = userDao.getSingle(id);
		return user;
	}
	
	public List<Users> getAll()
	{
		return userDao.getAll();
	}
	
	public void update(Users user)
	{
		userDao.update(user);
	}
	
	public void save(Users user)
	{
	   userDao.save(user);
	}

	public void delete(int id) {
		userDao.delete(id);
	}
}
