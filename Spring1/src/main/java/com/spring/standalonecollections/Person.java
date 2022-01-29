package com.spring.standalonecollections;

import java.util.List;

public class Person {
	private List<String> person;

	public List<String> getPerson() {
		return person;
	}

	public void setPerson(List<String> person) {
		this.person = person;
	}

	@Override
	public String toString() {
		return "Person [person=" + person + "]";
	}

}
