package cn.lomis.design.nullobject;

import org.junit.Test;

import cn.lomis.pattern.nullobject.AbstractCustomer;
import cn.lomis.pattern.nullobject.CustomerFactory;

public class TestNullObject {

	@Test
	public void test01() {
		AbstractCustomer customer1 = CustomerFactory.getCustomer("Rob");
		AbstractCustomer customer2 = CustomerFactory.getCustomer("Bob");
		AbstractCustomer customer3 = CustomerFactory.getCustomer("Julie");
		AbstractCustomer customer4 = CustomerFactory.getCustomer("Laura");

		System.out.println("Customers");
		System.out.println(customer1.getName());
		System.out.println(customer2.getName());
		System.out.println(customer3.getName());
		System.out.println(customer4.getName());
	}
}
