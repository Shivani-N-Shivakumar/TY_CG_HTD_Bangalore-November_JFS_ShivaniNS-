package com.cg.thread.creatingThread;

public class TestB {
	public static void main(String[] args) {
		System.out.println("main started");
		
		Theard2 t2=new Theard2();
		Thread t1=new Thread(t2);
		t1.start();
		System.out.println("main ended");
		}
}
