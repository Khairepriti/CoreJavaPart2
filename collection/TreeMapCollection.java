package com.java.collection;

import java.util.TreeMap;

public class TreeMapCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<String, Integer> tm = new TreeMap<String, Integer>();
		tm.put("green", 101);
		tm.put("yellow", 102);
		tm.put("pink", 103);
		tm.put("black", 104);
		System.out.println("Print treemap : "+tm);
		System.out.println("Print first key treemap : "+tm.firstKey());
		System.out.println("Print floorkey treemap : "+tm.floorKey("pink"));
		System.out.println("Print get treemap : "+tm.get("black"));
		System.out.println("Print desendingKey treemap :"+tm.descendingKeySet());
		System.out.println("Print treemap : "+tm.lowerKey("yellow"));
		System.out.println("Print size: "+tm.size());
		System.out.println(tm.lastKey());
		System.out.println(tm.containsKey("black"));
	

	}

}
