package com.java.file;


import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serialization  {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		FileOutputStream fout = new FileOutputStream("d://demo.txt");
		ObjectOutputStream obj = new ObjectOutputStream(fout);
		Employee e =new Employee();
		e.name="pqr";
		e.empid=16;
		e.deptname="xyz";
		obj.writeObject(e);
		System.out.println("data is saved");
		

	}

}
