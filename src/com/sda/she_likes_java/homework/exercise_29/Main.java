package com.sda.she_likes_java.homework.exercise_29;

public class Main {

    public static void main(String[] args) {
        char mLetter = 'm';
        System.out.println("m letter: " + mLetter);
        int mLetterCode = mLetter;
        System.out.println("m letter code: " + mLetterCode);
        String name = "mariusz";
        System.out.println("First 3 letters: " + name.substring(0, 3));
        System.out.println("Starting at the position number 3: " + name.substring(2));
        System.out.println("Let's check postal codes");
        try {
            PostalCodeUtilities.checkPostalCode("12");
        } catch (PostalCodeException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        try {
            PostalCodeUtilities.checkPostalCode("123456");
        } catch (PostalCodeException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        try {
            PostalCodeUtilities.checkPostalCode("ab-123");
        } catch (PostalCodeException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        try {
            PostalCodeUtilities.checkPostalCode("12-abc");
        } catch (PostalCodeException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        try {
            PostalCodeUtilities.checkPostalCode("02-972");
        } catch (PostalCodeException e) {
            System.out.println("Exception: " + e.toString());
        }
    }
}
