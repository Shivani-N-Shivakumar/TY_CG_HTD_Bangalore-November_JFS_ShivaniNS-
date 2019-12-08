package com.tyss.access.pack1;

public class Student {
	protected String studName;
	protected Student(String name) {
		studName=name;
	}
	protected void studDetails()
	{
		System.out.println("student name is "+studName);
	}
}
