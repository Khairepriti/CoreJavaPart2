package com.java;
class MainStudent{

			String name = "Priti";
			int rollno = 1;
			

			void display() {
				System.out.println("name: " + name + "   Roll no: " + rollno);
				
				
			}
			int add(int a,int b) {
				System.out.println("add "+(a+b));
				return a+b;
			}
			
		}


public class Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MainStudent s= new MainStudent();
		s.display();
		s.add(5, 5);
	}

}
