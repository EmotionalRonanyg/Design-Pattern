package com.DesignPattern._27BusinessDelegatePattern;

public class BusinessDelegate {
	private BusinessLookUp lookupService = new BusinessLookUp();
	private IBusinessService businessService;
	private String serviceType;

	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}

	public void doTask() {
		businessService = lookupService.getBusinessService(serviceType);
		businessService.doProcessing();
	}
}
