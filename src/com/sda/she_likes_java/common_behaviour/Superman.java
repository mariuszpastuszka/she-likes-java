package com.sda.she_likes_java.common_behaviour;

public class Superman implements Flyable, Swimmable, Moveable {
    @Override
    public void fly() {
        System.out.println("Superman is flying!!!");
    }

    @Override
    public void swim() {
        System.out.println("Superman is super swimmer");
    }

    @Override
    public void move() {
        System.out.println("Superman is moving super fast");
    }
}
