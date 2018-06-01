package cn.lomis.pattern.observer.impl;

import cn.lomis.pattern.observer.Observer;
import cn.lomis.pattern.observer.Subject;

public class BinaryObserver extends Observer {

	public BinaryObserver(Subject subject) {
		this.subject = subject;
		this.subject.attach(this);
	}

	@Override
	public void update() {
		System.out.println("Binary String: " + Integer.toBinaryString(subject.getState()));
	}
}