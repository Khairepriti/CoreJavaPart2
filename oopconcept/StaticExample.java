package com.oopconcept;

class Student {
		String name;
		int rollno;
		String location;
		static String course = "JFS";
		static String brachname = "Edubridge";

	Student(String n, int r, String l) {
		name = n;
	 rollno = r;
	 location = l;
	}
	void display() {
		System.out.println("Name = " + name +", Roll no= " +rollno+", Location = " + location +", Course name =" + course
				+", Branchname= " + brachname);
	}
}

public class StaticExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student obj = new Student("Priti", 121, "Mumbai");
		obj.display();
		Student obj1 = new Student("John", 122, "Mumbai");
		obj1.display();
	}

}
