package exceptionpropagation;

public class B {
static void n() {
	try {
		C.m();
}catch(ArithmeticException e2) {
	System.out.println(e2.getMessage());
	throw e2;
}
}
}
