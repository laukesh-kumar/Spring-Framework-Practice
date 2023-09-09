package com.spring.beans;

public class Employee {
	private String eid;
	private String ename;
	private String eadd;
	public String getEid() {
		return eid;
	}
	public void setEid(String eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getEadd() {
		return eadd;
	}
	public void setEadd(String eadd) {
		this.eadd = eadd;
	}
	
	public void getEmpDetails() {
		System.out.println("Emp id      : "+eid);
		System.out.println("Emp Name    : "+ename);
		System.out.println("Emp Address : "+eadd);
	}
}
