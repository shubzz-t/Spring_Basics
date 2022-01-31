package com.spring.jdbcusingAnnotations.main;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.spring.jdbcusingAnnotations.StudentDao.StudentDaoImpl;


@Configuration
@ComponentScan("com.spring.jdbcusingAnnotations")
public class JavaConfig {

	@Bean("ds")
	public DriverManagerDataSource getDataSource() {
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/Spring");
		ds.setUsername("root");
		ds.setPassword("");
		return ds;
	}

	@Bean("jdbcTemplate")
	public JdbcTemplate jdbcTemplate() {
		JdbcTemplate jdbcTemplate = new JdbcTemplate();
		jdbcTemplate.setDataSource(getDataSource());
		return jdbcTemplate;
	}

	@Bean("studentDao")
	public StudentDaoImpl studentDaoImpl() {
		StudentDaoImpl studentDaoImpl = new StudentDaoImpl();
		studentDaoImpl.setJdbcTemplate(jdbcTemplate());
		return studentDaoImpl;
	}
}
