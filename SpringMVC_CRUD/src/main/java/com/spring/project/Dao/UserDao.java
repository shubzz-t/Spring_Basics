package com.spring.project.Dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.spring.project.entity.Users;

@Repository
public class UserDao {

	@Autowired
	private HibernateTemplate hibernateTemplate;

	public List<Users> getAll() {
		List<Users> list = hibernateTemplate.loadAll(Users.class);
		return list;
	}

	public Users getSingle(int id) {
		Users user = hibernateTemplate.get(Users.class, id);
		return user;
	}

	@Transactional
	public void delete(int id) {
		Users user = hibernateTemplate.get(Users.class, id);
		hibernateTemplate.delete(user);
	}

	@Transactional
	public void update(Users user) {
		hibernateTemplate.update(user);
	}

	@Transactional
	public void save(Users user) {
		hibernateTemplate.save(user);
	}

}
