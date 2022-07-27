package com.oopconcept;

class Person {
	Person(String name, int age, String city) {
		System.out.println("Name : " + name);
		System.out.println("Age = " + age);
		System.out.println("City = " + city);
	}
}

class learner extends Person {
	String course = "JFS";

	learner() {
		super("Priti", 22, "Mumbai");
	}

	void display() {
		System.out.println("Course name = " + course);

	}
}

public class SuperConstructorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		learner l = new learner();
		l.display();

	}

}
