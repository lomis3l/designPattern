package cn.lomis.pattern.builder.impl;

import cn.lomis.pattern.builder.Item;
import cn.lomis.pattern.builder.Packing;

public abstract class Burger implements Item {

	@Override
	public Packing packing() {
		return new Wrapper();
	}

	@Override
	public abstract float price();
}