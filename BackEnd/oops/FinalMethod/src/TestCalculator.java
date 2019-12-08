
public class TestCalculator {

	public static void main(String[] args) {
		Calculator c1=new Calculator();
		c1.add(22,33);
		System.out.println("--------------------------------------------");
		ScientificCalculator c2=new ScientificCalculator();
		c2.add(33, 22 );

	}

}
