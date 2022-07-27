package com.java.collection;

import java.util.ArrayList;

	class Emp implements Comparable<Emp>{
		int id ;
		String name;
		
		public Emp(int id, String name) {
			super();
			this.id = id;
			this.name = name;
		}

		@Override
		public int compareTo(Emp e) {
			// TODO Auto-generated method stub
			if(id<e.id)
				return 1;
			else if(id<e.id)
				return -1;
			else
			return 0;
		}
	}
	public class QueuewithClass{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Emp> a1= new ArrayList();
		Emp e1 = new Emp (40,"priti");
		Emp e2 = new Emp(30, "sayali");
		Emp e3 = new Emp(20,"amol");
		a1.add(e1);
		a1.add(e2);
		a1.add(e3);
		System.out.println(a1);
		}

}
