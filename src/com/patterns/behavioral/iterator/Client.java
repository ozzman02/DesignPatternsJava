package com.patterns.behavioral.iterator;

public class Client {

    public static void main(String[] args) {
        MyCollection collection = new MyCollection();
        MyIterator<String> iterator = collection.getIterator();
        while (!iterator.isDone()){
            String item = iterator.getNext();
            System.out.println("Items on the item list: "+item);
        }
    }

}
