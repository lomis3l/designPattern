package cn.lomis.pattern.template.impl;

import cn.lomis.pattern.template.Game;

public class Football extends Game {

	@Override
	protected void endPlay() {
		System.out.println("Football Game Finished!");
	}

	@Override
	protected void initialize() {
		System.out.println("Football Game Initialized! Start playing.");
	}

	@Override
	protected void startPlay() {
		System.out.println("Football Game Started. Enjoy the game!");
	}
}