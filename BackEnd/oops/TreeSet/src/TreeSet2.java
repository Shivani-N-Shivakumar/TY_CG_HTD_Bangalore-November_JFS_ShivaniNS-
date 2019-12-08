import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet2 {

	public static void main(String[] args) {
		TreeSet<Student> t=new TreeSet<Student>();
		t.add(new Student(23,"gundu"));
		t.add(new Student(22,"ramu"));
		t.add(new Student(21,"somu"));
Iterator<Student> i=t.iterator();
while(i.hasNext()) {
	System.out.println(i.next());
}
	}

}
