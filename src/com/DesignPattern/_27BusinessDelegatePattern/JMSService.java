package com.DesignPattern._27BusinessDelegatePattern;

public class JMSService implements IBusinessService {

	 @Override
	   public void doProcessing() {
	      System.out.println("Processing task by invoking JMS Service");
	   }

}
