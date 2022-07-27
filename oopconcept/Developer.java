package com.oopconcept;

 class  EmployeeSal{
	int salary = 40000;
	void display() {
		System.out.println("Employee salary =" +salary);
	}
}
 class Empname extends EmployeeSal{
	  String name = "John";
	  void display() {
	 // System.out.println(super.salary);
	  System.out.println(name);
	  super.display();
 }
 }
public class Developer extends EmployeeSal{
	int bonus= 10000;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Developer d = new Developer();
		//System.out.println("Programmer salary = "+ d.salary);
	//	System.out.println("programmer bonus  " +d.bonus);
		Empname e = new Empname();
		e.display();

	}

}
