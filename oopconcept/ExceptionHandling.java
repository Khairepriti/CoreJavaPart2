package com.oopconcept;

public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=5,b=0;
		try {
			int c=a/b;
		} catch (ArithmeticException e) {
			System.out.print("errorindividedbyzero");
		}
		finally {
			int d=a+b;
			//System.out.print("d : " +d);
		}
		

	}		

}
