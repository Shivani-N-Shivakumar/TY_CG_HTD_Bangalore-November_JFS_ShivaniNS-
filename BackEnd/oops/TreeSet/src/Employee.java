
public class Employee implements Comparable<Employee> {
	String name;
	int age;
	double salary;
	public Employee(String name, int age, double salary) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	@Override
	public int compareTo(Employee o) {
		if(this.salary>o.salary) {
			return 1;
			
		}else if(this.salary<o.salary) {
			return -1;
		}else {
			return 0;
		}
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}
	

}
