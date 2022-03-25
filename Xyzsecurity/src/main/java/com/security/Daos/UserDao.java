package com.security.Daos;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import com.security.Entities.Employee;

@Component
public class UserDao {
	@Autowired
	HibernateTemplate hibernateTemplate;

	@SuppressWarnings("deprecation")
	public Employee getUser(String name) {
		Employee emp = new Employee();
		@SuppressWarnings("unchecked")
		ArrayList<Employee> users = (ArrayList<Employee>) hibernateTemplate
				.find("FROM Employee WHERE username = '" + name + "'");

		if (users.isEmpty()) {
			emp = null;
			return emp;
		} else {
			return users.get(0);
		}
	}

}
