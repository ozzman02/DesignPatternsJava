package com.patterns.creational.prototype;

/* Concrete Prototype */
public class Video extends Graphic {
	
	private String url;
	
	public void setUrl(String url) {
		this.url = url;
	}

	@Override
	public Graphic clone() {
		Video clone = new Video();
		clone.setUrl(url);
		return clone;
	}

	@Override
	public String getUrl() {
		return url;
	}

}
