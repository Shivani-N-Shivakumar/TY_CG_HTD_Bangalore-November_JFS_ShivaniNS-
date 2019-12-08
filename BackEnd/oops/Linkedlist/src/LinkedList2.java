import java.util.LinkedList;

public class LinkedList2 {

	public static void main(String[] args) {
		LinkedList l1=new LinkedList();
		l1.add(2);
		l1.add(12);
		l1.add(23);
		l1.add(2);
		l1.add(20);
		System.out.println(l1);
		System.out.println("-----------------------------------");
		System.out.println("--------------- addFirst and addLast --------------------");
		l1.addFirst(20);
		System.out.println(l1);
		System.out.println("-----------------------------------");
		l1.addLast(67);
		System.out.println(l1);
		System.out.println("-----------------------------------");
		System.out.println("----------------remove-------------------");
		l1.remove();
		System.out.println(l1);
		System.out.println("-----------------------------------");
		System.out.println("----------removeFirst and removeLast----------------------");
		l1.removeFirst();
		System.out.println(l1);
		System.out.println("-----------------------------------");
		l1.removeLast();
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
		System.out.println("------removefirstoccurance and removelastoccurance-----------------------------");
		l2.removeFirstOccurrence(2);
		System.out.println(l2);
		System.out.println("-----------------------------------");
		l2.removeLastOccurrence(2);
		System.out.println(l2);
		System.out.println("-----------------------------------");
		System.out.println("------------getfirst and getlast-----------------------");
		
		System.out.println(l2.getFirst());
		System.out.println("-----------------------------------");
		System.out.println(l2.getLast());
	
	}

}
