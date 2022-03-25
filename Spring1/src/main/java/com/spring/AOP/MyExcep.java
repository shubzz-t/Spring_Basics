package com.spring.AOP;

public class MyExcep extends Exception {

	public MyExcep() {
	}

	public MyExcep(String s)
	{
		System.out.println("ITS MY EXCEPTION"  + s);
	}
}
