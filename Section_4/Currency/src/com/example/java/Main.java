package com.example.java;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
	 double value = .012;
	 double pSum = value + value + value;
	 System.out.println("Sum of primititves: " +pSum);

	 // converting double to a String using the "Double" class method "toString"
	 String strValue = Double.toString(value);
	 System.out.println("strValue: " + strValue);

	 // putting the string value into BigDecimal object
	 BigDecimal bigValue = new BigDecimal(strValue);
	 /* creating a new BigDecimal object called bSum
	  and then calling "add" method of the bigDecimal object
	  to add two numbers which will return the added value
	  */
	 BigDecimal bSum = bigValue.add(bigValue).add(bigValue);
	 /* Printout the summation after converting it to string again*/
	 System.out.println("Sum of BigDecimals: " + bSum.toString());

    }
}
