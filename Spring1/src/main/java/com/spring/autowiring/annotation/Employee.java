package com.spring.autowiring.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;


public class Employee {
//@Autowired
//@Qualifier("address1")
	Address address;
	String surname;

	public Employee(Address address, String surname) {
		super();
		this.address = address;
		this.surname = surname;
	}

	
//CONSTRUCTOR 
	@Autowired
	public Employee(@Qualifier("address1")  Address address) {
		this.address = address;
		System.out.println("ONLY ONE PARAMETER CONSTRUCTOR CAALLED");
	}
	
//SETTER METHOD 	
//	@Autowired
//	@Qualifier("address1")
	public void setAddress(Address address) {
		this.address = address;
		System.out.println("SETTING USING SETTER INJECTION");
	}

	
	

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public Address getAddress() {
		return address;
	}


	public Employee() {

	}

	@Override
	public String toString() {
		return "Employee [address=" + address + ", surname=" + surname + "]";
	}

}
