package com.sda.she_likes_java.polymorphism;

public class Cat
        extends Animal
{
    @Override
    public void makeSound() {
        System.out.println("Miau");
    }

    public void sleep() {
        System.out.println("Cat is sleeping");
    }
}
