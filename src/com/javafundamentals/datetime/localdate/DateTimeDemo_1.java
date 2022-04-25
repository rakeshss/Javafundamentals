package com.javafundamentals.datetime;

import java.time.LocalDate;

public class DateTimeDemo_1 {
    // Get current date
    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();
        System.out.println(currentDate);
    }
}
