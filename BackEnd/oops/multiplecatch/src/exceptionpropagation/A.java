package exceptionpropagation;

public class A {
static void o() {
	try {
	B.n();
}catch(ArithmeticException e1) {
	System.out.println( e1.getMessage());
}
}
}
