package cn.lomis.pattern.builder.impl;

import cn.lomis.pattern.builder.Packing;

public class Bottle implements Packing {

	@Override
	public String pack() {
		return "Bottle";
	}
}