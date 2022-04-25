package com.javafundamentals.datetime.localdate;

import java.time.LocalDate;

public class DateTimeDemo_4 {

    public static void main( String args[] ) {
        // Using isBefore() to check if the date is before a given date.
        boolean isBefore = LocalDate.parse("2020-03-12")
                .isBefore(LocalDate.parse("2018-06-14"));
        System.out.println(isBefore);

        // Using isAfter() to check if the date is after a given date.
        boolean isAfter = LocalDate.parse("2020-03-12")
                .isAfter(LocalDate.parse("2018-06-14"));
        System.out.println(isAfter);
    }
}
