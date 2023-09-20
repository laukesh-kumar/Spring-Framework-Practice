package com.spring.beans;

public class Student {
	private String sid;
	private String sName;
	private Account account;
	private Address address;
	private Address currentAddress;
	
	public String getSid() {
		return sid;
	}
	public void setSid(String sid) {
		this.sid = sid;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Address getcurrentAddress() {
		return currentAddress;
	}
	public void setcurrentAddress(Address currentAddress) {
		this.currentAddress = currentAddress;
	}
	public void getStudentDetails() {
		System.out.println("Student Details");
		System.out.println("----------------------------------------");
		System.out.println("Student Id           : "+sid);
		System.out.println("Student Name         : "+sName);
		System.out.println();
		System.out.println("Account Details");
		System.out.println("----------------------------------------");
		System.out.println("Account Number       : "+account.getAccNo());
		System.out.println("Accoutn Holder Name  : "+account.getAccHolderName());
		System.out.println();
		System.out.println("Student Address");
		System.out.println("----------------------------------------");
		System.out.println("Student Home         : "+address.getHome());
		System.out.println("Student City         : "+address.getCity());
		System.out.println();
		System.out.println("Student CurrentAddress");
		System.out.println("----------------------------------------");
		System.out.println("Student Home         : "+currentAddress.getHome());
		System.out.println("Student City         : "+currentAddress.getCity());
	}
}
