import java.util.Vector;

public class Vector1 {
public static void main(String[] args) {
	Vector v1=new Vector();
	v1.add(20);
	v1.add(39);
	v1.add(67);
	v1.add(76);
	System.out.println(v1);
	v1.remove(new Integer(67));
	System.out.println(v1);
	System.out.println(v1.size());
	System.out.println(v1);
	for(int i=0;i<v1.size();i++)
		System.out.println(v1.get(i));
}
}
