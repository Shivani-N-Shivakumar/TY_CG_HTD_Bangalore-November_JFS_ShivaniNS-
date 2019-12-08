import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet3 {

	public static void main(String[] args) {
		EmployeeName e1=new EmployeeName();
		EmployeeSalary e2=new EmployeeSalary();
		EmployeeAge e3=new EmployeeAge();
		TreeSet<Employee> t=new TreeSet<Employee>(e1);
		t.add(new Employee("gundu",23,20.00));
		t.add(new Employee("paapu",20,40.00));
		t.add(new Employee("dinga",22,50.00));
		t.add(new Employee("puttu",21,49.00));
	
	for(Employee employee:t) {
		System.out.println("employee name is "+employee.name);
		System.out.println("employee age is "+employee.age);
		System.out.println("employee salary is "+employee.salary);
	}


}
}
