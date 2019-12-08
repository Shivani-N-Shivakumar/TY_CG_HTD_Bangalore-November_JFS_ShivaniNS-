package encapsulation;

import java.io.Serializable;

public class Person implements Serializable {
	
private int age;
private String name;

public void setAge(int age) {
this.age=age;
}

public int getAge() {
	return this.age=age;
}

public void setName(String name) {
	this.name=name;
}

public String getName() {
	return this.name=name;
}
public static void main(String[] args) {
	Person p=new Person();
	p.setAge(27);
	p.setName("deepak");
	System.out.println(p.getAge());
	System.out.println(p.getName());
}
}
