package com.example.java;

public class Main {

    public static void main(String[] args) {
        String[] months = {"January", "February", "March", "April", "May", "June",
                            "July", "August", "September", "October", "November", "December"};

        // incremental loop
        for (int i = 0; i < months.length; i++) {
            System.out.println(months[i]);
        }

        // decremental loop
        for(int i = months.length -1; i >=0; i--){
            System.out.println(months[i]);
        }

        // for each loop
        for(String month: months){
            System.out.println(month);
        }

        //while loop
        int counter = 0;
        while(counter < months.length){
            System.out.println(months[counter]);
            counter++;
        }

        // do while loop
        counter = 0;
        do {
            System.out.println(months[counter]);
            counter++;
        } while(counter < months.length);


    }
}
