package com.java.Thread;

public class TestDaemonThread extends Thread{

	@Override
	public void run() {
		// TODO Auto-generated method stub
	if(Thread.currentThread().isDaemon()) {
		System.out.println("Daemon thread work");
	}
	else {
		System.out.println("user thread work");
	}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestDaemonThread t1 = new TestDaemonThread();
		TestDaemonThread t2 =new TestDaemonThread();
		TestDaemonThread t3 = new TestDaemonThread();
		t1.setDaemon(true);
		t1.start();
		t2.start();
		t3.start();
	}

}
