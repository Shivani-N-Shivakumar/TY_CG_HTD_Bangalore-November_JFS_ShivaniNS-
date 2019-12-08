import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayList1 {

	public static void main(String[] args) {
		ArrayList<Integer> a1=new ArrayList<Integer>();
		a1.add(12);
		a1.add(35);
		a1.add(38);
		a1.add(12);
		a1.add(56);
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
		for( Integer i1:a1) {
			System.out.println(i1);
			}
		
		
		System.out.println("--------------iterator method----------");
		Iterator<Integer> itr=a1.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
		System.out.println("--------------list-iterator method----------");
		ListIterator<Integer> itr1=a1.listIterator(a1.size());
		while(itr1.hasPrevious()) {
			System.out.println(itr1.previous());
		}
		
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}
		
		ArrayList<Integer> a2=new ArrayList<Integer>();
		a2.add(23);
		a2.add(24);
		System.out.println(a2);
		a2.remove( new Integer(23));
		System.out.println(a2);
		
		
		
	}

}
