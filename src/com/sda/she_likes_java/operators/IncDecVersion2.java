package com.sda.she_likes_java.operators;

public class IncDecVersion2 {

    public static void main(String[] args) {
        System.out.println("First postincrementation");
        int age = 17;

        boolean isAdult = age >=18;
        System.out.println("isAdult value: " + isAdult);

        isAdult = age++ >= 18; // this line was computed like: isAdult = age >= 18; age++;
        System.out.println("isAdult value: " + isAdult);
        System.out.println("age is: " + age);

        System.out.println("Now preincrementation");
        age = 17;

        isAdult = age >=18;
        System.out.println("isAdult value: " + isAdult);

        isAdult = ++age >= 18; // this line was computed like: age++; isAdult = age >= 18;
        System.out.println("isAdult value: " + isAdult);
        System.out.println("age is: " + age);
    }
}
