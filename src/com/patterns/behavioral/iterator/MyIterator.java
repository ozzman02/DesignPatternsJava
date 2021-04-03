package com.patterns.behavioral.iterator;

public interface MyIterator<T> {

    T getNext();

    boolean isDone();

}
