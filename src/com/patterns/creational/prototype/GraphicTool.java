package com.patterns.creational.prototype;

public class GraphicTool {

	private Graphic prototype;
	
	public GraphicTool(Graphic prototype) {
		this.prototype = prototype;
	}
	
	public void setPrototype(Graphic prototype) {
		this.prototype = prototype;
	}
	
	protected Graphic createGraphic() {
		return prototype.clone();
	}
	
}
