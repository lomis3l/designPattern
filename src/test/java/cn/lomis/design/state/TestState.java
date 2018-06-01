package cn.lomis.design.state;

import org.junit.Test;

import cn.lomis.pattern.state.Context;
import cn.lomis.pattern.state.impl.StartState;
import cn.lomis.pattern.state.impl.StopState;

public class TestState {

	@Test
	public void test01() {
		Context context = new Context();

		StartState startState = new StartState();
		startState.doAction(context);

		System.out.println(context.getState().toString());

		StopState stopState = new StopState();
		stopState.doAction(context);

		System.out.println(context.getState().toString());
	}

}
