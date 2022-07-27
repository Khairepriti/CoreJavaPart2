package com.java.Thread;

import java.util.Iterator;
import java.util.Scanner;

class Fibbonacci implements Runnable {
	int num;

	public Fibbonacci(int x) {
		// TODO Auto-generated constructor stub
		num=x;
	}

	public void run() {

		int f0 = 0;
		int f1 = 1, f2 = 0;
		System.out.print(f0 + " " + f1);
		for (int i = 1; i <= num; i++) {
			f2 = f0 + f1;
			System.out.print(" " + f2);
			f0 = f1;
			f1 = f2;

		}
		
	}

}

class Factorial implements Runnable {
	int num1;

	public Factorial(int n) {
		// TODO Auto-generated constructor stub
		 num1=n;
	}

	public void run() {

		int fact = 1;
		System.out.print("\nFactorial number : ");
		for (int i = num1; i >= 1; i--) {
			fact = fact * i;
			System.out.print(fact + ",");
		}
		
	}
//	System.out.println("factorial of number: " + fact);
//	while (i <= num) {
//		fact *= i;
//		i++;
//	}
//	System.out.println("factorial of number: " + fact);
}
class Table implements Runnable{
	int t;
	public Table(int num2) {
		// TODO Auto-generated constructor stub
		t=num2;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=1;i<=10;i++) {
			System.out.println("\n"+t+"*"+i+"="+t*i);
		}
	}
}

public class MultipleThreadusingimplement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a user input for fibboacci :");
		int num = sc.nextInt();
		System.out.println("Enter a user input factorial :");
		int num1 = sc.nextInt();
		System.out.println("\nEnter the number table : ");
		int t=sc.nextInt();
		// TODO Auto-generated method stub
		Fibbonacci f1 = new Fibbonacci(num);
		Thread t1 = new Thread(f1);
		t1.start();
		Factorial f2 = new Factorial(num1);
		Thread t2 = new Thread(f2);
		t2.start();
		
		Table tab= new Table(t);
		Thread t3 = new Thread(tab);
		t3.start();
		

	}

}
