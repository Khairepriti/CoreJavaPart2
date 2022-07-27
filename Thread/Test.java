package com.java.Thread;
class Consumer extends Thread{
	int amount =10000;
	synchronized void withdrow(int amount) {
		System.out.println("Going to withdraw...");
		if(this.amount<amount) {
			System.out.println("Less balnce Waiting for deposit..");
		try
		{
			wait();
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		this.amount-=amount;
		System.out.println("Withdraw completed....");
		
		}
	}
		synchronized void deposit(int amount) {
			System.out.println("going to deposit..");
			this.amount+=amount;
			System.out.println("deposit amount..");
			notify();
		}
	
}

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method 
	final	Consumer c1 = new Consumer();
		new Thread() {
			public void run() {
				c1.withdrow(5000);
			}
			}.start();
			new Thread(){
				public void run() {
					c1.deposit(10000);
				}
				}.start();
			}
			
	}


