package com.sda.she_likes_java.strings;

public class ImmutableString {

    public static void main(String[] args) {
        String name = "mariusz";
        // name + "pasutuszka"
        name.concat("pastuszka"); // + is shortcut for concat method call
        name = name.concat("he's 40");
        System.out.println("My name now: " + name);

        StringBuilder nameWithBuilder = new StringBuilder("mariusz");
        nameWithBuilder.append(" pastuszka");
        nameWithBuilder.append(" pastuszka");
        nameWithBuilder.append(" pastuszka");
        nameWithBuilder.append(" pastuszka");
        nameWithBuilder.append(" pastuszka");
        nameWithBuilder.append(" pastuszka");
        System.out.println("Name with builder: " + nameWithBuilder);

        String some = "Alice " + " is" + " 10" + " years";
        // "Alice is" + " 10" + " years"
        // "Alice is 10" + years"
        // Alice is 10 years
        String alice = "Alice ";

        StringBuilder someString = new StringBuilder();
        someString.append("Alice");
        someString.append("is");
        someString.append("10");
        someString.append("years");

    }
}
