package com.spring.beans;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Student {
	private String sid;
	private String sname;
	private Address sadd;
	private List<String> quali;
	private Map<String ,String> course_and_teacher;
	public String getSid() {
		return sid;
	}
	public void setSid(String sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public Address getSadd() {
		return sadd;
	}
	public void setSadd(Address sadd) {
		this.sadd = sadd;
	}
	public List<String> getQuali() {
		return quali;
	}
	public void setQuali(List<String> quali) {
		this.quali = quali;
	} 
	public Map<String, String> getCourse_and_teacher() {
		return course_and_teacher;
	}
	public void setCourse_and_teacher(Map<String, String> course_and_teacher) {
		this.course_and_teacher = course_and_teacher;
	}
	public void getStudentDetails() {
		System.out.println("Student Details");
		System.out.println("------------------------------");
		System.out.println("Stuent Id             : "+sid);
		System.out.println("Student Name          : "+sname);
		System.out.println("Student Qualifiactions: "+ quali);
		Iterator<String> itr1 = quali.iterator();
		while(itr1.hasNext()) {
			String list = itr1.next();
			System.out.println(list);
		}
		
		System.out.println("Course Details        : "+course_and_teacher);
		System.out.println("iterate map object using keySet and values method");
		for(String key:course_and_teacher.keySet()) {
			System.out.println("Course            : "+ key);
		}
		for(String value: course_and_teacher.values()) {
			System.out.println("Teacher           : "+value);
		}
		// iterate map object using for - each loop
		System.out.println("iterate map object using for - each loop");
		for(Map.Entry<String, String> entry:course_and_teacher.entrySet()) {
			System.out.println("Course            : "+entry.getKey());
			System.out.println("Teacher           : "+entry.getValue());
			System.out.println("**********************************************");
			
		}
		//iterate map object using iterator
		System.out.println("iterate map object using iterator ");
		Iterator<Map.Entry<String, String>> itr = course_and_teacher.entrySet().iterator();
		while(itr.hasNext()) {
			Map.Entry<String, String> entry= itr.next();
			System.out.println("Course            : "+entry.getKey());
			System.out.println("Teacher           : "+entry.getValue());
			System.out.println("**********************************************");
		}
		
		System.out.println();
		System.out.println("Student Address");
		System.out.println("------------------------------");
		System.out.println("Student HomeNo.       : "+sadd.getHomeNo());
		System.out.println("Student Area          : "+sadd.getArea());
		System.out.println("Student City          : "+sadd.getCity());
		System.out.println("Student State         : "+sadd.getState());
		System.out.println("Studet Countery       : "+sadd.getCountry());
	}

}
