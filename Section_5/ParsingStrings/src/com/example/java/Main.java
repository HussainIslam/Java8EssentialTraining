package com.example.java;

public class Main {

    public static void main(String[] args) {
	    String s1 = "Welcome to California";
	    System.out.println("Length of string: " +s1.length());

	    int position = s1.indexOf("California");
	    System.out.println("Position of substring: " +position);

	     String sub = s1.substring(11);
	     System.out.println("Substring: " +sub);

	     String s2 = "Welcome!      ";
	     System.out.println("Length before trim: " + s2.length());
	     String s3 = s2.trim();
	     System.out.println("Length after trim: " + s3.length());
    }
}
