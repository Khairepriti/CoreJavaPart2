package com.java.collection;

public class Student {
	int age;
	String name;
	String city;
	

	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Student [studentAge=" + age + ", studentName=" +name + ", studentCity=" + city+ "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
