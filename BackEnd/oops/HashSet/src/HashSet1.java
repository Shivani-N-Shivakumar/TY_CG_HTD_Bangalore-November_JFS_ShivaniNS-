import java.util.HashSet;

public class HashSet1 {

	public static void main(String[] args) {
		HashSet hs=new HashSet();
		
		hs.add(23);
		hs.add(86);
		hs.add(12);
		hs.add(44);
		hs.add(23);
		hs.add(null);
		hs.add(null);
		for(Object object:hs) {
			System.out.println(object);
		}

		
		
		
		HashSet<String> hs2=new HashSet<String>();
		hs2.add("shree");
		hs2.add("divya");
		hs2.add("anu");
		hs2.add(null);
		for(Object object:hs2) {
			System.out.println(object);
		}
	}

}
