package com.sda.she_likes_java.homework.exercise_23;

public class Grade {
    private int gradeNumber;

    public Grade(int gradeNumber) {
        this.gradeNumber = gradeNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Grade grade = (Grade) o;

        return gradeNumber == grade.gradeNumber;
    }

    @Override
    public int hashCode() {
        return gradeNumber;
    }

    @Override
    public String toString() {
        return "Grade{" +
                "gradeNumber=" + gradeNumber +
                '}';
    }

    public int getGradeNumber() {
        return gradeNumber;
    }

    public void setGradeNumber(int gradeNumber) {
        this.gradeNumber = gradeNumber;
    }
}
