package com.javafundamentals.datetime;

import java.time.LocalDate;
import java.time.Month;

public class DateTimeDemo_2 {

    // get specific date
    public static void main(String[] args) {
        // of(int year, int month, int dayOfMonth)
        LocalDate date = LocalDate.of(2019, 05, 03);
        System.out.println(date);

        // of(int year, Month month, int dayOfMonth)
        date = LocalDate.of(2019, Month.AUGUST, 03);
        System.out.println(date);
    }
}
