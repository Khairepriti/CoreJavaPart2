package com.java.collection;

import java.util.ArrayList;
import java.util.List;

public class CollectionArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> li = new ArrayList<>();
		li.add("Priti");
		li.add("Meghana");
		li.add(1, "Ankita");
		li.add("Sayali");
		li.add("Sanjana");
		System.out.println("List pf elements:  "+li);
		System.out.println("Length of list : "+li.size());
		System.out.println("set value to list : "+li.set(3, "Sakshi"));
		System.out.println("get of list : "+li.get(2) );
		System.out.println("List of element : "+li);
		System.out.println("Remove element : "+li.remove(3));
		System.out.println("Contain of elements : "+li.contains("Nikita"));
		li.add("Nikita");
		System.out.println("List pf elements:  "+li);
		System.out.println("Contain of elements : "+li.contains("Nikita"));
		System.out.println("List pf elements:  "+li);
		 Object[] objects = li.toArray();
		  
	        // Printing array of objects
	        for (Object obj : objects)
	            System.out.print(obj + " ");
	
		
	}
	
	}

