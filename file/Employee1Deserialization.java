package com.java.file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Employee1Deserialization {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		FileInputStream fin= new FileInputStream("d://Demo1.txt");
		ObjectInputStream obj = new ObjectInputStream(fin);
		Employee1 e1 = (Employee1)obj.readObject();
		Employee1 e2 =(Employee1)obj.readObject();
		Employee1 e3 =(Employee1)obj.readObject();
		System.out.println("\nid : "+e1.getId()+"\nname : "+e1.getName()+"\ncity : "+e1.getCity());
		System.out.println("\nid : "+e2.getId()+"\nname : "+e2.getName()+"\ncity : "+e2.getCity());
		System.out.println("\nid : "+e3.getId()+"\nname : "+e3.getName()+"\ncity : "+e3.getCity());

	}

}
