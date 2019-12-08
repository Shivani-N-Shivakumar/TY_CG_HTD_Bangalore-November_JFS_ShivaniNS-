package com.tyss.typecasting.pack1;

public class Primitive {
//implicit type casting
	byte b=4;
	short s=b;
	int i=b;
	float f=b;
	double d=b;
	void values() {
		System.out.println("byte value is "+b);
		System.out.println("short value is "+s);
		System.out.println("int value is "+i);
		System.out.println("float value is "+f);
		System.out.println("double value is "+d);}
		//explicit type casting 
		
		double PI=3.142;
		int a=(int) PI;
		
		void details() {
			System.out.println("int value is "+a);
			System.out.println("double value is "+PI);
		}
		
	}

