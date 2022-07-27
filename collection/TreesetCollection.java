package com.java.collection;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreesetCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        TreeSet<Integer> set = new TreeSet<>();
        set.add(10);
        set.add(90);
        set.add(70);
        set.add(50);
        System.out.println("treeset: "+set);
       
        // Accessing elements
        TreeSet<Integer> set1 = new TreeSet<Integer>();
        Iterator<Integer> itr = set.iterator();
        System.out.print("TreeSet using Iterator: ");
        while(itr.hasNext()) {
            System.out.print(itr.next());
            System.out.print(", ");
            
        }
            // Using the addAll() method
            TreeSet<Integer> set3 = new TreeSet<>();
           // set3.add(1);
           set3.addAll(set);
            System.out.println("\nNew TreeSet: " + set3);
            boolean value1 = set.remove(50);
            System.out.println("Is 5 removed? " + set);
            System.out.println(value1); 

            // Using the removeAll() method
            boolean value2 = set.removeAll(set);
            System.out.println("Are all elements removed? " + value2);
	
	}
}
