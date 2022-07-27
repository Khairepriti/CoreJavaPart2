package com.oopconcept;
 
class pqr{
	int a;
		int b;
		void getdata() {
			a = 10;
			b = 20;
		}
}
class sum extends pqr{
	int sum;
	void sum() {
		sum = a+b;
		System.out.println("\nSum =" +sum);
	}
}
class  subt extends sum{
	int sub ;
	void subt() {
		sub = a-b;
	System.out.println("\nSubstraction = " +sub);
	}
}

public class Multilevel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		subt obj = new subt();
		obj.getdata();
		obj.sum();
		obj.subt();
	}

}
