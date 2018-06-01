package cn.lomis.design.mediator;

import org.junit.Test;

import cn.lomis.pattern.mediator.User;

public class TestMediator {

	@Test
	public void test01() {
		User robert = new User("Robert");
		User john = new User("John");

		robert.sendMessage("Hi! John!");
		john.sendMessage("Hello! Robert!");
	}

}
