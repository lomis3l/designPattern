package cn.lomis.design.factory;

import org.junit.Test;

import cn.lomis.pattern.factory.Shape;
import cn.lomis.pattern.factory.ShapeFactory;

public class TestFactoryPattern {

	@Test
	public void test01() {
		ShapeFactory shapeFactory = new ShapeFactory();

		Shape rectangleShape = shapeFactory.getShape("RECTANGLE");
		rectangleShape.draw();
		
		Shape circleShape = shapeFactory.getShape("CIRCLE");
		circleShape.draw();
	}
}
