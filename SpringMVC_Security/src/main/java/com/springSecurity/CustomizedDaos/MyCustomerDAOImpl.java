package com.springSecurity.CustomizedDaos;

import java.util.ArrayList;

import org.hibernate.internal.build.AllowSysOut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import com.springSecurity.CustomizedEntities.Customer;

@Repository
public class MyCustomerDAOImpl implements MyCustomerDAO {
	@Autowired
	HibernateTemplate hibernateTemplate;

	@SuppressWarnings({ "unchecked", "deprecation" })
	@Override
	public Customer CustomerfindCustomerByCustomername(String username) {
		ArrayList<Customer> customers = new ArrayList<Customer>();
		customers = (ArrayList<Customer>) hibernateTemplate.find("FROM customer WHERE username = '" + username + "'");
		Customer customer;
		if (customers.isEmpty()) {
			customer = null;
			return customer;
		} else {
			customer = customers.get(0);
			return customer;
		}
	}

}
