package com.sda.she_likes_java.homework.exercise_17;

import java.time.Year;

public class Book {
    private static int numberOfCreatedBooks;
    private final String title;
    private final String author;
    private final Year yearOfPublication;
    public Book(String title, String author, Year yearOfPublication) {
        this.title = title;
        this.author = author;
        this.yearOfPublication = yearOfPublication;
        numberOfCreatedBooks++;
    }

    public static int getNumberOfCreatedBooks() {
        return numberOfCreatedBooks;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", yearOfPublication=" + yearOfPublication +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public Year getYearOfPublication() {
        return yearOfPublication;
    }
}
