package com.spring.beans;

public class Course {
	private String cName;
	private String cCost;
	public Course(String cName, String cCost) {
		this.cName=cName;
		this.cCost=cCost;
	}
	public String getcName() {
		return cName;
	}
	public String getcCost() {
		return cCost;
	}
	
}
