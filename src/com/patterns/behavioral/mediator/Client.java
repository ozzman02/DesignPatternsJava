package com.patterns.behavioral.mediator;

/*
    ScreenDirector manages widget interaction.

    Each Widget has a ScreenDirector implementation. This implementation manages List and InputText.

    The moment the list changes the screen director captures the change and the implementation
        of screen director places the value in the input text.

    We want to select an item from the list and pass the value to an input text.

*/
public class Client {

    public static void main(String[] args) {

        CustomList list = new CustomList();
        InputText text = new InputText();

        ScreenDirectorOne screenDirector = new ScreenDirectorOne();
        screenDirector.setInputText(text);
        list.setScreenDirector(screenDirector);

        list.getItems().add("Data item one");
        list.getItems().add("Data item two");
        list.getItems().add("Data item three");

        list.selectItem(2);

        System.out.println("Selected value is: " + text.getValue());




    }
}
