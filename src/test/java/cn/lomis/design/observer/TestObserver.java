package cn.lomis.design.observer;

import org.junit.Test;

import cn.lomis.pattern.observer.Subject;
import cn.lomis.pattern.observer.impl.BinaryObserver;
import cn.lomis.pattern.observer.impl.HexaObserver;
import cn.lomis.pattern.observer.impl.OctalObserver;

public class TestObserver {

	@Test
	public void test01() {
		Subject subject = new Subject();

		new HexaObserver(subject);
		new OctalObserver(subject);
		new BinaryObserver(subject);

		System.out.println("First state change: 15");
		subject.setState(15);
		System.out.println("Second state change: 10");
		subject.setState(10);
	}

}
