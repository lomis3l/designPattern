package cn.lomis.design.businessDelegate;

import org.junit.Test;

import cn.lomis.pattern.businessDelegate.BusinessDelegate;
import cn.lomis.pattern.businessDelegate.Client;

public class TestBusinessDelegate {

	@Test
	public void test01() {
		BusinessDelegate businessDelegate = new BusinessDelegate();
		businessDelegate.setServiceType("EJB");

		Client client = new Client(businessDelegate);
		client.doTask();

		businessDelegate.setServiceType("JMS");
		client.doTask();
	}

}
