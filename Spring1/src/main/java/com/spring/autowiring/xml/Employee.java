package com.spring.autowiring.xml;

public class Employee {
	Address address;
	String surname;

	public Employee(Address address, String surname) {
		super();
		this.address = address;
		this.surname = surname;
	}

	public Employee(Address address) {
		this.address = address;
		System.out.println("ONLY ONE PARAMETER CONSTRUCTOR CAALLED");
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

	public void setAddress(Address address) {
		this.address = address;
	}

	public Employee() {

	}

	@Override
	public String toString() {
		return "Employee [address=" + address + ", surname=" + surname + "]";
	}

}
