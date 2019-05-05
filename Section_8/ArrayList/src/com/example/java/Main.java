package com.example.java;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("California");
        list.add("Oregon");
        list.add("Washington");
        System.out.println(list);
        list.add("Alaska");
        System.out.println(list);
        list.remove(0);

        String state = list.get(1);
        System.out.println("The second state is " +state);

        // find a item in list
        int pos = list.indexOf("Alaska");
        System.out.println("Alaska is at position " +pos);
    }
}
