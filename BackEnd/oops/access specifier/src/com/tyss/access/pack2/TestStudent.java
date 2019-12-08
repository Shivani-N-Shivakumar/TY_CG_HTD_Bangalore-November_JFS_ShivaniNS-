package com.tyss.access.pack2;

import com.tyss.access.pack1.Student;

public class TestStudent extends Student {

	protected TestStudent(String name) {
		super(name);
		
	}
	void studentDetails() {
		
		System.out.println("student nam is "+studName);
	}
	public static void main(String[] ar) {
		TestStudent t=new TestStudent("deepak");
		
		t.studentDetails();
	}

}
