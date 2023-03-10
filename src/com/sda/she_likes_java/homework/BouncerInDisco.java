package com.sda.she_likes_java.homework;

import java.util.Scanner;

public class BouncerInDisco {
    public static void main(String[] args) {

        System.out.println();
        System.out.println("Welcome to the club! Before I let you in you have to answer some questions :)");
        System.out.println();

        System.out.println("So how old are you?");
        Scanner inputReader = new Scanner(System.in);

        int personAge = inputReader.nextInt();
        System.out.println("I'm " + personAge + " years old");
        System.out.println();
        if (personAge < 18) {
            System.out.println("Go home kid, it's past your bedtime >:(");
        }

        System.out.println();


        String refusingMessage = "Oh, sorry. You're not allowed to enter the club!!!";
        if (personAge >= 18) {
            float personHeight;
            System.out.println("And how tall are you?");
            personHeight = inputReader.nextFloat();
            System.out.println("I'm " + personHeight + "m tall");

            boolean test = personHeight <= 1.85 && personHeight >= 1.45;
            if (test) {
                System.out.println("Please come in :D");

            } else if (personHeight > 1.85) {
                System.out.println("Sorry, giants aren't welcome. Go play basketball >:P");

            } else if (personHeight < 1.45) {
                System.out.println(refusingMessage);
            }
        } else {
            System.out.println(refusingMessage);
        }


    }
}