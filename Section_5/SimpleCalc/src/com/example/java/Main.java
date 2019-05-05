package com.example.java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your first number: ");
        String input1 = scanner.nextLine();

        System.out.print("Enter your second number: ");
        String input2 = scanner.nextLine();

        double num1 = Double.parseDouble(input1);
        double num2 = Double.parseDouble(input2);
        double sum = num1 + num2;

        System.out.println("Summation of the numbers: " +sum);
    }
}
