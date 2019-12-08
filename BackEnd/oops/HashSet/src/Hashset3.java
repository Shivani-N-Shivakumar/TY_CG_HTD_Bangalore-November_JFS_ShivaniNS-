import java.util.HashSet;

public class Hashset3 {

	public static void main(String[] args) {

		HashSet<Student> hs2=new HashSet<Student>();
		hs2.add(new Student(22,"shree"));
		hs2.add(new Student(23,"anu"));
		hs2.add(new Student(22,"shree"));
		hs2.add(new Student(24,"Divya"));
		hs2.add(new Student(24,"Divya"));
		
		for(Object s1:hs2) {
		
	
			System.out.println(s1.equals(hs2));

			
				
		}

	}

}
