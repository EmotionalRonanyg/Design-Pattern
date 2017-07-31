package com.DesignPattern._2AbstractFactoryPattern;

public class ColorFactory extends AbstractFactory {

	@Override
	IShape getShape(String shape) {
		return null;
	}

	@Override
	IColor getColor(String color) {
		if(color == null){
	         return null;
	      }		
	      
	    if(color.equalsIgnoreCase("RED")){
	         return new Red();
	         
	    }else if(color.equalsIgnoreCase("GREEN")){
	         return new Green();
	         
	    }else if(color.equalsIgnoreCase("BLUE")){
	         return new Blue();
	    }
		return null;
	}

}
