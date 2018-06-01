package cn.lomis.pattern.abstractfactory.impl;

import cn.lomis.pattern.abstractfactory.Shape;

/**
 * 圆形
 * @author lomis
 *
 */
public class Circle implements Shape {

	@Override
	public void draw() {
		System.out.println("绘制圆形");

	}

}
