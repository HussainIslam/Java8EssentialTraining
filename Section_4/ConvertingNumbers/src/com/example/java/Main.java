package com.example.java;

public class Main {

    public static void main(String[] args) {
	    int intValue1 = 56;
	    int intValue2 = intValue1;
	    System.out.println("The 2nd value is " + intValue2);

	    // widening the type is automatic
		long longValue1 = intValue1;
		System.out.println("The long value is " + longValue1);

		//narrowing the type using casting (within range)
		short shortValue1 = (short)intValue1;
		System.out.println("The short value is " + shortValue1);

		// narrowing the type using casting (outside range, will fail)
		int intValue3 = 1024;
		byte byteValue = (byte) intValue3;
		System.out.println("The byte value is " + byteValue);

		// trancated value in case of double to int
		double doubleValue = 3.9999d;
		int intValue4 = (int) doubleValue;
		System.out.println("Double to int: " + intValue4);

    }
}
