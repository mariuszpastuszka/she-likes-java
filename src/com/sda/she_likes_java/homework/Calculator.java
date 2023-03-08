package com.sda.she_likes_java.homework;

import java.util.Scanner;

public class Calculator {
    // psvm - not so magic shortcut

    public static void main(String[] args) {
        System.out.println("com.sda.she_likes_java.homework.Calculator...");
        System.out.println("Calculating sum of two numbers");
        System.out.println("Provide first number: ");
        int firstNumber;
        int secondNumber;
        Scanner inputReader = new Scanner(System.in);
        firstNumber = inputReader.nextInt();
        System.out.println("You provided number: " + firstNumber);
        System.out.println("Provide second number: ");
        secondNumber = inputReader.nextInt();
        System.out.println("You provided number: " + secondNumber);
        int sum = firstNumber + secondNumber;
        System.out.println("Sum is: " + sum);

        System.out.println("--------------------");
        System.out.println("Calculating difference of two numbers");
        System.out.println("Provide first number: ");
        firstNumber = inputReader.nextInt();
        System.out.println("You provided number: " + firstNumber);
        System.out.println("Provide second number: ");
        secondNumber = inputReader.nextInt();
        System.out.println("You provided number: " + secondNumber);
        int difference = firstNumber - secondNumber;
        System.out.println("Difference is: " + difference);

        System.out.println("--------------------");
        System.out.println("Calculating product of two numbers");
        System.out.println("Provide first number: ");
        firstNumber = inputReader.nextInt();
        System.out.println("You provided number: " + firstNumber);
        System.out.println("Provide second number: ");
        secondNumber = inputReader.nextInt();
        System.out.println("You provided number: " + secondNumber);
        int productOfNumbers = firstNumber * secondNumber;
        System.out.println("Product of two numbers is: " + productOfNumbers);

        System.out.println("--------------------");
        System.out.println("Calculating quotient of two numbers");
        System.out.println("Provide first number: ");
        firstNumber = inputReader.nextInt();
        System.out.println("You provided number: " + firstNumber);
        System.out.println("Provide second number: ");
        secondNumber = inputReader.nextInt();
        System.out.println("You provided number: " + secondNumber);
        int quotient = firstNumber / secondNumber;
        System.out.println("Quotient is: " + quotient);
    }
}
