package cn.lomis.pattern.facade.impl;

import cn.lomis.pattern.facade.Shape;

public class Circle implements Shape {

	@Override
	public void draw() {
		System.out.println("Circle::draw()");
	}
}