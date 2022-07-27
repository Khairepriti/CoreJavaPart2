package com.java.exceptionhandling;

public class MultipleTryBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int a[] = new int[5];
			a[2] = 21/0;
			System.out.println("My Array Element " + a[7]);

		}
		catch (ArithmeticException a) {
			System.out.println(a);
		}
		catch (NumberFormatException n) {
			System.out.print(n);
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	
//		 catch (NullPointerException e) {
//				System.out.println(e);
//			} 
		
	}
}
