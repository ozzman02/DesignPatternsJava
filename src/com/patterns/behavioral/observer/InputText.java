package com.patterns.behavioral.observer;

/* Concrete Observer */
public class InputText implements Observer {

    public void setText(String text) {
        System.out.println("Input text set text: " + text);
    }

    @Override
    public void update() {
        this.setText("button has been clicked");
    }

}
