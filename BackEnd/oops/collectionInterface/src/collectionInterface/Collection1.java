package collectionInterface;

import java.util.ArrayList;
import java.util.Collection;

public class Collection1 {
public static void main(String[] args) {
	
	Collection c=new ArrayList();
	
	//adding an element inside the collection
	c.add(12);
	System.out.println(c);
	
	//removing an element from the collection
	c.remove(12);
	System.out.println(c);
	
	//finding the size of an collection
	System.out.println(c.size());
	
	//checking than collection is empty or not
	System.out.println(c.isEmpty());
	c.add(12);
	
	//checking whether 12 object is there or not inside the collection
	System.out.println(c.contains(12));
}
}
