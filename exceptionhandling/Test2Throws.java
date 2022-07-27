package com.java.exceptionhandling;


class TestCustomException {
	static void  validation(int age) throws InvalidAgeException {
		if(age<18) {
			throw new InvalidAgeException("not valid");
		}
		else {
			System.out.println("Welcome to vote");
		}
	}
}
public class Test2Throws {
	public static void main(String[] args) {
		try {
			 TestCustomException .validation(13);
			}
catch(Exception m) {
	System.out.println("Exception occured: "+m);
}
		System.out.println("rest of the code.....");
}
}
