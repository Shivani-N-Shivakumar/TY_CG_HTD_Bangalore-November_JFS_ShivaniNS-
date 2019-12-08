package customunchecked;

public class SBIAtm {

	public static void main(String[] args) {
		System.out.println("main started");
		ATMSimulator a1=new ATMSimulator();
		try {
			a1.withDraw(41000);
		}catch(DayLimitException e) {
			System.out.println(e.getMessage());
		}
System.out.println("main ended");
	}

}
