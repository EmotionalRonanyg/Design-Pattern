package com.DesignPattern._27BusinessDelegatePattern;

public class EJBService implements IBusinessService {

	@Override
	public void doProcessing() {
		System.out.println("Processing task by invoking EJB Service");
	}

}
