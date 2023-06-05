package com.sda.she_likes_java.lambda;

// Classes from java.lang are imported always
//import java.lang.FunctionalInterface;
// API - Application programming interface
// contract - what to do
@FunctionalInterface // to protect programmer from accidental refactoring
public interface Jogging {

    void run();

    // simple/default implementation
    default void walk() {}

    default void drink(String drink) {}
}
