package cn.lomis.pattern.prototype;

/**
 * 圆形
 * @author lomis
 *
 */
public class Circle extends Shape {

	public Circle() {
		type = "Circle";
	}

	@Override
	public void draw() {
		System.out.println("绘制圆形");
	}
}