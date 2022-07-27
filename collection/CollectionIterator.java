package com.java.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> li  = new ArrayList<String>();
		li.add("priti");
		li.add("sakshi");
		li.add("ankita");
		li.add("Sayali");
		li.add("Sanjana");
		Iterator<String> it = li.iterator();
		while(it.hasNext()) {
			  System.out.println(it.next());
			}
		while(it.hasNext()) {
		      String str = it.next();
		      if(str=="priti") {
		        it.remove();
		        System.out.println(li);
		      }
		    }
		    System.out.println(li);
	}
	
}
