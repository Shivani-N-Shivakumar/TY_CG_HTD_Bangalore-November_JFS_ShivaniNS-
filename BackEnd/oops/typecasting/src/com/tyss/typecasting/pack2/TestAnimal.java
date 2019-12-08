package com.tyss.typecasting.pack2;

public class TestAnimal {

	public static void main(String[] args) {
	Animal a=new Animal();
	a.eat();
	System.out.println("--------------------------");
	Animal a1=new Dog();
	a1.eat();
	System.out.println("--------------------------");
	Dog d=(Dog)a1;
	d.eat();
	d.walk();
	System.out.println("--------------------------");
	Animal a2=new Lion();
	Lion l=(Lion)a2;
	l.eat();
	l.run();

	}

}
