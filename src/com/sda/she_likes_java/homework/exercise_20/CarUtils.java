package com.sda.she_likes_java.homework.exercise_20;

public class CarUtils {

    public static void safeCast(Car car) {
        if (car instanceof Mazda) {
            System.out.println("Is Mazda nice: " + ((Mazda) car).isNice());
        } else if (car instanceof Toyota) {
            System.out.println("Is Toyota safe: " + ((Toyota) car).isSafe());
        } else {
            System.out.println("Different type of car");
        }
    }

    public static void useToyota(Toyota car) {

    }
}
