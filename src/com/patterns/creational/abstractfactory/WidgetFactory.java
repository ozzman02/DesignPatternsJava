package com.patterns.creational.abstractfactory;

/* Abstract Factory */
public interface WidgetFactory {
	
	ScrollBar createScrollBar();
	
	Window createWindow();

}
