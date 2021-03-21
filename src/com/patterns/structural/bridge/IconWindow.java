package com.patterns.structural.bridge;

/* Refined Abstraction */
public class IconWindow extends Window {

    public void drawIcon(){
        draw(0,0,10,10,"White");
        draw(0,10,10,10,"Black");
    }

}
