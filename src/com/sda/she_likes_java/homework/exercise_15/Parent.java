package com.sda.she_likes_java.homework.exercise_15;


import com.sda.she_likes_java.classes.Address;
import com.sda.she_likes_java.classes.Person;

public class Parent {
    String firstName;
    String surname;
    Person firstChild;
    Person secondChild;
    Address address;

    public static void main(String[] args) {
        Address someAddress = new Address();
        someAddress.country = "Poland:)";
    }
}
