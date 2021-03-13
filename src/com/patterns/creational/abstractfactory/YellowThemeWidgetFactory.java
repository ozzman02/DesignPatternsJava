package com.patterns.creational.abstractfactory;

/* ConcreteFactory */
public class YellowThemeWidgetFactory implements WidgetFactory {

	@Override
	public ScrollBar createScrollBar() {
		return new YellowThemScrollBar();
	}

	@Override
	public Window createWindow() {
		return new YellowThemeWindow();
	}

}
