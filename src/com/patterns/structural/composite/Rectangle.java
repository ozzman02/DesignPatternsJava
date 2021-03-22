package com.patterns.structural.composite;

/* Leaf */
public class Rectangle implements Graphic {

    @Override
    public void draw() {
        System.out.println("Drawing a rectangle");
    }

}
