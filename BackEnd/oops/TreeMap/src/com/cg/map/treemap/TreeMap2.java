package com.cg.map.treemap;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMap2 {

	public static void main(String[] args) {
		SortByAge sortAge=new SortByAge();
		TreeMap<Student,String> t1=new TreeMap<Student,String>(sortAge);
		t1.put( new Student(25,"shiavni"),"1st standard");
				t1.put( new Student(10,"vani"),"2nd standard");
						t1.put( new Student(18,"shi"),"3rd standard");
		Set<Map.Entry<Student,String>> s1=t1.entrySet();
						
						for(Map.Entry<Student, String>e1:s1) {
							System.out.println(e1.getKey());
							System.out.println(e1.getValue());
							System.out.println("-----------------------------");
						}
								
		
		

	}

}
