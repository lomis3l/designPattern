package cn.lomis.design.bridge;

import cn.lomis.pattern.bridge.Circle;
import cn.lomis.pattern.bridge.Shape;
import cn.lomis.pattern.bridge.impl.GreenCircle;
import cn.lomis.pattern.bridge.impl.RedCircle;

import org.junit.Test;

public class TestBridge {
	@Test
	public void test01() {
		Shape redCircle = new Circle(100, 100, 10, new RedCircle());
		Shape greenCircle = new Circle(100, 100, 10, new GreenCircle());

		redCircle.draw();
		greenCircle.draw();
	}

}
