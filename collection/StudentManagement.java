package com.java.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
class SortByNames implements Comparator<Student> {

	@Override
	public int compare(Student s1, Student s2) {
		return s1.getName().compareTo(s2.getName());
	}
} 

public class StudentManagement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> stdarry = new ArrayList<Student>();
		int choice,age = 0;
		String name,city=null;
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("Press 1 for  Add student details. ");
			System.out.println("Press 2 for show student details. ");
			System.out.println("Press 3 for search student by name.");
			System.out.println("Press 4 for delete user by name. ");
			System.out.println("Press 5 for sort user by name. ");
			System.out.println("Press 6 for update age.");
			System.out.println("Press 7 for treeset.");
			System.out.println("Press 8 for Quit\n\n");
			//Asking user to make choice
			System.out.println("Make your choice : ");
			choice = sc.nextInt();
			//creating switch case 
			switch (choice) {
			case 1:
				System.out.print("Enter student name : ");
				name = sc.next();
				System.out.print("Enter the student age : ");
				age = sc.nextInt();
				System.out.print("Enter the city : ");
				city =sc.next();
				Student s1 = new Student();
				s1.setAge(age);
				s1.setCity(city);
				s1.setName(name);
				stdarry.add(s1);
				break;
				//second case for finding the diff
			case 2:
				System.out.println("--------------------------------------------------------------------------------");
				for(int i = 0;i<stdarry.size();i++) {
					System.out.println("Student record : "+(i+1));
					System.out.println("Student name : "+stdarry.get(i).getName());
					System.out.println("Student city : "+stdarry.get(i).getCity());
					System.out.println("Student age : "+stdarry.get(i).getAge());
					System.out.println("--------------------------------------------------------------------------------");
				}
				System.out.println("--------------------------------------------------------------------------------");
			break;
			case 3:
				System.out.println("Enter the student name for search : ");
				name= sc.next();
				int ii=0 ;
				for (int i = 0;i<stdarry.size();i++) {
					if(stdarry.get(i).getName().contains(name)) {
						System.out.println("Student Record : "+(++ii));
						System.out.println("Student name : "+stdarry.get(i).getName());
						System.out.println("Student city : "+stdarry.get(i).getCity());
						System.out.println("Student age : "+stdarry.get(i).getAge());
						System.out.println("--------------------------------------------------------------------------------");
					
						
					}
					if(ii==0) {
						System.out.println("no record found.. ");
					}
					
					}
				break;
					case 4:
						System.out.println("Enter the student name for delete : ");
						name=sc.next();
						int search = 0;
						for(int i =0;i<stdarry.size();i++) {
							if(stdarry.get(i).getName().contains(name)) {
								System.out.println("Student record : "+(++search));
							stdarry.remove(i);
							}
						}
						if(search==0) {
							System.out.println("no record fount for delete record ");
						}
						else {
							System.out.println("student record has been deleted successfully.");
						}
				System.out.println("-------------------------------------------------------------------------");
				break;
					case 5:
						
			
					case 6:
						System.out.println("enter the name you want to update student record : ");
						name=sc.next();
						int update=0;
						for (int i=0;i<stdarry.size();i++) {
							if(stdarry.get(i).getName().contains(name)) {
								System.out.println("student record : "+(i+1));
								System.out.println("enter age you wnat to update: ");
								int age1=sc.nextInt();
								System.out.println("enter city  you want to update: ");
								String city1=sc.next();
								System.out.println("enter the name you want to update: ");
								String name1 =sc.next();
								//System.out.println("student record update : "+(++update));
								stdarry.get(i).setName(name1);
								stdarry.get(i).setAge(age1);
								stdarry.get(i).getCity();
								update++;
								
								}
							if(update==0) {
								System.out.println("no record updated.");
							}
							else {
								System.out.println("Student record updated successfully "+update);
							}
							break;
							
						}
					case 7:
						for (Student stud : stdarry) {
							System.out.println("Student: " + stud + "");
						}

						Collections.sort(stdarry, new SortByNames());
						System.out.println("Sorted by Names:\n " +stdarry);
						System.out.println("------------------------------------------");

						break;
					case 8:
						System.exit(0);
						break;
					default:
						System.out.println("Invalid Input");
						
			
			}
			}
		}
		
	}


