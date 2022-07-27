package com.java.file;

import java.io.FileWriter;

public class FileInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileWriter fw = new FileWriter("d://abc.txt");
			fw.write("Welcome");
			fw.close();
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		System.out.println("Success");

	}

}
