package com.sda.she_likes_java.collections.lists;


import com.sda.she_likes_java.collections.Trousers;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        int a = 5;
        a = 6;

        final int b = 7;
//        b = 8;

        // expandable list
        List<Trousers> trousers = new ArrayList<>();
        trousers.add(new Trousers("jeans", "big star"));
        trousers.add(new Trousers("jeans", "primemark"));

        showItemsFromTheList(trousers);
        // let's add another item to the list
        trousers.add(new Trousers("jeans", "primemark"));

        // frozen list:)
        List<Trousers> trousersList = List.of(
                new Trousers("jeans", "big star"),
                new Trousers("jeans", "big star"),
                new Trousers("jeans", "big star")
        );
        showItemsFromTheList(trousersList);
//        trousersList.add(new Trousers("jeans", "primemark"));

        List<Trousers> trousersList2 = List.of(
                new Trousers("jeans", "big star"),
                new Trousers("jeans", "big star"),
                new Trousers("jeans", "big star"),
                new Trousers("jeans", "big star"),
                new Trousers("jeans", "big star"),
                new Trousers("jeans", "big star")
        );
    }

    public static void showItemsFromTheList(List<Trousers> items) {
        // enhanced for loop
        for (Trousers currentItem: items) {
            System.out.println(currentItem);
        }

        // old loop
        for (int i = 0; i < items.size(); i++) {
            Trousers currentItem = items.get(i);
            System.out.println(currentItem);
        }
    }
}
