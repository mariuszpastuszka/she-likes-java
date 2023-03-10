package com.sda.she_likes_java.operators;

public class Operators {

    public static void main(String[] args) {
        System.out.println("Now, let's try some operators");
        System.out.println("Logical operators");

        boolean firstValue;
        boolean secondValue;
        boolean evaluationResult;
        System.out.println("&& operator");
        firstValue = true;
        secondValue = true;
        evaluationResult = firstValue && secondValue;
        System.out.println("true && true: " + evaluationResult);

        firstValue = true;
        secondValue = false;
        evaluationResult = firstValue && secondValue;
        System.out.println("true && false: " + evaluationResult);

        firstValue = false;
        secondValue = true;
        evaluationResult = firstValue && secondValue;
        System.out.println("false && true: " + evaluationResult);

        firstValue = false;
        secondValue = false;
        evaluationResult = firstValue && secondValue;
        System.out.println("false && false: " + evaluationResult);

        System.out.println();
        System.out.println("Let's test negation operator");
        firstValue = false;
        secondValue = !firstValue;
        System.out.println("!false is: " + secondValue);

        firstValue = true;
        secondValue = !firstValue;
        System.out.println("!true is: " + secondValue);

        // negation of isPolite equals naughty
        boolean isPolite = false;
        if (!isPolite) {
            System.out.println("You're not polite, or just naughty");
        }

        boolean naughty = true;
        if (naughty) {
            System.out.println("You're not polite, or just naughty");
        }
    }
}

