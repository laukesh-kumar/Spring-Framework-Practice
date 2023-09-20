package com.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.beans.Employee;

public class Test {

	public static void main(String[] args) {
		ApplicationContext contex = new ClassPathXmlApplicationContext("/com/spring/resources/applicationContext.xml");
		Employee emp= (Employee) contex.getBean("empBean");
		emp.getEmployeeDetails();
	}

}
