package com.patterns.behavioral.mediator;

/* Concrete Mediator */
public class ScreenDirectorOne implements ScreenDirector {

    private InputText inputText;

    public void setInputText(InputText inputText) {
        this.inputText = inputText;
    }

    @Override
    public void itemSelected(String item) {
        inputText.setValue(item);
    }
}
