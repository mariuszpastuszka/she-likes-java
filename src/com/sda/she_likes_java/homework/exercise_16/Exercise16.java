package com.sda.she_likes_java.homework.exercise_16;

public class Exercise16 {

    public static void main(String[] args) {
        Animal azor = new Animal("Azor", 3, "Alaskan");
        Owner han = new Owner("Han", "Solo", azor);
        Owner leia = new Owner("Leia", "Organa", azor);

        System.out.println("Han and his animal: " + han);
        System.out.println("Leia and her animal: " + leia);
        System.out.println("Just Han's Surname: " + han.getSurname());
    }
}
