package com.spring.project.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "Users")
public class Users {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@Column(name = "name")
	private String name;

	@Column(name = "email")
	private String email;

	@Column(name = "date")
	@DateTimeFormat(pattern = "dd/mm/yyyy")
	private Date date;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Users(int id, String name, String email, Date date) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.date = date;
	}

	public Users(String name, String email, Date date) {
		super();
		this.name = name;
		this.email = email;
		this.date = date;
	}

	public Users(int id, String name, String email) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
	}

	public Users() {
		
	}

	public Users(String name, String email) {
		super();
		this.name = name;
		this.email = email;
	}

	

	
}
