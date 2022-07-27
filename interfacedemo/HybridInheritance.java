package com.interfacedemo;

class ClassA {
	void methodA() {
		System.out.println(" This is method of A");
	}

}

class ClassB extends ClassA {
	void methodB() {
		System.out.println(" This is method of B");
	}
}

class ClassC extends ClassB {
	void methodC() {
		System.out.println(" This is method of C");
	}
}

public class HybridInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassC c = new ClassC();
		c.methodA();
		c.methodB();
		c.methodC();
	}

}
