package com.DesignPattern._1FactoryPattern;

public class ShapeFactory {

	public IShape getShape(String shapeType) {
		
		if(shapeType == null) {
			return null;
		}
		if(shapeType.equalsIgnoreCase("Circle")) {
			
			return new Circle();
		}
		if(shapeType.equalsIgnoreCase("Rectangle")) {
			
			return new Rectangle();
		}
		if(shapeType.equalsIgnoreCase("Square")) {
		
			return new Square();
		}
	
		return null;
	}
}
