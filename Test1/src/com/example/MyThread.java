package com.example;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyThread extends Thread {

	A a;

	public MyThread(A a) {
		this.a = a;
	}

	@Override
	public void run() {
		a.print();
		a.print1();
	}
}

class A {
	

	public  void print() {
		synchronized(A.class){
		for (int i = 0; i < 10; i++) {
			System.out.println("@@@ " + Thread.currentThread().getName());
		}
		}
	}

	public void print1() {
		synchronized(A.class){
		for (int i = 0; i < 10; i++) {
			System.out.println("### " + Thread.currentThread().getName());
		}
		}
	}
}
