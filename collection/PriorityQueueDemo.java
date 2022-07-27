package com.java.collection;

import java.util.PriorityQueue;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<String> str = new PriorityQueue<String>();
		str.add("Red");
		str.add("yellow");
		str.add("pink");
		str.add("blue");
		str.add("Red");
		System.out.println("Prioriti queue : "+str);
		System.out.println("Head of the queue: "+ str.peek());
		System.out.println("Remove : "+str.poll());
		System.out.println("Prioriti queue : "+str);
		System.out.println("Size of queue : "+str.size());
		System.out.println(str.isEmpty());
		System.out.println(str.contains("pink"));
	}

}
