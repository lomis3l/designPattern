package cn.lomis.pattern.facade.impl;

import cn.lomis.pattern.facade.Shape;

public class Rectangle implements Shape {

	@Override
	public void draw() {
		System.out.println("Rectangle::draw()");
	}
}