package com.sda.she_likes_java.homework.exercise_25;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CitiesCountries {

    private final Map<String, List<String>> countriesOverCities;

    public CitiesCountries(Map<String, List<String>> countriesOverCities) {
        this.countriesOverCities = new HashMap<>(countriesOverCities);
    }

    public List<String> countriesNames() {
        return new ArrayList<>(countriesOverCities.keySet());
    }

    public List<String> getCitiesInCountry(String country) {
        List<String> citiesFromCountry = countriesOverCities.get(country);

        return citiesFromCountry != null ? citiesFromCountry : List.of();
    }
}
