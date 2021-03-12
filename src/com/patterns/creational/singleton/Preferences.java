package com.patterns.creational.singleton;

public class Preferences {
	
	private static Preferences instance = null;
	
	/* 
		If you need to allow extension of this class the constructor needs to be protected.
		
		If not, you are going to have the following error in the subclass:
		"Implicit super constructor Preferences() is not visible for default constructor. 
			Must define an explicit constructor"
	*/
	protected Preferences() {
		
	}
	
	public static Preferences getInstance() {
		if (instance == null) {
			synchronized (Preferences.class) {
				if (instance == null) {
					instance = new Preferences();
				}
			}
		}
		return instance;
	}
	
	public void helloSingleton() {
		System.out.println("Hello I'm a Singleton !!!");
	}
	
	/*private synchronized static void createInstance() {
		if (instance == null) instance = new Preferences();
	}
	
	public static Preferences getInstance() {
		if (instance == null) createInstance();
		return instance;
	}*/
}
