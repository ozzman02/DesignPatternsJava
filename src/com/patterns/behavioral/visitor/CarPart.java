package com.patterns.behavioral.visitor;

public abstract class CarPart {

    private String carPartName;

    public CarPart(String carPartName) {
        this.carPartName = carPartName;
    }

    void acceptCarPartVisitor(CarPartVisitor visitor){
        visitor.visit(this);
    }

    @Override
    public String toString() {
        return "CarPart{" +
                "carPartName='" + carPartName + '\'' +
                '}';
    }
}
