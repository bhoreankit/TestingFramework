package com.InheritanceAndThreds;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread t=new MyThread();
		t.start();
		ThreadDemo td=new ThreadDemo();
		td.start();
		System.out.println("main thread");
	}

}
