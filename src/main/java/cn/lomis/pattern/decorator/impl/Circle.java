package cn.lomis.pattern.decorator.impl;

import cn.lomis.pattern.decorator.Shape;

public class Circle implements Shape {

	@Override
	public void draw() {
		System.out.println("绘制圆形");
	}
}