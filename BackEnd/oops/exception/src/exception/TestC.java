package exception;

public class TestC {
public static void main(String[] args) {
	System.out.println("main started");
	int[] a1=new int[2];
	a1[0]=10;
	a1[1]=20;
	try {
		a1[2]=30;
	}catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("there is no size to store the value" );
	}
	System.out.println("main ended");
}
}
