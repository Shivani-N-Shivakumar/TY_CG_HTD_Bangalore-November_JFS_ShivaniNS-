package finalvariable;

public class InstanceVarible {

	final double MAXIMUM;
	static final  double PI;
	
	public InstanceVarible() {
		System.out.println("constructor is called");
	}
	public InstanceVarible(int a) {
		System.out.println("constructor overloaded");
	}
	{
		System.out.println("instance block executed");
		this.MAXIMUM=3000;
	}
	static {
		System.out.println("static initializer block executed");
		PI=3.142;
	}
	
}
