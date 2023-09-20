package com.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.beans.HelloBeans;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("/com/spring/resources/applicationContext.xml");
		HelloBeans hb= (HelloBeans) context.getBean("helloBeans");
		//hb.setName("Laukesh");
		System.out.println(hb.sayHello());
	}
}

