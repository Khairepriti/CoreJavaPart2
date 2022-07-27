package com.java;

class constructorstud{
	int rollno;
	String name;
	String city; 
	
	
	constructorstud(int rollno1,String name1,String city1){
		rollno = rollno1;
		name = name1;
		city = city1;
	}
	constructorstud(String name2,String city2){
		name = name2;
		city = city2;
	}
	void display() {
		System.out.println("Roll No. :"+rollno +" Name :"+name +"  City :"+city);
	}
}

public class OverloadingConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		constructorstud c1 =new constructorstud(121,"Priti","mumbai");
        c1.display();
        constructorstud c2 =new constructorstud("Priti","mumbai");
       c2.display();

	}

}
