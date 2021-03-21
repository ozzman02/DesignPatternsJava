package com.patterns.structural.bridge;

/* Concrete Implementor */
public class DirectXWindowImpl extends WindowImpl {

    @Override
    public void draw(int x, int y, int width, int height, String colour) {
        System.out.println("Drawing on direct x: "+x+" y: "+y+"  width: "+width+ " height "+height);
    }

}
