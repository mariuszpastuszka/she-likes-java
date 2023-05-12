package com.sda.she_likes_java.collections.lists;

public class DictionaryProgram {

    public static void main(String[] args) {
        MyGreatDictionary englishCechDictionary = MyDictionaries.createEnglishCechDictionary();
        englishCechDictionary.translateFromSourceLanguageToDestiny("dog");
        englishCechDictionary.translateFromSourceLanguageToDestiny("house");
    }
}
