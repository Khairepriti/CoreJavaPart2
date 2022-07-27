package com.java;
class calculate{
	void sum(int a,int b) {
		System.out.println(a+b);
		
	}
	void sum(int a,int b ,int c,int d ) {
		System.out.println(a+b+c+d);
	}
	void add(int a,float b) {

	}
	
}

public class Overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		calculate c =new calculate();
		c.sum(10,10,10,10);
		c.sum(10,10);
		c.add(10, 10.1f);
		
		
	}

}
