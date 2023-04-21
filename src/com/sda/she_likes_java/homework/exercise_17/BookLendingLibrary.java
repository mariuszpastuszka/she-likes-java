package com.sda.she_likes_java.homework.exercise_17;

import java.time.Year;
import java.util.Random;

public class BookLendingLibrary {
    public static void main(String[] args) {
        System.out.println("Let's create some books");
        createBourneTrilogy();
        System.out.printf("Number of copies of all books: [%d]%n", Book.getNumberOfCreatedBooks());
    }

    public static void createBourneTrilogy() {
        Random random = new Random();
        int numberOfIterations = random.nextInt();

        for (int i = 0; i < numberOfIterations; i++) {
            new Book("Bourne Identity", "Robert Ludlum", Year.of(1980));
            new Book("Bourne Supremacy", "Robert Ludlum", Year.of(1986));
            new Book("Bourne Ultimatum", "Robert Ludlum", Year.of(1990));
        }
    }
}
