package com.capgemini.datastructure.array;

import java.util.Scanner;

public class Array1 {

	public static void main(String[] args) {
		int n,i;
	Scanner sc=new Scanner(System.in);
System.out.println("Enter no. of Elements you want in array");
n=sc.nextInt();
int a[]=new int[n];
System.out.println("Enter All the Elements");
for( i=0;i<n;i++) {
	a[i]=sc.nextInt();
	
}

	}

}
