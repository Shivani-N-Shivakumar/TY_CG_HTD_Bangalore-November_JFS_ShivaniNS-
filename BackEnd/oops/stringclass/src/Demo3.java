
public class Demo3 {

	public static void main(String[] args) {
	String s1="john";
	System.out.println(s1.toLowerCase());
	System.out.println(s1.toUpperCase());

	String s2=("          JOHN MICHEASLY                ");
	System.out.println(s2.trim());
	
	String s4=s1.substring(3);
	System.out.println(s4);
	
	String s5="shivani";
	System.out.println(s5.substring(3,6));
	
	System.out.println(s5.isEmpty());
	
	String s6="shreeshree";
	System.out.println(s6.charAt(4));
	
	System.out.println(s6.indexOf("h"));
	System.out.println(s6.indexOf("re"));
	System.out.println(s6.indexOf("re",4));	
	System.out.println(s6.indexOf("h",4));
	
	
	}

}
