package com.springSecurity.Config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class BasicOP {
	@Autowired
	HibernateTemplate hibernateTemplate;

//	@Transactional
//	public void save(users user) {
//		hibernateTemplate.save(user);
//	}
//
//	@Transactional
//	public void save(authorities aut) {
//		hibernateTemplate.save(aut);
//	}
}
