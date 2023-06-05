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
        SortedPerson zorro1 = new SortedPerson("Zorro", 7);
        SortedPerson zorra = new SortedPerson("Zorra", 11);
        List<SortedPerson> persons = new ArrayList<>();
        persons.add(olaf);
        persons.add(gustaw);
        persons.add(zorro);
        persons.add(zorro);
        persons.add(zorro);
        persons.add(zorra);
        persons.add(zorro1);

        Collections.sort(persons);
        System.out.println("After sorting: " + persons);

        // if returns -1 that means: olaf, gustaw
        // if returns 1 that means: gustaw, olaf
//        System.out.println("olaf.compareTo(gustaw): " + olaf.compareTo(gustaw));
//        System.out.println("gustaw vs zorro: " + gustaw.compareTo(zorro));
        Comparator<SortedPerson> reversedAgeOrder = new AgedReversedOrderOfSortedPersons();
        Collections.sort(persons, reversedAgeOrder);
        System.out.println("Reversed order based on age: " + persons);

        List<String> names = new ArrayList<>();
        names.add("Ramune");
        names.add("Lina");
        names.add("Alma");
        names.add("Karolina");
        Collections.sort(names);
        System.out.println("sorted names: " + names);

        Collections.sort(persons, new LexicalOrderForSortedPerson());
        System.out.println("persons sorted by name: " + persons);

        Collections.sort(persons, new ReversedLexicalOrderForSortedPerson());
        System.out.println("persons sorted by name - reversed: " + persons);

        Collections.sort(persons,
                new LexicalOrderForSortedPerson().reversed()
                        .thenComparing(reversedAgeOrder));

        Comparator<SortedPerson> reversedAgeOrderLambda = (o1, o2) -> {
//        return o2.getAge() - o1.getAge();
            System.out.println("Using my AgedReversedOrderOfSortedPersons class");
            if (o1.getAge() < o2.getAge()) {
                return 1;
            } else if (o1.getAge() > o2.getAge()) {
                return -1;
            } else {
                return 0;
            }
        };

        // logically broken
        // You can provide lambda for Comparable, but it's not real functional interface
        Comparable<SortedPerson> brokenComparableLambda = o -> 1;
    }
}
