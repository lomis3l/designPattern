package cn.lomis.pattern.strategy.impl;

import cn.lomis.pattern.strategy.Strategy;

public class OperationSubstract implements Strategy {
	@Override
	public int doOperation(int num1, int num2) {
		return num1 - num2;
	}
}