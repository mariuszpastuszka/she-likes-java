package com.sda.she_likes_java.homework.exercise_31;

public class CalculatorApp {

    public static void main(String[] args) {
        Calculator calculator = (a, b) -> {
            int result = a + b;

            System.out.printf("%d + %d = %d%n", a, b, result);
            return result;
        } ;

        System.out.println("Let's check our calculator");
        calculator.add(5, 3);
        calculator.sub(8, 4);
        calculator.mult(4, 12);
        calculator.div(10, 5);
    }
}
