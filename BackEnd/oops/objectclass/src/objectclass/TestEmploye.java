package objectclass;

public class TestEmploye {

	public static void main(String[] args) {
		Employe e1=new Employe(222,"anu");
		Employe e2=new Employe(222,"anu");
		Employe e3=new Employe(22,"divya");
		System.out.println(e1.equals(e2));
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
		System.out.println(e3.hashCode());
		


	}

}
