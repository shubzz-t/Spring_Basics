//package com.springSecurity.Entities;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.Table;
//
//@Entity
//@Table(name = "users")
//public class users {
//	@Id
//	@Column(name = "username")
//	private String username;
//	@Column(name = "password")
//	private String password;
//	@Column(name = "enabled")
//	private int enabled=1;
//
//	public int getEnabled() {
//		return enabled;
//	}
//
//	public void setEnabled(int enabled) {
//		this.enabled = enabled;
//	}
//
//	public String getUsername() {
//		return username;
//	}
//
//	public void setUsername(String username) {
//		this.username = username;
//	}
//
//	public String getPassword() {
//		return password;
//	}
//
//	public void setPassword(String password) {
//		this.password = password;
//	}
//
//	public users() {
//
//	}
//
//	@Override
//	public String toString() {
//		return "users [ username=" + username + ", password=" + password + "]";
//	}
//
//	public users(String username, String password) {
//		this.username = username;
//		this.password = password;
//	}
//
//}
