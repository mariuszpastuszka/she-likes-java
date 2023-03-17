package com.sda.she_likes_java.operators;

public class IncrementationDecrementationExamples {

    public static void main(String[] args) {
        int one = 10;
        int two = 10;

        one++; // postincrementation
        two--; // postdecrementation

        System.out.println("one value is: " + one);
        System.out.println("two value is: " + two);

        ++one; // preincrementation
        --two; // predecrementation
        System.out.println("one value is: " + one);
        System.out.println("two value is: " + two);

        int three = one++;
        System.out.println("one value is: " + one);
        System.out.println("three should have value of 13, and current value of it is: " + three);

        System.out.println("Incrementation explanation....");
        int four = one++;
        System.out.println("one value is: " + one);
        System.out.println("postincrementation is going to assign to four variable current value of one and later we're going "
                + "to increase value of one");
        System.out.println("four value is: " + four);

        four = ++one;
        System.out.println("one value is: " + one);
        System.out.println("four value is: " + four);
        System.out.println("preincrementation - firs increment, later user new value in assignment expression");

    }
}
