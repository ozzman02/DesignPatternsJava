package com.patterns.behavioral.command;

public class Client {

    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        editor.setText("1234");
        ClearTextCommand command = new ClearTextCommand(editor);
        editor.executeAction(command);
        System.out.println("Text is: " + editor.getText());
        editor.undo();
        System.out.println("Text is: " + editor.getText());
        AddTextCommand addTextCommand = new AddTextCommand(editor," fun text");
        editor.executeAction(addTextCommand);
        System.out.println("Text is: " + editor.getText());
    }

}
