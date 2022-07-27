package com.java.Thread;
class Table2 extends Thread{
	
	int num =0;
	public Table2 (int num) {
		this.num =num;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		createTable(num);
	}
	synchronized public void createTable(int number) {
		System.out.println("\n\n Table is\n");
	for(int i=1;i<=10;i++) {
		System.out.println(number +" * "+i+" = "+(number*i));
		try {
			Table2.sleep(100);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}
	}
}
class Factorial2 extends Thread{
	int factnum = 0;
	public Factorial2(int fact) {
		// TODO Auto-generated constructor stub
this.factnum=fact;
		
	}
	@Override
	public void run() {
	int j=	findFactorial(factnum);
	System.out.println("Factorial of number : "+j);
	}
	synchronized public int findFactorial(int number) {
		int i ,fact=1;
		for(i=1;i<=number;i++) {
			fact=fact*i;
		}
		return fact;
	}
}
public class SyncThreadExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Table2 t = new Table2(10);
	
		Factorial2 f = new Factorial2(5);
		f.start();
		t.start();

	}

}
