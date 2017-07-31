package com.DesignPattern._3SingletonPattern;

public class SingletonPatternDemo {

	public static void main(String[] args) {
		
		SingleObject singleObject = SingleObject.getInstance();
				
		singleObject.showSomething();
	}
}
