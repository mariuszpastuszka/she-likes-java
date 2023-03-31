package com.sda.she_likes_java.homework.exercise_16;

public class Owner {
    private String firstName;
    private String surname;
    private Animal myAnimal;

    public Owner(String firstName, String surname, Animal myAnimal) {
        this.firstName = firstName;
        this.surname = surname;
        this.myAnimal = myAnimal;
    }

    @Override
    public String toString() {
        return "Owner{" +
                "firstName='" + firstName + '\'' +
                ", surname='" + surname + '\'' +
                ", myAnimal=" + myAnimal +
                '}';
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Animal getMyAnimal() {
        return myAnimal;
    }

    public void setMyAnimal(Animal myAnimal) {
        this.myAnimal = myAnimal;
    }
}
