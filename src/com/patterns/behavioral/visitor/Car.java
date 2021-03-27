package com.patterns.behavioral.visitor;

import java.util.ArrayList;
import java.util.List;

/* Element */
public class Car {

    List<CarPart> carParts = new ArrayList<CarPart>();

    public List<CarPart> getCarParts() {
        return carParts;
    }

    public void setCarParts(List<CarPart> carParts) {
        this.carParts = carParts;
    }

    public void render() {
        RenderCarPartVisitor renderCarPartVisitor = new RenderCarPartVisitor();
        carParts.forEach(carPart -> carPart.acceptCarPartVisitor(renderCarPartVisitor));
    }

    public void print() {
        PrintCarPartVisitor printCarPartVisitor = new PrintCarPartVisitor();
        carParts.forEach(carPart -> carPart.acceptCarPartVisitor(printCarPartVisitor));
    }

    public void upgrade() {
        UpgradeCarPartVisitor upgradeCarPartVisitor = new UpgradeCarPartVisitor();
        carParts.forEach(carPart -> carPart.acceptCarPartVisitor(upgradeCarPartVisitor));
    }

}
