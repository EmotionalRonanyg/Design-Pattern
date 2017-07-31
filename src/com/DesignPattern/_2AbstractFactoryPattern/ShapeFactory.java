package com.DesignPattern._2AbstractFactoryPattern;

public class ShapeFactory extends AbstractFactory {

	@Override
	IShape getShape(String shape) {
		
		if(shape == null){
	         return null;
	      }		
	    if(shape.equalsIgnoreCase("CIRCLE")){
	         return new Circle();
	         
	    }else if(shape.equalsIgnoreCase("RECTANGLE")){
	         return new Rectangle();
	         
	    }else if(shape.equalsIgnoreCase("SQUARE")){
	         return new Square();
	    }
		return null;
	}

	@Override
	IColor getColor(String color) {
		return null;
	}

}
