package com.java8.lamda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

interface Add{
	public int addMethod(int a, int b);
	
}
//class MyComparator implements Comparator<Integer>{
//
//	@Override
//	public int compare(Integer o1, Integer o2) {
//		if(o1<o2) {
//			return -1;
//		}
//		else if(o1>o2) {
//			return 1;
//		}
//		return 0;
//	}
//	
//}
public class LamdaTest1 {

	public static void main(String[] args) {
		Add add= (a, b) -> a+b;
		System.out.println(add.addMethod(10, 20));
		ArrayList<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(1);
		list.add(12);
		list.add(5);
		//MyComparator m = new MyComparator();
		Comparator<Integer> m = (o1,o2) -> (o1<o2)?1:(o1>o2)?-1:0;
		Collections.sort(list,m);
		System.out.println(list);
		list.stream().forEach(System.out::println);
	}

}
