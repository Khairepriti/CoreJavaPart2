package com.java.exceptionhandling;

import java.util.Scanner;

public class Register {
	private String firstname;
	private String lastname;
	private String emailid;
	private String password;
	private long phoneno;

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmailid() {
		return emailid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public long getPhoneno() {
		return phoneno;
	}

	public void setPhoneno(long phoneno) {
		this.phoneno = phoneno;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Register reg = new Register();
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter First name =");
			String firstname = sc.nextLine();
			reg.setFirstname(firstname);
			System.out.println("Enter last name =");
			String lastname = sc.nextLine();
			reg.setLastname(lastname);
			System.out.println("Enter EmailId =");
			String emailid = sc.nextLine();
			reg.setEmailid(emailid);
			System.out.println("Enter Password =");
			String password = sc.nextLine();
			reg.setPassword(password);
			System.out.println("Enter Phone number =");
			long phoneno = sc.nextLong();
			reg.setPhoneno(phoneno);

			
			printRegisterDate(reg);
		}
	}

	private static void printRegisterDate(Register reg) {
		System.out.println(reg.getFirstname());
		System.out.println(reg.getLastname());
		System.out.println(reg.getEmailid());
		System.out.println(reg.getPassword());
		System.out.println(reg.getPhoneno());

	}
}
