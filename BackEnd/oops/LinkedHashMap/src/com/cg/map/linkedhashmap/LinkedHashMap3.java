package com.cg.map.linkedhashmap;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMap3 {

	public static void main(String[] args) {
		LinkedHashMap<Integer,Employee> l1=new LinkedHashMap<Integer,Employee>();
		l1.put(34,new Employee(23000,"ramesh"));
		l1.put(56,new Employee(23000,"Divya"));
		l1.put(89,new Employee(23000,"sree"));
		System.out.println(l1.get(56));
		Set<Map.Entry<Integer,Employee>> s1=l1.entrySet();
		for(Map.Entry<Integer, Employee>e1:s1) {
			System.out.println(e1.getKey());
			System.out.println(e1.getValue());
			System.out.println("---------------------------");
		}
		System.out.println(l1.containsKey(34));
		

	}

}
