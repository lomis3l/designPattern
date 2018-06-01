package cn.lomis.pattern.builder.child;

import cn.lomis.pattern.builder.impl.ColdDrink;

public class Coke extends ColdDrink {

	@Override
	public float price() {
		return 30.0f;
	}

	@Override
	public String name() {
		return "Coke";
	}
}