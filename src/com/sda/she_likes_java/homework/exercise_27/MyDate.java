package com.sda.she_likes_java.homework.exercise_27;

import java.util.Comparator;

public class MyDate implements Comparable<MyDate> {

    private final int year;

    private final int month;

    private final int day;

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    @Override
    public String toString() {
        return "MyDate{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MyDate myDate = (MyDate) o;

        if (year != myDate.year) return false;
        if (month != myDate.month) return false;
        return day == myDate.day;
    }

    @Override
    public int hashCode() {
        int result = year;
        result = 31 * result + month;
        result = 31 * result + day;
        return result;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    @Override
    public int compareTo(MyDate o) {
        if (year != o.year) {
            return Integer.compare(year, o.getYear());
        } else if (month != o.getMonth()) {
            return Integer.compare(month, o.getMonth());
        }
        return Integer.compare(day, o.getDay());
    }
}
