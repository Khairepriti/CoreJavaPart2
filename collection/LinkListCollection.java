package com.java.collection;

import java.util.LinkedList;

public class LinkListCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList <String> link = new LinkedList<>();
		link.add("Nikita");
		link.add("Priti");
		link.add("Pooja");
		System.out.println("Print Linklist : "+link);
		System.out.println("Print first Element : " +link.peek());
		System.out.println("Remove first Element : " +link.poll());
		System.out.println("Print Linklist : "+ link);
		System.out.println("Print last Element : " +link.peekLast());
	
		

	}

}
