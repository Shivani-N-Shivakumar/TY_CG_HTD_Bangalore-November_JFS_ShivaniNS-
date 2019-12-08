package exception;

public class Calculator {
void divide(int a,int b) {
	System.out.println("divide method is called");
	try {
	System.out.println(a/b);
}catch(ArithmeticException e) {
	System.out.println( "dont divide by zero");
	
}
}
}