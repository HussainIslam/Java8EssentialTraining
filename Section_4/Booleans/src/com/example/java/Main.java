package com.example.java;

public class Main {
    // data member of the class
    // boolean values created without initialization are set to False
    static boolean bDef;
    public static void main(String[] args) {
        boolean b1 = true;
        boolean b2 = false;
        System.out.println("The value of b1 is " + b1);
        System.out.println("The value of b2 is " + b2);
        System.out.println("The value of bDef is " + bDef);

        // negation of boolean
        boolean b3 = !b1;
        System.out.println("The value of b3 is " + b3);

        // boolean value from boolean expressions
        int i1 = 0;
        boolean b4 = (i1 != 0);
        System.out.println("The value of b4 is " + b4);

        // converting string "True" or "False" to boolean
        String sBoolean = "true";
        boolean parsed = Boolean.parseBoolean(sBoolean);
        System.out.println("The value of parsed is " + parsed);



    }
}
