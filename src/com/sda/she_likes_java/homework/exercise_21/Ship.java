package com.sda.she_likes_java.homework.exercise_21;

public class Ship extends Vehicle implements Floating {

    @Override
    public void move() {
        System.out.println("move() from Ship");
    }

    @Override
    public void swim() {
        System.out.println("swim() from Ship");
    }
}
