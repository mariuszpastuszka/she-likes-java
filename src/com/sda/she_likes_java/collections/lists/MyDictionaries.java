package com.sda.she_likes_java.collections.lists;

import java.util.List;

public class MyDictionaries {
    // create english-polish dictionary
    public static MyGreatDictionary createEnglishPolishDictionary() {
        List<WordsBilingual> list = List.of(
                new WordsBilingual("house", "dom")
        );
        MyGreatDictionary englishPolishDictionary = new MyGreatDictionary();
        englishPolishDictionary.fillWithWordsBilingual(list);
        return englishPolishDictionary;
    }

    // create english-cech dictionary
    public static MyGreatDictionary createEnglishCechDictionary() {
        List<WordsBilingual> list = List.of(
                new WordsBilingual("house", "dům")
        );
        MyGreatDictionary englishCechDictionary = new MyGreatDictionary();
        englishCechDictionary.fillWithWordsBilingual(list);
        return englishCechDictionary;
    }
}
