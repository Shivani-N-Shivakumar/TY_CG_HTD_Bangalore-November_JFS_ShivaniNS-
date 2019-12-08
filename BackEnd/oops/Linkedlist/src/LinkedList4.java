import java.util.LinkedList;

public class LinkedList4 {

	public static void main(String[] args) {
		LinkedList l1=new LinkedList();
		l1.add(20);
		l1.add(67);
		l1.add(76);
		l1.add(56);
		l1.push(99);
		System.out.println("---------------push-------------");
		System.out.println(l1);
		l1.pop();
		System.out.println("---------------pop-------------");
		System.out.println(l1);
		System.out.println("---------------element-------------");
		System.out.println(l1.element());
		System.out.println("----------------------------------");
		System.out.println(l1);
	}

}
