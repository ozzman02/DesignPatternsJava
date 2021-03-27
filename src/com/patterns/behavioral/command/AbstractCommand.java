package com.patterns.behavioral.command;

public abstract class AbstractCommand implements Command {

    private TextEditor textEditor;

    public TextEditor getTextEditor() {
        return textEditor;
    }

    public void setTextEditor(TextEditor textEditor) {
        this.textEditor = textEditor;
    }

    public AbstractCommand(TextEditor textEditor) {
        this.textEditor = textEditor;
    }

}
