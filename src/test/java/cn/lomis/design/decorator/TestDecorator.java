package cn.lomis.design.decorator;

import org.junit.Test;

import cn.lomis.pattern.decorator.Shape;
import cn.lomis.pattern.decorator.impl.Circle;
import cn.lomis.pattern.decorator.impl.Rectangle;
import cn.lomis.pattern.decorator.impl.RedShapeDecorator;

public class TestDecorator {

	@Test
	public void test01() {
		Shape circle = new Circle();

		Shape redCircle = new RedShapeDecorator(new Circle());

		Shape redRectangle = new RedShapeDecorator(new Rectangle());
		System.out.println("Circle with normal border");
		circle.draw();

		System.out.println("\nCircle of red border");
		redCircle.draw();

		System.out.println("\nRectangle of red border");
		redRectangle.draw();
	}
}
