package com.patterns.structural.flyweight;

public class Client {

    public static void main(String[] args) {
        WordProcessor processor = new WordProcessor();

        String textToAdd = "Hello i'm aaaa wwworddd pprocessorrrr";
        int length = textToAdd.length();

        LetterFactory factory = new LetterFactory();

        for (int i = 0; i < length; i++) {
            String value = textToAdd.substring(i,i+1);
            processor.addLetter(factory.createLetter(value));
        }

        /* Less objects are being created, Flyweight Pattern reduces the number of objects being created

            New letter created with value: H
            New letter created with value: e
            New letter created with value: l
            New letter created with value: o
            New letter created with value:
            New letter created with value: i
            New letter created with value: '
            New letter created with value: m
            New letter created with value: a
            New letter created with value: w
            New letter created with value: r
            New letter created with value: d
            New letter created with value: p
            New letter created with value: c
            New letter created with value: s
            Hello i'm aaaa wwworddd pprocessorrrr
        */
        processor.printLetters();
    }

}
