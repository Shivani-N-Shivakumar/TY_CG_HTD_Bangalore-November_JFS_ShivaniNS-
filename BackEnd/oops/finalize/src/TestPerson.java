
public class TestPerson {

	public static void main(String[] args) throws Throwable {
		System.out.println("-----------main started-----------");
		Person p1=new Person("john");
		p1.finalize();
		p1=null;
		System.gc();
		System.out.println("-----------main ended-----------");

	}

}
