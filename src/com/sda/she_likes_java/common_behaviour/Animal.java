package com.sda.she_likes_java.common_behaviour;

public class Animal implements Moveable {
    public void go() {
        System.out.println("go() from Animal");
    }

    @Override
    public void move() {
        System.out.println("Animal is moving:)");
    }

    // don't put fly() here - because not every
    // animal is able to fly
//    public void fly() {
//        System.out.println("fly() from Animal");
//    }
}
