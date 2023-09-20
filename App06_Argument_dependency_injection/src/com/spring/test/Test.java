package com.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.beans.Course;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("/com/spring/resource/applicationContext.xml");
		
		Course cr = (Course) context.getBean("courseBean");
		cr.getCourseDetails();
	}

}
