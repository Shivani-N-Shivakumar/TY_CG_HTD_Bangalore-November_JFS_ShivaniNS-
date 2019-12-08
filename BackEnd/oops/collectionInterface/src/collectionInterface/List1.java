package collectionInterface;

import java.util.ArrayList;
import java.util.List;

public class List1 {

	public static void main(String[] args) {
		 List l1=new ArrayList();
		 //methods present in the list interface
		 l1.add(0,12);
		 l1.add(1,15);
		 l1.add(2,87);
		 l1.add(3,98);
		 l1.add(4,99);
		 l1.add(1,110);
		 System.out.println(l1);
		 System.out.println("------------------------");
		 
		 l1.remove(2);
		 System.out.println(l1);
		 System.out.println("------------------------");
		 
		 
		 System.out.println(l1.indexOf(110));
		 System.out.println("------------------------");
		 
		 l1.add(110);
		 System.out.println(l1);
		 System.out.println("------------------------");
		 
		 System.out.println(l1.lastIndexOf(110));
		 System.out.println("------------------------");
		 for(int i=0;i<l1.size();i++)
		 {
			 System.out.println(l1.get(i));
		 }
		 System.out.println("------------------------");
		 List l2=new ArrayList();
		 l2.add(12);
		 l2.add(23);
		 l2.add(24);
		 List l3=new ArrayList();
		 l3.add(12);
		 l3.add(25);
		 l3.add(24);
		 System.out.println(l2);
		 l2.addAll(l3);
		 System.out.println( l2);
		 System.out.println("------------------------");

		 List l4=new ArrayList();
		 l4.add(162);
		 l4.add(285);
		 l4.add(264);
		 l4.set(1, 299);
		 System.out.println(l4);
		 System.out.println("------------------------");

		 List l5=new ArrayList();
		 l5.add(192);
		 l5.add(85);
		 l5.add(64);
		 
		 List l6=l5.subList(0,2);
		 System.out.println(l6);
		 
		 
	}

}
