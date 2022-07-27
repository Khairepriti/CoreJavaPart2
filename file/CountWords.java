package com.java.file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CountWords {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileReader fir = new FileReader("d://abc.txt");
		BufferedReader br1=new BufferedReader(fir);
		String currentLine=br1.readLine();
		int linecount=0;
		int wordcount=0;
		int charcount=0;
		while(currentLine!= null) {
			linecount++;
			String [] words=currentLine.split(" ");
			wordcount = wordcount+words.length;
			for(String word :words) {
				charcount=charcount+word.length();
			}
			currentLine=br1.readLine();
			
		}
		System.out.println("the number of word in abc file is....."+wordcount);
		System.out.println("the number of character in file is..."+charcount);
		System.out.println("the number of line in file....."+linecount);
		br1.close();
	}

}
