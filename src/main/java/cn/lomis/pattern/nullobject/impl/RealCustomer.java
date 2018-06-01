package cn.lomis.pattern.nullobject.impl;

import cn.lomis.pattern.nullobject.AbstractCustomer;

public class RealCustomer extends AbstractCustomer {

	public RealCustomer(String name) {
		this.name = name;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public boolean isNil() {
		return false;
	}
}