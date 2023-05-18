package com.sda.she_likes_java.homework.exercise_26;

public class Main {

    public static void main(String[] args) {
        ImportantEvents[] allImportantEvents = ImportantEvents.values();

        for (ImportantEvents event : allImportantEvents) {
            System.out.println("Important event: ");
            System.out.println("\t" + event.getEventDate() + ": " + event.getDescription());
        }
    }
}
