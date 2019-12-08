
public class Son extends Father {
	Son(){
		super("jan",20);
		System.out.println("C");
	}
Son(String name,int age){
	this();
	System.out.println("D");
}
}
