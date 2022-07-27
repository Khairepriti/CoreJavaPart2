package com.java;

class Car {
	String s;
	int modelyear;

	Car() {
		s = "Ford";
		System.out.println(s);
	}

	Car(int i) {
		modelyear = i;
	}

	void getbrand() {
		System.out.println("Brand= " + s);
		System.out.println("Model Year=" + modelyear);
	}
}

public class MyCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c = new Car();
		Car c1 = new Car(999);
		c.getbrand();

	}

}
