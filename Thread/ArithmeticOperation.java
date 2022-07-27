package com.java.Thread;

import java.util.Scanner;

class ThreadEvenOdd extends Thread {
	int x;

	public ThreadEvenOdd(int i) {
		x = i;
	}

	// TODO Auto-generated constructor stub
	public void run() {

		if (x % 2 == 0) {
			System.out.println(x+": Even");

		} else {
			System.out.println(x+": Odd");
		}
		System.out.println("\nEnd of even odd thread.");
	}
	
}

class ThreadFactorialNumber extends Thread {
	int n;

	public ThreadFactorialNumber(int f) {
		// TODO Auto-generated constructor stub
		 n=f;
		// System.out.println("Factorial numbers : ");
		 
	}

	public void run() {
		// Scanner sc = new Scanner(System.in);
		// System.out.println("Enter number");
		// int n=sc.nextInt();
		int fact = 1;
		for (int i = n; i >= 1; i--) {
			fact = fact * i;
			System.out.print(fact+",");
		}
		System.out.println("\nend of  factorial of number thread..");
	}
}

class ThreadFibbonaciSeries extends Thread {
	int n1;
	int n2;

	public ThreadFibbonaciSeries(int x, int y) {
		// TODO Auto-generated constructor stub
		x=n1;
		y=n2;
	}

	public void run() {

		Scanner sc = new Scanner(System.in);
		int fibb = 1;
		int n1 = 0;
		int n2 = 1;
		System.out.println("enter total number for calculate: ");
		int lfib = sc.nextInt();
		System.out.print("Fibbonacci: ");
		for (int i = n1; i <= lfib; i++) {
			fibb = n1 + n2;
			System.out.print(fibb + ",");
			n1 = n2;
			n2 = fibb;
		}
		System.out.println("\n end of fibbonacci number thread.");
	}
}

public class ArithmeticOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter number for even Odd operation: ");
     	Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		
		System.out.print("Enetr the number to calculate factorial: ");
		int n =sc.nextInt();
		int n1=0;
		int n2=1;
		ThreadEvenOdd t1 = new ThreadEvenOdd(x);
		t1.start();
		ThreadFactorialNumber t2 = new ThreadFactorialNumber(n);
		t2.start();
		//System.out.print("Enetr numbar to calculate fibbonacci: ");
		
		
		
		
		
		ThreadFibbonaciSeries t3 = new ThreadFibbonaciSeries(n1,n2);
		t3.start();

	}
}
