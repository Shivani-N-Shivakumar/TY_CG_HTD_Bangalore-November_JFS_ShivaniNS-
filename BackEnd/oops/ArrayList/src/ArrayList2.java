import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayList2 {

	public static void main(String[] args) {
		ArrayList<String> a1=new ArrayList<String>();
		a1.add("deepak");
		a1.add("nikki");
		a1.add("shivani");
		System.out.println(a1);
		a1.remove(1);
		System.out.println(a1);
		
		
		System.out.println("--------------for loop----------");
		//iterating an arraylist using for loop
		for( int i=0;i<a1.size();i++) {
			System.out.println(a1.get(i));
			}
		
		System.out.println("--------------for each loop----------");
		//iterating an arraylist using foreach loop
		for( String i1:a1) {
			System.out.println(i1);
			}
		
		
		System.out.println("--------------iterator method----------");
		Iterator<String> itr=a1.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
		System.out.println("--------------list-iterator method----------");
		ListIterator<String> itr1=a1.listIterator(a1.size());
		while(itr1.hasPrevious()) {
			System.out.println(itr1.previous());
		}
		
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}
		
		ArrayList<String> a2=new ArrayList<String>();
		a2.add("handi");
		a2.add("chinni");
		System.out.println(a2);
		a2.remove( new String("handi"));
		System.out.println(a2);
		
		System.out.println(a1.size());
		
		System.out.println(a1.isEmpty());
		
		System.out.println(a1.contains("shivani"));
		
		a1.add("vidya");
		System.out.println(a1);
		
		a1.remove(2);
		System.out.println(a1);
		
		a2.addAll(a1);
		System.out.println(a1);
		
		a1.removeAll(a2);
		System.out.println(a2);
		
		a1.containsAll(a2);
		System.out.println(a2);
		
		
		

	}

}
