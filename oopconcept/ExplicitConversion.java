package com.oopconcept;

public class ExplicitConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Explicite conversion larger data type to smaller data type

		double d1 = 40.40;
		System.out.println("byte value : " + d1);
		float f1 = (float) d1;
		System.out.println("float value : " + f1);
		long l1 = (long) f1;
		System.out.println("long value : " + l1);
		int i1 = (int) l1;
		System.out.println("integer value : " + i1);
		short s1 = (short) i1;
		System.out.println("Short value : " + s1);
		byte b1 = (byte) s1;
		System.out.println("byte value : " + b1);
	}

}
