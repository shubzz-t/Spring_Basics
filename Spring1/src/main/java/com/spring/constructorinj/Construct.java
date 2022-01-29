package com.spring.constructorinj;

import java.util.List;

public class Construct {
	int id;
	String name;
	Certificate certificate;
	List<String> list;

	public Construct(int id, String name, Certificate certificate, List<String> list) {
		super();
		this.id = id;
		this.name = name;
		this.certificate = certificate;
		this.list = list;
	}

	@Override
	public String toString() {
		return "Construct [id=" + id + ", name=" + name + ", certificate=" + certificate + ", list=" + list + "]";
	}
}
