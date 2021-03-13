package com.patterns.creational.factorymethod;

public class BikeFactory extends TransportFactory {

	@Override
	public Transport create() {
		return new Bike();
	}

}
