package com.java.file;

import java.io.FileInputStream;

public class FileInputStreamDemo {

	public static void main(String[] args) {
		try {
			FileInputStream fin =new FileInputStream("D://abc.txt");
			int i= 0;
			while((i=fin.read())!= -1) {
				System.out.println((char)i);
			}
			fin.close();
		} catch (Exception e) {
			System.out.println(e);
			// TODO: handle exception
		}
		System.out.println("\nReading of file is successful");
	}
		
	

}
