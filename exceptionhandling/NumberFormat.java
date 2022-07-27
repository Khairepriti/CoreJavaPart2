package com.java.exceptionhandling;

public class NumberFormat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			String str="Priti";
			int i=Integer.parseInt(str);
			System.out.print("String format : "+i);
		} catch (Exception e) {
			System.out.print(e);
		}
	}

}
