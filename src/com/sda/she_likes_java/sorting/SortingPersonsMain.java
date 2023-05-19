package com.sda.she_likes_java.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingPersonsMain {

    public static void main(String[] args) {
        SortedPerson olaf = new SortedPerson("Olaf", 22);
        SortedPerson gustaw = new SortedPerson("Gustaw", 11);
        SortedPerson zorro = new SortedPerson("Zorro", 11);
        List<SortedPerson> persons = new ArrayList<>();
        persons.add(olaf);
        persons.add(gustaw);
        persons.add(zorro);
        persons.add(zorro);
        persons.add(zorro);

        Collections.sort(persons);
        System.out.println("After sorting: " + persons);

        // if returns -1 that means: olaf, gustaw
        // if returns 1 that means: gustaw, olaf
//        System.out.println("olaf.compareTo(gustaw): " + olaf.compareTo(gustaw));
//        System.out.println("gustaw vs zorro: " + gustaw.compareTo(zorro));
        Comparator<SortedPerson> reversedAgeOrder = new AgedReversedOrderOfSortedPersons();
        Collections.sort(persons, reversedAgeOrder);
        System.out.println("Reversed order based on age: " + persons);
    }
}
