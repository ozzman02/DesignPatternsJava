package com.patterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

/* Composite */
public class GraphicItemGroup implements Graphic {

    private List<Graphic> graphics = new ArrayList<>();

    public List<Graphic> getGraphics() {
        return graphics;
    }

    @Override
    public void draw() {
        graphics.forEach(Graphic::draw);
    }

}
