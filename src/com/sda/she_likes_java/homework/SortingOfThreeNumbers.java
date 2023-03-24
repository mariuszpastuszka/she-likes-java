package com.sda.she_likes_java.homework;

import java.util.Random;

public class SortingOfThreeNumbers {

    public static void main(String[] args) {
        Random numberGenerator = new Random();

        int firstNumber = numberGenerator.nextInt(20);
        int secondNumber = numberGenerator.nextInt(20);
        int thirdNumber = numberGenerator.nextInt(20);

        // ascending order
        // first min value
        int min;
        int middle;
        int max;

        // min
        min = firstNumber;
        if (secondNumber < min) {
            min = secondNumber;
        }
        if (thirdNumber < min) {
            min = thirdNumber;
        }

        // max
        max = firstNumber;
        if (secondNumber > max) {
            max = secondNumber;
        }
        if (thirdNumber > max) {
            max = thirdNumber;
        }

        // middle
        if (firstNumber > min && firstNumber < max) {
            middle = firstNumber;
        } else if (secondNumber > min && secondNumber < max) {
            middle = secondNumber;
        } else if (thirdNumber > min && thirdNumber < max) {
            middle = thirdNumber;
        } else if (firstNumber == secondNumber || firstNumber == thirdNumber) {
            middle = firstNumber;
        } else {
            middle = secondNumber;
        }


        System.out.println("Before sorting");
        System.out.println("first: " + firstNumber);
        System.out.println("second: " + secondNumber);
        System.out.println("third: " + thirdNumber);

        System.out.println();

        System.out.println("Sorted in ascending order");
        System.out.println("min: " + min);
        System.out.println("middle: " + middle);
        System.out.println("max: " + max);
    }
}
