package com.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.beans.Student;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("/com/spring/resource/applicationContext.xml");
		
		Student st = (Student) context.getBean("studentBean");
		st.getStudentDetails();
	}

}
