package com.patterns.behavioral.command;

import java.util.LinkedList;
import java.util.Queue;

public class TextEditor {

    private String text;

    private Queue<Command> queue = new LinkedList<Command>();

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Queue<Command> getQueue() {
        return queue;
    }

    public void setQueue(Queue<Command> queue) {
        this.queue = queue;
    }

    public void executeAction(Command command){
        command.action();
        queue.add(command);
    }

    public void undo(){
        Command command = queue.poll();
        if(command != null){
            command.undo();
        }
    }

}
