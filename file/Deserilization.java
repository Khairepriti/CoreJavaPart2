package com.java.file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Deserilization {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub

		FileInputStream fout = new FileInputStream("d://demo.txt");
		ObjectInputStream obj = new ObjectInputStream(fout);
		Employee e = (Employee)obj.readObject();
		System.out.println("employee details are : "+" name "+e.name +" department   "+e.deptname +"   empid   "+e.empid );
		
	}



}
