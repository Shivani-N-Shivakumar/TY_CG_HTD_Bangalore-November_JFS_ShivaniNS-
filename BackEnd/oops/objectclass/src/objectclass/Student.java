package objectclass;

public class Student {
int studId;
String studName;
public Student(int studId,String studName) {
	super();
	this.studId=studId;
	this.studName=studName;
}
public String toString() {
	return "student id is: "+studId+"student name is: "+studName;
	
}
	

}
