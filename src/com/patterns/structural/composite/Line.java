package com.patterns.structural.composite;

/* Leaf */
public class Line implements Graphic {

    @Override
    public void draw() {
        System.out.println("Draw line");
    }

}
