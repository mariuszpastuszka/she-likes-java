package com.sda.she_likes_java.arrays;

import java.util.Random;

public class EnglishSchoolGrades {

    public static void main(String[] args) {
        int[] myGradesOnEnglishClass = new int[10000];

        Random gradeGenerator = new Random();

        // initializing grades with some random scores
        for (int index = 0; index < myGradesOnEnglishClass.length; index++) {
            myGradesOnEnglishClass[index] = 1 + gradeGenerator.nextInt(6);
        }

        for (int index = 0; index < myGradesOnEnglishClass.length; index++) {
            System.out.println("my grade on index nr: " + index + " is: " + myGradesOnEnglishClass[index]);
        }
    }
}
