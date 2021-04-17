package com.hackerrank.java;

import java.time.LocalDate;

public class DateAndTime {

    public static String findDay(int month, int day, int year) {
        return LocalDate.of(year, month, day).getDayOfWeek().name();
    }

    public static void main(String[] args) {
        System.out.println(findDay(8, 5, 2015));
    }
}
