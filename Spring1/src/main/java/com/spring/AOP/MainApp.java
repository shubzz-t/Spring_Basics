package com.spring.AOP;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class MainApp {
	public static void main(String[] args) throws MyExcep {
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
		Student student = context.getBean("student", Student.class);
	
		//JOINPOINT
		//student.school();
	    //JOINPOINT
		
		//student.break_();
		
		
		//student.come(4);
		
		student.excep();
	}

}
