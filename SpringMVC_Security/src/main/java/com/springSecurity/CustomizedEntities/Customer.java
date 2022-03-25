package com.springSecurity.CustomizedEntities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "customer")
@Table(name = "customer")
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private int id;
	@Column(name = "email")
	private String email;
	@Column(name = "username")
	private String username;
	@Column(name = "address")
	private String address;
	@Column(name = "password")
	private String password;
	@Column(name = "authority")
	private String authority;
	@Column(name = "enabled")
	private int enabled;

	public Customer(String username, String password, int enabled) {
		super();
		this.username = username;
		this.password = password;
		this.enabled = enabled;
	}

	public Customer(String email, String username, String address, String password, String authority, int enabled) {
		super();
		this.email = email;
		this.username = username;
		this.address = address;
		this.password = password;
		this.authority = authority;
		this.enabled = enabled;
	}

	public Customer() {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAuthority() {
		return authority;
	}

	public void setAuthority(String authority) {
		this.authority = authority;
	}

	public int getEnabled() {
		return enabled;
	}

	public void setEnabled(int enabled) {
		this.enabled = enabled;
	}

	public Customer(int id, String email, String username, String address, String password, String authority,
			int enabled) {
		super();
		this.id = id;
		this.email = email;
		this.username = username;
		this.address = address;
		this.password = password;
		this.authority = authority;
		this.enabled = enabled;
	}

}
