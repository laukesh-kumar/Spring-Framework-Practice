package com.java8.lamda;

import java.util.function.Predicate;

public class PredicateTest {

	public static void main(String[] args) {
		Predicate<Integer> f =a-> a*a == 9;
		System.out.println(f.test(3));
	}

}
