package com.DesignPattern._2AbstractFactoryPattern;

public abstract class AbstractFactory {

	 abstract IShape getShape(String shape);
	 abstract IColor getColor(String color);
}
