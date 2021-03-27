package com.patterns.behavioral.visitor;

/* Concrete Visitor */
public class PrintCarPartVisitor implements CarPartVisitor {

    @Override
    public void visit(CarPart carPart) {
        System.out.println("Print " + carPart);
    }

}
