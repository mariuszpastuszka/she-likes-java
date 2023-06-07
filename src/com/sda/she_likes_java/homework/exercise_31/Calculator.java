package com.sda.she_likes_java.homework.exercise_31;

public interface Calculator {
    default int sub(int a, int b) {
        int result = a - b;
        System.out.printf("%d - %d = %d%n", a, b, result);
        return result;
    }

    default int mult(int a, int b) {
        int result = a * b;
        System.out.printf("%d * %d = %d%n", a, b, result);
        return a * b;
    }

    default int div(int a, int b) {
        int result = a / b;
        System.out.printf("%d / %d = %d%n", a, b, result);
        return a / b;
    }

    int add(int a, int b);
}
