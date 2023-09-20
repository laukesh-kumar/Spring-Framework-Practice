package com.spring.beans;

public class Employee {
	private String eid;
	private String ename;
	private String eadd;
	private Account acc;
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
	public Account getAcc() {
		return acc;
	}
	public void setAcc(Account acc) {
		this.acc = acc;
	}
	public void getEmpDetails() {
		System.out.println("Employee Details:- ");
		System.out.println("------------------------------");
		System.out.println("Employee Id         : "+eid);
		System.out.println("Employee Name       : "+ename);
		System.out.println("Employee  Address   : "+eadd);
		System.out.println("Employee Account    : "+acc);
		System.out.println();
		
		System.out.println("Account Details:- ");
		System.out.println("------------------------------");
		System.out.println("Account Numebr      : "+acc.getAccNo());
		System.out.println("Accoutn Type        : "+acc.getAccType());
		System.out.println("Account Balance     : "+acc.getBal());
	}
}
