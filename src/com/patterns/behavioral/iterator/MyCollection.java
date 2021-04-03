package com.patterns.behavioral.iterator;

public class MyCollection {

    private String [] items = new String[5];

    public MyCollection(){
        items[0] = "0";
        items[1] = "1";
        items[2] = "2";
        items[3] = "3";
        items[4] = "4";
    }


    String[] getItems() {
        return items;
    }

    public MyIterator<String> getIterator(){
        return new CollectionIterator(this);
    }
}
