package com.patterns.creational.factorymethod;

/* Concrete Creator */
public class CarFactory extends TransportFactory {

	@Override
	public Transport create() {
		return new Car();
	}

}
