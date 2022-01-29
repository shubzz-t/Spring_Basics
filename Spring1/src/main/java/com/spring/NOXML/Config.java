package com.spring.NOXML;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration

public class Config {
	
	@Bean
	public Student student()
	{
		return new Student();
	}
	


}
