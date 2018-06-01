package cn.lomis.pattern.abstractfactory.impl;

import cn.lomis.pattern.abstractfactory.Shape;

/**
 * 矩形
 * @author lomis
 *
 */
public class Rectangle implements Shape {

	@Override
	public void draw() {
		System.out.println("绘制矩形");
		
	}

}
