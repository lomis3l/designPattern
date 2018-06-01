package cn.lomis.pattern.businessDelegate;

import cn.lomis.pattern.businessDelegate.impl.EJBService;
import cn.lomis.pattern.businessDelegate.impl.JMSService;

public class BusinessLookUp {
	public BusinessService getBusinessService(String serviceType) {
		if (serviceType.equalsIgnoreCase("EJB")) {
			return new EJBService();
		} else {
			return new JMSService();
		}
	}
}