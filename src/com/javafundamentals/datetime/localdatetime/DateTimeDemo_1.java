package com.javafundamentals.datetime.localdatetime;

import java.time.LocalDateTime;
import java.time.Month;

public class DateTimeDemo_1 {

    public static void main(String args[]) {
        // of(int year, int month, int dayOfMonth, int hour, int minute)
        LocalDateTime date = LocalDateTime.of(2019, 05, 03, 12, 34);
        System.out.println(date);

        // of(int year, int month, int dayOfMonth, int hour, int minute, int second)
        date = LocalDateTime.of(2019, Month.AUGUST, 03, 23, 34);
        System.out.println(date);
    }
}
