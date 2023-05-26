package com.sda.she_likes_java.homework.exercise_28;

import java.util.Comparator;

public class LengthBaseComparator implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        return o1.length() - o2.length();
    }
}
