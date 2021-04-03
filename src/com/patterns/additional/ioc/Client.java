package com.patterns.additional.ioc;

public class Client {

    public static void main(String[] args) {
        Container container = new Container();
        container.init();
        ImageService imageService = container.getImageService();
        System.out.print(imageService.readImage());
    }

}
