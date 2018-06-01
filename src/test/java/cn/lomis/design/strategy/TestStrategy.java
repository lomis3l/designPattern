package cn.lomis.design.strategy;

import org.junit.Test;

import cn.lomis.pattern.strategy.Context;
import cn.lomis.pattern.strategy.impl.OperationAdd;
import cn.lomis.pattern.strategy.impl.OperationMultiply;
import cn.lomis.pattern.strategy.impl.OperationSubstract;

public class TestStrategy {

	@Test
	public void test01() {
		Context context = new Context(new OperationAdd());
		System.out.println("10 + 5 = " + context.executeStrategy(10, 5));

		context = new Context(new OperationSubstract());
		System.out.println("10 - 5 = " + context.executeStrategy(10, 5));

		context = new Context(new OperationMultiply());
		System.out.println("10 * 5 = " + context.executeStrategy(10, 5));
	}

}
