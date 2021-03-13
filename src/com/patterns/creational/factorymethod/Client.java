package com.patterns.creational.factorymethod;

public class Client {

	public static void main(String[] args) {
		
		TransportFactory bikeFactory = new BikeFactory();
		Transport bike  = bikeFactory.create();
		System.out.println(bike.drive());
		
		TransportFactory carFactory = new CarFactory();
		Transport car = carFactory.create();
		System.out.println(car.drive());
		
	}

}
