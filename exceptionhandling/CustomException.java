package com.java.exceptionhandling;



import java.util.Scanner;

class NameNotExistException extends Exception{
	 public NameNotExistException(String s) {
		super(s);
	}
}

public class CustomException {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String names[]= {"Ankita","Priti","komal","Swati","Rutuja"};
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your name= ");
		String name = sc.nextLine();
		try {
			checkNameExist(name,names);
		}
		catch (NameNotExistException e) {
			System.out.println(e.getMessage());
		}
	}
		private static void checkNameExist(String name,String[] names) throws NameNotExistException{
			boolean flag= false;
			for(String str : names) {
				if(name.equalsIgnoreCase(str)) {
					flag= true;
					break;
					//System.out.println("name exist ");
				}
			}
			if(flag) {
				System.out.println("name exist ");
			}
				else {
					throw new NameNotExistException("name not exist");				}
			}
		
}
