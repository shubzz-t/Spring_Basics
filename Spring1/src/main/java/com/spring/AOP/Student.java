package com.spring.AOP;

import org.springframework.stereotype.Component;

@Component
public class Student {
	
	public void school() {
		System.out.println("GOING TO SCHOOL...");
	}
	
	
	public void break_()
	{
		System.out.println("ITS STUDENT BREAK...");
	}
	
	
	public int come(int time)
	{
		//System.out.println("HE IS COMING AT .... " + time);
		return time;
	}

	
	public void excep() throws MyExcep
	{
		throw new MyExcep("  ITS THROWN NOW...");
	}
}
