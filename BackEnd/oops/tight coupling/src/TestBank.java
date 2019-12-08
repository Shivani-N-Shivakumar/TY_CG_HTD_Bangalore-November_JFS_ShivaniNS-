
public class TestBank {

	public static void main(String[] args) {
		Atm a= new Atm();
		Bank b=new Bank();
		Hdfc h=new Hdfc();
		Sbi s = new Sbi();
		Icici i=new Icici();
		a.withDraw(h);

	}

}
