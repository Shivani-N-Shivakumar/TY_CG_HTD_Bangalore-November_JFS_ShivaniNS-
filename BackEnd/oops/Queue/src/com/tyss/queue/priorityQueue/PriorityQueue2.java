package com.tyss.queue.priorityQueue;

import java.util.PriorityQueue;

public class PriorityQueue2 {

	public static void main(String[] args) {
		PriorityQueue<Student> p1=new PriorityQueue<Student>();
		p1.offer(new Student(22,"divya"));
		p1.offer(new Student(23,"sree"));
		p1.offer(new Student(22,"divya"));
		for(Object o:p1) {
			System.out.println(o);
		}
	}

}
