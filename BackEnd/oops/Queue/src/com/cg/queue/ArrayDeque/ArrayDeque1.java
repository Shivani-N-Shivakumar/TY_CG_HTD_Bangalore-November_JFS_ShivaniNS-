package com.cg.queue.ArrayDeque;

import java.util.ArrayDeque;

public class ArrayDeque1 {

	public static void main(String[] args) {
		ArrayDeque<String> a=new ArrayDeque<String>();
		a.add("shi");
		a.addLast("vani");
		a.addFirst("shivani");
		System.out.println(a);
		System.out.println(a.getFirst());
		System.out.println(a.getLast());
		a.removeFirst();
		a.removeLast();
		System.out.println(a);
		a.add("shi");
		a.addLast("vani");
		a.addFirst("shivani");
		System.out.println(a);
		a.remove();
		a.removeFirstOccurrence(a);
		a.removeLastOccurrence(a);
		System.out.println(a);
		System.out.println(a.peek());
		System.out.println(a.peekFirst());
		System.out.println(a.peekLast());
		System.out.println(a.poll());
		System.out.println( a);
		System.out.println(a.pollFirst());
		System.out.println(a.pollLast());
		a.offer("deepa");
		a.offerFirst("nikki");
		a.offerLast("putti");
		System.out.println(a);
		a.push("sho");
		System.out.println(a.pop());
		System.out.println(a.element());
		System.out.println(a);
		
		
		
		

	}

}
