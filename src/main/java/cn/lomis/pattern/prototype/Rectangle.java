package cn.lomis.pattern.prototype;

/**
 * 矩形
 * @author lomis
 *
 */
public class Rectangle extends Shape {

	public Rectangle() {
		type = "Rectangle";
	}

	@Override
	public void draw() {
		System.out.println("绘制矩形");
	}
}