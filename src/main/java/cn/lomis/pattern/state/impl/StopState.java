package cn.lomis.pattern.state.impl;

import cn.lomis.pattern.state.Context;
import cn.lomis.pattern.state.State;

public class StopState implements State {

	public void doAction(Context context) {
		System.out.println("Player is in stop state");
		context.setState(this);
	}

	public String toString() {
		return "Stop State";
	}
}