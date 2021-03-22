package com.patterns.structural.proxy;

import java.util.ArrayList;
import java.util.List;

/* Subject */
public class Application {

    private List<Image> images = new ArrayList<Image>();

    public Application(List<Image> images) {
        this.images = images;
    }

    public void draw() {
        images.forEach(Image::draw);
    }
}
