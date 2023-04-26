package com.sda.she_likes_java.common_behaviour.wrong_approach;

public class Main {

    public static void main(String[] args) {
        Bird bird = new Bird();
//        bird.fly();

        Animal tiger = new Tiger();
        tiger.go();

        Bird parrot = new Parrot();
        Bird ostrich = new Ostrich();

        Flyable superman = new Superman();
        Flyable flyableParrot = new Parrot();
    }
}
