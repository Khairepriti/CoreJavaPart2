package com.java;

class Myclass {
	int x;
	Myclass(){
		x=10;
		System.out.println("X=" +x);
	}
	//parameterized constructor
Myclass(int i){
	x=i;
	System.out.println("X=" +x);
}
}
public class ConstructorOp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Myclass m =new Myclass();
		Myclass m1 =new Myclass(20);//parameterized constructor
		Myclass m2 =new Myclass(30);
		System.out.println(m1.x +" "+ m2.x);

	}

}
