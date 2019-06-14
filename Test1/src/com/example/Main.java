package com.example;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {

	public static void main(String[] args) {

		Employee e1 = new Employee(1, "a");
		Employee e2 = new Employee(1, "b");
//		Map<Employee, String> s = new HashMap<Employee, String>();
//		s.put(e1, "a");
//		s.put(e2, "b");
//		
//		System.out.println(s.size());		
//		System.out.println(s.get(e2));
		
		Set<Employee> ss = new HashSet<>();
		System.out.println(ss.add(e1));
		System.out.println(ss.add(e2));
		System.out.println(ss);
		
		
		
		
		
		
// 		MyThread t1 = new MyThread(new A());
//		MyThread t2 = new MyThread(new A());
//		MyThread t3 = new MyThread(new A());
		
//		A a = new A();
//		MyThread t1 = new MyThread(a);
//		MyThread t2 = new MyThread(a);
//		MyThread t3 = new MyThread(a);
		
//		t1.start();
//		t2.start();
//		t3.start();
	}

}


class Employee{
	int i ;
	String s;
	
	
	public Employee(int i, String s) {
		super();
		this.i = i;
		this.s = s;
	}
	public int getI() {
		return i;
	}
	public void setI(int i) {
		this.i = i;
	}
	public String getS() {
		return s;
	}
	public void setS(String s) {
		this.s = s;
	}
	
	@Override
	public int hashCode() {
		return 10;
	}
	
	@Override
	public boolean equals(Object obj) {
	
		return true;
	}
	
	
}
