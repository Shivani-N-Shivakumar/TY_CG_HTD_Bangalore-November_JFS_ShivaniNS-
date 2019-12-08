package collectionInterface;

import java.util.ArrayList;
import java.util.Collection;

public class Collection3 {

	public static void main(String[] args) {
		Collection c1=new ArrayList();
		c1.add(12);
		c1.add(23);
		Collection c2=new ArrayList();
		c2.add(24);
		c2.add(25);
		System.out.println(c1);
		c1.addAll(c2);
		System.out.println(c2);
		
		System.out.println("--------------------");
		
		Collection c3=new ArrayList();
		c3.add(12);
		c3.add(23);
		c3.add(83);
		c3.add(54);
		Collection c4=new ArrayList();
		c4.add(83);
		c4.add(25);
		c4.add(12);
		System.out.println(c3);
		c3.removeAll(c4);
		System.out.println(c4);
		
		System.out.println("--------------------");
		
		Collection c5=new ArrayList();
		c5.add(25);
		c5.add(23);
		c5.add(12);
		c5.add(13);
		System.out.println(c5);
		c4.retainAll(c5);
		System.out.println(c5);
		System.out.println("--------------------");
		
	System.out.println(c4.containsAll(c5));
	System.out.println(c4);
	c4.clear();
	System.out.println(c4);
	
	System.out.println("--------------------");
	
	Collection c6=new ArrayList();
	c6.add(12);
	c6.add(23);
	
	Object a[]=c6.toArray();
	
	for(int i=0;i<a.length;i++) {
		System.out.println(a[i]);
	}
	System.out.println("--------------------");
	

	
	}

}
