package com.sda.she_likes_java.homework.exercise_27;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println("Let's play with dates");
        MyDate firstDate = new MyDate(2017, 1, 5);
        MyDate secondDate = new MyDate(2017, 1, 6);
        MyDate thirdDate = new MyDate(2015, 7, 8);
        MyDate fourthDate = new MyDate(2020, 12, 31);

        List<MyDate> myDates = new ArrayList<>();
        myDates.add(firstDate);
        myDates.add(secondDate);
        myDates.add(thirdDate);
        myDates.add(fourthDate);

        System.out.println("List before sorting: " + myDates);
        Collections.sort(myDates);
        System.out.println("List after sorting: " + myDates);
    }
}
