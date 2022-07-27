package com.java.collection;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> set = new HashSet<String>();
		set.add("priti");
		set.add(null);
		set.add("Ankita");
		set.add("Radhika");
		set.add(null);
		System.out.println(set);
		set.remove(null);
		System.out.println(set);
		System.out.println(set.contains("Rutuja"));
		System.out.println(set);
		System.out.println(set.size());
		System.out.println(set.isEmpty());
//		set.clear();
//		System.out.println(set);
		System.out.println(set.hashCode());
		Set<Integer> set1 = new HashSet<>(3,(float)0.50);
		set1.add(10);
		set1.add(50);
		set1.add(90);
		set1.add(30);
		System.out.println(set1);
		Set<Integer> set2 = new HashSet<Integer>();
		set2.addAll(set1);
		System.out.println(set2);
	   List<Integer> li  = new ArrayList<Integer>(set2);  
	   System.out.println("coversation from hashset to array list : "+li);
	   List< String> li1 = new ArrayList<String>(set);
	   System.out.println("coversation from hashset to array list : "+li1);
	   
	}

}
