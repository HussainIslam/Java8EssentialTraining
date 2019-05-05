package com.example.java;

public class Main {

    public static void main(String[] args) {
        int intValue1 = 56;
        int intValue2 = 42;
        int result1 = intValue1 + intValue2;
        System.out.println("Addition " +result1);
        int result2 = intValue1 - intValue2;
        System.out.println("Addition " +result2);
        int result3 = intValue1 * intValue2;
        System.out.println("Addition " +result3);
        double result4 = (double)intValue1 / intValue2;
        System.out.println("Addition " +result4);
        double result5 = (double) intValue1 % intValue2;
        System.out.println("Addition " +result5);

        // rounding numbers with Math class
        // if passed a double, this will return long
        double doubleValue = -3.99999;
        long rounded = Math.round(doubleValue);
        System.out.println("Rounded " + rounded);

        // getting absolute value using Math class
        double absValue = Math.abs(doubleValue);
        System.out.println("Absolute " + absValue);

    }
}
