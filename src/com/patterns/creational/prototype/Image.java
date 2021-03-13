package com.patterns.creational.prototype;

/* Concrete Prototype */
public class Image extends Graphic {
	
	private String url;
	
	public void setUrl(String url) {
		this.url = url;
	}

	@Override
	public Graphic clone() {
		Image clone = new Image();
		clone.setUrl(url);
		return clone;
	}

	@Override
	public String getUrl() {
		return url;
	}

}
