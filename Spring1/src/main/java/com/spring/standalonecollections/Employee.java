package com.spring.standalonecollections;

import java.util.List;

public class Employee {
	private List<String> name;

	public List<String> getName() {
		return name;
	}

	public void setName(List<String> name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + "]";
	}

}
