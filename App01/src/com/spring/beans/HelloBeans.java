package com.spring.beans;

public class HelloBeans {
	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String sayHello() {
		return "HEllO SPRING---BEANS "+name;
	}

}
