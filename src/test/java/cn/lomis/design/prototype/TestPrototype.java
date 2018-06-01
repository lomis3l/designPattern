package cn.lomis.design.prototype;

import org.junit.Test;

import cn.lomis.pattern.prototype.Shape;
import cn.lomis.pattern.prototype.ShapeCache;

public class TestPrototype {

	@Test
	public void test01() {
		ShapeCache.loadCache();

		Shape clonedShape = (Shape) ShapeCache.getShape("1");
		System.out.println("Shape : " + clonedShape.getType());

		Shape clonedShape2 = (Shape) ShapeCache.getShape("2");
		System.out.println("Shape : " + clonedShape2.getType());
	}
}
