package com.java.file;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Employee1Serialization {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileOutputStream fout = new FileOutputStream("D://Demo1.txt");
		ObjectOutputStream obj=new ObjectOutputStream(fout);
		Employee1 e1 = new Employee1();
		e1.setId(101);
		e1.setName("Priti");
		e1.setCity("Mumbai");
		
		Employee1 e2 = new Employee1();
		e2.setId(102);
		e2.setName("Rutika");
		e2.setCity("Pune");
		
		Employee1 e3 = new Employee1();
		e3.setId(103);
		e3.setName("ankita");
		e3.setCity("mumbai");
		
		obj.writeObject(e1);
		obj.writeObject(e2);
		obj.writeObject(e3);
		System.out.println("All employee data is saved ");
		

	}

}
