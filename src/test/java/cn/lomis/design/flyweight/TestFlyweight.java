package cn.lomis.design.flyweight;

import org.junit.Test;

import cn.lomis.pattern.flyweight.ShapeFactory;
import cn.lomis.pattern.flyweight.impl.Circle;

public class TestFlyweight {

	private static final String colors[] = { "Red", "Green", "Blue", "White", "Black" };

	@Test
	public void test01() {
		for (int i = 0; i < 20; ++i) {
			Circle circle = (Circle) ShapeFactory.getCircle(getRandomColor());
			circle.setX(getRandomX());
			circle.setY(getRandomY());
			circle.setRadius(100);
			circle.draw();
		}
	}

	private static String getRandomColor() {
		return colors[(int) (Math.random() * colors.length)];
	}

	private static int getRandomX() {
		return (int) (Math.random() * 100);
	}

	private static int getRandomY() {
		return (int) (Math.random() * 100);
	}

}
