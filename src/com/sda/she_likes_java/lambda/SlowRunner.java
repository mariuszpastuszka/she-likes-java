package com.sda.she_likes_java.lambda;

public class SlowRunner implements Jogging {
    @Override
    public void run() {
        System.out.println("I'm terribly slow...");
    }

    @Override
    public void walk() {
        System.out.println("Slowly walking");
    }
}
