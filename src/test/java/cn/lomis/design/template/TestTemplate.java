package cn.lomis.design.template;

import org.junit.Test;

import cn.lomis.pattern.template.Game;
import cn.lomis.pattern.template.impl.Cricket;
import cn.lomis.pattern.template.impl.Football;

public class TestTemplate {
	@Test
	public void test01() {
		Game game = new Cricket();
		game.play();
		System.out.println();
		game = new Football();
		game.play();
	}

}
