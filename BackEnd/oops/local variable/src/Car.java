
public class Car extends Vehicle {
int cost=50000;

void carDetails() {
	int cost=10000;
	System.out.println("localvariable cost of car is "+cost);
	System.out.println("globalvariable cost of car is "+this.cost);
	System.out.println("cost of car is "+super.cost);
}
}
