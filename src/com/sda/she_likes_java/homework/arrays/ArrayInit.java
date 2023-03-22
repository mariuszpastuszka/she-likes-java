package com.sda.she_likes_java.homework.arrays;

public class ArrayInit {

    public static void main(String[] args) {
        int[] numbers = new int[100];

        // initialization phase
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = 3 * i;
        }

        // read data
        for (int i = numbers.length - 1; i > -1; i--) {
            System.out.println("number[" + i + "] = " + numbers[i]);
        }
    }
}
