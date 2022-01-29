package com.spring.beanlifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainAppln {

	public static void main(String[] args) {

		AbstractApplicationContext context = new ClassPathXmlApplicationContext(
				"com/spring/beanlifecycle/lifecycleconfig.xml");

		UsingXml basic = (UsingXml) context.getBean("usingx");
		System.out.println(basic);

		// REGISTERSHUTDOWNHOOK used for calling destroy method
		// registershutdown... present inside AbtractApplicationContext which is
		// abstract class
		context.registerShutdownHook();
		
		
		UsingInterface interface1 = (UsingInterface) context.getBean("usingi");
		System.out.println(interface1);
		
		UsingAnnotations annotations = (UsingAnnotations)context.getBean("usinga");
		System.out.println(annotations);
	}

}
