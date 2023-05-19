package com.sda.she_likes_java.time_and_date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;
import java.util.Date;

public class TimeAndDateExample {

    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();
        System.out.println("Current date is: " + currentDate);

        System.out.println("Current year is: " + currentDate.getYear());
        System.out.println("Current month is: " + currentDate.getMonth());
        System.out.println("Current day of the month is: " + currentDate.getDayOfMonth());

        LocalDateTime currentDateAndTime = LocalDateTime.now();
        System.out.println("Current date and time in my location is: " + currentDateAndTime);

        System.out.println("Let's format a little bit our date and time");
//        System.out.println(currentDateAndTime.format(DateTimeFormatter.RFC_1123_DATE_TIME));
        System.out.println(currentDateAndTime.format(DateTimeFormatter.BASIC_ISO_DATE));

        // DON'T USE!!!!
        Date oldDate = new Date();
        oldDate.setTime(1000 * 60 * 60 * 24);

        LocalDate now = LocalDate.now();
        LocalDate future = now.plus(5, ChronoUnit.DAYS);
        System.out.println("now is: " + now);
        System.out.println("future is: " + future);
        LocalDate previousYear = now.minusYears(1);
        System.out.println("previous year: " + previousYear);
        boolean isBefore = previousYear.isBefore(now);
    }
}
