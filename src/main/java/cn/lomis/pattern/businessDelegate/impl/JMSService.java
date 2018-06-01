package cn.lomis.pattern.businessDelegate.impl;

import cn.lomis.pattern.businessDelegate.BusinessService;

public class JMSService implements BusinessService {

	@Override
	public void doProcessing() {
		System.out.println("Processing task by invoking JMS Service");
	}
}