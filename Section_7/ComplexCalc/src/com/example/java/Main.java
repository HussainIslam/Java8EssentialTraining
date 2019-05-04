package com.example.java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double s1 = 0;
        double s2 = 0 ;
        char sym = '+';
        try {
            s1 = getInput("Enter the first number: ");
            s2 = getInput("Enter the second number: ");
            sym = getSymbol("Enter the operator: ");
        } catch (Exception e) {
            System.out.println(e);
        }

        double calc = doMath(s1, s2, sym);
        System.out.println("The result of operation: " +calc);
    }

    static double getInput(String prompt) throws Exception {
        System.out.print(prompt);
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        double num;
        try{
            num = Double.parseDouble(s);
        } catch (Exception e) {
            throw new Exception("Not a valid number!");
        }
        return num;
    }

    static char getSymbol(String prompt) throws Exception {
        System.out.print(prompt);
        Scanner sc = new Scanner(System.in);
        char sign = sc.next().charAt(0);
        if(!(sign == '+' || sign == '-' || sign == '*' || sign == '/' || sign == '%')){
            throw (new Exception("Not a valid symbol"));
        }
        return sign;
    }

    static double doMath(double num1, double num2, char sym){
        double calc = 0;
        switch (sym){
            case '+':
                calc = num1 + num2;
                break;
            case '-':
                calc = num1 - num2;
                break;
            case '*':
                calc = num1 * num2;
                break;
            case '/':
                calc = num1 / num2;
                break;
            case '%':
                calc = num1 % num2;
                break;
            default:
                break;
        }
        return calc;
    }


}
