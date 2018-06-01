package cn.lomis.pattern.abstractfactory.impl;

import cn.lomis.pattern.abstractfactory.Color;

public class Red implements Color {

	@Override
	public void fill() {
		System.out.println("填充-红色");

	}

}
