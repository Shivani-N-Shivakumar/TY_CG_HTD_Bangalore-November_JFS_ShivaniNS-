package com.cg.map.linkedhashmap;

import java.util.LinkedHashMap;
import java.util.Set;
import java.util.Map;

public class LinkedHashMap1 {

	public static void main(String[] args) {
	LinkedHashMap<String,Integer> l1=new LinkedHashMap<String,Integer>();
	l1.put("BTM", 560072);
	l1.put("Rajajinagar", 567800);
	l1.put("BTR", 670098);
	System.out.println(l1);
	System.out.println("---------------------------------------");
	l1.remove("BTM");
	System.out.println(l1);
	System.out.println("---------------------------------------");
	Set<Map.Entry<String,Integer>> s1=l1.entrySet();
	for(Map.Entry<String, Integer> e1:s1) {
		System.out.println(e1.getKey());
		System.out.println(e1.getValue());
	}
		System.out.println("---------------------------------------");
		System.out.println(l1.size());

	

	}

}
