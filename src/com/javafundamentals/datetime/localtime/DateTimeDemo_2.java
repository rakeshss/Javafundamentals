package com.javafundamentals.datetime.localtime;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTimeDemo_2 {

    public static void main(String args[]) {
        // parse(CharSequence text)
        LocalTime time = LocalTime.parse("08:27");
        System.out.println(time);

        // parse(CharSequence text, DateTimeFormatter formatter)
        time = LocalTime.parse("08:27", DateTimeFormatter.ofPattern("HH:mm"));
        System.out.println(time);
    }
}
