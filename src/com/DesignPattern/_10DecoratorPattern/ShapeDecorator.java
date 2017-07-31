package com.DesignPattern._10DecoratorPattern;

public abstract class ShapeDecorator implements IShape {

	  protected IShape decoratedShape;

	   public ShapeDecorator(IShape decoratedShape){
	      this.decoratedShape = decoratedShape;
	   }

	   @Override
	   public void draw(){
	      decoratedShape.draw();
	   }

}
