package com.sda.she_likes_java.homework.exercise_15;

public class Address {
    String country;
    String city;
    String street;
    // 02-987
    // 011
    String postalCode;

    @Override
    public String toString() {
        return "Address{" +
                "country='" + country + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", postalCode='" + postalCode + '\'' +
                '}';
    }
}
