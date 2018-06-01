package cn.lomis.pattern.builder.child;

import cn.lomis.pattern.builder.impl.Burger;

public class ChickenBurger extends Burger {

	@Override
	public float price() {
		return 50.5f;
	}

	@Override
	public String name() {
		return "Chicken Burger";
	}
}