//package com.springSecurity.Entities;
//
//import java.io.Serializable;
//
//import javax.persistence.CascadeType;
//import javax.persistence.Column;
//import javax.persistence.EmbeddedId;
//import javax.persistence.Entity;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.ManyToOne;
//import javax.persistence.Table;
//
//@Entity
//@Table(name = "authorities")
//public class authorities implements Serializable {
//	@EmbeddedId
//	@ManyToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "username")
//	private users user;
//	@Column(name = "authority")
//	private String authority;
//
//	public authorities(users username, String authority) {
//		super();
//		this.user = username;
//		this.authority = authority;
//	}
//
//	public users getUsername() {
//		return user;
//	}
//
//	public void setUsername(users username) {
//		this.user = username;
//	}
//
//	public String getAuthority() {
//		return authority;
//	}
//
//	public void setAuthority(String authority) {
//		this.authority = authority;
//	}
//
//	public authorities() {
//
//	}
//
//}
