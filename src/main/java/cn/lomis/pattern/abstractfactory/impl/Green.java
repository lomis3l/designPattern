package cn.lomis.pattern.abstractfactory.impl;

import cn.lomis.pattern.abstractfactory.Color;

public class Green implements Color {

	@Override
	public void fill() {
		System.out.println("填充-绿色");

	}

}
