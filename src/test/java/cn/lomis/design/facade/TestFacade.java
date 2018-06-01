package cn.lomis.design.facade;

import org.junit.Test;

import cn.lomis.pattern.facade.ShapeMaker;

public class TestFacade {

	@Test
	public void test01() {
		ShapeMaker shapeMaker = new ShapeMaker();

		shapeMaker.drawCircle();
		shapeMaker.drawRectangle();
	}

}
