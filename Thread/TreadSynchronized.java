package com.java.Thread;
class First {
	synchronized public void display(String msg){
		System.out.print("["+msg);
		System.out.println("]");
		try {
			Second.sleep(400);
		} catch (InterruptedException e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}
	
}
class Second extends Thread{
	String msg;
	First obj;
	public Second(First fp, String str) {
		// TODO Auto-generated constructor stub
		obj=fp;
		msg=str;
		
	}	
		public void run() {
			obj.display(msg);
		}
	}

public class TreadSynchronized {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 First fnew = new First();
		 Second s = new Second(fnew, "Welcome");
		 s.start();
		 Second s1 =new Second(fnew, "to");
		 s1.start();
		 Second s2 = new Second(fnew, "multithreading");
		 s2.start();
	}

}
