package cn.lomis.pattern.builder.impl;

import cn.lomis.pattern.builder.Item;
import cn.lomis.pattern.builder.Packing;

public abstract class ColdDrink implements Item {

	@Override
	public Packing packing() {
		return new Bottle();
	}

	@Override
	public abstract float price();
}