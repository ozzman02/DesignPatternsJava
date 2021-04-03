package com.patterns.behavioral.iterator;

public class CollectionIterator implements MyIterator<String>{

    private MyCollection myCollection;

    private int cursor = 0;

    public CollectionIterator(MyCollection myCollection) {
        this.myCollection = myCollection;
    }

    @Override
    public String getNext() {
        if (!isDone()) {
            String item = myCollection.getItems()[cursor];
            cursor++;
            return item;
        }
        return null;
    }

    @Override
    public boolean isDone() {
        return cursor == myCollection.getItems().length;
    }

}
