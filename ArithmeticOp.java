package com.java;

class sum{
	int add(int a,int b) {
	
		System.out.println("Add : "+(a+b));
		return a+b;
	}


	int sub(int a,int b) {
	
		System.out.println("Sub : "+(a-b));
		return a-b;
	}


	int mul(int a,int b) {
	
		System.out.println("Mul : "+(a*b));
		return a*b;
	}


	int div(int a,int b) {
	
		System.out.println("Div : "+(a/b));
		return a/b;
	}
}
public class ArithmeticOp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sum s = new sum();
		s.add(5, 5);
		s.sub(5, 5);
		s.mul(5, 5);
		s.div(5, 5);
	}

}
