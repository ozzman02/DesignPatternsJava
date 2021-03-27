package com.patterns.behavioral.visitor;

/* Concrete Visitor */
public class UpgradeCarPartVisitor implements CarPartVisitor {

    @Override
    public void visit(CarPart carPart) {
        System.out.println("Upgrade: " + carPart);
    }

}
