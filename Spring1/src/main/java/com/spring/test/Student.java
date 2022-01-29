package com.spring.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
	
	@Value("dsd")
	private String name;
	
	@Autowired
	private Address address;

	@Override
	public String toString() {
		return "Student [name=" + name + ", address=" + address + "]";
	}

	public Student(String name, Address address) {
		super();
		this.name = name;
		this.address = address;
	}

	public Student() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

}
