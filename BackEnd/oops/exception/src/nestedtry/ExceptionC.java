package nestedtry;

public class ExceptionC {

	public static void main(String[] args) {
		System.out.println("main started");
		Employee e1=new Employee();
		try {
			Object o=e1.clone();
			try {
				Class c1=Class.forName("nestedtry.Employee");
				System.out.println("class is found");
			}catch(ClassNotFoundException e) {
				System.out.println("class not found");
				
			}
			
		}catch(CloneNotSupportedException e) {
			System.out.println("clone is not supported");
		}
		System.out.println("main ended");
	}

}
