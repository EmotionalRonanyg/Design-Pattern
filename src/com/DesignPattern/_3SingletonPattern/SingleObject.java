package com.DesignPattern._3SingletonPattern;

public class SingleObject {

	private static SingleObject instance ;
	
	
	private SingleObject() {}
	
	public static SingleObject getInstance() {
		
		if(instance == null) {
			instance= new SingleObject();
		}
		return instance;
		
	}
	public void showSomething() {
		System.out.println(" I'm SingleObject ");
	}
}
