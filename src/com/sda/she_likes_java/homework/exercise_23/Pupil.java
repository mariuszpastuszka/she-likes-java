package com.sda.she_likes_java.homework.exercise_23;

import java.util.Objects;

public class Pupil {

    private String name;
    private String surname;
    private String currentClass;

    public Pupil(String name, String surname, String currentClass) {
        this.name = name;
        this.surname = surname;
        this.currentClass = currentClass;
    }

    @Override
    public String toString() {
        return "Pupil{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", currentClass='" + currentClass + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Pupil pupil = (Pupil) o;

        if (!Objects.equals(name, pupil.name)) return false;
        if (!Objects.equals(surname, pupil.surname)) return false;
        return Objects.equals(currentClass, pupil.currentClass);
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (surname != null ? surname.hashCode() : 0);
        result = 31 * result + (currentClass != null ? currentClass.hashCode() : 0);
        return result;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getCurrentClass() {
        return currentClass;
    }

    public void setCurrentClass(String currentClass) {
        this.currentClass = currentClass;
    }
}
