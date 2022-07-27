package com.java;
class Learner {
	String name;
	int age;
	String course;

	Learner() { // Non Parameterized Constructor
		name = "Xyz";
		age = 12;
		course = "ABC";
		System.out.println("Non Parameterized Constructor called");
		System.out.println("Name:" + name + ", Age:" + age + ", course: " + course);

	}

	Learner(String name, int age, String course) { // Parameterized Constructor

		this.name = name;
		this.age = age;
		this.course = course;
		System.out.println("Parameterized Constructor called: ");
		System.out.println("Name:" + name + ", Age:" + age + ", course: " + course);

	}

	Learner(Learner stu) { // Copy Constructor

		name = stu.name;
		age = stu.age;
		course = stu.course;
		System.out.println("Copy Constructor called: ");
		System.out.println("Name:" + name + ", Age:" + age + ", course: " + course);

	}
}

public class CopyConstructor {

	public static void main(String[] args) {
		// Non Parameterized Constructor
		Learner s1 = new Learner();
		// Parameterized Constructor
		Learner s2 = new Learner("Priti", 22, "Java FullStack Development");
		// Copy Constructor
		Learner s3 = new Learner(s1);

	}

}


