import java.util.LinkedList;

public class LinkedList3 {

	public static void main(String[] args) {
		LinkedList l1=new LinkedList();
		l1.add(2);
		l1.add(12);
		l1.add(23);
		l1.add(2);
		l1.add(20);
		System.out.println(l1);
		System.out.println("-----------------------------------");
		System.out.println("--------------- peek,peekfirst,peeklast--------------------");
		System.out.println(l1.peek());
		System.out.println(l1.peekFirst());
		System.out.println(l1.peekLast());
		System.out.println(l1);
		System.out.println("-----------------------------------");
		System.out.println("--------------- poll,pollfirst,polllast--------------------");
		System.out.println(l1.poll());
		System.out.println(l1.pollFirst());
		System.out.println(l1.pollLast());
		System.out.println(l1);
		
		
		System.out.println("-----------------------------------");
		LinkedList l2=new LinkedList();
		l2.add(2);
		l2.add(12);
		l2.add(23);
		l2.add(2);
		l2.add(20);
		System.out.println(l2);
		System.out.println("-----------------------------------");
		System.out.println("------offer,offerFirst,offerLast-----------------------------");
		l2.offer(2);
		System.out.println(l2);
		l2.offerFirst(23);
		System.out.println(l2);
		l2.offerLast(20);
		System.out.println(l2);
		
		
	}

}
