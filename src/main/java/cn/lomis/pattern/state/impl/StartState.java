package cn.lomis.pattern.state.impl;

import cn.lomis.pattern.state.Context;
import cn.lomis.pattern.state.State;

public class StartState implements State {

	public void doAction(Context context) {
		System.out.println("Player is in start state");
		context.setState(this);
	}

	public String toString() {
		return "Start State";
	}
}