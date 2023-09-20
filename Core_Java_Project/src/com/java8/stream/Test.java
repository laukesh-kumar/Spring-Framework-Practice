package com.java8.stream;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) {
		 ArrayList<Integer> marks = new ArrayList<Integer>();
		 marks.add(33);
		 marks.add(34);
		 marks.add(43);
		 marks.add(75);
		 marks.add(32);
		 System.out.println(marks);
		 //natural sorting
		 List<Integer> li= marks.stream().sorted().collect(Collectors.toList());
		 System.out.println(li);
		 //costumise sorting 
//		 Comparator<Integer> c = (I1,I2)->(I1>I2)?1:(I2>I1)?-1:0;
		 List<Integer>  li5=marks.stream().sorted((I1,I2)->(I1>I2)?-1:(I2>I1)?1:0).collect(Collectors.toList());
		 System.out.println(li5+"....compare method");
//		 Using compareTo Method
		 List<Integer>  li6=marks.stream().sorted((I1,I2)->I2.compareTo(I1)).collect(Collectors.toList());
		 System.out.println(li6+".... compateTo method");
		 // Count the marks of fails students
//		 Pridicate<Integer> p=i->i>35;
		 List<Integer> li1 = marks.stream().filter(i->i>35).collect(Collectors.toList());
		 System.out.println(li1);
		 //print list object value using stream
		 li1.stream().forEach(System.out::println);
		 //give 5 grace marks of each students
		 List<Integer> li2 = marks.stream().map(i->i+5).toList();
		 System.out.println(li2);
		 //count the value present inside arraylist
		 long li4=marks.stream().count();
		 System.out.println(li4);
		 LocalDateTime datetime = LocalDateTime.now();
		 System.out.println(datetime);
		 
	}

}
