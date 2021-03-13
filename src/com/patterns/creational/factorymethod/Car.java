package com.patterns.creational.factorymethod;

/* Concrete Product */
public class Car extends Transport {

	@Override
	public String drive() {
		return "Car driving";
	}

}
