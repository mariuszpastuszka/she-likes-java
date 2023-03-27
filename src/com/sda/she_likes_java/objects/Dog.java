package com.sda.she_likes_java.objects;

public class Dog {
    String name;

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.name = "Azor";

        System.out.println("My dog: " + dog.toString());
    }
}
