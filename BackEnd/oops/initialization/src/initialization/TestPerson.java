package initialization;

public class TestPerson {

	public static void main(String[] args) {
		Person p1=new Person();
		p1.age=23;
		p1.name="john";
		p1.personDetails();
		Person p2=new Person();
		p2.initialize(23,"Divya");
		p2.personDetails();

	}

}
