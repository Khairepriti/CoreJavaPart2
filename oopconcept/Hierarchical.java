package com.oopconcept;

class Car {
	public void methodcar() {
		System.out.println("Car");
	}
}

class Fort extends Car {
	public void methodfort() {
		System.out.println("Fort");
	}
}

class BMW extends Car {
	public void methodtBMW() {
		System.out.println("BMW");
	}
}

class Audi extends Car {
	public void methodaudi() {
		System.out.println("Audi");
	}
}

public class Hierarchical {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fort f = new Fort();
		BMW t = new BMW();
		Audi a = new Audi();
		f.methodcar();
		t.methodcar();
		a.methodcar();
		t.methodtBMW();
	}
}
