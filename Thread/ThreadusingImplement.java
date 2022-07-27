package com.java.Thread;
class Threadone implements Runnable {


	// TODO Auto-generated method stub
	
		public void run() {
			System.out.println("Thread1 is running.....");
		}


	 
}
	
	

public class ThreadusingImplement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Threadone t1 =new Threadone();
		Thread t =new Thread(t1);
		t.start();
	}

}
