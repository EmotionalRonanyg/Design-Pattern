package com.DesignPattern._27BusinessDelegatePattern;

public class BusinessLookUp {

	public IBusinessService getBusinessService(String serviceType) {

		if (serviceType.equalsIgnoreCase("EJB")) {
			return new EJBService();
		} else {
			return new JMSService();
		}
	}
}
