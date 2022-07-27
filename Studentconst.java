package com.java;
import java.util.Scanner;
class stud{
	int rollno;
	String name;
	String city; 
	public stud(int rollno1,String name1,String city1){
		rollno = rollno1;
		name = name1;
		city = city1;
		
	}
	
	public stud(){
		rollno = 1;
		name = "Meghana";
		city = "Panvel";
	}
	 void display() {
		System.out.println("Roll No. :"+rollno +" Name :"+name +"  City :"+city);
		//System.out.println("\nRoll No.,Name ,City is");
	}
}

public class Studentconst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 stud s = new stud(100,"priti","mumbai");
	 s.display();
	 stud s1 =new stud();
	 s1.display();
	 Scanner sc =new Scanner(System.in);
	 int rollno=sc.nextInt();
	 String name =sc.nextLine();
	 String city = sc.nextLine();
	 stud s2 = new stud(rollno,name,city);
	 s2.display();
	}

}
