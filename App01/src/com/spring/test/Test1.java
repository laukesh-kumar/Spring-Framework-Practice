package com.spring.test;
class ThreadScope extends ThreadLocal<String>{
	@Override
	protected String initialValue() {
		return "Empty";
	}
}
class A {
	public void m1() {
		System.out.println("Method1: Thread1...."+Thread1.threadScope.get());
		System.out.println("Method1: Thread2...."+Thread2.threadScope.get());

	}
	public void m2() {
		System.out.println("Method2: Thread2...."+Thread2.threadScope.get());
	}
}
class Thread1 extends Thread{
	static ThreadScope threadScope = new ThreadScope();
	A a;
	Thread1(A a){
		this.a=a;
	}
	public void run() {
		threadScope.set("AAA..");
		a.m1();
	}
}
class Thread2 extends Thread{
	static ThreadScope threadScope = new ThreadScope();
	A a;
	Thread2(A a){
		this.a=a;
	}
	public void run() {
		threadScope.set("BBB..");
		a.m2();
	}
}
public class Test1 {
	public static void main(String[] args) throws Exception{
		A a = new A();
		Thread1 one = new Thread1(a);
		Thread2 two = new Thread2(a);
		one.start();
		two.start();
		
	}
}
