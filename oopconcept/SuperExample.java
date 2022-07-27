package com.oopconcept;

class Vehical {
	int speed = 50;
	Vehical(String s){
		System.out.println(s);
	}
}

class Bike extends Vehical {
	Bike(){
	
	super ("Honda");
	}
	int speed = 100;
	void display() {
		System.out.println(super.speed);
		System.out.println(speed);
	}

}

public class SuperExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bike b = new Bike();
		b.display();
		
	}

}
