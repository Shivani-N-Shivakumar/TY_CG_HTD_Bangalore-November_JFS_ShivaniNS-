
public class Employee {
int empid;
String empname;
public Employee(int empid, String empname) {
	super();
	this.empid = empid;
	this.empname = empname;
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + empid;
	result = prime * result + ((empname == null) ? 0 : empname.hashCode());
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Employee other = (Employee) obj;
	if (empid != other.empid)
		return false;
	if (empname == null) {
		if (other.empname != null)
			return false;
	} else if (!empname.equals(other.empname))
		return false;
	return true;
}
@Override
public String toString() {
	return "Employee [empid=" + empid + ", empname=" + empname + "]";
}

}
