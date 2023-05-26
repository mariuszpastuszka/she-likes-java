package com.sda.she_likes_java.homework.exercise_28;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        words.add("one");
        words.add("p");
        words.add("second");
        words.add("haha");

        System.out.println("Sorting strings by length");
        System.out.println("Before sorting: " + words);

        Collections.sort(words, new LengthBaseComparator());
        System.out.println("After sorting: " + words);
    }
}
