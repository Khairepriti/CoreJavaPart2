package com.java.exceptionhandling;

 class Test1Throw1 {
	static void  validation(int age) {
		if(age<18) {
			throw new ArithmeticException("not valid");
		}
		else {
			System.out.println("Welcome to vote");
		}
	}
}
	public class Test1Throw {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test1Throw1.validation(20);
	}

}
