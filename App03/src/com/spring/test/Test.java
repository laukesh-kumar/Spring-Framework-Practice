package com.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.beans.TestBeans;
import com.spring.config.AppConfig;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		
		TestBeans testBeans = (TestBeans) context.getBean("testBeans");
		testBeans.sayHello();
		System.out.println(testBeans.sayHello());
	}
}
