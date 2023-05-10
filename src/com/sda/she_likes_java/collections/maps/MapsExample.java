package com.sda.she_likes_java.collections.maps;

import com.sda.she_likes_java.collections.Person;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapsExample {

    public static void main(String[] args) {
        // Wrappers: Long, Integer
        // for collections
        int a = 1444444;
        Integer aInteger = null;
//        List<int> integers;
        List<Integer> intNumbers = new ArrayList<>();
        intNumbers.add(1);
        intNumbers.add(2);
        intNumbers.add(3);
        intNumbers.add(null);

        long grade = -1L;
        Long longGrade = 2L;
        longGrade = null;
        // 2 + 2
        // 2 + null
        String name = null;
        String stringGrade = "VVV";

        List<Long> numbers;

        // String will be student's name
        // List<Long> - student's grades
        Map<String, List<Long>> studentsGrades = new HashMap<>();
        String john = "John";
        List<Long> johnsGrades = new ArrayList<>();
        johnsGrades.add(5L);
        johnsGrades.add(1L);

        List<Long> anotherListOfGrades = new ArrayList<>();
        anotherListOfGrades.add(3L);

        studentsGrades.put(john, johnsGrades);
        System.out.println("after adding John to map: " + studentsGrades);
        studentsGrades.put(john, anotherListOfGrades);
        System.out.println("after reassigning John inside map: " + studentsGrades);
//        studentsGrades.put("mariusz", "2L");

        Person me = new Person("mariusz", "p.");
        me = new Person("mariusz", "w.");
//        me = "karolina";

        Map<String, String> namesAndSurnames = new HashMap<>();
        namesAndSurnames.put("Ramune", "LTU");

        System.out.println("Ramune's surname: " + namesAndSurnames.get("Ramune"));
    }
}
