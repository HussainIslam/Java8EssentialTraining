package com.example.java;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.GregorianCalendar;

public class Main {

    public static void main(String[] args) {
	    // old date and time API
        Date d = new Date();
        System.out.println("Today: " + d);

        // Create a date with specific date
        GregorianCalendar gc = new GregorianCalendar(2009, 1, 28);
        // adding a "DATE" 1 to the "gc"
        gc.add(GregorianCalendar.DATE, 1);
        // GregorianCalendar starts month from 0;
        // So, 1 in the month means Feb and the we are adding 1 to the date
        // which means the next date would be March 1 of 2009
        Date d2 = gc.getTime();
        System.out.println("New Date: " + d2);

        DateFormat df = DateFormat.getDateInstance(DateFormat.FULL);
        System.out.println("Formatted date: " + df.format(d2));

        // New Date and time API
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println("Local Date Time: " + ldt);

        // specific date
        LocalDate ld =  LocalDate.of(2009, 1, 28);
        System.out.println("Local Date: " +ld);

        // date time formatter
        DateTimeFormatter dtf = DateTimeFormatter.ISO_DATE;
        System.out.println("Local date formatter: " +dtf.format(ld));

        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("M/d/yyyy");
        System.out.println("Local date formatter: " +dtf2.format(ld));
    }
}
