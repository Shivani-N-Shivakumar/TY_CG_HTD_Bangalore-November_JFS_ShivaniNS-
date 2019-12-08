package com.cg.map.linkedhashmap;

public class Employee {
	int empsalary;
	String empName;
	public Employee(int empsalary, String empName) {
		super();
		this.empsalary = empsalary;
		this.empName = empName;
	}
	
	@Override
	public String toString() {
		return "Employee [empsalary=" + empsalary + ", empName=" + empName + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((empName == null) ? 0 : empName.hashCode());
		result = prime * result + empsalary;
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
		if (empName == null) {
			if (other.empName != null)
				return false;
		} else if (!empName.equals(other.empName))
			return false;
		if (empsalary != other.empsalary)
			return false;
		return true;
	}
	

}
