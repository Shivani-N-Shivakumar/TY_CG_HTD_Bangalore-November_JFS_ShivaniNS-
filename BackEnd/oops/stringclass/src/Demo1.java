
public class Demo1 {

	public static void main(String[] args) {
	String s1="john";
	System.out.println("s1 hashcode value "+s1.hashCode());
	String s2="mickel";
	s1="pinky";
	String s3="john";
	System.out.println("s1 hashcode value "+s1.hashCode());
	System.out.println("s3 hashcode value "+s3.hashCode());

	}

}
