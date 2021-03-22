package com.patterns.structural.flyweight;

import java.util.ArrayList;
import java.util.List;

/* Flyweight */
public class WordProcessor {

    private List<Letter> letters = new ArrayList<Letter>();

    public void addLetter(Letter letter){
        this.letters.add(letter);
    }

    public void printLetters() {
        letters.forEach(letter -> System.out.print(letter.getValue()));
    }

}
