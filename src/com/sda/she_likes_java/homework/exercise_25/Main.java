package com.sda.she_likes_java.homework.exercise_25;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Map<String, List<String>> testData = generateTestData();
        CitiesCountries citiesCountries = new CitiesCountries(testData);
        System.out.println("Let's play");
        System.out.println("Show me all countries You know");
        System.out.println(citiesCountries.countriesNames());
        System.out.println("Show me cities in Spain");
        System.out.println(citiesCountries.getCitiesInCountry("Spain"));
    }

    private static Map<String, List<String>> generateTestData() {
        Map<String, List<String>> exampleData = new HashMap<>();
        exampleData.put("Spain", List.of("Madrit", "Barcelona", "Bilbao"));
        exampleData.put("Italy", List.of("Rome", "Florence"));
        return exampleData;
    }
}
