package nestedtry;

public class TestTry {

	public static void main(String[] args) {
		System.out.println("main started");
		ExceptionB b=new ExceptionB();
		b.exception(0, "shi");
		System.out.println("main ended");
	}

}
