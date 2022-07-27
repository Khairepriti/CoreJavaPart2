package com.java.Thread;

public class ATMTransaction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=4;i++  )
	{
			AccountHolder t = new AccountHolder();
			t.setName("Person "+i);
			t.start();
	}
	}
}
class ATMCenter{
	static synchronized void userAction() throws InterruptedException{
		System.out.println(Thread.currentThread().getName()+"entered");
		System.out.println("Performed transaction ");
		try {
			Thread.sleep(400);	
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println(e);
			}
		}
	}
class AccountHolder extends Thread{
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		//s.userAction();
		try {
			ATMCenter .userAction();
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}	}
}
