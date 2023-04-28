package com.sda.she_likes_java.homework.exercise_21;

public class Submarine extends Vehicle implements Diving {
    @Override
    public void dive() {
        System.out.println("dive() from Submarine");
    }
}
