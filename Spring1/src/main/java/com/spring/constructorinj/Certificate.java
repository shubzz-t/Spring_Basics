package com.spring.constructorinj;

public class Certificate {
	String certiname;

	public Certificate(String certiname) {
		super();
		this.certiname = certiname;
	}

	@Override
	public String toString() {
		return "Certificate [certiname=" + certiname + "]";
	}

}
