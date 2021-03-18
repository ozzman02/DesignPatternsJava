package com.patterns.structural.adapter;

public class Client {

    /* New Framework code - Needs to adapt the new Rectangle code to work with legacy rectangle */
    public void calculateRectangleSize(Rectangle rectangle) {
        System.out.println("Rectangle Size: " + rectangle.determineSize());
    }

    public static void main(String[] args) {
        Client client = new Client();
        LegacyRectangle legacyRectangle = new LegacyRectangle();
        LegacyRectangleAdapter adapter = new LegacyRectangleAdapter(legacyRectangle);
        client.calculateRectangleSize(adapter);
    }

}
