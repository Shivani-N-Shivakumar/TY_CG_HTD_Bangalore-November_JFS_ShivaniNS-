package multiplecatch;

import javax.crypto.AEADBadTagException;

public class ExceptionA {
void exception(int a,String string) {
	try {
		System.out.println(500/a);
		System.out.println(string.length());
	}catch(ArithmeticException e) {
		System.out.println("dont deal with 0");
		
	}catch(NullPointerException n) {
		System.out.println("dont deal with null");
	}
}
}
