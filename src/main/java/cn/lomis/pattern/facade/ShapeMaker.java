package cn.lomis.pattern.facade;

import cn.lomis.pattern.facade.impl.Circle;
import cn.lomis.pattern.facade.impl.Rectangle;

public class ShapeMaker {
	private Shape circle;
	private Shape rectangle;

	public ShapeMaker() {
		circle = new Circle();
		rectangle = new Rectangle();
	}

	public void drawCircle() {
		circle.draw();
	}

	public void drawRectangle() {
		rectangle.draw();
	}
}