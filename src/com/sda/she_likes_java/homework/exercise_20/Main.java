package com.sda.she_likes_java.homework.exercise_20;

public class Main {

    public static void main(String[] args) {
        Car ferrari = new Ferrari();
        CarUtils.safeCast(new Mazda());
        CarUtils.safeCast(new Toyota());
        CarUtils.safeCast(new Ferrari());
        CarUtils.safeCast(new Car());
        BWM bwm = new BWM();
        bwm.speedUp();
        Car bmw = new BWM();
        CarUtils.safeCast(bmw);
    }
}
