package com.java.Thread;

class Thread1 extends Thread{
	public void run() {
		System.out.println("Thread1 is running.....");
	}
}
class Thread2 extends Thread{
	public void run() {
		for(int i=0;i<5;i++) {
			
		System.out.println(i);
	}
		System.out.println("Thread2 ");
}
}
class Thread3 extends Thread{
	public void run() {
		for (int i=0;i<10;i++) {
			System.out.println(i);
		}
		System.out.println("Thread3 ");
	}
}


public class ThreadExtendExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread1 t1 = new Thread1();
		t1.start();
		Thread2 t2 = new Thread2();
		t2.start();
		Thread3 t3 = new Thread3();
		t3.start();
		

	}

}
