package com.jsp.hierarchical_inheritance;

public class Driver {
  public static void main(String[] args) {
	Dog dog=new Dog();
	Deer d=new Deer();

	dog.bark();
	dog.eat();
	d.eating();
	d.eat();
}
}
