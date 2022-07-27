package com.java.Thread;

public class SeatReservation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Reservation reserve = new Reservation();
		Person thread1= new Person(reserve,5);
		thread1.start();
		Person thread2 = new Person(reserve,4);
		thread2.start();

	}

}
class Reservation{
	static int availableSeat = 10;
	synchronized void reservation(int requestedSeat)
{
		System.out.println(Thread.currentThread().getName()+"enter.");
		System.out.println("Availableseats : "+availableSeat +"Requestedseats : "+requestedSeat);
		if(availableSeat >= requestedSeat) {
			System.out.println("Seat Available.Reserve now : ");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO: handle exception
				System.out.println("Thread interrupted");
			}
			System.out.println(requestedSeat + "Seat reserved .");
			availableSeat= availableSeat-requestedSeat;
		}
		}
}
class Person{
	
	
}
