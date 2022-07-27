package com.java.collection;

import java.lang.reflect.Array;
import java.util.*;
import java.util.HashSet;
import java.util.Set;

public class SetOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] i= {3,5,6,2,5,7,9,10};
		Integer [] j= {2,4,7,8,9,3,1};
		Set<Integer> set1= new HashSet<Integer>();
		Set<Integer>set2 = new HashSet<Integer>();
		set1.addAll(Arrays.asList(i));
		set2.addAll(Arrays.asList(j));
		Set<Integer> union_set = new HashSet<Integer>(set1);//union
		union_set.addAll(set2);
		System.out.println("Union is : ");
		System.out.println(union_set);
		Set<Integer> intersaction = new HashSet<Integer>(set2);
		intersaction.retainAll(set2);
		System.out.println("Intersacyion is : ");
		System.out.println(intersaction);
		Set<Integer> difference = new HashSet<Integer>(set2);
		difference.removeAll(set2);
		System.out.println("Difference of set1 from set2 : ");
		System.out.println(difference);
		
		
		

	}

}
