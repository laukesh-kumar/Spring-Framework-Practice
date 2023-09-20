package com.spring.beans;

public class Course {
	private String cid;
	private String cname;
	private int ccost;
	
	public Course(String cid, String cname, int ccost) {
		this.cid = cid;
		this.cname = cname;
		this.ccost = ccost;
	}
	public void getCourseDetails() {
		System.out.println("Course details....");
		System.out.println("----------------------------");
		System.out.println("Course id           : "+cid);
		System.out.println("Course Name         : "+cname);
		System.out.println("Course Cost         : "+ccost);
	}
	

}
