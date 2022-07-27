package com.java.exceptionhandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferReaderException {

	public static void main(String[] args) throws  IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter ypur name ");
		String name =br.readLine();
		System.out.println("Name :"+name);
		System.out.println("Enter your roll no: ");
		int rollno = Integer.parseInt(br.readLine());
		System.out.println("Name :"+name);
		System.out.println("Roll no::"+rollno);
	}

}
