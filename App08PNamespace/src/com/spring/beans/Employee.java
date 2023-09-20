package com.spring.beans;

public class Employee {
	private String eId;
	private String eName;
	private Account acc;
	public String geteId() {
		return eId;
	}
	public void seteId(String eId) {
		this.eId = eId;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public Account getAcc() {
		return acc;
	}
	public void setAcc(Account acc) {
		this.acc = acc;
	}
	public void getEmployeeDetails() {
		System.out.println("Employee Details");
		System.out.println("--------------------------------");
		System.out.println("Employee Id             : "+eId);
		System.out.println("Employee Name           : "+eName);
		System.out.println("");
		System.out.println("Account Details");
		System.out.println("Account Number          : "+acc.getAccNo());
		System.out.println("Accoutn Holder Name     : "+acc.getAccName());
	}
	

}
