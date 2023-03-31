package com.sda.she_likes_java.homework.exercise_16;

public class Animal {
    private String firstName;
    private int age;
    private String breed;

    public Animal(String firstName, int age, String breed) {
        this.firstName = firstName;
        this.age = age;
        this.breed = breed;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "firstName='" + firstName + '\'' +
                ", age='" + age + '\'' +
                ", breed='" + breed + '\'' +
                '}';
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
}
