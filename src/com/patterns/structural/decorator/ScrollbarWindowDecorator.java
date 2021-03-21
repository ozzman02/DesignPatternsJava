package com.patterns.structural.decorator;

/* Decorator */
public class ScrollbarWindowDecorator extends WindowDecorator {

    public ScrollbarWindowDecorator(Window window) {
        super(window);
    }

    @Override
    public void draw() {
        System.out.println("Drawing scrollbar");
        window.draw();
    }

}
