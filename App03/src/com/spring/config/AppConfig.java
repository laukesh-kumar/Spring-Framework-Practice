package com.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.spring.beans.TestBeans;

 
public class AppConfig {
	static {
		System.out.println("class loading...");
	}
	public AppConfig() {
		System.out.println("Class instantiation...");
	}
	@Bean
	public TestBeans testBeans() {
		TestBeans tb = new TestBeans();
		tb.setName("Laukesh");
		return tb;
		
	}
}
