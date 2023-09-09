package com.spring.test;

import org.springframework.context.ApplicationContext; 
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.beans.Account;


public class Test {

	public static void main(String[] args) {
		ApplicationContext contex = new ClassPathXmlApplicationContext("/com/spring/resource/applicationContext.xml");
		
		Account acc = (Account) contex.getBean("account");
		acc.getAccountDetails();
	}

}
