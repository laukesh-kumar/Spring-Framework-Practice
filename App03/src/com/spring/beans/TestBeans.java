package com.spring.beans;

public class TestBeans {
	private String name;
	static {
		System.out.println("Bean Class loading...");
	}
	public TestBeans() {
		System.out.println("Bean Class instantiation...");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String sayHello() {
		return "HEllO, users...Good Morning"+name;
	}
}
