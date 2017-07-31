package com.DesignPattern._10DecoratorPattern;

public class DecoratorPatternDemo {

	public static void main(String[] args) {

	      IShape circle = new Circle();

	      IShape redCircle = new RedShapeDecorator(new Circle());

	      IShape redRectangle = new RedShapeDecorator(new Rectangle());
	      System.out.println("Circle with normal border");
	      circle.draw();

	      System.out.println("\nCircle of red border");
	      redCircle.draw();

	      System.out.println("\nRectangle of red border");
	      redRectangle.draw();
	}

}
