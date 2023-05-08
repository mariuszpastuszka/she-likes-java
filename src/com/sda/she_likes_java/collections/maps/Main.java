package com.sda.she_likes_java.collections.maps;

import com.sda.she_likes_java.collections.Person;
import com.sda.she_likes_java.collections.Trousers;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        System.out.println("Maps are like dictionaries");

        // type of the key is String
        // type of the value is Trousers
        Map<String, Trousers> myJeans = new HashMap<>();
        // key: "my favourite jeans"
        // value: new Trousers("jeans", "big star")
        myJeans.put("my favourite jeans", new Trousers("jeans", "big star"));
        myJeans.put("my old one", new Trousers("unknow material", "primemark"));
        myJeans.put("my old one", new Trousers("unknow material", "primemark II"));

        Map<Person, Trousers> personsTrousers = new HashMap<>();
        personsTrousers.put(new Person("mariusz", "p."), new Trousers("polish material", "primemark"));
        personsTrousers.put(new Person("karolina", "p."), new Trousers("polish material", "primemark"));
    }
}
