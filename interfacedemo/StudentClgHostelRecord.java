package com.interfacedemo;

public class StudentClgHostelRecord implements StudentRecord, HostelRecord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentClgHostelRecord sc = new StudentClgHostelRecord();
		sc.studentRecord();
		sc.hostelRecord();
	}

	@Override
	public void hostelRecord() {
		// TODO Auto-generated method stub
		System.out.println("Student Name = Priti Khaire");
		System.out.println("Hostel Name = SCOE");

	}

	@Override
	public void studentRecord() {
		// TODO Auto-generated method stub
		System.out.println("Student Name = Priti Khaire");
		System.out.println("Student Academic year = 2021-2022");

	}

}
