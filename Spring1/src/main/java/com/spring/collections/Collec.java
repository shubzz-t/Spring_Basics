package com.spring.collections;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Collec {
	private String name;
	private List<String> phone;
	private Set<String> address;
	private Map<String, Integer> courses;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getPhone() {
		return phone;
	}
	public void setPhone(List<String> phone) {
		this.phone = phone;
	}
	public Set<String> getAddress() {
		return address;
	}
	public void setAddress(Set<String> address) {
		this.address = address;
	}
	public Map<String, Integer> getCourses() {
		return courses;
	}
	public void setCourses(Map<String, Integer> courses) {
		this.courses = courses;
	}
	public Collec(String name, List<String> phone, Set<String> address, Map<String, Integer> courses) {
		super();
		this.name = name;
		this.phone = phone;
		this.address = address;
		this.courses = courses;
	}
	public Collec() {
		
	}
	@Override
	public String toString() {
		return "Collec [name=" + name + ", phone=" + phone + ", address=" + address + ", courses=" + courses + "]";
	}
	
	
	
	
	

}
