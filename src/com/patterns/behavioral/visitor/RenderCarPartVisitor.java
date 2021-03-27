package com.patterns.behavioral.visitor;

/* Concrete Visitor */
public class RenderCarPartVisitor implements CarPartVisitor {

    @Override
    public void visit(CarPart carPart) {
        System.out.println("Render " + carPart);
    }

}
