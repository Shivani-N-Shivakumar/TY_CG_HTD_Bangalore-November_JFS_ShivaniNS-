
public class Employee {
	String empName;
	int empAge;
	double empSalary;
	Employee(String name,int age,double salary){
		empName=name;
		empAge=age;
		empSalary=salary;
	}
void details()
{
	System.out.println("Employee name is "+empName +"Employee Age is "+empAge +"Employee Salary is "+empSalary);
}
}
