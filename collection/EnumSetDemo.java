package com.java.collection;

import java.util.EnumSet;
import java.util.Iterator;

public class EnumSetDemo {

	enum Color{
		red,blue,pink,green
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EnumSet<Color> c = EnumSet.noneOf(Color.class);
		System.out.println("Empty Enumset : "+c);
		EnumSet<Color> c2 = EnumSet.allOf(Color.class);
		System.out.println(" Enumset : "+c2);
		EnumSet<Color> c1 = EnumSet.range(Color.blue, Color.green);
		System.out.println("Range of enumset : "+c1);
		Iterator<Color> itr = c.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}

}
}
