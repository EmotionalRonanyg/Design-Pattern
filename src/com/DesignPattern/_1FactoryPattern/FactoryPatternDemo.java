package com.DesignPattern._1FactoryPattern;

public class FactoryPatternDemo {

	public static void main(String[] args) {
			
		ShapeFactory shapeFactory = new ShapeFactory();
		IShape shape1 = shapeFactory.getShape("circle");
		shape1.draw();
		
		IShape shape2 = shapeFactory.getShape("Square");
		shape2.draw();
		
	}

}
