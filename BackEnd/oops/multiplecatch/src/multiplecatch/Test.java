package multiplecatch;

public class Test {

	public static void main(String[] args) {
		
		System.out.println("main started");
		ExceptionA a1=new ExceptionA();
		a1.exception(0,"shi");
		a1.exception(12, null);
		System.out.println("main ended");
	}

}
