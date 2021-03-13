package com.patterns.creational.factorymethod;

/* Concrete Product */
public class Bike extends Transport {

	@Override
	public String drive() {
		return "Bike driving";
	}

}
