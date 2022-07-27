package com.java.file;
import java.io.FileOutputStream;

public class FileOutputStreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileOutputStream fout = new FileOutputStream("d://abc.txt");
			fout.write(97);
			fout.write(98);
			fout.write(99);
			fout.write(100);
			fout.close();
System.out.println("Writing into file is seccessful");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}

	}

}
